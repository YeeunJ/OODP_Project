package com.oodp.projectSupporter.ObserverDP;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBox;


public class Main {

	User user = new User();
	Manager manager = new Manager();
	
	static Meetingchannel mc = new Meetingchannel();
	
	JCheckBox cb1;//user
	JCheckBox cb2;//manager
	
	
	Main(){
		cb1 = new JCheckBox("user 미팅 알림",true);
		cb2 = new JCheckBox("manager 미팅 알림",true);
		
		mc.addObserver(user);
		mc.addObserver(manager);
		//디폴트로 다 미팅알림 기능이 다 되어있음
		cb1.addActionListener((ActionListener)this);
		cb1.addActionListener((ActionListener) this);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(!cb1.isSelected())
			mc.deleteObserver(user);
		
		else if(!cb2.isSelected())
			mc.deleteObserver(manager);
	}
	 
	public static void main(String[] args) {
		
		new Main();
		
		if(mc.istimeOn()==true) {//시간이 되었을 경우
			mc.meetingTimeOn();// 모든 옵저버에게 update하게 함
		}
		
		



		
	}

}
