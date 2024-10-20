package com.example.prac23

import androidx.wear.activity.WearableActivity
import androidx.wearable.activity.WearableActivity

import android.os.Bundle

class SignInActivity : WearableActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)
    }
}
