package com.example.chowcrazeapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.chowcrazeapp.R
import com.example.chowcrazeapp.models.Heros
import com.squareup.picasso.Picasso

class HeroDetail : AppCompatActivity() {
    //Variables para insertar el heroe seleccionado
    private lateinit var heroTitle : TextView
    private lateinit var heroName : TextView
    private lateinit var heroDetail : TextView
    private lateinit var heroPower : TextView
    private lateinit var heroImage : ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hero_detail)
        //Asigna a las variables su elemento del layout
        heroTitle = findViewById(R.id.heroNameTitle)
        heroName = findViewById(R.id.heroNameTxt)
        heroDetail = findViewById(R.id.heroDesc)
        heroPower = findViewById(R.id.heroPower)
        heroImage = findViewById(R.id.imgIndHero)
        val hero = intent.getSerializableExtra("hero") as Heros

        //Asigna la informacion del heroe en cada campo del layout
        heroTitle.text = hero.name
        heroName.text = hero.name
        heroDetail.text = hero.description
        heroPower.text = hero.powers
        //Trae la imagen con picasso
        Picasso.get().load(hero.image).into(heroImage)
    }
}