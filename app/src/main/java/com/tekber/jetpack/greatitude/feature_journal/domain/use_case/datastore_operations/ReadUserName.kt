package com.tekber.jetpack.greatitude.feature_journal.domain.use_case.datastore_operations

import com.tekber.jetpack.greatitude.feature_journal.domain.repository.DataStoreOperationsRepository
import kotlinx.coroutines.flow.Flow

class ReadUserNameUseCase(
    private val dataStoreOperationsRepository: DataStoreOperationsRepository
) {
    operator fun invoke(): Flow<String> =
        dataStoreOperationsRepository.readUserNameState()
}