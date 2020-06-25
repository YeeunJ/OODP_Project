package com.oodp.projectSupporter.mementoDP;

import java.util.ArrayList;

import com.oodp.projectSupporter.dto.DTO;

public class Memento {
     
      private ArrayList<DTO> data = new ArrayList<DTO>();
      private String check;
      private String state;
	  
	  private ArrayList<String> arrList1 = new ArrayList<String>();  //����
	  private ArrayList<String> arrList2 = new ArrayList<String>();  //�׽�ũ
	  
	  
	   Memento(ArrayList<DTO> data, String check, String state) {
	        this.data = data;
	        this.check = check; // "meetingPage", "taskPage"
	        this.state = state; // "undo" -> delete, "redo" -> insert
	    }
	  
	  public void setMeetingpage(String p,String m, String t, String d, String c) {
		  arrList1.add(p);
		  arrList1.add(m);
		  arrList1.add(t);
		  arrList1.add(d);
		  arrList1.add(c);  
	  }
	  

	  public void setTaskpage(String d,String l, String c) {
		  arrList2.add(d);
		  arrList2.add(l);
		  arrList2.add(c);
	  }
	  
	  
	  public ArrayList<String> getMeetingpage() {
		  return arrList1;  
	  }
	  

	  public ArrayList<String> getTaskpage() {  
		  return arrList2;
	  }
	  
	 
 }

