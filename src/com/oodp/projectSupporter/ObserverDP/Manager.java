package com.oodp.projectSupporter.ObserverDP;

import javax.swing.JOptionPane;

public class Manager implements Observer {

	@Override
	public void update() {
		JOptionPane.showMessageDialog(null, " ���� �ð��Դϴ�!! ������ �������ּ���.", "���� �˸���", JOptionPane.INFORMATION_MESSAGE);
	}

}
