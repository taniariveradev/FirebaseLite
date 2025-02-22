package com.example.firebaselite

import android.app.Application
import android.content.Context
import android.util.Log
import com.google.firebase.FirebaseApp

class FirebaseApp : Application() {

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
        // Inicializa Firebase
        FirebaseApp.initializeApp(this)
    }
}
