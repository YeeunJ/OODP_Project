package com.oodp.projectSupporter.CompositePattern;

public class SubTaskFile implements SubTaskNode{
	private String task;
	
	public SubTaskFile(String task) {
		this.task = task;
	}
	
	@Override
	public String getSubTask() {
		// TODO Auto-generated method stub
		return task;
	}

}
