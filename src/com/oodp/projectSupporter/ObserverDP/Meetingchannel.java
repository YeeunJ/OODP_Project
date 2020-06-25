package com.oodp.projectSupporter.ObserverDP;

import java.util.ArrayList;
import java.util.List;

//��ũ��Ʈ ������Ʈ
public class Meetingchannel implements Subject {
	 List<Observer> observerList = new ArrayList<>();
	 
	 private boolean timeOn; //�ð��� �� �Ǿ�����

	 public boolean istimeOn(){
		 return timeOn;
	 }
	    
	 public void meetingTimeOn(){
		 // System.out.println("���� Ÿ���� �Ǿ����ϴ�");
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
