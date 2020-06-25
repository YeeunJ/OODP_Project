package com.oodp.projectSupporter.CompositePattern;

import java.util.List;

public class SubTaskDirectory implements SubTaskNode{
	private String task;
	private List<SubTaskNode> children;
	
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
}
