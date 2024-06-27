package com.tekber.jetpack.greatitude.feature_journal.domain.util.journal;

import com.tekber.jetpack.greatitude.feature_journal.domain.model.JournalDataResponse;

sealed class JournalEvent {

    data class DeleteJournal(val journalDataResponse: JournalDataResponse) : JournalEvent()
    data class SearchInList(val searchKeyWord: String) : JournalEvent()

}