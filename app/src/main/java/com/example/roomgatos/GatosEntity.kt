package com.example.roomgatos

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "cat_table")
class GatosEntity (
    @PrimaryKey(autoGenerate = true)
    val id: Int = 0,
    val name: String,
    val age: Int,
    val color: String
)