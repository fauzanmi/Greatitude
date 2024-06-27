package com.tekber.jetpack.greatitude.feature_journal.domain.use_case.journal

data class JournalUseCases(
    val getJournals: GetJournals,
    val deleteJournal: DeleteJournal,
    val addJournal: AddJournal,
    val getJournalById: GetJournalById
)