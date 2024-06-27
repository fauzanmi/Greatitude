package com.tekber.jetpack.greatitude.feature_journal.domain.use_case.journal;

import com.tekber.jetpack.greatitude.feature_journal.domain.model.InvalidJournalException;
import com.tekber.jetpack.greatitude.feature_journal.domain.model.JournalDataResponse;
import com.tekber.jetpack.greatitude.feature_journal.domain.repository.JournalRepository;

class GetJournalById(private val repository: JournalRepository) {

    @Throws(InvalidJournalException::class)
    suspend operator fun invoke(id: Int): JournalDataResponse? = repository.getJournalById(id)
}