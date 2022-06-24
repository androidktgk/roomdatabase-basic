package com.govind8061.simplesimple.daos

import androidx.lifecycle.LiveData
import androidx.room.*
import com.govind8061.simplesimple.tables.Contact

@Dao
interface ContactDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertData(contact: Contact)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun updateData(contact: Contact)

    @Delete
   fun deleteData(contact: Contact)

    @Query("SELECT * FROM contacts")
    fun getContacts(): LiveData<List<Contact>>
}