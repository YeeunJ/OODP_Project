import javax.swing.*;
import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.BufferedWriter;
import java.io.FileWriter;
/*
1.���� ������ư Ŭ�� ->���� ���α׷����� �����մϴ�.
1.���� �߰� ��ư->���� record�� �̵�
2.���� record ��ư-> ������ ���� ,��¥, �ð�, ��ġ, ���� �� ����ϰ�
			-> ���Ϸ� �����Ҽ� ����
*/


public class meetingPage extends JFrame {
	
	inputFrame tf2;///////�̰� Ŭ�������� ���� ���â��!
	
	public meetingPage() {
		
		
		//1. ���� �����ϱ� ��ư�� ������ ->zoom ���� ������...
		JPanel buttons =new JPanel();
		
		JButton zoom = new JButton("���� �����ϱ�");
		JButton plus = new JButton("���� �߰��ϱ�");
		buttons.add(zoom);
		buttons.add(plus);
		
		add(buttons);// �ֻ��� �ǳڿ� ��ư �ǳ� �߰�
		buttons.setSize(250,40);
		buttons.setVisible(true);
		
		 zoom.addActionListener(new ActionListener()// "���� �����ϱ�" ��ư Ŭ���ϸ� â �����
				 {	
			 		public void actionPerformed(ActionEvent T){
						 JOptionPane.showMessageDialog(null, "Zoom���� ������...");
					 }
				 });
		
		 plus.addActionListener(new ActionListener()// "���� �߰��ϱ�" ��ư Ŭ���ϸ� �ٸ� â �����
				 {	
			 		public void actionPerformed(ActionEvent T){
			 			tf2 = new inputFrame();
					 }
				 });
		 
		 //////2. �ֻ��� �ǳڿ� ���� �ǳ��� ��ư �ǳ� �ؿ� �����./////
		 	JPanel info = new JPanel();
		 	JLabel l1 = new JLabel("ù°��");
		 	JLabel l2 = new JLabel("��°��");// ���� �����ɷ� ���� ��������, �����ʿ�!
		 	JLabel l3 = new JLabel("��°��");
		 	JLabel l4 = new JLabel("--------------");
		 	
		 	this.add(info);	// �ֻ��� �ǳڿ� �߰�
		 	
			
			GridLayout grid = new GridLayout(12,1);
    		grid.setVgap(10);
    	    info.setLayout(grid);
			info.setBounds(0,60, 300, 300);
			
			info.setVisible(true);
			
		 	
			info.add(l1);
			info.add(l2);
			info.add(l3);//info �ǳڿ� �߰�
			info.add(l4);
			
			
			

		 //3. meeting record
		JPanel panel = new JPanel();
		this.add(panel);
		setVisible(true);  ///�ణ�� ����.... �� �̰� �ű�� baseP �ǳ��� �Ⱥ��̴��� �𸣰���
		setSize(400,400);
	 
	}

	
	class information extends JPanel{
		public information() {
		JPanel info = new JPanel();
	 	JLabel l1 = new JLabel("ù°��");
	 	JLabel l2 = new JLabel("��°��");// ���� �����ɷ� ���� ��������, �����ʿ�!
	 	JLabel l3 = new JLabel("��°��");
	 	JLabel l4 = new JLabel("--------------");
	 	
	 	this.add(info);	// �ֻ��� �ǳڿ� �߰�
	 	
		
		GridLayout grid = new GridLayout(12,1);
		grid.setVgap(10);
	    info.setLayout(grid);
		info.setBounds(0,60, 300, 300);
		
		info.setVisible(true);
		
	 	
		info.add(l1);
		info.add(l2);
		info.add(l3);//info �ǳڿ� �߰�
		info.add(l4);
		
		
	}
	
}
	
	
	
	class inputFrame extends JDialog{//���ο� ������
		
        JPanel panel = new JPanel(); //���� �ƴ϶� �ǳ� ����ߵ�
        public inputFrame(){
                getContentPane().add(panel);
                
        		
        		JLabel stlabel = new JLabel("Record meeting ");
        		JLabel stlabe2 = new JLabel("");
        		JLabel lab1 = new JLabel("��¥�ð�: ");
        		JTextField date= new JTextField(20);
        		JLabel lab2 = new JLabel("����");
        		JTextField topic= new JTextField(10);
        		JLabel lab3 = new JLabel("����");
        		JTextField content = new JTextField(10);
        		JLabel stlabe3 = new JLabel("");
        		JButton pbtn= new JButton("�߰�");//�߰� ��ư ����
        	
        		this.add(panel);
        		setTitle("Add Meeting page");
        		setVisible(true);
        		 
        		GridLayout grid = new GridLayout(5,2);
        		grid.setVgap(5);
        	    panel.setLayout(grid);
        	    
        	  //�ǳڿ� �߰�
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
        				 //������ ����
        				 try {
        				 BufferedWriter bf = new BufferedWriter(new FileWriter("���ñ��.txt",true));
        				 bf.write("��¥,�ð� :"+ date.getText()+"\n");
        				 bf.write("���� :"+ topic.getText()+"\n");
        				 bf.write("���� :"+ content.getText()+"\n");
        				 bf.close();
        				 JOptionPane.showMessageDialog(null, "������ ���� �Ϸ�Ǿ����ϴ�.");
        				 }
        				 
        				 catch(Exception e) {
        					 JOptionPane.showMessageDialog(null, "������ ���� �����Ͽ����ϴ�. �ٽ� �õ����ּ���!");
        			 
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
