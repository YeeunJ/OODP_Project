package com.oodp.projectSupporter.mementoDP;
//caretaker ����

import java.util.ArrayList;

public class Caretaker {

	  private ArrayList<Memento> MementoList1 = new ArrayList<Memento>();  //����
	  private ArrayList<Memento> MementoList2 = new ArrayList<Memento>();  //�׽�ũ
	  
	  
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
