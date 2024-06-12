package com.gontharuk.bootcounter.data.bootevent

import com.gontharuk.bootcounter.domain.bootevent.BootEvent
import com.gontharuk.bootcounter.domain.bootevent.IBootEventRepository
import javax.inject.Inject

class BootEventRepository
@Inject constructor(
    private val bootEventDao: BootEventDao
) : IBootEventRepository {

    override fun putEvent(bootEvent: BootEvent) {
        bootEventDao.put(bootEvent.toEntity())
    }

    override fun getAllEvents(): Set<BootEvent> {
        return bootEventDao.getAll()
            .map { it.toModel() }
            .toSet()
    }
}