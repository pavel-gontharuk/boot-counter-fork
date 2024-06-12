package com.gontharuk.bootcounter.data.bootevent

import com.gontharuk.bootcounter.domain.bootevent.BootEvent

fun BootEvent.toEntity(): BootEventEntity = BootEventEntity(
    timeStamp = timeStamp
)

fun BootEventEntity.toModel(): BootEvent = BootEvent(
    timeStamp = timeStamp
)