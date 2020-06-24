package com.oodp.projectSupporter.BuilderDesignPattern;

abstract class InformationBuilder {
	protected InformationTank informationTank;
	
	public InformationTank getInformationTank() {
		return informationTank;
	}
	
	public void createNewInformationTank(){
		informationTank=new InformationTank();
	}
	
	public abstract void buildName();
	public abstract void buildMail();
	public abstract void buildProject();
}
