package com.oodp.projectSupporter.mementoDP;

import java.util.ArrayList;

//오리지네이터 역할
public class meetingpage {

	  private String date;
	  private String location;
	  private String content;
	   
	  private ArrayList<String> state = new ArrayList<String>();  //미팅 의 상태 저장
	        
	        public void setState(String d,String l, String c){  
	        	date = d;
		        location= l;
		        content= c;
	        }  
	        
	        public ArrayList<String> getState(){  
	            return state;  
	        }  
	          
	        public Memento saveM_StateToMemento(){  
	            return new Memento(date,location,content);  
	        }  
	          
	        public void getM_StateFromMemento(Memento Memento){  
	            state = Memento.getMeetingpage();  
	        }  
}
