package com.oodp.projectSupporter;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

//import com.oodp.projectSupporter.meetingPage.inputFrame;

public class main_appearence {
	inputFrame tf2;
	
	private JFrame frame;
	private JTextField IDtext;
	private JPasswordField passwordField;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JPanel mainPage;
	private JLabel lblNewLabel_3;
	private JButton myPageButton;
	private JButton meetingPageButton;
	private JLabel lblNewLabel_4;
	private JLabel UserWelcomeText;
	private JLabel lblNewLabel_5;
	private JButton myPageAddEditButton;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_7;
	private JLabel lblId;
	private JLabel lblPassword_1;
	private JLabel lblName_1;
	private JLabel lblProject_1;
	private JButton btnNewButton;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JButton btnNewButton_1;
	private JButton addEditGoBack;
	private JLabel lblYourProject;
	private JPanel taskPage;
	private JPanel meetingPage;
	private JButton meetingPaticipateButton;
	private JButton addNewMeetingButton;
	private JLabel lblNewLabel_8;
	private JLabel lblNewLabel_9;
	private JLabel lblTitle;
	private JLabel lblContent;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JButton meetingPageBackButton;
	private JPanel taskCheckListPage;
	private JPanel taskAddEditPage;
	private JButton taskPageBackButton;
	private JLabel lblNewLabel_12;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JButton taskCheckListPageBackButton;
	private JLabel lblNewLabel_14;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_appearence window = new main_appearence();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public main_appearence() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle("Program");
		
		/////////
		
		JPanel myPageAddEditPage = new JPanel();
		myPageAddEditPage.setVisible(false);
		
		meetingPage = new JPanel();
		meetingPage.setBackground(Color.WHITE);
		meetingPage.setBounds(0, 0, 1000, 640);
		meetingPage.setVisible(false);
		
		mainPage = new JPanel();
		mainPage.setBackground(Color.WHITE);
		mainPage.setBounds(0, 0, 1000, 640);
		mainPage.setVisible(false);
		
		taskPage = new JPanel();
		taskPage.setBackground(Color.WHITE);
		taskPage.setBounds(0, 0, 1000, 640);
		taskPage.setVisible(false);
		
		JPanel taskDetailPage = new JPanel();
		taskDetailPage.setBackground(Color.WHITE);
		taskDetailPage.setVisible(false);
		
		taskCheckListPage = new JPanel();
		taskCheckListPage.setVisible(false);
		
		
		
		taskAddEditPage = new JPanel();
		taskAddEditPage.setBackground(Color.WHITE);
		taskAddEditPage.setVisible(false);
		taskAddEditPage.setBounds(0, 0, 1000, 640);
		frame.getContentPane().add(taskAddEditPage);
		taskAddEditPage.setLayout(null);
		
		lblNewLabel_12 = new JLabel("Manager :");
		lblNewLabel_12.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_12.setBounds(257, 136, 146, 71);
		taskAddEditPage.add(lblNewLabel_12);
		
		textField_12 = new JTextField();
		textField_12.setBounds(358, 161, 280, 46);
		taskAddEditPage.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblDueDate = new JLabel("Due date :");
		lblDueDate.setFont(new Font("굴림", Font.BOLD, 15));
		lblDueDate.setBounds(257, 249, 146, 71);
		taskAddEditPage.add(lblDueDate);
		
		JLabel lblTitle_1 = new JLabel("Task Title :");
		lblTitle_1.setFont(new Font("굴림", Font.BOLD, 15));
		lblTitle_1.setBounds(257, 354, 146, 71);
		taskAddEditPage.add(lblTitle_1);
		
