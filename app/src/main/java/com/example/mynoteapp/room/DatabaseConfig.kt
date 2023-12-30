package com.example.mynoteapp.room

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.Room.databaseBuilder
import androidx.room.RoomDatabase

object DatabaseConfig {
    fun getInstance(context: Context):AppDatabase{
        var db= databaseBuilder(
            context,
            AppDatabase::class.java,
            "note_db"
        ).build()
        return db
    }
}

