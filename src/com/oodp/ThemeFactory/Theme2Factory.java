package com.oodp.ThemeFactory;

import java.awt.Color;

public class Theme2Factory implements ThemeFactory{

	@Override
	public ButtonTheme createButtonTheme() {
		// TODO Auto-generated method stub
		return new Theme2Button();
	}

	@Override
	public BackgroundTheme createBackgroundTheme() {
		// TODO Auto-generated method stub
		
		return new Theme2Background();
	}

	@Override
	public Color bgColorReturn() {
		// TODO Auto-generated method stub
		Theme2Background t2bg = new Theme2Background();
		return t2bg.bgColor;	
	}

	@Override
	public Color btnColorReturn() {
		// TODO Auto-generated method stub
		Theme2Button t2btn = new Theme2Button();
		return t2btn.btnColor;	
	}
}
