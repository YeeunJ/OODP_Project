package ThemeFactory;

import java.awt.Color;

public class ThemeSelection {
	ThemeFactory themeFactory= null;
	
	public void createTheme(int type){
        //InformationFactory informationFactory= null;
        switch (type){
            case 0:
            	themeFactory = new Theme1Factory();
                break;

            case 1:
            	themeFactory = new Theme2Factory();
                break;
        }

        themeFactory.createButtonTheme();
        themeFactory.createBackgroundTheme();
    }
	
	public Color bgColorReturn() {
		return themeFactory.bgColorReturn();
	}
	public Color btnColorReturn() {
		return themeFactory.btnColorReturn();
	}
}
