package com.oodp.projectSupporter.BuilderDesignPattern;

import java.sql.SQLException;

import com.oodp.projectSupporter.dao.PrintAlldao;
import com.oodp.projectSupporter.dao.dao;

public class TaskPageInformation extends InformationBuilder{
	@Override
	public PrintAlldao buildTaskDAO() {
		// TODO Auto-generated method stub
		dao d = new dao();
		PrintAlldao pa = new PrintAlldao("taskPage");
		d.changedao(pa);
		try {
			d.prepareDB();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		return pa;
	}


	@Override
	public PrintAlldao buildlMeetingDAO() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
