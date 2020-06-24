package com.oodp.ThemeFactory;

import java.awt.Color;

public interface ThemeFactory {
	public ButtonTheme createButtonTheme();
	public BackgroundTheme createBackgroundTheme();
	public Color bgColorReturn();
	public Color btnColorReturn();
}
