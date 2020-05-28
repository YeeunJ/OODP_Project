package com.oodp.projectSupporter.MainAppearence;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JTextPane;

class mainPageMaker implements PageMaker{
	@Override
	public JPanel makePage() {
		JPanel mainPage = new JPanel();
		mainPage.setBackground(Color.WHITE);
		mainPage.setBounds(0, 0, 1000, 640);
		mainPage.setVisible(false);
		mainPage.setLayout(null);		
		return mainPage;
	}
	
}

class registrationPageMaker implements PageMaker{
	@Override
	public JPanel makePage() {
		JPanel RegistrationPage = new JPanel();
		RegistrationPage.setBounds(0, 0, 1000, 643);
		RegistrationPage.setVisible(false);
		RegistrationPage.setBackground(Color.WHITE);
		RegistrationPage.setLayout(null);

		return RegistrationPage;
	}
	
}

class myPageMaker implements PageMaker{
	@Override
	public JPanel makePage() {
		JPanel myPage = new JPanel();
		myPage.setBackground(Color.WHITE);
		myPage.setBounds(0, 0, 1000, 643);
		myPage.setLayout(null);
		
		JLabel lblNewLabel_5 = new JLabel("My Page");
		lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_5.setBounds(455, 73, 226, 108);
		myPage.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("ID :");
		lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_6.setBounds(569, 274, 97, 56);
		myPage.add(lblNewLabel_6);
		
		JLabel lblPassword = new JLabel("Password :");
		lblPassword.setFont(new Font("굴림", Font.BOLD, 20));
		lblPassword.setBounds(569, 406, 112, 56);
		myPage.add(lblPassword);
		
		return myPage;
	}
}


class meetingPageMaker implements PageMaker{
	@Override
	public JPanel makePage() {
		JPanel meetingPage = new JPanel();
		meetingPage.setBackground(Color.WHITE);
		meetingPage.setBounds(0, 0, 1000, 640);
		meetingPage.setVisible(false);
		meetingPage.setLayout(null);
		return meetingPage;
	}
	
}

class myPageAddEditPageMaker implements PageMaker{

	@Override
	public JPanel makePage() {
		JPanel myPageAddEditPage=new JPanel();
		myPageAddEditPage.setVisible(false);
		myPageAddEditPage.setBackground(Color.WHITE);
		myPageAddEditPage.setBounds(0, 0, 1000, 643);
		myPageAddEditPage.setLayout(null);
		
		return myPageAddEditPage;
	}
	
}

class taskAddEditPageMaker implements PageMaker{

	@Override
	public JPanel makePage() {
		JPanel taskAddEditPage = new JPanel();
		taskAddEditPage.setBackground(Color.WHITE);
		taskAddEditPage.setVisible(false);
		taskAddEditPage.setBounds(0, 0, 1000, 640);
		taskAddEditPage.setLayout(null);

		return taskAddEditPage;
	}
}

class taskPageMaker implements PageMaker{

	@Override
	public JPanel makePage() {
		JPanel taskPage = new JPanel();
		taskPage.setBackground(Color.WHITE);
		taskPage.setBounds(0, 0, 1000, 640);
		taskPage.setVisible(false);
		taskPage.setLayout(null);
		return taskPage;
	}
	
}

class taskDetailPageMaker implements PageMaker{

	@Override
	public JPanel makePage() {
		JPanel taskDetailPage = new JPanel();
		taskDetailPage.setBackground(Color.WHITE);
		taskDetailPage.setVisible(false);
		taskDetailPage.setBounds(0, 0, 1000, 640);
		taskDetailPage.setLayout(null);

		return taskDetailPage;
	}
	
}

