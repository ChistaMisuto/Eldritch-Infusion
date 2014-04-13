package chista.EI.core.util;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class LocalizationUtil {
	public static boolean isXMLLanguageFile(String filename) {
		return filename.endsWith(".xml");
	}
	
	public static String getLocaleFromFileName(String filename) {
		return filename.substring(filename.lastIndexOf("/")+1, filename.lastIndexOf("."));
	}
	
	public static String getLocalizationString(String key) {
		return LanguageRegistry.instance().getStringLocalization(key);
	}
}
