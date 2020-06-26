package com.oodp.projectSupporter.MainAppearence;

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
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;

import com.oodp.projectSupporter.ThemeFactory.ThemeSelection;
import com.oodp.projectSupporter.dao.Insertdao;
import com.oodp.projectSupporter.dao.PrintAlldao;
import com.oodp.projectSupporter.dao.dao;
import com.oodp.projectSupporter.dbconnection.connection;
import com.oodp.projectSupporter.dto.DTO;
import com.oodp.projectSupporter.dto.meetingDTO;
import com.oodp.projectSupporter.dto.taskDTO;
import com.oodp.projectSupporter.dto.userDTO;
import com.oodp.projectSupporter.login.Button;
import com.oodp.projectSupporter.login.Command;
import com.oodp.projectSupporter.login.Login;
import com.oodp.projectSupporter.login.LoginCommand;
import com.oodp.projectSupporter.login.RegisterCommand;

//import com.oodp.projectSupporter.meetingPage.inputFrame;

public class main_appearance {
	dao d = new dao();
	//ArrayList<String> mailList = new ArrayList<>();
	//ArrayList<String> passwordList = new ArrayList<>();
	//HashMap<String, Integer>managerMap = new HashMap();
	Button loginButton = new Button();
	userDTO user = new userDTO();
	inputFrame tf2;
	
	private JFrame frame;
	private JTextField IDtext;
	private JPasswordField passwordField;
	private JLabel lblName;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	private JLabel UserWelcomeText;
	private JLabel lblYourProject;
	private JButton meetingPaticipateButton;
	private JButton addNewMeetingButton;
	private JButton listMeetingButton;
	private JButton meetingPageBackButton;
	private JPanel taskCheckListPage;
	private JButton taskCheckListPageBackButton;
	private JLabel lblPassword_2;
	private JLabel lblNewLabel_16;
	private JTextField textField_18;
	private JTextField textField_19;
	private JLabel lblTeam;
	private JTextField textField_20;
	private JTextField positionFild;
	private JButton logOutButton;
	private ButtonGroup taskGroup;
	private meetingDTO md = new meetingDTO();
	int check = 0;
    private String currentUser;
	
