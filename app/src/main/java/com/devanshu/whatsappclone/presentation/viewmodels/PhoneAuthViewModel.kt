package com.devanshu.whatsappclone.presentation.viewmodels

import android.app.Activity
import android.util.Log
import androidx.activity.result.ActivityResult
import androidx.compose.ui.input.pointer.PointerId
import androidx.lifecycle.ViewModel
import com.devanshu.whatsappclone.MainActivity
import com.devanshu.whatsappclone.models.PhoneAuthUser
import com.google.firebase.FirebaseException
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.PhoneAuthCredential
import com.google.firebase.auth.PhoneAuthProvider
import com.google.firebase.crashlytics.buildtools.reloc.org.apache.http.auth.AuthState
import com.google.firebase.database.FirebaseDatabase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject


@HiltViewModel
class PhoneAuthViewModel @Inject constructor(
    private val firebaseAuth : FirebaseAuth,
    private val database : FirebaseDatabase
    ) : ViewModel() {
    private val _authState =
        MutableStateFlow<AuthState>(com.devanshu.whatsappclone.presentation.viewmodels.AuthState.Ideal)
    val authState = _authState.asStateFlow()

    private val UserRef = database.reference.child("users")

    fun sendVerificationCode(phoneNumber: String,activity: Activity)
    {
        _authState.value = com.devanshu.whatsappclone.presentation.viewmodels.AuthState.Loading

        val option = object : PhoneAuthProvider.OnVerificationStateChangedCallbacks(){

            override fun onCodeSent(id: String, token: PhoneAuthProvider.ForceResendingToken) {
                super.onCodeSent(id, token)
                Log.d("PhoneAuth","onCodeSent trigerred. verification ID :$id")
                _authState.value = com.devanshu.whatsappclone.presentation.viewmodels.AuthState.CodeSent(verificationId = id)
            }

            override fun onVerificationCompleted(credential: PhoneAuthCredential) {
                TODO("Not yet implemented")
            }

            override fun onVerificationFailed(exception: FirebaseException) {
                Log.e("PhoneAuth","Verification failed: ${exception.message}")
                _authState.value = com.devanshu.whatsappclone.presentation.viewmodels.AuthState.Error(exception.message ?: "Verification Failed")
            }

        }
        }
    }

sealed class AuthState {
    object Ideal : AuthState()
    object Loading : AuthState()
    data class CodeSent(val verificationId: String) : AuthState()
    data class Success(val user: PhoneAuthUser) : AuthState()
    data class Error(val message: String) : AuthState()

}