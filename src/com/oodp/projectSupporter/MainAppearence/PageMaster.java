package com.oodp.projectSupporter.MainAppearence;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PageMaster {
	private PageMaker pagemaker;
	
	public PageMaster(PageMaker pagemaker) {
		this.pagemaker=pagemaker;
	}
	
	public JPanel createPage() {
		return pagemaker.makePage();
	}
	
	public void setCustom(PageMaker pagemaker) {
		this.pagemaker=pagemaker;
	}
}
