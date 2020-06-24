package com.oodp.ThemeFactory;

import java.awt.Color;

public class Theme1Factory implements ThemeFactory{

	@Override
	public ButtonTheme createButtonTheme() {
		// TODO Auto-generated method stub
		return new Theme1Button();
	}

	@Override
	public BackgroundTheme createBackgroundTheme() {
		// TODO Auto-generated method stub
		return new Theme1Background();
	}

	@Override
	public Color bgColorReturn() {
		// TODO Auto-generated method stub
		Theme1Button t1btn = new Theme1Button();
		return t1btn.btnColor;
	}

	@Override
	public Color btnColorReturn() {
		// TODO Auto-generated method stub
		Theme1Background t1bg = new Theme1Background();
		return t1bg.bgColor;
	}

	

}
