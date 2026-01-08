package com.example.roomgatos

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Delete

@Dao
interface GatosDao {

    @Query("SELECT * FROM cat_table")
    fun getAllCats(): List<GatosEntity>

    @Insert
    fun insertCat(cat: GatosEntity)

    @Delete
    fun deleteCat(cat: GatosEntity)
}