	/**
	 * Launch the application.
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection conn = connection.getInstance().getConnection();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main_appearance window = new main_appearance();
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
	public main_appearance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		//mailList.add("Siin");
		//passwordList.add("1234");
		//managerMap.put("Siin", 1);
		
		frame = new JFrame();
		frame.setTitle("Program");

		// ###########################<Main Page>###############################
		PageMaster mainPageMaster = new PageMaster(new mainPageMaker());
		JPanel mainPage = mainPageMaster.createPage();
		
		
		frame.getContentPane().add(mainPage);
		
		lblNewLabel_3 = new JLabel("Main Page");
		lblNewLabel_3.setFont(new Font("굴림", Font.BOLD, 31));
		lblNewLabel_3.setBounds(133, 55, 213, 73);
		mainPage.add(lblNewLabel_3);

		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.LIGHT_GRAY);
		textPane.setBounds(133, 362, 360, 164);
		mainPage.add(textPane);

		lblNewLabel_4 = new JLabel("Announcement");
		lblNewLabel_4.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_4.setBounds(133, 318, 128, 34);
		mainPage.add(lblNewLabel_4);

		UserWelcomeText = new JLabel("Welcome " + user.getName());
		UserWelcomeText.setFont(new Font("굴림", Font.PLAIN, 24));
		UserWelcomeText.setBounds(133, 151, 264, 73);
		mainPage.add(UserWelcomeText);

		lblYourProject = new JLabel("Your Project");
		lblYourProject.setFont(new Font("굴림", Font.BOLD, 15));
		lblYourProject.setBounds(409, 173, 300, 34);
		mainPage.add(lblYourProject);
		// ######################################################################

		// ###########################<Login Page>###############################
		
		ImagePanel Login_Page = new ImagePanel(
				new ImageIcon("/Users/jeong-yeeun/git/OODP_Project/Image/Login2.jpg").getImage());
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

		JButton registrationButton = new JButton("Registration");

		registrationButton.setBounds(695, 460, 127, 40);
		Login_Page.add(registrationButton);
		// ######################################################################

		// ###########################<RegistrationPage>###############################
		PageMaster registrationPageMaster = new PageMaster(new registrationPageMaker());
		JPanel RegistrationPage = registrationPageMaster.createPage();
		frame.getContentPane().add(RegistrationPage);

		registrationButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Page.setVisible(false);
				RegistrationPage.setVisible(true);
			}
		});

		JLabel lblMail = new JLabel("Mail :");
		lblMail.setFont(new Font("굴림", Font.BOLD, 20));
		lblMail.setBounds(247, 226, 103, 41);
		RegistrationPage.add(lblMail);
		
		JLabel lblMail1 = new JLabel("Project :");
		lblMail1.setFont(new Font("굴림", Font.BOLD, 20));
		lblMail1.setBounds(600, 226, 103, 41);
		RegistrationPage.add(lblMail1);

		lblPassword_2 = new JLabel("Password :");
		lblPassword_2.setFont(new Font("굴림", Font.BOLD, 20));
		lblPassword_2.setBounds(193, 317, 136, 41);
		RegistrationPage.add(lblPassword_2);

		lblNewLabel_16 = new JLabel("Registration Page");
		lblNewLabel_16.setFont(new Font("굴림", Font.BOLD, 26));
		lblNewLabel_16.setBounds(110, 51, 299, 51);
		RegistrationPage.add(lblNewLabel_16);

		
		
		textField_18 = new JTextField();
		textField_18.setColumns(10);
		textField_18.setBounds(324, 234, 156, 30);
		RegistrationPage.add(textField_18);

		positionFild = new JTextField();
	    positionFild = new JTextField();
	    positionFild.setColumns(10);
	    positionFild.setBounds(700, 234, 156, 30);
		RegistrationPage.add(positionFild);

		
		textField_19 = new JTextField();
		textField_19.setColumns(10);
		textField_19.setBounds(324, 325, 156, 30);
		RegistrationPage.add(textField_19);

		lblTeam = new JLabel("Name :");
		lblTeam.setFont(new Font("굴림", Font.BOLD, 20));
		lblTeam.setBounds(228, 407, 136, 41);
		RegistrationPage.add(lblTeam);

		textField_20 = new JTextField();
		textField_20.setColumns(10);
		textField_20.setBounds(324, 415, 156, 30);
		RegistrationPage.add(textField_20);

		JButton registrationDoneButton = new JButton("Done");

		registrationDoneButton.setFont(new Font("굴림", Font.BOLD, 15));
		registrationDoneButton.setBounds(366, 514, 114, 41);
		RegistrationPage.add(registrationDoneButton);

		registrationDoneButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Login_Page.setVisible(true);
				
				//mailList.add(textField_18.getText());
				//passwordList.add(textField_19.getText());
				//managerMap.put(textField_18.getText(), 0);
				System.out.println(textField_18.getText());
				System.out.println(textField_19.getText());
				System.out.println(textField_20.getText());
				System.out.println(positionFild.getText());
				user.setMail(textField_18.getText());
				user.setPassword(textField_19.getText());
				user.setName(textField_20.getText());
				RegisterCommand regist = new RegisterCommand(user);
				loginButton.setCommand(regist);
				try {
					loginButton.pressed();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				JOptionPane.showMessageDialog(null, "register success!!");
				/*
				user.setMail(textField_18.getText());
				user.setPassword(textField_19.getText());
				user.setName(textField_18.getText());
				if(result) {
					user = loginButton.getData();
					System.out.println(user.toString());
					Login_Page.setVisible(false);
					mainPage.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}*/
				RegistrationPage.setVisible(false);
			}
		});
		// ######################################################################

		// ###########################<TaskPage>###############################
		PageMaster taskPageMaster = new PageMaster(new taskPageMaker());
		JPanel taskPage = taskPageMaster.createPage();
		frame.getContentPane().add(taskPage);

		JLabel lblNewLabel_10 = new JLabel("Task Page");
		lblNewLabel_10.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_10.setBounds(456, 70, 272, 107);
		taskPage.add(lblNewLabel_10);

		JLabel lblNewLabel_11 = new JLabel("All Tasks :");
		lblNewLabel_11.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_11.setBounds(127, 236, 163, 47);
		taskPage.add(lblNewLabel_11);
		/*
		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBackground(Color.LIGHT_GRAY);
		textPane_1.setBounds(381, 221, 405, 237);
		taskPage.add(textPane_1);*/
		// ####################################################################

		// ###########################<MyPage>#################################
		PageMaster myPageMaster = new PageMaster(new myPageMaker());
		JPanel myPage = myPageMaster.createPage();
		frame.getContentPane().add(myPage);
		
		
		lblName = new JLabel("Name :");
		lblName.setFont(new Font("굴림", Font.BOLD, 20));
		lblName.setBounds(569, 197, 97, 56);
		myPage.add(lblName);

		textField = new JTextField();
		textField.setBounds(687, 216, 96, 21);
		myPage.add(textField);
		textField.setColumns(10);

		textField_1 = new JTextField();
		textField_1.setBounds(687, 293, 96, 21);
		myPage.add(textField_1);
		textField_1.setColumns(10);

		textField_2 = new JTextField();
		textField_2.setBounds(687, 426, 96, 21);
		myPage.add(textField_2);
		textField_2.setColumns(10);

		JLabel lblProject = new JLabel("Project :");
		lblProject.setFont(new Font("굴림", Font.BOLD, 20));
		lblProject.setBounds(569, 477, 97, 56);
		myPage.add(lblProject);

		textField_3 = new JTextField();
		textField_3.setBounds(687, 497, 96, 21);
		myPage.add(textField_3);
		textField_3.setColumns(10);

		JLabel lblPosition = new JLabel("Position :");
		lblPosition.setFont(new Font("굴림", Font.BOLD, 20));
		lblPosition.setBounds(569, 340, 97, 56);
		myPage.add(lblPosition);

		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(687, 360, 96, 21);
		myPage.add(textField_4);

		JLabel lblMyTasks = new JLabel("My Tasks :");
		lblMyTasks.setFont(new Font("굴림", Font.BOLD, 20));
		lblMyTasks.setBounds(56, 197, 134, 56);
		myPage.add(lblMyTasks);

		JTextField textField_16 = new JTextField();
		textField_16.setBackground(Color.LIGHT_GRAY);
		textField_16.setBounds(202, 199, 266, 318);
		myPage.add(textField_16);
		textField_16.setColumns(10);
		myPage.setVisible(false);
		// ####################################################################

		// ###########################<MeetingPage>############################
		PageMaster meetingPageMaster = new PageMaster(new meetingPageMaker());
		JPanel meetingPage = meetingPageMaster.createPage();
		frame.getContentPane().add(meetingPage);
		PrintAlldao pa = new PrintAlldao("meetingPage");
		d.changedao(pa);
		try {
			d.prepareDB();
		} catch (ClassNotFoundException | SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ArrayList<DTO> data2 = pa.getdata();
		meetingDTO mdto;
		mdto = (meetingDTO) data2.get(0);
		JLabel lblNewLabel_8 = new JLabel("Meeting Page");
		lblNewLabel_8.setFont(new Font("굴림", Font.BOLD, 30));
		lblNewLabel_8.setBounds(433, 57, 244, 100);
		meetingPage.add(lblNewLabel_8);

		JLabel lblNewLabel_9 = new JLabel("Date :");
		lblNewLabel_9.setFont(new Font("굴림", Font.BOLD, 18));
		lblNewLabel_9.setBounds(550, 248, 115, 25);
		meetingPage.add(lblNewLabel_9);

		JLabel lblTitle = new JLabel("Location :");
		lblTitle.setFont(new Font("굴림", Font.BOLD, 18));
		lblTitle.setBounds(550, 306, 103, 25);
		meetingPage.add(lblTitle);

		JLabel lblContent = new JLabel("Content :");
		lblContent.setFont(new Font("굴림", Font.BOLD, 18));
		lblContent.setBounds(550, 362, 103, 25);
		meetingPage.add(lblContent);

		JLabel textField_9 = new JLabel(mdto.getDate().toString());
		textField_9.setBounds(700, 245, 175, 21);
		meetingPage.add(textField_9);

		JLabel textField_10 = new JLabel(mdto.getLocation());
		textField_10.setBounds(700, 309, 175, 21);
		meetingPage.add(textField_10);

		JLabel textField_11 = new JLabel(mdto.getContent());
		textField_11.setBounds(700, 365, 175, 21);
		meetingPage.add(textField_11);
		// ####################################################################

		// ######################<myPageAddEditPage>######################
		PageMaster myPageAddEditPageMaster = new PageMaster(new myPageAddEditPageMaker());
		JPanel myPageAddEditPage = myPageAddEditPageMaster.createPage();
		frame.getContentPane().add(myPageAddEditPage);

		JLabel lblNewLabel_7 = new JLabel("Enter New Informations");
		lblNewLabel_7.setFont(new Font("굴림", Font.BOLD, 20));
		lblNewLabel_7.setBounds(67, 97, 339, 82);
		myPageAddEditPage.add(lblNewLabel_7);

		JLabel lblId = new JLabel("ID :");
		lblId.setFont(new Font("굴림", Font.BOLD, 17));
		lblId.setBounds(124, 225, 97, 56);
		myPageAddEditPage.add(lblId);

		JLabel lblPassword_1 = new JLabel("Password :");
		lblPassword_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblPassword_1.setBounds(67, 301, 97, 56);
		myPageAddEditPage.add(lblPassword_1);

		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblName_1.setBounds(98, 377, 97, 56);
		myPageAddEditPage.add(lblName_1);

		JLabel lblProject_1 = new JLabel("Project :");
		lblProject_1.setFont(new Font("굴림", Font.BOLD, 17));
		lblProject_1.setBounds(371, 225, 97, 56);
		myPageAddEditPage.add(lblProject_1);

		JTextField textField_5 = new JTextField();
		textField_5.setBounds(162, 244, 96, 21);
		textField_5.setColumns(10);
		myPageAddEditPage.add(textField_5);

		JTextField textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(162, 320, 96, 21);
		myPageAddEditPage.add(textField_6);

		JTextField textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(162, 396, 96, 21);
		myPageAddEditPage.add(textField_7);

		JTextField textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(445, 244, 96, 21);
		myPageAddEditPage.add(textField_8);
		// ####################################################################

		// ######################<taskAddEditPage>######################
		PageMaster taskAddEditPageMaster = new PageMaster(new taskAddEditPageMaker());
		JPanel taskAddEditPage = taskAddEditPageMaster.createPage();
		frame.getContentPane().add(taskAddEditPage);

		JLabel lblNewLabel_12 = new JLabel("Manager :");
		lblNewLabel_12.setFont(new Font("굴림", Font.BOLD, 15));
		lblNewLabel_12.setBounds(257, 136, 146, 71);
		taskAddEditPage.add(lblNewLabel_12);

		JTextField textField_12 = new JTextField();
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

		JTextField textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(358, 274, 280, 46);
		taskAddEditPage.add(textField_13);

		JTextField textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(358, 379, 280, 46);
		taskAddEditPage.add(textField_14);

		JTextField textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(358, 489, 280, 46);
		taskAddEditPage.add(textField_15);

		JLabel lblNewLabel_14 = new JLabel("Task Add & Edit Page");
		lblNewLabel_14.setFont(new Font("굴림", Font.BOLD, 25));
		lblNewLabel_14.setBounds(355, 77, 358, 56);
		taskAddEditPage.add(lblNewLabel_14);
		// ####################################################################

		// ######################<taskCheckListPage>######################
		taskCheckListPage = new JPanel();
		taskCheckListPage.setVisible(false);
		taskCheckListPage.setBounds(0, 0, 1000, 640);
		frame.getContentPane().add(taskCheckListPage);
		taskCheckListPage.setLayout(null);

		taskCheckListPageBackButton = new JButton("Back");
		taskCheckListPageBackButton.setFont(new Font("굴림", Font.BOLD, 15));
		taskCheckListPageBackButton.setBounds(145, 470, 166, 81);
		taskCheckListPage.add(taskCheckListPageBackButton);
		// ####################################################################

		// ######################<taskDetailPage>######################
		PageMaster taskDetailPageMaster = new PageMaster(new taskDetailPageMaker());
		JPanel taskDetailPage = taskDetailPageMaster.createPage();
		frame.getContentPane().add(taskDetailPage);

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBackground(Color.LIGHT_GRAY);
		textPane_2.setBounds(179, 131, 544, 366);
		taskDetailPage.add(textPane_2);

		JLabel lblNewLabel_13 = new JLabel("Task Details");
		lblNewLabel_13.setFont(new Font("굴림", Font.BOLD, 17));
		lblNewLabel_13.setBounds(179, 41, 342, 48);
		taskDetailPage.add(lblNewLabel_13);
		// ####################################################################

		// ###################################################################
		// ###################################################################
		// ##########################<Buttons>################################
		// ###################################################################
		// ###################################################################

		
		// @@@@@@@@@@@@@@@@@@@@@@@@@@@<LoginPage>@@@@@@@@@@@@@@@@@@@@@@@@@
		JButton LoginEnterBttn = new JButton("Enter");
		LoginEnterBttn.setBounds(375, 513, 279, 40);
		LoginEnterBttn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//int count = 0;
				//int i = 0;
				Boolean result = false;
				user.setMail(IDtext.getText());
				user.setPassword(String.valueOf(passwordField.getPassword()));
				LoginCommand login = new LoginCommand(user);
				loginButton.setCommand(login);
				try {
					result = loginButton.pressed();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				if(result) {
					user = loginButton.getData();
					UserWelcomeText.setText("Welcome " + user.getName());
					PrintAlldao pad = new PrintAlldao("project", user.getProject_id());
					d.changedao(pad);
					try {
						d.prepareDB();
					} catch (ClassNotFoundException | SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					lblYourProject.setText("Your Project " + pad.getproject());
					System.out.println(user.toString());
					Login_Page.setVisible(false);
					mainPage.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}
				/*
				for(String arr : mailList) {
					if(arr.equals(IDtext.getText())) {
						//System.out.println(String.valueOf(passwordField.getPassword()));
						if(Arrays.equals(passwordField.getPassword(), passwordList.get(i).toCharArray())) {
							currentUser = IDtext.getText();
							count++;
							break;
						}
					}
					i++;
				}
				
				if(count==1) {
					Login_Page.setVisible(false);
					mainPage.setVisible(true);
				}else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}*/
				/*
				userDTO user = new userDTO();
				user.setMail(IDtext.getText());
				Command LoginCommand = new LoginCommand(new Login(), user);
				Button loginbutton = new Button(LoginCommand);
				try {
					if(loginbutton.pressed()) {
						Login_Page.setVisible(false);
						mainPage.setVisible(true);
					}else {
						JOptionPane.showMessageDialog(null, "You failed to log in");
					}
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}*/
				
				// TODO Auto-generated method stub
				/*if (IDtext.getText().equals("Siin")
						&& (Arrays.equals(passwordField.getPassword(), "1234".toCharArray()))) {
					Login_Page.setVisible(false);
					mainPage.setVisible(true);
				} else {
					JOptionPane.showMessageDialog(null, "You failed to log in");
				}*/
			}
		});
		Login_Page.add(LoginEnterBttn);

		// @@@@@@@@@@@@@@@@@@@@@@@@@@@<MeetingPage>@@@@@@@@@@@@@@@@@@@@@@@@
		meetingPaticipateButton = new JButton("Meeting Participate");
		meetingPaticipateButton.setFont(new Font("굴림", Font.BOLD, 15));
		meetingPaticipateButton.setBounds(168, 238, 237, 35);
		meetingPage.add(meetingPaticipateButton);
		
		listMeetingButton = new JButton("past meeting list");
		listMeetingButton.setFont(new Font("굴림", Font.BOLD, 15));
		listMeetingButton.setBounds(168, 295, 237, 35);
		meetingPage.add(listMeetingButton);
		
		addNewMeetingButton = new JButton("Add new meeting");
		addNewMeetingButton.setFont(new Font("굴림", Font.BOLD, 15));
		addNewMeetingButton.setBounds(168, 352, 237, 35);
		meetingPage.add(addNewMeetingButton);

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

		// @@@@@@@@@@@@@@@@@@@@@@@@@@@<taskAddEditPage>@@@@@@@@@@@@@@@@@@@@@@@@@
		JButton btnNewButton_2 = new JButton("Add");
		btnNewButton_2.setFont(new Font("굴림", Font.BOLD, 16));
		btnNewButton_2.setBounds(521, 562, 117, 56);
		taskAddEditPage.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				taskDTO td = new taskDTO();
				td.setMember_id(user.getUser_id());
				td.setProject_id(Integer.parseInt(textField_12.getText()));
				td.setTitle(textField_13.getText());
				td.setContent(textField_14.getText());
				
				Insertdao pa = new Insertdao("taskPage", md);
				d.changedao(pa);
				try {
					d.prepareDB();
					JOptionPane.showMessageDialog(null, "Data saving complete.");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Data saving fail. Try again!");
				}
				
			}
			
		});
		// @@@@@@@@@@@@@@@@@@@@@@@@@@@<myPageAddEditPage>@@@@@@@@@@@@@@@@@@@@@@@@@
		
		JButton btnNewButton = new JButton("Member Authority Edit");
		
		btnNewButton.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton.setBounds(352, 385, 314, 39);
		myPageAddEditPage.add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Save");
		btnNewButton_1.setFont(new Font("굴림", Font.BOLD, 20));
		btnNewButton_1.setBounds(197, 514, 209, 56);
		myPageAddEditPage.add(btnNewButton_1);

		JButton addEditGoBack = new JButton("Go Back");
		addEditGoBack.setFont(new Font("굴림", Font.BOLD, 16));
		addEditGoBack.setBounds(67, 46, 113, 41);
		myPageAddEditPage.add(addEditGoBack);

		// @@@@@@@@@@@@@@@@@@@@@@@@@@@<TaskPage>@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		JButton taskPageBackButton;
		taskPageBackButton = new JButton("Back");
		taskPageBackButton.setFont(new Font("굴림", Font.BOLD, 16));
		taskPageBackButton.setBounds(110, 435, 108, 37);
		taskPage.add(taskPageBackButton);
		taskPageBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.setVisible(true);
				taskPage.setVisible(false);
			}
		});

		JButton taskChecklistButton = new JButton("Task CheckList");
		taskChecklistButton.setFont(new Font("굴림", Font.BOLD, 20));
		taskChecklistButton.setBounds(456, 526, 233, 71);
		taskPage.add(taskChecklistButton);
		taskChecklistButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(false);
				taskCheckListPage.setVisible(true);
			}
		});

		// @@@@@@@@@@@@@@@@@@@@@@@@@@@<MainPage>@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		JButton taskPageButton = new JButton("Task Page");
		taskPageButton.setBounds(571, 490, 161, 36);
		mainPage.add(taskPageButton);
		JButton taskAddEditButton = new JButton("Task Add & Edit");
		taskPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MangerCheckClass managerCheckClass = new MangerCheckClass(user.getUser_id());
				taskAddEditButton.setVisible(managerCheckClass.checkResult());
				
				mainPage.setVisible(false);
				PrintAlldao pa = new PrintAlldao("taskPage");
				d.changedao(pa);
				try {
					d.prepareDB();
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				ArrayList<DTO> data2 = pa.getdata();
				taskGroup = new ButtonGroup();
				taskDTO td = (taskDTO)data2.get(2);
				textPane_2.setText(td.getContent());
				JRadioButton[] task = new JRadioButton[9];
				int height = 150;
				int i = 0;
				for(DTO d: data2) {
					task[i] = new JRadioButton(d.toString());
					task[i].setBounds(250, height, 700, 36);
					task[i].addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							taskDTO td = (taskDTO)data2.get((int)Math.random()%8);
							textPane_2.setText(td.getContent());
						}
					});
					height+=40;
					if(i < 8)
						taskPage.add(task[i]);
					else
						break;
					i++;
					System.out.println(d.toString());
				}
				taskPage.setVisible(true);
			}
		});

		logOutButton = new JButton("Log Out");
		logOutButton.setBounds(133, 562, 204, 45);
		mainPage.add(logOutButton);
		logOutButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.setVisible(false);
				Login_Page.setVisible(true);
			}
		});
		
		
		
		JButton myPageButton = new JButton("My Page");
		myPageButton.setBounds(571, 362, 161, 36);
		mainPage.add(myPageButton);
		myPageButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				mainPage.setVisible(false);
				myPage.setVisible(true);
				MangerCheckClass managerCheckClass = new MangerCheckClass(user.getUser_id());
				btnNewButton.setVisible(managerCheckClass.checkResult());
			}

		});

		JButton meetingPageButton = new JButton("Meeting Page");
		meetingPageButton.setBounds(571, 426, 161, 36);
		mainPage.add(meetingPageButton);
		meetingPageButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.setVisible(false);
				meetingPage.setVisible(true);
			}
		});

		// @@@@@@@@@@@@@@@@@@@@@@@@@@@<MyPage>@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		JButton myPageGoBackButton = new JButton("Go back");
		myPageGoBackButton.setFont(new Font("굴림", Font.BOLD, 20));
		myPageGoBackButton.setBounds(176, 579, 147, 33);
		myPage.add(myPageGoBackButton);

		myPageGoBackButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				myPage.setVisible(false);
				mainPage.setVisible(true);
			}
		});

		JButton myPageAddEditButton = new JButton("Add & Edit");
		myPageAddEditButton.setFont(new Font("굴림", Font.BOLD, 20));
		myPageAddEditButton.setBounds(428, 543, 183, 69);
		myPage.add(myPageAddEditButton);
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
		meetingPageBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				mainPage.setVisible(true);
				meetingPage.setVisible(false);
			}
		});

		// @@@@@@@@@@@@@@@@@@@@@@@@@@@<TaskPage>@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
		taskCheckListPageBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(true);
				taskCheckListPage.setVisible(false);
			}
		});

		JButton taskAddEditPageBackButton = new JButton("Back");
		taskAddEditPageBackButton.setFont(new Font("굴림", Font.BOLD, 16));
		taskAddEditPageBackButton.setBounds(41, 562, 117, 56);
		taskAddEditPage.add(taskAddEditPageBackButton);
		taskAddEditPageBackButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(true);
				taskAddEditPage.setVisible(false);
			}
		});

		
		
		taskAddEditButton.setFont(new Font("굴림", Font.BOLD, 20));
		taskAddEditButton.setBounds(740, 526, 233, 71);
		taskPage.add(taskAddEditButton);
		taskAddEditButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(false);
				taskAddEditPage.setVisible(true);
			}
		});

		JButton taskDetailButton = new JButton("Task Details");
		taskDetailButton.setFont(new Font("굴림", Font.BOLD, 20));
		taskDetailButton.setBounds(157, 526, 233, 71);
		taskPage.add(taskDetailButton);
		taskDetailButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				taskPage.setVisible(false);
				taskDetailPage.setVisible(true);
			}
		});

		// @@@@@@@@@@@@@@@@@@@@@@@@@@@<taskDetailPage>@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
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

		
		JButton themeChangeButton = new JButton("Theme Change");
		themeChangeButton.setBounds(433, 562, 204, 45);
		mainPage.add(themeChangeButton);
		themeChangeButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if(check == 0) {
					check = 1;
				}else {
					check = 0;
				}
				ThemeSelection themeSelection = new ThemeSelection();
				themeSelection.createTheme(check);
				mainPage.setBackground(themeSelection.bgColorReturn());
				taskPageButton.setBackground(themeSelection.btnColorReturn());
				meetingPageButton.setBackground(themeSelection.btnColorReturn());
				myPageButton.setBackground(themeSelection.btnColorReturn());
			}
			
		});
		// ###################################################################
		// ###################################################################
		// ###################################################################
		// ###################################################################
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
	}
}

