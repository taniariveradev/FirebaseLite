package com.example.firebaselite

import android.app.Application
import android.content.Context

class FirebaseApp : Application() {

    companion object {
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = this
    }
}
