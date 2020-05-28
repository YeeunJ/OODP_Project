package com.oodp.projectSupporter.loginout;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		LoginCommand login=	new LoginCommand("Siin", "1234");//""여기에 쿼리문 mail,password
		LogoutCommand logout =new LogoutCommand("Siin");//mail
		
		login.execute();
		logout.execute();
	}

}
