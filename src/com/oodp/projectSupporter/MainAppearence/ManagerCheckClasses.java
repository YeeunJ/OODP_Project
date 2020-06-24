package com.oodp.projectSupporter.MainAppearence;

class ManagerCheckClasses implements ManagerState{
	@Override
	public boolean checkResult() {
		return true;
	}
}

class CommonUserCheckClasses implements ManagerState{
	@Override
	public boolean checkResult() {
		return false;
	} 
}