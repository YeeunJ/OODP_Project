package com.oodp.projectSupporter.ObserverDP;

import javax.swing.JOptionPane;

//��ũ��Ʈ ������
public class User implements Observer {

	@Override
	public void update() {
		JOptionPane.showMessageDialog(null, " ���� �ð��Դϴ�!! ���ÿ� �����ϼ���.", "���� �˸���", JOptionPane.INFORMATION_MESSAGE);
	}

}
