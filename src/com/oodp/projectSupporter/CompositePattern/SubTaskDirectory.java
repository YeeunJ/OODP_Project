package com.oodp.projectSupporter.CompositePattern;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextArea;

public class SubTaskDirectory implements SubTaskNode{
	private String task;
	private List<SubTaskNode> children = new ArrayList<SubTaskNode>();
	
	public SubTaskDirectory(String task) {
		this.task = task;
	}
	
	
	
	@Override
	public String getSubTask() {
		// TODO Auto-generated method stub
		return task;
	}
	public void add(SubTaskNode Node) {
		children.add(Node);
	}
	public void remove(SubTaskNode Node) {
		children.remove(Node);
	}
	public void print(JTextArea area) {
		 for (SubTaskNode node : children) {
			 	area.append(node.getSubTask()+"\n"); 
	     }
	}
	public SubTaskNode changeDirectroy(String input, SubTaskNode origin) {
		SubTaskNode temp = null;
		int check = 0;
		System.out.println(input);
		for (SubTaskNode node : children) {
		 	if(node.getSubTask().equals("["+input+"]")) {
		 		temp = node;
		 		check = 1;
		 	}
		}
		System.out.println(input);

		if(check == 1) {
			System.out.println("done");
			return temp;
		}else {
			System.out.println("false!!!");
			return origin;
		}
	}
}
