package ua.itaysonlab.sigmagram.preferences

import org.telegram.messenger.LocaleController
import org.telegram.messenger.R
import org.telegram.ui.ActionBar.BaseFragment
import ua.itaysonlab.sigmagram.SigmaGramConfig
import ua.itaysonlab.sigmagram.OTA
import ua.itaysonlab.sigmagram.preferences.ktx.*
import ua.itaysonlab.tgkit.preference.types.TGKitTextIconRow

class UpdatesPreferenceEntry : BasePreferencesEntry {
    override fun getPreferences(bf: BaseFragment) = tgKitScreen(LocaleController.getString("CG_Updates_Category", R.string.CG_Updates_Category)) {
        category(LocaleController.getString("CG_Updates_Category", R.string.CG_Updates_Category)) {
            switch {
                title = LocaleController.getString("CG_Auto_Ota", R.string.CG_Auto_Ota)
                summary = LocaleController.getString("CG_Auto_Ota_summary", R.string.CG_Auto_Ota_summary)

                contract({
                    return@contract SigmaGramConfig.autoOta
                }) {
                    SigmaGramConfig.autoOta = it
                }
            }
            textIcon {
                title = LocaleController.getString("CG_Ota", R.string.CG_Ota)
                listener = TGKitTextIconRow.TGTIListener { OTA.download(bf.parentActivity, true) }
            }
        }
    }
}