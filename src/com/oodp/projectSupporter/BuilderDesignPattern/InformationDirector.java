package com.oodp.projectSupporter.BuilderDesignPattern;

public class InformationDirector {
	private InformationBuilder informtionBuilder;
	
	public void setInformationBuilder(InformationBuilder IB) {
		informtionBuilder = IB;
	}
	public InformationBuilder getInformationBuilder() {
		return informtionBuilder;
	}
	public void constructInformationTank() {
		informtionBuilder.createNewInformationTank();
		informtionBuilder.buildTaskDAO();
		informtionBuilder.buildlMeetingDAO();
	}
}
