package com.govind8061.simplesimple.tables

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "contacts")
data class Contact(

    @PrimaryKey(autoGenerate = true)
    val id:Long,
    val name:String,
    val phone:String
)
