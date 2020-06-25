package com.oodp.projectSupporter.mementoDP;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {
	
	meetingpage originator1 = new meetingpage();
	taskpage originator2 = new taskpage();
    Caretaker careTaker = new Caretaker();  
	
	Button btn1; //되돌리기 버튼
	Button btn2;//새로고침 버튼 다시
	
	등록버튼을 누르면 메멘토로 상태 저장 및 복원시점 추가{  
	 originator1.setState(date,location,content); //최근 등록한 데이터들!
     careTaker.addMeeting(originator1.saveM_StateToMemento());  //복원 시점 추가
	 
	 originator2.setState(project_id,member_id,title,due_date,check); //최근 등록한 데이터들!
     careTaker.addTask(originator2.saveT_StateToMemento());  //복원 시점 추가
	}
	각 페이지의 현상태 확인 가능- 새로고침기능?{
	 originator1.getState(); //미팅페이지의 현상태
	 originator2.getState(); //태스크페이지의 현상태
	}
	 되돌아가기 버튼을 누르면!{
	 originator1.getM_StateFromMemento(careTaker.getMeeting(0));  //미팅페이지의 전상태를 가져오고
     System.out.println("저장된 전 상태: " + originator1.getState()); //나타낸다
     
     originator2.getT_StateFromMemento(careTaker.getTask(0));  //태스크페이지의 전상태를 가져오고
     System.out.println("저장된 전 상태: " + originator2.getState()); //나타낸다
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
