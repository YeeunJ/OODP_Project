package com.oodp.projectSupporter.mementoDP;
//������������ ����

import java.util.ArrayList;

public class taskpage {
	  private String project_id;
	  private String member_id;
	  private String title;
	  private String due_date;
	  private String check;

	  
	  private ArrayList<String> state = new ArrayList<String>();  //�½�ũ �� ���� ����
      
      public void setState(String p,String m, String t, String d, String c){  
    	  	project_id=p;
	  		member_id=m;
	  		title=t;
	  		due_date=d;	
	  		check=c;	        
      }  
      
      public ArrayList<String> getState(){  
          return state;  
      }  
        
      public Memento saveT_StateToMemento(){  
          return new Memento(project_id,member_id,title,due_date,check);  
      }  
        
      public void getT_StateFromMemento(Memento Memento){  
          state = Memento.getTaskpage();  
      }  
}
