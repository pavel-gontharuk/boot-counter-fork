package com.gontharuk.bootcounter.data.bootevent

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(
    tableName = "bootEvent",
)
data class BootEventEntity(
    @PrimaryKey
    val timeStamp: Long,
)