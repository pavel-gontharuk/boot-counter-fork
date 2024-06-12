package com.gontharuk.bootcounter.presentation.bootevent

import androidx.lifecycle.ViewModel
import com.gontharuk.bootcounter.domain.bootevent.BootEvent
import com.gontharuk.bootcounter.domain.bootevent.IBootEventRepository
import dagger.hilt.android.scopes.ViewModelScoped
import kotlinx.coroutines.flow.StateFlow

@ViewModelScoped
class BootEventViewModel(
    private val repository: IBootEventRepository
) : ViewModel() {

    val state: StateFlow<UIState> = TODO("collect repository.getAll as flow ")
}

sealed class UIState {
    data object Loading : UIState()

    data class ShowData(
        val items: Set<BootEvent>
    ) : UIState() {
        // TODO format data for UI here
    }
}