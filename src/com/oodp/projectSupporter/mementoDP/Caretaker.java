package com.oodp.projectSupporter.mementoDP;
//caretaker 역할

import java.util.ArrayList;

public class Caretaker {

	  private ArrayList<Memento> MementoList1 = new ArrayList<Memento>();  //미팅
	  private ArrayList<Memento> MementoList2 = new ArrayList<Memento>();  //테스크
	  
	  
    public void addMeeting(Memento state){  
    	MementoList1.add(state);  
    }  
  
    public Memento getMeeting(int index){  
        return MementoList1.get(index);  
    }  
    
    public void addTask(Memento state){  
    	MementoList2.add(state);  
    }  
  
    public Memento getTask(int index){  
        return MementoList2.get(index);  
    }  
    
    
	
}
