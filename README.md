# Mood Journal


[![Static Badge](https://img.shields.io/badge/Kotlin-black?logo=kotlin)]()

### Mood Journal is a sleek and feature-rich Android app built with Android Studio, designed to help users track their journaling and daily experiences effortlessly. This app provides a clean and intuitive user interface with a variety of customization options.

## Features ✨-
- Custom Date Selection
- New Prompts
- Color Selection
- Add Image
- Delete Journal Entry
- Edit Journal Entry
- Share
- Clean UI

## Project Root
```
├── JournalApp.kt
├── di
│   └── AppModule.kt
├── feature_journal
│   ├── data
│   │   ├── data_source
│   │   │   ├── JournalDao.kt
│   │   │   └── JournalDatabase.kt
│   │   └── repository
│   │       ├── DataStoreOperationsRepositoryImpl.kt
│   │       └── JournalRepositoryImpl.kt
│   ├── domain
│   │   ├── model
│   │   │   └── JournalDataResponse.kt
│   │   ├── repository
│   │   │   ├── DataStoreOperationsRepository.kt
│   │   │   └── JournalRepository.kt
│   │   ├── use_case
│   │   │   ├── datastore_operations
│   │   │   │   ├── DataStoreOperationsUseCases.kt
│   │   │   │   ├── ReadFirstEntry.kt
│   │   │   │   ├── ReadOnBoarding.kt
│   │   │   │   ├── ReadUserName.kt
│   │   │   │   ├── SaveFirstEntry.kt
│   │   │   │   ├── SaveOnBoarding.kt
│   │   │   │   └── SaveUserName.kt
│   │   │   └── journal
│   │   │       ├── AddJournal.kt
│   │   │       ├── DeleteJournal.kt
│   │   │       ├── GetJournalById.kt
│   │   │       ├── GetJournals.kt
│   │   │       └── JournalUseCases.kt
│   │   └── util
│   │       ├── add_edit_journal
│   │       │   ├── AddEditJournalEvent.kt
│   │       │   ├── AddEditJournalState.kt
│   │       │   └── JournalRandomDataState.kt
│   │       ├── datastore
│   │       │   ├── DataStoreOperationsEvent.kt
│   │       │   └── DataStoreOperationsState.kt
│   │       └── journal
│   │           ├── JournalDataTypeConverter.kt
│   │           ├── JournalEvent.kt
│   │           ├── JournalState.kt
│   │           └── JournalTextFieldState.kt
│   ├── navigation
│   │   ├── Screen.kt
│   │   └── SetupNavGraph.kt
│   ├── presentation
│   │   ├── DataStoreOperationsViewModel.kt
│   │   ├── MainActivity.kt
│   │   ├── add_edit_journal
│   │   │   ├── AddEditJournalScreen.kt
│   │   │   ├── AddEditJournalViewModel.kt
│   │   │   ├── components
│   │   │   │   ├── CustomHintTextField.kt
│   │   │   │   ├── DatePickerView.kt
│   │   │   │   ├── ShowColorPicker.kt
│   │   │   │   ├── ShowSearchBar.kt
│   │   │   │   ├── ShowVoiceRecorder.kt
│   │   │   │   └── VerticalDivider.kt
│   │   │   └── util
│   │   │       ├── AndroidAudioPlayer.kt
│   │   │       ├── AndroidAudioRecorder.kt
│   │   │       ├── AudioPlayer.kt
│   │   │       └── AudioRecorder.kt
│   │   ├── journal_screen
│   │   │   ├── JournalScreen.kt
│   │   │   ├── JournalViewModel.kt
│   │   │   └── components
│   │   │       ├── CustomDropDownMenu.kt
│   │   │       ├── JournalCardItem.kt
│   │   │       └── PandaCardView.kt
│   │   ├── onboarding_screen
│   │   └── OnBoardingScreen.kt
│   │   └── splash_screen
│   │       └── SplashScreen.kt
│   └── util
│       ├── Constants.kt
│       └── Utility.kt
└── ui
    └── theme
        ├── Color.kt
        ├── Theme.kt
        └── Type.kt
```

## License
This project is licensed under the MIT License.

## Acknowledgments
Special thanks to Android Studio for making UI development on Android a breeze!
