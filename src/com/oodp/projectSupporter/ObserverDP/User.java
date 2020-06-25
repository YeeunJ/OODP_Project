package com.oodp.projectSupporter.ObserverDP;

import javax.swing.JOptionPane;

//컨크리트 옵저버
public class User implements Observer {

	@Override
	public void update() {
		JOptionPane.showMessageDialog(null, " 미팅 시간입니다!! 미팅에 참석하세요.", "미팅 알림이", JOptionPane.INFORMATION_MESSAGE);
	}

}
