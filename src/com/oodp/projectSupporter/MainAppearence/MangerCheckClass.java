package com.oodp.projectSupporter.MainAppearence;

import javax.swing.JOptionPane;

public class MangerCheckClass {
	public ManagerState managerState;
	
	public MangerCheckClass(int check){
		if(check != 0) {
			ManagerCheckClasses managerCheckClasses = new ManagerCheckClasses();
			this.managerState=managerCheckClasses;
		}else {
			CommonUserCheckClasses commonUserCheckClasses = new CommonUserCheckClasses();
			this.managerState=commonUserCheckClasses;
		}
	}
	

	public boolean checkResult() {
		return managerState.checkResult();
	}
}
//JOptionPane.showMessageDialog(null, "You are not manager.");