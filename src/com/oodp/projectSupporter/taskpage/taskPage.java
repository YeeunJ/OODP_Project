package com.oodp.projectSupporter.taskpage;

import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.*;

@SuppressWarnings("serial")
public class taskPage extends JFrame {
	
	private JTextField field, field2, field3;
	private JLabel label, label2, label3, label4;
	private JPanel panel, panel2;
	private JButton button, button2;
	private ActionListener al = new taskPageAction();
	String title, contents;
	Date due_date;
	
	public void generatePage(){
		this.setTitle("taskPage");
        this.setSize(600, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		field = new JTextField(10);
		field2 = new JTextField(30);
		field3 = new JTextField(10);
		label = new JLabel("모든 task 내용 출력");
		label2 = new JLabel("제목");
		label3 = new JLabel("내용");
		label4 = new JLabel("마감 기한");
		panel = new JPanel();
		panel2 = new JPanel();
		button = new JButton("입력");
		button2 = new JButton("출력");

		field.setText("");
		field2.setText("");
		field3.setText("");

		button.addActionListener(al);
		button2.addActionListener(al);



		panel.add(label2);
		panel.add(field);
		panel.add(label3);
		panel.add(field2);
		panel.add(label4);
		panel.add(field3);
		panel.add(button);
		panel.add(button2);
		panel.add(label);
		this.add(panel);
		this.add(panel2);
		this.setVisible(true);
	}
	
	public class taskPageAction implements ActionListener {
		ArrayList<taskDTO> tasks;
		taskDAO td;
		@Override
		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				taskDTO task = new taskDTO();
				title = String.valueOf(field.getText());
				contents = String.valueOf(field2.getText());
				due_date = Date.valueOf(field3.getText());

				task.setTitle(title);
				task.setContent(contents);
				task.setDue_date(due_date);
				try {
					td.insertTask(task);
				} catch (ClassNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			} else if (e.getSource() == button2) {
				try {
					tasks = td.selectAllTask();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				for (taskDTO t : tasks)
					panel2.add(new Label(t.toString()));
			}
			
		}
	}
}
