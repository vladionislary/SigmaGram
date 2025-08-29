package ua.itaysonlab.sigmagram

import ua.itaysonlab.sigmagram.preferences.*
import ua.itaysonlab.tgkit.TGKitSettingsFragment

object SigmaGramPreferencesNavigator {
    @JvmStatic
    fun createMainMenu() = TGKitSettingsFragment(MainPreferencesEntry())

    fun createChats() = TGKitSettingsFragment(ChatsPreferencesEntry())
    fun createAppearance() = TGKitSettingsFragment(AppearancePreferencesEntry())
    fun createSecurity() = TGKitSettingsFragment(SecurityPreferencesEntry())

    fun createDB() = TGKitSettingsFragment(DoubleBottomPreferencesEntry())
    fun createUpdates() = TGKitSettingsFragment(UpdatesPreferenceEntry())
    fun createDonate() = TGKitSettingsFragment(DonatePreferenceEntry())
}