		JLabel lblContents = new JLabel("Contents :");
		lblContents.setFont(new Font("굴림", Font.BOLD, 15));
		lblContents.setBounds(257, 464, 146, 71);
		taskAddEditPage.add(lblContents);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(358, 274, 280, 46);
		taskAddEditPage.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(358, 379, 280, 46);
		taskAddEditPage.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(358, 489, 280, 46);
		taskAddEditPage.add(textField_15);
		
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 16));
		btnNewButton_2.setBounds(521, 562, 117, 56);
		taskAddEditPage.add(btnNewButton_2);
		
		JButton taskAddEditPageBackButton = new JButton("Back");
		
		taskAddEditPageBackButton.setFont(new Font("굴림", Font.BOLD, 16));
		taskAddEditPageBackButton.setBounds(41, 562, 117, 56);
		taskAddEditPage.add(taskAddEditPageBackButton);
		
		lblNewLabel_14 = new JLabel("Task Add & Edit Page");
		lblNewLabel_14.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_14.setBounds(355, 77, 358, 56);
		taskAddEditPage.add(lblNewLabel_14);
		
		taskAddEditPageBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(true);
				taskAddEditPage.setVisible(false);
			}
		});
		taskCheckListPage.setBounds(0, 0, 1000, 640);
		frame.getContentPane().add(taskCheckListPage);
		taskCheckListPage.setLayout(null);
		
		taskCheckListPageBackButton = new JButton("Back");
		
		taskCheckListPageBackButton.setFont(new Font("굴림", Font.BOLD, 15));
		taskCheckListPageBackButton.setBounds(145, 470, 166, 81);
		taskCheckListPage.add(taskCheckListPageBackButton);
		taskDetailPage.setBounds(0, 0, 1000, 640);
		frame.getContentPane().add(taskDetailPage);
		taskDetailPage.setLayout(null);
		
		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBackground(Color.LIGHT_GRAY);
		textPane_2.setBounds(179, 131, 544, 366);
		taskDetailPage.add(textPane_2);
		
		JLabel lblNewLabel_13 = new JLabel("Task Details");
		lblNewLabel_13.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_13.setBounds(179, 41, 342, 48);
		taskDetailPage.add(lblNewLabel_13);
		
		JButton taskDetailPageBackButton = new JButton("Back");
		taskDetailPageBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskDetailPage.setVisible(false);
				taskPage.setVisible(true);
			}
		});
		taskDetailPageBackButton.setFont(new Font("굴림", Font.BOLD, 15));
		taskDetailPageBackButton.setBounds(179, 548, 124, 36);
		taskDetailPage.add(taskDetailPageBackButton);
		
		
		frame.getContentPane().add(taskPage);
		taskPage.setLayout(null);
		
		JButton taskAddEditButton = new JButton("Task Add & Edit");
		
		taskAddEditButton.setFont(new Font("굴림", Font.BOLD, 20));
		taskAddEditButton.setBounds(740, 526, 233, 71);
		taskPage.add(taskAddEditButton);
		
		JLabel lblNewLabel_10 = new JLabel("Task Page");
		lblNewLabel_10.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_10.setBounds(456, 70, 272, 107);
		taskPage.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Your Tasks :");
		lblNewLabel_11.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_11.setBounds(227, 236, 163, 47);
		taskPage.add(lblNewLabel_11);
		
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setBounds(381, 221, 405, 237);
		taskPage.add(textPane_1);
		
		JButton taskChecklistButton = new JButton("Task CheckList");
		
		taskChecklistButton.setFont(new Font("굴림", Font.BOLD, 20));
		taskChecklistButton.setBounds(456, 526, 233, 71);
		taskPage.add(taskChecklistButton);
		
		JButton taskDetailButton = new JButton("Task Details");
		
		taskDetailButton.setFont(new Font("굴림", Font.BOLD, 20));
		taskDetailButton.setBounds(157, 526, 233, 71);
		taskPage.add(taskDetailButton);
		
		taskPageBackButton = new JButton("Back");
		
		taskPageBackButton.setFont(new Font("굴림", Font.BOLD, 16));
		taskPageBackButton.setBounds(157, 435, 108, 37);
		taskPage.add(taskPageBackButton);
		
		
		taskPageBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.setVisible(true);
				taskPage.setVisible(false);
			}
		});
		frame.getContentPane().add(mainPage);
		mainPage.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Main Page");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 31));
		lblNewLabel_3.setBounds(133, 55, 213, 73);
		mainPage.add(lblNewLabel_3);
		
		myPageButton = new JButton("My Page");
		myPageButton.setBounds(571, 362, 161, 36);
		mainPage.add(myPageButton);
		
		meetingPageButton = new JButton("Meeting Page");
		
		meetingPageButton.setBounds(571, 426, 161, 36);
		mainPage.add(meetingPageButton);
		
		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(133, 362, 360, 164);
		mainPage.add(textPane);
		
		lblNewLabel_4 = new JLabel("Announcement");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_4.setBounds(133, 318, 128, 34);
		mainPage.add(lblNewLabel_4);
		
		UserWelcomeText = new JLabel("Welcome "+ "Siin!");
		UserWelcomeText.setFont(new Font("굴림", Font.PLAIN, 24));
		UserWelcomeText.setBounds(133, 151, 264, 73);
		mainPage.add(UserWelcomeText);
		
		JButton taskPageButton = new JButton("Task Page");
		
		taskPageButton.setBounds(571, 490, 161, 36);
		mainPage.add(taskPageButton);
		
		lblYourProject = new JLabel("Your Project");
		lblYourProject.setFont(new Font("굴림", Font.BOLD, 15));
		lblYourProject.setBounds(409, 173, 128, 34);
		mainPage.add(lblYourProject);
		
		JPanel myPage = new JPanel();
		myPage.setBackground(Color.WHITE);
		myPage.setBounds(0, 0, 1000, 643);
		frame.getContentPane().add(myPage);
		myPage.setLayout(null);
		
		lblNewLabel_5 = new JLabel("My Page");
		lblNewLabel_5.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_5.setBounds(455, 73, 226, 108);
		myPage.add(lblNewLabel_5);
		
		myPageAddEditButton = new JButton("Add & Edit");
		myPageAddEditButton.setFont(new Font("굴림", Font.BOLD, 20));
		myPageAddEditButton.setBounds(428, 543, 183, 69);
		myPage.add(myPageAddEditButton);
		
		JLabel lblNewLabel_6 = new JLabel("ID");
		lblNewLabel_6.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_6.setBounds(248, 340, 97, 56);
		myPage.add(lblNewLabel_6);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("굴림", Font.BOLD, 20));
		lblPassword.setBounds(248, 406, 97, 56);
		myPage.add(lblPassword);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("굴림", Font.BOLD, 20));
		lblName.setBounds(248, 263, 97, 56);
		myPage.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(366, 282, 96, 21);
		myPage.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(366, 359, 96, 21);
		myPage.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(366, 425, 96, 21);
		myPage.add(textField_2);
		textField_2.setColumns(10);
		
		JButton myPageGoBackButton = new JButton("Go back");
		myPageGoBackButton.setFont(new Font("굴림", Font.BOLD, 20));
		myPageGoBackButton.setBounds(176, 579, 147, 33);
		myPage.add(myPageGoBackButton);
		
		JLabel lblProject = new JLabel("Project");
		lblProject.setFont(new Font("굴림", Font.BOLD, 20));
		lblProject.setBounds(569, 263, 97, 56);
		myPage.add(lblProject);
		
		textField_3 = new JTextField();
		textField_3.setBounds(693, 282, 96, 21);
		myPage.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("굴림", Font.BOLD, 20));
		lblPosition.setBounds(569, 340, 97, 56);
		myPage.add(lblPosition);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(693, 359, 96, 21);
		myPage.add(textField_4);
		myPage.setVisible(false);
		//
		myPageGoBackButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myPage.setVisible(false);
				mainPage.setVisible(true);
			}	
		});
		
		myPageAddEditButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myPage.setVisible(false);
				myPageAddEditPage.setVisible(true);
			}
		});
		
		ImagePanel Login_Page = new ImagePanel(new ImageIcon("Image/Login2.jpg").getImage());
		Login_Page.setBounds(0, 0, 1000, 640);
		frame.getContentPane().add(Login_Page);
		frame.setSize(Login_Page.getWidth(), Login_Page.getHeight());
		Login_Page.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setBounds(375, 337, 161, 63);
		lblNewLabel.setFont(new Font("굴림", Font.BOLD, 25));
		Login_Page.add(lblNewLabel);
		
		IDtext = new JTextField();
		IDtext.setBounds(375, 398, 279, 32);
		IDtext.setToolTipText("");
		Login_Page.add(IDtext);
		IDtext.setColumns(10);
		
		JButton LoginEnterBttn = new JButton("Enter");
		LoginEnterBttn.setBounds(375, 513, 279, 40);
		
		LoginEnterBttn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(IDtext.getText().equals("Siin") && (Arrays.equals(passwordField.getPassword(), "1234".toCharArray())) )  {
					Login_Page.setVisible(false);
					mainPage.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
			}
		});
		Login_Page.add(LoginEnterBttn);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(375, 456, 279, 32);
		passwordField.setToolTipText("");
		Login_Page.add(passwordField);
		
		lblNewLabel_1 = new JLabel("ID   ");
		lblNewLabel_1.setBounds(317, 406, 50, 15);
		lblNewLabel_1.setFont(new Font("굴림", Font.BOLD, 12));
		Login_Page.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(297, 464, 79, 15);
		lblNewLabel_2.setFont(new Font("굴림", Font.BOLD, 12));
		Login_Page.add(lblNewLabel_2);
		
	
		frame.getContentPane().add(meetingPage);
		meetingPage.setLayout(null);
		
		meetingPaticipateButton = new JButton("Meeting Participate");
		
		meetingPaticipateButton.setFont(new Font("굴림", Font.BOLD, 15));
		meetingPaticipateButton.setBounds(168, 238, 237, 35);
		meetingPage.add(meetingPaticipateButton);
		
		addNewMeetingButton = new JButton("Add new meeting");
		
		addNewMeetingButton.setFont(new Font("굴림", Font.BOLD, 15));
		addNewMeetingButton.setBounds(168, 352, 237, 35);
		meetingPage.add(addNewMeetingButton);
		
		lblNewLabel_8 = new JLabel("Meeting Page");
		lblNewLabel_8.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_8.setBounds(433, 57, 244, 100);
		meetingPage.add(lblNewLabel_8);
		
		lblNewLabel_9 = new JLabel("Date, Time :");
		lblNewLabel_9.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_9.setBounds(550, 248, 115, 25);
		meetingPage.add(lblNewLabel_9);
		
		lblTitle = new JLabel("Title :");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 18));
		lblTitle.setBounds(550, 306, 103, 25);
		meetingPage.add(lblTitle);
		
		lblContent = new JLabel("Content :");
		lblContent.setFont(new Font("굴림", Font.BOLD, 18));
		lblContent.setBounds(550, 362, 103, 25);
		meetingPage.add(lblContent);
		
		textField_9 = new JTextField();
		textField_9.setBounds(700, 245, 175, 21);
		meetingPage.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(700, 309, 175, 21);
		meetingPage.add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(700, 365, 175, 21);
		meetingPage.add(textField_11);
		
		meetingPageBackButton = new JButton("Back");
		
		meetingPageBackButton.setFont(new Font("굴림", Font.BOLD, 20));
		meetingPageBackButton.setBounds(155, 489, 147, 47);
		meetingPage.add(meetingPageBackButton);
		
		meetingPaticipateButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Connect to zoom...");
			}
		});
		
		addNewMeetingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf2 = new inputFrame();
			}
		});
		
		
		myPageAddEditPage.setBackground(Color.WHITE);
		myPageAddEditPage.setBounds(0, 0, 1000, 643);
		frame.getContentPane().add(myPageAddEditPage);
		myPageAddEditPage.setLayout(null);
		
		lblNewLabel_7 = new JLabel("Enter New Informations");
		lblNewLabel_7.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_7.setBounds(67, 97, 339, 82);
		myPageAddEditPage.add(lblNewLabel_7);
		
		lblId = new JLabel("ID :");
		lblId.setFont(new Font("굴림", Font.BOLD, 17));
		lblId.setBounds(124, 225, 97, 56);
		myPageAddEditPage.add(lblId);
		
		lblPassword_1 = new JLabel("Password :");
		lblPassword_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblPassword_1.setBounds(67, 301, 97, 56);
		myPageAddEditPage.add(lblPassword_1);
		
		lblName_1 = new JLabel("Name :");
		lblName_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblName_1.setBounds(98, 377, 97, 56);
		myPageAddEditPage.add(lblName_1);
		
		lblProject_1 = new JLabel("Project :");
		lblProject_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblProject_1.setBounds(371, 225, 97, 56);
		myPageAddEditPage.add(lblProject_1);
		
		btnNewButton = new JButton("Member Authority Edit");
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(352, 385, 314, 39);
		myPageAddEditPage.add(btnNewButton);
		
		textField_5 = new JTextField();
		textField_5.setBounds(162, 244, 96, 21);
		myPageAddEditPage.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(162, 320, 96, 21);
		myPageAddEditPage.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(162, 396, 96, 21);
		myPageAddEditPage.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(445, 244, 96, 21);
		myPageAddEditPage.add(textField_8);
		
		btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(197, 514, 209, 56);
		myPageAddEditPage.add(btnNewButton_1);
		
		addEditGoBack = new JButton("Go Back");
		
		addEditGoBack.setFont(new Font("굴림", Font.BOLD, 16));
		addEditGoBack.setBounds(67, 46, 113, 41);
		myPageAddEditPage.add(addEditGoBack);
		addEditGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myPage.setVisible(true);
				myPageAddEditPage.setVisible(false);
			}
		});
		meetingPageBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.setVisible(true);
				meetingPage.setVisible(false);
			}
		});
		taskPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.setVisible(false);
				taskPage.setVisible(true);
			}
		});
		meetingPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.setVisible(false);
				meetingPage.setVisible(true);
			}
		});
		myPageButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainPage.setVisible(false);
				myPage.setVisible(true);
			}
			
		});
		taskDetailButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(false);
				taskDetailPage.setVisible(true);
			}
		});
		taskChecklistButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(false);
				taskCheckListPage.setVisible(true);
			}
		});
		taskAddEditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(false);
				taskAddEditPage.setVisible(true);
			}
		});
		taskCheckListPageBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(true);
				taskCheckListPage.setVisible(false);
			}
		});
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}

