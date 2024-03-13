package com.example.chowcrazeapp.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.chowcrazeapp.R
import com.example.chowcrazeapp.models.Publisher
import com.squareup.picasso.Picasso
//Adapter de franquicias
class PublisherAdapter(val publishers: List<Publisher>, val onclick:(Int)->Unit):
    RecyclerView.Adapter<PublisherAdapter.PublisherViewHolder>() {
        //Establecer de donde se va a sacar el modelo del adapter
    class PublisherViewHolder(val view: View): RecyclerView.ViewHolder(view){
        val publisherTextView : TextView = view.findViewById(R.id.publisherName)
        var publisherImage : ImageView = view.findViewById(R.id.publisherImg)

    }
    //Infla la vista para que aparezca en el view
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PublisherViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.publisher_item,parent,false)
        return PublisherViewHolder(view)
    }

    override fun getItemCount(): Int {
        return publishers.size
    }
    //Se agrega el modelo a las variables y ademas, se envia el evento de click
    override fun onBindViewHolder(holder: PublisherViewHolder, position: Int) {
        val publisher = publishers[position]
        holder.publisherTextView.text = publisher.name
        Picasso.get().load(publisher.image).into(holder.publisherImage)
        holder.itemView.setOnClickListener {
            onclick(position)
        }
    }
}