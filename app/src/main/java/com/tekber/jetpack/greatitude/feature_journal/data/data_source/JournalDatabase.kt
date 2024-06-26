package com.tekber.jetpack.greatitude.feature_journal.data.data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.tekber.jetpack.greatitude.feature_journal.domain.model.JournalDataResponse
import com.tekber.jetpack.greatitude.feature_journal.domain.util.journal.JournalDataTypeConverter


@Database(entities = [JournalDataResponse::class], version = 1, exportSchema = false)
@TypeConverters(JournalDataTypeConverter::class)
abstract class JournalDatabase : RoomDatabase() {
    abstract val journalDao: JournalDao
}