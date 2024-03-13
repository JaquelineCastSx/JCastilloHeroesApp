package com.example.chowcrazeapp.mock

import com.example.chowcrazeapp.models.User

class MockData {
    companion object{
        //Lista de usuarios para logIn
        val users = listOf<User>(
            User("textUno@gmail.com", "Password01"),
            User("textUno@yahoo.com", "Password02"),
            User("textUno@hotmail.com", "Password03")
        )
    }

}