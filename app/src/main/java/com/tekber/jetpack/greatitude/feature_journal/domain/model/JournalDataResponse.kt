package com.tekber.jetpack.greatitude.feature_journal.domain.model

import android.net.Uri
import androidx.compose.runtime.Stable
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.DailyGratitude;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.EmotionalInsight;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.QuickMeditation;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.WeeklyGoals;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.JoyfulMoment;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.MeaningfulConnection;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.RecentChallenge;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.FutureVision;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.CreativeJourney;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.DayInThreeWords;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.PositiveThoughts;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.MentalCheck;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.KindnessAct;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.NatureExperience;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.LearningMoment;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.SelfCareActivity;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.AchievementHighlight;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.StressRelief;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.InspirationalQuote;
import com.tekber.jetpack.greatitude.feature_journal.util.Constants.DailyReflection;

import com.tekber.jetpack.greatitude.ui.theme.AlmondCream;
import com.tekber.jetpack.greatitude.ui.theme.BlushPink;
import com.tekber.jetpack.greatitude.ui.theme.Buttercream;
import com.tekber.jetpack.greatitude.ui.theme.ChampagneGold;
import com.tekber.jetpack.greatitude.ui.theme.Creamsicle;
import com.tekber.jetpack.greatitude.ui.theme.FeatherGray;
import com.tekber.jetpack.greatitude.ui.theme.LinenWhite;
import com.tekber.jetpack.greatitude.ui.theme.MintyFresh;
import com.tekber.jetpack.greatitude.ui.theme.MistyBlue;
import com.tekber.jetpack.greatitude.ui.theme.NimbusGray;
import com.tekber.jetpack.greatitude.ui.theme.PalePlatinum;
import com.tekber.jetpack.greatitude.ui.theme.PeachSorbet;
import com.tekber.jetpack.greatitude.ui.theme.PistachioGreen;
import com.tekber.jetpack.greatitude.ui.theme.Rosewater;
import com.tekber.jetpack.greatitude.ui.theme.SerenityBlue;
import com.tekber.jetpack.greatitude.ui.theme.SilverSand;
import com.tekber.jetpack.greatitude.ui.theme.Snowfall;
import com.tekber.jetpack.greatitude.ui.theme.VanillaCream;
import com.tekber.jetpack.greatitude.ui.theme.WhisperWhite;
import com.tekber.jetpack.greatitude.ui.theme.WhisperingWillow;

import java.io.File


@Stable
@Entity
data class JournalDataResponse(
    val title: String,
    val content: String,
    val date: String,
    val color: Int,
    val imageUri: Uri = Uri.EMPTY,
    val audioFilePath: File? = null,
    val audioDuration: String = "",
    @PrimaryKey val id: Int? = null
) {
    companion object {
        val journalColors =
            listOf(
                WhisperWhite,
                SilverSand,
                MistyBlue,
                VanillaCream,
                PalePlatinum,
                Snowfall,
                FeatherGray,
                BlushPink,
                MintyFresh,
                LinenWhite,
                Buttercream,
                SerenityBlue,
                PeachSorbet,
                PistachioGreen,
                ChampagneGold,
                NimbusGray,
                Rosewater,
                WhisperingWillow,
                AlmondCream,
                Creamsicle
            )
        val journalPrompts = listOf(
            DailyGratitude,
            EmotionalInsight,
            QuickMeditation,
            WeeklyGoals,
            JoyfulMoment,
            MeaningfulConnection,
            RecentChallenge,
            FutureVision,
            CreativeJourney,
            DayInThreeWords,
            PositiveThoughts,
            MentalCheck,
            KindnessAct,
            NatureExperience,
            LearningMoment,
            SelfCareActivity,
            AchievementHighlight,
            StressRelief,
            InspirationalQuote,
            DailyReflection
        )

    }
}
class InvalidJournalException(message: String) : Exception(message)