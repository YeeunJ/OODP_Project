package com.oodp.projectSupporter.ObserverDP;
//��ü ������Ʈ
public interface Subject {
	public void addObserver(Observer o);//�����ڸ� add
	public void deleteObserver(Observer o);//������ ����
	public void notifyObserver();//��� �����ڵ鿡�� �˸���
	
	
}
