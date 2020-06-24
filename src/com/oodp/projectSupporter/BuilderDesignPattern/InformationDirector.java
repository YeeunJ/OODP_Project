package com.oodp.projectSupporter.BuilderDesignPattern;

public class InformationDirector {
	private InformationBuilder informtionBuilder;
	
	public void setInformationBuilder(InformationBuilder IB) {
		informtionBuilder = IB;
	}
	public InformationBuilder getInformationBuilder(InformationBuilder IB) {
		return informtionBuilder;
	}
	public void constructInformationTank() {
		informtionBuilder.createNewInformationTank();
		informtionBuilder.buildMail();
		informtionBuilder.buildName();
		informtionBuilder.buildProject();
	}
}
