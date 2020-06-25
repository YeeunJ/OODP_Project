package com.oodp.projectSupporter.mementoDP;

import java.util.ArrayList;

//������������ ����
public class meetingpage {

	  private String date;
	  private String location;
	  private String content;
	   
	  private ArrayList<String> state = new ArrayList<String>();  //���� �� ���� ����
	        
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
	        /*
	        public ArrayList<DTO> getData(){
	        	return data2;
	        }*/
}
