package com.tekber.jetpack.greatitude.feature_journal.domain.use_case.journal;

import com.tekber.jetpack.greatitude.feature_journal.domain.model.JournalDataResponse;
import com.tekber.jetpack.greatitude.feature_journal.domain.repository.JournalRepository;
import kotlinx.coroutines.flow.Flow

class GetJournals(private val repository: JournalRepository) {

    operator fun invoke(): Flow<List<JournalDataResponse>> {
        return repository.getJournal()
    }


}