class ImagePanel extends JPanel{
	private Image img;
	
	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null) ));
		setPreferredSize(new Dimension(img.getWidth(null),img.getHeight(null)));
		setLayout(null);
	}
	
	public int getWidth() {
		return img.getWidth(null);
	}
	
	public int getHeight() {
		return img.getHeight(null);
	}
	
	public void paintComponent(Graphics g) {
		g.drawImage(img,0,0,null);
	}
	
}

class inputFrame extends JDialog{
	
    JPanel panel = new JPanel(); 
    public inputFrame(){
            getContentPane().add(panel);
            
    		JLabel stlabel = new JLabel("Record meeting ");
    		JLabel stlabe2 = new JLabel("");
    		JLabel lab1 = new JLabel("Date,Time: ");
    		JTextField date= new JTextField(20);
    		JLabel lab2 = new JLabel("Title");
    		JTextField topic= new JTextField(10);
    		JLabel lab3 = new JLabel("Content");
    		JTextField content = new JTextField(10);
    		JLabel stlabe3 = new JLabel("");
    		JButton pbtn= new JButton("Add");
    	
    		this.add(panel);
    		setTitle("Add Meeting page");
    		setVisible(true);
    		 
    		GridLayout grid = new GridLayout(5,2);
    		grid.setVgap(5);
    	    panel.setLayout(grid);
    	    
    		panel.add(stlabel);
    		panel.add(stlabe2);
    		panel.add(lab1);
    		panel.add(date);
    		panel.add(lab2);
    		panel.add(topic);
    		panel.add(lab3);
    		panel.add(content);
    		panel.add(stlabe3);
    		panel.add(pbtn, BorderLayout.SOUTH);
    		
    		 pbtn.addActionListener(new ActionListener()
    		 {
    			 public void actionPerformed(ActionEvent T){
    				 
    				 try {
	    				 BufferedWriter bf = new BufferedWriter(new FileWriter("meetingRecord.txt",true));
	    				 bf.write("Date,Time :"+ date.getText()+"\n");
	    				 bf.write("Title :"+ topic.getText()+"\n");
	    				 bf.write("Content :"+ content.getText()+"\n");
	    				 bf.close();
	    				 JOptionPane.showMessageDialog(null, "Data saving complete.");
    				 }
    				 
    				 catch(Exception e) {
    					 JOptionPane.showMessageDialog(null, "Data saving fail. Try again!");
    			 
    				 }
    			 }
    		 });
           
            this.setSize(400,400);
            this.setModal(true);
            this.setVisible(true);
           
    }
}
