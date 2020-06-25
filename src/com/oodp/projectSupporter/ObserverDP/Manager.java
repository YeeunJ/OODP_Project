package com.oodp.projectSupporter.ObserverDP;

import javax.swing.JOptionPane;

public class Manager implements Observer {

	@Override
	public void update() {
		JOptionPane.showMessageDialog(null, " 미팅 시간입니다!! 미팅을 생성해주세요.", "미팅 알림이", JOptionPane.INFORMATION_MESSAGE);
	}

}
