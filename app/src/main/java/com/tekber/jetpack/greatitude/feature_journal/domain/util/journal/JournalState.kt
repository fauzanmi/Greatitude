package com.tekber.jetpack.greatitude.feature_journal.domain.util.journal;

import com.tekber.jetpack.greatitude.feature_journal.domain.model.JournalDataResponse;

data class JournalState(
    val journal: List<JournalDataResponse> = emptyList(),
    val filteredList: List<JournalDataResponse> = emptyList(),
    val noResultFound: Boolean = false,
)