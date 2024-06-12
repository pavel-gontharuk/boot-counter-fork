package com.gontharuk.bootcounter.data.bootevent

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface BootEventDao {

    @Insert
    fun put(bootEventEntity: BootEventEntity)

    @Query("SELECT * FROM bootEvent")
    fun getAll(): List<BootEventEntity>
}