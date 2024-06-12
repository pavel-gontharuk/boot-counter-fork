package com.gontharuk.bootcounter.domain.bootevent

interface IBootEventRepository {

    fun putEvent(bootEvent: BootEvent)

    // TODO return all events as coroutine flow, so any updates in Database will feed pipeline right to the UI
    fun getAllEvents(): Set<BootEvent>
}