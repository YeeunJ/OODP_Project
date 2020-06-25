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
		cb1 = new JCheckBox("user ���� �˸�",true);
		cb2 = new JCheckBox("manager ���� �˸�",true);
		
		mc.addObserver(user);
		mc.addObserver(manager);
		//����Ʈ�� �� ���þ˸� ����� �� �Ǿ�����
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
		
		if(mc.istimeOn()==true) {//�ð��� �Ǿ��� ���
			mc.meetingTimeOn();// ��� ���������� update�ϰ� ��
		}
		
		



		
	}

}
