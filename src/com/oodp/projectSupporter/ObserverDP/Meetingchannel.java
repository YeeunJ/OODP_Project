package com.oodp.projectSupporter.ObserverDP;

import java.util.ArrayList;
import java.util.List;

//컨크리트 서브젝트
public class Meetingchannel implements Subject {
	 List<Observer> observerList = new ArrayList<>();
	 
	 private boolean timeOn; //시간이 다 되었는지

	 public boolean istimeOn(){
		 return timeOn;
	 }
	    
	 public void meetingTimeOn(){
		 // System.out.println("미팅 타임이 되었습니다");
		 timeOn = true;
		 notifyObserver();
	 }

	 @Override
	 public void addObserver(Observer o){

		observerList.add(o);
	}

	@Override
	public void deleteObserver(Observer o){
	
		observerList.remove(o);
	}

	@Override
	public void notifyObserver() {
		for(Observer o : observerList){
	            o.update();
	    }
	}

}
