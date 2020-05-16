package com.oodp.projectSupporter;

import com.oodp.projectSupporter.dbconnection.connection;

public class main {

	public static void main(String[] args) {
		/*
		 * 일단 com.수업명.시스템명을 기본 패키지 명으로 해서 main만들어두었습니다.(예시로 패키지 만들어놓은거라 원하시면 바꿔주세요!!)
		 * 그리고 이 안에서 각자 추가로 패키지 정해서 코드 구현하시면 되실 것 같아요!!
		 * 그리고 교수님께서 이번에는 일부로라도 못짜고 refactoring해도 된다고 하셨으니까!! 
		 * 대충 기능 구현해서 돌아가게만 해놓고 다음에 refactoring 하면 좋을 것 같아요~
		 */
		
		connection c = new connection();
		c.readData();
	}

}
