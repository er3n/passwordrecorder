package com.iinance.passwordrecorder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {

    private var mAuth: FirebaseAuth? = null
    private val email = "erenozturk@gmail.com"
    private val password = "123456"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mAuth = FirebaseAuth.getInstance()
    }

    override fun onStart() {
        super.onStart()
        val fireBaseuser = mAuth!!.currentUser
        println("Current firebase user is ${fireBaseuser?.email}")

        signIn()
        mAuth!!.currentUser!!.sendEmailVerification()


    }

    fun createUser() = mAuth!!.createUserWithEmailAndPassword("erenozturk@gmail.com", "123456")
            .addOnCompleteListener {
                if(it.isSuccessful) {
                    Log.d("MainActivity", "createUserWithEmail:success ${mAuth!!.currentUser}")
                } else {
                    Log.w("MainActivity", "createUserWithEmail:failure", it.exception);
                    Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show()
                }
            }
    fun signIn() = mAuth!!.signInWithEmailAndPassword(email, password)
            .addOnCompleteListener {
                if(it.isSuccessful) {
                    Log.d("MainActivity", "createUserWithEmail:success ${mAuth!!.currentUser!!.email}")
                } else {
                    Log.w("MainActivity", "createUserWithEmail:failure", it.exception);
                    Toast.makeText(this, "Authentication failed.", Toast.LENGTH_SHORT).show()
                }
            }
}
