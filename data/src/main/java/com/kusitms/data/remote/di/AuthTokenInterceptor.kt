package com.kusitms.data.remote.di

import android.util.Log
import com.kusitms.data.local.AuthDataStore
import okhttp3.Interceptor
import okhttp3.Response

class AuthTokenInterceptor(
private val authDataStore: AuthDataStore = AuthDataStore
): Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val authToken = authDataStore.authToken
        val tokenRequest = if (authToken.isNotEmpty()) {
            chain.request().newBuilder()
                .addHeader("Authorization", "$authToken")
                .build()
        } else {
            chain.request().newBuilder()
                .build()
        }
        Log.d("token send", authToken.toString())
        return chain.proceed(tokenRequest)
    }
}