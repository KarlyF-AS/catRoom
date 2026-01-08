package com.example.roomgatos

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [GatosEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun GatosDao(): GatosDao
}
