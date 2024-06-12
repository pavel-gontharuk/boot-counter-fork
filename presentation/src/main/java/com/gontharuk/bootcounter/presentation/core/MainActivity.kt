package com.gontharuk.bootcounter.presentation.core

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import com.gontharuk.bootcounter.presentation.core.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

/**
 * TODO :
 *  App: -----------------
 *  Broadcast receiver for RECEIVE_BOOT_COMPLETED event
 *  PRESENTATION: -----------------
 *  Date formatter
 *  BootCounterViewModel
 *  WorkManager
 *  DATA: -----------------
 *  BootCounterRepository
 *  BootCounterDaoImplementation
 */
@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
                    Text(
                        text = "Boot Counter",
                        textAlign = TextAlign.Center
                    )
                }
            }
        }
    }
}