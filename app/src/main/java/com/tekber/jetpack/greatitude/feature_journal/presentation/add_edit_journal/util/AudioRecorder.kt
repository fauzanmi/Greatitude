package com.tekber.jetpack.greatitude.feature_journal.presentation.add_edit_journal.util

import java.io.File

interface AudioRecorder {
    fun start(outputFile: File)
    fun stop()
}