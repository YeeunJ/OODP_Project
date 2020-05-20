import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
/*
1.미팅 참여버튼 클릭 ->미팀 프로그램으로 연결합니다.
1.미팅 추가 버튼->미팅 record로 이동
2.미팅 record 버튼-> 진행한 미팅 ,날짜, 시간, 위치, 내용 을 기록하고
			-> 파일로 저장할수 있음
*/


public class meetingPage extends JFrame {
	
	inputFrame tf2;///////이게 클릭했을때 나올 기록창임!
	
	public meetingPage() {
		
		
		//1. 미팅 참여하기 버튼을 누른다 ->zoom 으로 연결중...
		JPanel buttons =new JPanel();
		
		JButton zoom = new JButton("미팅 참여하기");
		JButton plus = new JButton("미팅 추가하기");
		buttons.add(zoom);
		buttons.add(plus);
		
		add(buttons);// 최상위 판넬에 버튼 판넬 추가
		buttons.setSize(250,40);
		buttons.setVisible(true);
		
		 zoom.addActionListener(new ActionListener()// "미팅 참여하기" 버튼 클릭하면 창 띄워짐
				 {	
			 		public void actionPerformed(ActionEvent T){
						 JOptionPane.showMessageDialog(null, "Zoom으로 연결중...");
					 }
				 });
		
		 plus.addActionListener(new ActionListener()// "미팅 추가하기" 버튼 클릭하면 다른 창 띄워짐
				 {	
			 		public void actionPerformed(ActionEvent T){
			 			tf2 = new inputFrame();
					 }
				 });
		 
		 //////2. 최상위 판넬에 정보 판넬을 버튼 판넬 밑에 만든다./////
		 	JPanel info = new JPanel();
		 	JLabel l1 = new JLabel("첫째줄");
		 	JLabel l2 = new JLabel("둘째줄");// 이제 받은걸로 라벨을 만들어야함, 연결필요!
		 	JLabel l3 = new JLabel("셋째줄");
		 	JLabel l4 = new JLabel("--------------");
		 	
		 	this.add(info);	// 최상위 판넬에 추가
		 	
			
			GridLayout grid = new GridLayout(12,1);
    		grid.setVgap(10);
    	    info.setLayout(grid);
			info.setBounds(0,60, 300, 300);
			
			info.setVisible(true);
			
		 	
			info.add(l1);
			info.add(l2);
			info.add(l3);//info 판넬에 추가
			info.add(l4);
			
			
			

		 //3. meeting record
		JPanel panel = new JPanel();
		this.add(panel);
		setVisible(true);  ///약간의 문제.... 왜 이걸 옮기면 baseP 판넬이 안보이는지 모르겠음
		setSize(400,400);
	 
	}

	
	class information extends JPanel{
		public information() {
		JPanel info = new JPanel();
	 	JLabel l1 = new JLabel("첫째줄");
	 	JLabel l2 = new JLabel("둘째줄");// 이제 받은걸로 라벨을 만들어야함, 연결필요!
	 	JLabel l3 = new JLabel("셋째줄");
	 	JLabel l4 = new JLabel("--------------");
	 	
	 	this.add(info);	// 최상위 판넬에 추가
	 	
		
		GridLayout grid = new GridLayout(12,1);
		grid.setVgap(10);
	    info.setLayout(grid);
		info.setBounds(0,60, 300, 300);
		
		info.setVisible(true);
		
	 	
		info.add(l1);
		info.add(l2);
		info.add(l3);//info 판넬에 추가
		info.add(l4);
		
		
	}
	
}
	
	
	
	class inputFrame extends JDialog{//새로운 프레임
		
        JPanel panel = new JPanel(); //라벨이 아니라 판넬 띄워야됨
        public inputFrame(){
                getContentPane().add(panel);
                
        		
        		JLabel stlabel = new JLabel("Record meeting ");
        		JLabel stlabe2 = new JLabel("");
        		JLabel lab1 = new JLabel("날짜시간: ");
        		JTextField date= new JTextField(20);
        		JLabel lab2 = new JLabel("주제");
        		JTextField topic= new JTextField(10);
        		JLabel lab3 = new JLabel("내용");
        		JTextField content = new JTextField(10);
        		JLabel stlabe3 = new JLabel("");
        		JButton pbtn= new JButton("추가");//추가 버튼 생성
        	
        		this.add(panel);
        		setTitle("Add Meeting page");
        		setVisible(true);
        		 
        		GridLayout grid = new GridLayout(5,2);
        		grid.setVgap(5);
        	    panel.setLayout(grid);
        	    
        	  //판넬에 추가
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
        		
        		 /*pbtn.addActionListener(new ActionListener()
        		 {
        			 public void actionPerformed(ActionEvent T){
        				 //데이터 저장
        				 try {
        				 BufferedWriter bf = new BufferedWriter(new FileWriter("미팅기록.txt",true));
        				 bf.write("날짜,시간 :"+ date.getText()+"\n");
        				 bf.write("주제 :"+ topic.getText()+"\n");
        				 bf.write("내용 :"+ content.getText()+"\n");
        				 bf.close();
        				 JOptionPane.showMessageDialog(null, "데이터 저장 완료되었습니다.");
        				 }
        				 
        				 catch(Exception e) {
        					 JOptionPane.showMessageDialog(null, "데이터 저장 실패하였습니다. 다시 시도해주세요!");
        			 
        				 }
        			 }
        		 });
               */
                
        	
               
                this.setSize(400,400);
                this.setModal(true);
                this.setVisible(true);
               
        }
}
	
		

	
	 public static void main(String[] args) {
         new meetingPage();
    }  
	
	 }
