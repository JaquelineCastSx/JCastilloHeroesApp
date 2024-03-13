package com.example.chowcrazeapp.models

data class Publisher(val id:Int, val name:String, val image:String){
    companion object{
        //Objeto estático de lista de franquicias
        val publishers = mutableListOf<Publisher>(
            Publisher(1, "Marvel", "https://1000marcas.net/wp-content/uploads/2020/02/Marvel-Studios-Logo-2008.png"),
            Publisher(2, "DC", "https://1000logos.net/wp-content/uploads/2021/05/DC-Comics-logo.png")
        )
    }
}
