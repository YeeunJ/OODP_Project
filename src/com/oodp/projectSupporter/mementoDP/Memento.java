package com.oodp.projectSupporter.mementoDP;

import java.util.ArrayList;

public class Memento {
     
      private String date;
	  private String location;
	  private String content;
	  
	  private String project_id;
	  private String member_id;
	  private String title;
	  private String due_date;
	  private String check;
	  
	  private ArrayList<String> arrList1 = new ArrayList<String>();  //미팅
	  private ArrayList<String> arrList2 = new ArrayList<String>();  //테스크
	  
	  
	   Memento(String d,String l, String c) {
	        date = d;
	        location= l;
	        content= c;
	    }
	  
	   Memento(String p,String m, String t, String d, String c) {
	    	project_id=p;
	  		member_id=m;
	  		title=t;
	  		due_date=d;	
	  		check=c;  
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

