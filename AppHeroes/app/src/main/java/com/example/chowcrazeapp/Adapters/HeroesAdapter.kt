package com.example.chowcrazeapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chowcrazeapp.R
import com.example.chowcrazeapp.models.Heros
import com.squareup.picasso.Picasso
//Adapter de heroes

class HeroesAdapter(val heroes: List<Heros>, val onclick:(Heros)->Unit): RecyclerView.Adapter<HeroesAdapter.HeroesViewHolder>() {
    //Establecer de donde se va a sacar el modelo del adapter
    class HeroesViewHolder(val view:View):RecyclerView.ViewHolder(view){
        val heroesImageView : ImageView = view.findViewById(R.id.imgHero)
        val heroesName : TextView = view.findViewById(R.id.nameHero)
    }
    //Infla la vista para que aparezca en el view

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HeroesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.heroes_item,parent,false)
        return HeroesViewHolder(view)
    }

    override fun getItemCount(): Int {
        return heroes.size
    }

    //Se agrega el modelo a las variables y ademas, se envia el evento de click
    override fun onBindViewHolder(holder: HeroesViewHolder, position: Int) {
        val hero = heroes[position]
        holder.heroesName.text = hero.name
        Picasso.get().load(hero.image).into(holder.heroesImageView)
        holder.itemView.setOnClickListener {
            onclick(hero)
        }
    }
}