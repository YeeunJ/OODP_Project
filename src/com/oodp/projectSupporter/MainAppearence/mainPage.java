package com.oodp.projectSupporter.MainAppearence;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;

import com.oodp.projectSupporter.dao.PrintAlldao;
import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.userDTO;

public class mainPage implements Runnable{
	userDTO user;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel UserWelcomeText;
	private JLabel lblYourProject;
	PageMaster mainPageMaster;
	JPanel mainPage;
	
	public mainPage(userDTO user) {
		this.user = user;
		mainPageMaster = new PageMaster(new mainPageMaker());
		mainPage = mainPageMaster.createPage();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		 
	}
	
	public void makeMain(JFrame frame) {
		// ###########################<Main Page>###############################
				
				
				frame.getContentPane().add(mainPage);
				
				lblNewLabel_3 = new JLabel("Main Page");
				lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 31));
				lblNewLabel_3.setBounds(133, 55, 213, 73);
				mainPage.add(lblNewLabel_3);

				JTextPane textPane = new JTextPane();
				textPane.setBackground(Color.LIGHT_GRAY);
				textPane.setBounds(133, 362, 360, 164);
				mainPage.add(textPane);

				lblNewLabel_4 = new JLabel("Announcement");
				lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 15));
				lblNewLabel_4.setBounds(133, 318, 128, 34);
				mainPage.add(lblNewLabel_4);

				UserWelcomeText = new JLabel("Welcome " + user.getName());
				UserWelcomeText.setFont(new Font("굴림", Font.PLAIN, 24));
				UserWelcomeText.setBounds(133, 151, 264, 73);
				mainPage.add(UserWelcomeText);

				lblYourProject = new JLabel("Your Project");
				lblYourProject.setFont(new Font("굴림", Font.BOLD, 15));
				lblYourProject.setBounds(409, 173, 128, 34);
				mainPage.add(lblYourProject);
				
	}
	
	public void showMain() {
		mainPage.setVisible(true);
	}
	public void addMain() {
		mainPage.setVisible(true);
	}
}
