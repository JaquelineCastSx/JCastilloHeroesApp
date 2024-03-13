package com.example.chowcrazeapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.chowcrazeapp.Adapters.HeroesAdapter
import com.example.chowcrazeapp.R
import com.example.chowcrazeapp.models.Heros
import com.example.chowcrazeapp.models.Publisher

class HeroesActvity : AppCompatActivity() {
    //Variables para filtrar los heroes que se van a mostrar en el recycleview
    private lateinit var heroRecycleView : RecyclerView
    private lateinit var filteredHeroes: List<Heros>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_heroes_actvity)
        //Toma el id que fue enviado desde el activity anterior con el id
        //de la franquicia seleccionada
        val franchiseId = intent.getIntExtra("franchiseId", -1)

        //Filtra los heroes segun el id de la franquicia
        filteredHeroes = getAllHeroes().filter { it.publisherid == franchiseId }
        heroRecycleView = findViewById(R.id.heroesRecycleView)
        heroRecycleView.adapter = HeroesAdapter(filteredHeroes){ hero ->
            val intent = Intent(this, HeroDetail::class.java).apply {
                //Envia al siguiente activity el heroe que se seleccionó con toda su informacion
                putExtra("hero", hero)
            }
            startActivity(intent)
        }
        heroRecycleView.layoutManager = GridLayoutManager(this,2)
    }
    private fun getAllHeroes(): List<Heros> {
        // Trae todos los heroes del companion object
        return Heros.heroes
    }
}