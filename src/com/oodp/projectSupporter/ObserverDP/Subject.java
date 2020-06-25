package com.oodp.projectSupporter.ObserverDP;
//주체 서브젝트
public interface Subject {
	public void addObserver(Observer o);//관찰자를 add
	public void deleteObserver(Observer o);//관찰자 제거
	public void notifyObserver();//모든 관찰자들에게 알린다
	
	
}
