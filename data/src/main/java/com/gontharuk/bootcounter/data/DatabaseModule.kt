package com.gontharuk.bootcounter.data

import android.content.Context
import androidx.room.Room
import com.gontharuk.bootcounter.data.bootevent.BootEventDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object DatabaseModule {

    @Provides
    @Singleton
    fun provideDatabase(
        @ApplicationContext context: Context,
    ): Database = Room.databaseBuilder(
        context = context,
        klass = Database::class.java,
        name = "BootCounterDataBase"
    ).build()

    @Provides
    fun provideBootEventDao(
        database: Database
    ): BootEventDao = database.bootEventDao()
}