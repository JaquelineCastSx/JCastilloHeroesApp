package com.example.chowcrazeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.example.chowcrazeapp.mock.MockData
import com.example.chowcrazeapp.ui.HomePage
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    //Variables para iniciar sesión
    private lateinit var loginBtn: Button
    private lateinit var emailTxt: EditText
    private lateinit var  passwordTxt: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //Guardar status de sesión iniciada
        val sharedPreferences = getSharedPreferences("myprefs", MODE_PRIVATE)
        val isLogged = sharedPreferences.getBoolean("isLogged", false)
        if(isLogged){
            //Si esta iniciada la sesión va directo al home page
            val intent = Intent(this@MainActivity,HomePage::class.java)
            startActivity(intent)
            finish()
        }
        loginBtn = findViewById(R.id.enterBtn)
        emailTxt = findViewById(R.id.emailInp)
        passwordTxt = findViewById(R.id.passwordInp)

        loginBtn.setOnClickListener{
            val email = emailTxt.text.toString()
            val password = passwordTxt.text.toString()
            //Validacion de usuario y contraseña segun la lista de MockData
            if(email.isEmpty() || password.isEmpty()){
                Log.i("INVALID", "invalid credentials")
                Snackbar.make(it, "El correo o contraseña están vacios", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            val isValidUser = MockData.users.any {u -> u.email == email && u.password == password}

            if(!isValidUser){
                Snackbar.make(it, "El correo o la contraseña no son validos", Snackbar.LENGTH_SHORT).show()
                return@setOnClickListener
            }
            //Aqui cambia el status a sesion iniciada
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", true)
            editor.apply()
            val intent = Intent(this@MainActivity,HomePage::class.java)
            startActivity(intent)
            finish()
        }
    }
}