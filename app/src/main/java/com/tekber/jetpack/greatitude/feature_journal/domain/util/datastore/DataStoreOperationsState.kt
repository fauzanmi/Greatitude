package com.tekber.jetpack.greatitude.feature_journal.domain.util.datastore

data class DataStoreOperationsState(
    val onBoardingCompleted: Boolean = false,
    val firstEntryCompleted: Boolean = false,
    val userName: String = ""
)