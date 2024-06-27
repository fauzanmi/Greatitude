package com.tekber.jetpack.greatitude.di

import android.content.Context
import androidx.room.Room
import com.tekber.jetpack.greatitude.feature_journal.data.data_source.JournalDatabase
import com.tekber.jetpack.greatitude.feature_journal.data.repository.DataStoreOperationsRepositoryImpl
import com.tekber.jetpack.greatitude.feature_journal.data.repository.JournalRepositoryImpl
import com.tekber.jetpack.greatitude.feature_journal.domain.repository.DataStoreOperationsRepository
import com.tekber.jetpack.greatitude.feature_journal.domain.repository.JournalRepository
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.datastore_operations.DataStoreOperationsUseCases
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.datastore_operations.ReadFirstEntryUseCase
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.datastore_operations.ReadOnBoardingUseCase
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.datastore_operations.ReadUserNameUseCase
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.datastore_operations.SaveFirstEntryUseCase
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.datastore_operations.SaveOnBoardingUseCase
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.datastore_operations.SaveUserNameUserCase
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.journal.AddJournal
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.journal.DeleteJournal
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.journal.GetJournalById
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.journal.GetJournals
import com.tekber.jetpack.greatitude.feature_journal.domain.use_case.journal.JournalUseCases
import com.tekber.jetpack.greatitude.feature_journal.domain.util.journal.JournalDataTypeConverter
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.DATABASE_NAME
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Singleton
    @Provides
    fun provideJournalDatabase(@ApplicationContext app: Context): JournalDatabase {
        return Room.databaseBuilder(
            app, JournalDatabase::class.java, DATABASE_NAME
        ).addTypeConverter(JournalDataTypeConverter()).build()
    }

    @Singleton
    @Provides
    fun provideJournalRepository(database: JournalDatabase): JournalRepository {
        return JournalRepositoryImpl(database.journalDao)
    }

    @Singleton
    @Provides
    fun provideDataStoreOperations(@ApplicationContext app: Context): DataStoreOperationsRepository {
        return DataStoreOperationsRepositoryImpl(app)
    }


    @Singleton
    @Provides
    fun provideJournalUseCases(repository: JournalRepository): JournalUseCases {
        return JournalUseCases(
            getJournals = GetJournals(repository),
            deleteJournal = DeleteJournal(repository),
            addJournal = AddJournal(repository),
            getJournalById = GetJournalById(repository)
        )
    }


    @Singleton
    @Provides
    fun provideOnBoardingUseCases(repository: DataStoreOperationsRepository): DataStoreOperationsUseCases {
        return DataStoreOperationsUseCases(
            readOnBoarding = ReadOnBoardingUseCase(repository),
            saveOnBoarding = SaveOnBoardingUseCase(repository),
            readUserNameUseCase = ReadUserNameUseCase(repository),
            saveUserNameUserCase = SaveUserNameUserCase(repository),
            readFirstEntryUseCase = ReadFirstEntryUseCase(repository),
            saveFirstEntryUseCase = SaveFirstEntryUseCase(repository)
        )
    }
}