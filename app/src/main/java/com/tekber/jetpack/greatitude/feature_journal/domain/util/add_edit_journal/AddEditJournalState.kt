package com.tekber.jetpack.greatitude.feature_journal.domain.util.add_edit_journal

data class AddEditJournalState(
    val isDatePickerDialogVisible: Boolean = false,
    val isVoiceRecorderSheetVisible: Boolean = false,
    val isVoiceRecorderActive: Boolean = false,
    val isAudioPlaying: Boolean = false,
)