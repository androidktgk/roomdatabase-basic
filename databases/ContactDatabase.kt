package com.govind8061.simplesimple.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.govind8061.simplesimple.daos.ContactDao
import com.govind8061.simplesimple.tables.Contact

@Database(entities = [Contact::class], version = 1)
abstract class ContactDatabase : RoomDatabase(){

    abstract fun contactDao(): ContactDao
}