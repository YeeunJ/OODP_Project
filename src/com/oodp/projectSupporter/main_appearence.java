package com.oodp.projectSupporter;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;

public class main_appearence {


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
		
		mainPage = new JPanel();
		mainPage.setBackground(Color.WHITE);
		mainPage.setBounds(0, 0, 1000, 640);
		mainPage.setVisible(false);
		
		taskPage = new JPanel();
		taskPage.setBackground(Color.WHITE);
		taskPage.setBounds(0, 0, 1000, 640);
		taskPage.setVisible(false);
		frame.getContentPane().add(taskPage);
		frame.getContentPane().add(mainPage);
		mainPage.setLayout(null);
		
		lblNewLabel_3 = new JLabel("Main Page");
		lblNewLabel_3.setFont(new Font("±¼¸²", Font.BOLD, 31));
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
		lblNewLabel_4.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblNewLabel_4.setBounds(133, 318, 128, 34);
		mainPage.add(lblNewLabel_4);
		
		UserWelcomeText = new JLabel("Welcome "+ "Siin!");
		UserWelcomeText.setFont(new Font("±¼¸²", Font.PLAIN, 24));
		UserWelcomeText.setBounds(133, 151, 264, 73);
		mainPage.add(UserWelcomeText);
		
		JButton taskPageButton = new JButton("Task Page");
		taskPageButton.setBounds(571, 490, 161, 36);
		mainPage.add(taskPageButton);
		
		lblYourProject = new JLabel("Your Project");
		lblYourProject.setFont(new Font("±¼¸²", Font.BOLD, 15));
		lblYourProject.setBounds(409, 173, 128, 34);
		mainPage.add(lblYourProject);
		
		
		myPageAddEditPage.setBackground(Color.WHITE);
		myPageAddEditPage.setBounds(0, 0, 1000, 643);
		frame.getContentPane().add(myPageAddEditPage);
		myPageAddEditPage.setLayout(null);
		
		lblNewLabel_7 = new JLabel("Enter New Informations");
		lblNewLabel_7.setFont(new Font("±¼¸²", Font.BOLD, 20));
		lblNewLabel_7.setBounds(67, 97, 339, 82);
		myPageAddEditPage.add(lblNewLabel_7);
		
		lblId = new JLabel("ID :");
		lblId.setFont(new Font("±¼¸²", Font.BOLD, 17));
		lblId.setBounds(124, 225, 97, 56);
		myPageAddEditPage.add(lblId);
		
		lblPassword_1 = new JLabel("Password :");
		lblPassword_1.setFont(new Font("±¼¸²", Font.BOLD, 17));
		lblPassword_1.setBounds(67, 301, 97, 56);
		myPageAddEditPage.add(lblPassword_1);
		
		lblName_1 = new JLabel("Name :");
		lblName_1.setFont(new Font("±¼¸²", Font.BOLD, 17));
		lblName_1.setBounds(98, 377, 97, 56);
		myPageAddEditPage.add(lblName_1);
		
		lblProject_1 = new JLabel("Project :");
		lblProject_1.setFont(new Font("±¼¸²", Font.BOLD, 17));
		lblProject_1.setBounds(371, 225, 97, 56);
		myPageAddEditPage.add(lblProject_1);
		
		btnNewButton = new JButton("Member Authority Edit");
		btnNewButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
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
		btnNewButton_1.setFont(new Font("±¼¸²", Font.BOLD, 20));
		btnNewButton_1.setBounds(197, 514, 209, 56);
		myPageAddEditPage.add(btnNewButton_1);
		
		addEditGoBack = new JButton("Go Back");
		
		addEditGoBack.setFont(new Font("±¼¸²", Font.BOLD, 16));
		addEditGoBack.setBounds(67, 46, 113, 41);
		myPageAddEditPage.add(addEditGoBack);
		
		JPanel myPage = new JPanel();
		myPage.setBackground(Color.WHITE);
		myPage.setBounds(0, 0, 1000, 643);
		frame.getContentPane().add(myPage);
		myPage.setLayout(null);
		
		lblNewLabel_5 = new JLabel("My Page");
		lblNewLabel_5.setFont(new Font("±¼¸²", Font.BOLD, 30));
		lblNewLabel_5.setBounds(455, 73, 226, 108);
		myPage.add(lblNewLabel_5);
		
		myPageAddEditButton = new JButton("Add & Edit");
		myPageAddEditButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		myPageAddEditButton.setBounds(428, 543, 183, 69);
		myPage.add(myPageAddEditButton);
		
		JLabel lblNewLabel_6 = new JLabel("ID");
		lblNewLabel_6.setFont(new Font("±¼¸²", Font.BOLD, 17));
		lblNewLabel_6.setBounds(248, 340, 97, 56);
		myPage.add(lblNewLabel_6);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("±¼¸²", Font.BOLD, 17));
		lblPassword.setBounds(248, 406, 97, 56);
		myPage.add(lblPassword);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("±¼¸²", Font.BOLD, 17));
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
		myPageGoBackButton.setFont(new Font("±¼¸²", Font.BOLD, 20));
		myPageGoBackButton.setBounds(107, 99, 147, 33);
		myPage.add(myPageGoBackButton);
		
		JLabel lblProject = new JLabel("Project");
		lblProject.setFont(new Font("±¼¸²", Font.BOLD, 17));
		lblProject.setBounds(569, 263, 97, 56);
		myPage.add(lblProject);
		
		textField_3 = new JTextField();
		textField_3.setBounds(693, 282, 96, 21);
		myPage.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblPosition = new JLabel("Position");
		lblPosition.setFont(new Font("±¼¸²", Font.BOLD, 17));
		lblPosition.setBounds(569, 340, 97, 56);
		myPage.add(lblPosition);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(693, 359, 96, 21);
		myPage.add(textField_4);
		myPage.setVisible(false);
		
		ImagePanel Login_Page = new ImagePanel(new ImageIcon("C:/Users/bsi05/git/OODP_Project/Image/Login2.jpg").getImage());
		Login_Page.setBounds(0, 0, 1000, 640);
		frame.getContentPane().add(Login_Page);
		frame.setSize(Login_Page.getWidth(), Login_Page.getHeight());
		Login_Page.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Log In");
		lblNewLabel.setBounds(375, 337, 161, 63);
		lblNewLabel.setFont(new Font("±¼¸²", Font.BOLD, 25));
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
		
		myPageGoBackButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myPage.setVisible(false);
				mainPage.setVisible(true);
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
		
		myPageAddEditButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myPage.setVisible(false);
				myPageAddEditPage.setVisible(true);
			}
		});
		addEditGoBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myPage.setVisible(true);
				myPageAddEditPage.setVisible(false);
			}
		});
			Login_Page.add(LoginEnterBttn);
			
			passwordField = new JPasswordField();
			passwordField.setBounds(375, 456, 279, 32);
			passwordField.setToolTipText("");
			Login_Page.add(passwordField);
			
			lblNewLabel_1 = new JLabel("ID   ");
			lblNewLabel_1.setBounds(317, 406, 50, 15);
			lblNewLabel_1.setFont(new Font("±¼¸²", Font.BOLD, 12));
			Login_Page.add(lblNewLabel_1);
			
			lblNewLabel_2 = new JLabel("Password");
			lblNewLabel_2.setBounds(297, 464, 79, 15);
			lblNewLabel_2.setFont(new Font("±¼¸²", Font.BOLD, 12));
			Login_Page.add(lblNewLabel_2);
		//frame.setBounds(100, 100, 800, 600);
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
