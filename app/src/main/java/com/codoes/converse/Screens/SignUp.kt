package com.codoes.converse.Screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import com.codoes.converse.Helpers.Components
import com.codoes.converse.R

/**
 * Author: Jayesh M
 */
class SignUp : AppCompatActivity() {

    /** UI Objects */
    var back: ImageButton? = null
    var title: TextView? = null
    var fullName: EditText? = null
    var userName: EditText? = null
    var emailID: EditText? = null
    var password: EditText? = null
    var confirm: EditText? = null
    var signUp: Button? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sign_up)

        /** Initializing helper objects */
        var components: Components = Components(applicationContext, window.decorView.rootView) // UI Object initializer

        /** Initializing UI Objects */
        back = components.defaultImageButton(R.id.su_back)
        title = components.defaultTextView(R.id.su_title, "Create Your Account", Gravity.START, 20f)
        fullName = components.defaultEditText(R.id.su_fullname, "Enter Full Name", true)
        userName = components.defaultEditText(R.id.su_username, "Enter User Name", false)
        emailID = components.defaultEditText(R.id.su_username, "Enter Email ID", false)
        password = components.defaultEditText(R.id.su_username, "Enter Password", false)
        confirm = components.defaultEditText(R.id.su_username, "Confirm Password", false)
        signUp = components.defaultButton(R.id.su_signup, "Sign Up", Components.ButtonType.FULL)

        /** onclick function calls */
        signUp!!.setOnClickListener{

        }
    }

    /* creates request body for a request */
    private fun makeRequest() {

    }

}