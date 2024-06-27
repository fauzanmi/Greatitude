package com.tekber.jetpack.greatitude.feature_journal.domain.repository

import com.tekber.jetpack.greatitude.feature_journal.domain.model.JournalDataResponse
import kotlinx.coroutines.flow.Flow

interface JournalRepository {

    fun getJournal(): Flow<List<JournalDataResponse>>

    suspend fun getJournalById(id: Int): JournalDataResponse?

    suspend fun insertJournal(journalDataResponse: JournalDataResponse)

    suspend fun deleteJournal(journalDataResponse: JournalDataResponse)

}