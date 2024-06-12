package com.gontharuk.bootcounter.data

import androidx.room.Database
import androidx.room.RoomDatabase
import com.gontharuk.bootcounter.data.bootevent.BootEventDao
import com.gontharuk.bootcounter.data.bootevent.BootEventEntity


@Database(
    entities = [BootEventEntity::class],
    version = 1,
)
abstract class Database : RoomDatabase() {

    abstract fun bootEventDao(): BootEventDao
}