package com.example.chowcrazeapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chowcrazeapp.Adapters.PublisherAdapter
import com.example.chowcrazeapp.MainActivity
import com.example.chowcrazeapp.R
import com.example.chowcrazeapp.models.Publisher

class HomePage : AppCompatActivity() {
    //Variables para recycleview y cerrar sesion
    private lateinit var publisherRecyclerView : RecyclerView
    private lateinit var logoutBtn : ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        //Visualiza el recycleview en la pantalla home con las franquicias de heroes
        publisherRecyclerView = findViewById(R.id.publisher_recycler_view)
        publisherRecyclerView.adapter = PublisherAdapter(Publisher.publishers){ position ->
            val selectedFranchiseId = Publisher.publishers[position].id
            val intent = Intent(this,HeroesActvity::class.java).apply {
                //Envia hacia el siguiente activity el id de la franquicia en que se hizo click
                //Esto para despues traer los heroes de dicha franquicia
                putExtra("franchiseId", selectedFranchiseId)

            }
            startActivity(intent)
        }
        publisherRecyclerView.layoutManager = GridLayoutManager(this,1)

        //Toma el status de la sesion y al hacer click en el boton, cierra la sesion
        //Y vuelve a la pagina de login
        val sharedPreferences = getSharedPreferences("myprefs", MODE_PRIVATE)
        logoutBtn = findViewById(R.id.btnOut)
        logoutBtn.setOnClickListener{
            val editor = sharedPreferences.edit()
            editor.putBoolean("isLogged", false)
            editor.apply()
            val intent = Intent(this@HomePage, MainActivity::class.java)
            startActivity(intent)
            finish()
        }

    }

}