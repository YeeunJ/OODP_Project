package com.oodp.projectSupporter.loginout;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JOptionPane;

import com.oodp.projectSupporter.main_appearence;

public class DB {
	
	
	

	
	public void login(String mail, String password) {
		main_appearence ma = new main_appearence();
		
		LoginEnterBttn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(IDtext.getText().equals() && (Arrays.equals(passwordField.getPassword(), "1234".toCharArray())) )  {
					Login_Page.setVisible(false);
					mainPage.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		
	}

	public void logout(String mail) {
		
		
		
		
	}

}
