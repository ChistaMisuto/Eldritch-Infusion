package chista.EI.core.handler;

import cpw.mods.fml.common.registry.LanguageRegistry;
import chista.EI.core.util.LocalizationUtil;
import chista.EI.lib.Localizations;

public class LocalizationHandler {
	public static void loadLanguages() {
		for (String localizationFile : Localizations.localeFiles) {
			LanguageRegistry.instance().loadLocalization(localizationFile, LocalizationUtil.getLocaleFromFileName(localizationFile), LocalizationUtil.isXMLLanguageFile(localizationFile));
		}
	}
}
