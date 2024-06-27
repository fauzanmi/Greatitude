package com.tekber.jetpack.greatitude.feature_journal.domain.use_case.datastore_operations

import com.tekber.jetpack.greatitude.feature_journal.domain.repository.DataStoreOperationsRepository

class SaveOnBoardingUseCase(
    private val dataStoreOperationsRepository: DataStoreOperationsRepository
) {
    suspend operator fun invoke(completed: Boolean) {
        dataStoreOperationsRepository.saveOnBoardingState(completed = completed)
    }
}