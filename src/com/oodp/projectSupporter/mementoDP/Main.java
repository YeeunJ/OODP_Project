package com.oodp.projectSupporter.mementoDP;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
	
	meetingpage originator1 = new meetingpage();
	taskpage originator2 = new taskpage();
    Caretaker careTaker = new Caretaker();  
	
	Button btn1; //�ǵ����� ��ư
	Button btn2;//���ΰ�ħ ��ư �ٽ�
	
	��Ϲ�ư�� ������ �޸���� ���� ���� �� �������� �߰�{  
	 originator1.setState(date,location,content); //�ֱ� ����� �����͵�!
     careTaker.addMeeting(originator1.saveM_StateToMemento());  //���� ���� �߰�
	 
	 originator2.setState(project_id,member_id,title,due_date,check); //�ֱ� ����� �����͵�!
     careTaker.addTask(originator2.saveT_StateToMemento());  //���� ���� �߰�
	}
	�� �������� ������ Ȯ�� ����- ���ΰ�ħ���?{
	 originator1.getState(); //������������ ������
	 originator2.getState(); //�½�ũ�������� ������
	}
	 �ǵ��ư��� ��ư�� ������!{
	 originator1.getM_StateFromMemento(careTaker.getMeeting(0));  //������������ �����¸� ��������
     System.out.println("����� �� ����: " + originator1.getState()); //��Ÿ����
     
     originator2.getT_StateFromMemento(careTaker.getTask(0));  //�½�ũ�������� �����¸� ��������
     System.out.println("����� �� ����: " + originator2.getState()); //��Ÿ����
	 }
	 
	Main(){
		 btn1.addActionListener(new EventHandler1());
		 btn2.addActionListener(new EventHandler2());
	}
	
	

	class EventHandler1 implements ActionListener {
		 
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    
	}
	
	class EventHandler2 implements ActionListener {
		 
        @Override
        public void actionPerformed(ActionEvent e) {
            
        }
    
	}
}
