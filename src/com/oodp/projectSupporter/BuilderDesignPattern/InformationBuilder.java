package com.oodp.projectSupporter.BuilderDesignPattern;

import com.oodp.projectSupporter.dao.PrintAlldao;

public abstract class InformationBuilder {
	protected InformationTank informationTank;
	
	public InformationTank getInformationTank() {
		return informationTank;
	}
	
	public void createNewInformationTank(){
		informationTank=new InformationTank();
	}
	
	public abstract PrintAlldao buildTaskDAO();
	public abstract PrintAlldao buildlMeetingDAO();
}