class ImagePanel extends JPanel {
	private Image img;

	public ImagePanel(Image img) {
		this.img = img;
		setSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setPreferredSize(new Dimension(img.getWidth(null), img.getHeight(null)));
		setLayout(null);
	}

	public int getWidth() {
		return img.getWidth(null);
	}

	public int getHeight() {
		return img.getHeight(null);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(img, 0, 0, null);
	}

}

class inputFrame extends JDialog {
	JPanel panel = new JPanel();
	dao dr = new dao();
	public inputFrame() {
		getContentPane().add(panel);

		JLabel stlabel = new JLabel("Record meeting ");
		JLabel stlabe2 = new JLabel("");
		JLabel lab1 = new JLabel("Date,Time: ");
		JTextField date = new JTextField(20);
		JLabel lab2 = new JLabel("Title: ");
		JTextField topic = new JTextField(10);
		JLabel lab3 = new JLabel("Content: ");
		JTextField content = new JTextField(10);
		JLabel lab4 = new JLabel("project_id: ");
		JTextField project_id = new JTextField(20);
		JLabel lab5 = new JLabel("location: ");
		JTextField location = new JTextField(20);
		JLabel stlabe3 = new JLabel("");
		JButton pbtn = new JButton("Add");

		this.add(panel);
		setTitle("Add Meeting page");
		setVisible(true);

		GridLayout grid = new GridLayout(5, 2);
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
		panel.add(lab4);
		panel.add(project_id);
		panel.add(lab5);
		panel.add(location);
		panel.add(stlabe3);
		panel.add(pbtn, BorderLayout.SOUTH);

		pbtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent T) {
				DateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
				meetingDTO md = new meetingDTO();
				md.setProject_id(Integer.parseInt(project_id.getText()));
				try {
					md.setDate(new Date(sdf.parse(date.getText()).getTime()));
				} catch (ParseException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				md.setContent(content.getText());
				md.setLocation(location.getText());
				
				Insertdao pa = new Insertdao("meetingPage", md);
				dr.changedao(pa);
				try {
					dr.prepareDB();
					JOptionPane.showMessageDialog(null, "Data saving complete.");
				} catch (ClassNotFoundException | SQLException e1) {
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, "Data saving fail. Try again!");
				}
				
				System.out.println(md.toString());
				setVisible(false);
			}
		});

		this.setSize(400, 400);
		this.setModal(true);
		this.setVisible(true);

	}
}