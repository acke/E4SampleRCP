/**
 * 
 */
package com.purplescout.sdk.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.css.swt.theme.IThemeEngine;

/**
 * @author Knut Funkel
 * 
 */
public class ThemeSwitchHandler {
	private static final String DEFAULT_THEME = "com.purplescout.sdk.standardTheme";
	private static final String RED_THEME = "com.purplescout.sdk.themeRed";

	// Remember the state
	static boolean defaulttheme = true;

	@Execute
	public void switchTheme(IThemeEngine engine) {
		// second argument defines that change is
		// persisted and restored on restart
		System.out.println("executing themeengine");
		if (!engine.getActiveTheme().getId().equals(DEFAULT_THEME)) {
			engine.setTheme(DEFAULT_THEME, true);
		} else {
			engine.setTheme(RED_THEME, true);
		}
	}
}
