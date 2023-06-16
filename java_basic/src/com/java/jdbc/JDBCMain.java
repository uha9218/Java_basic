package com.java.jdbc;

import java.util.List;

public class JDBCMain {
	public static void main(String[] args) throws Exception{ 
		MemberDAO memberDAO = new memberDAOImpl();
		
		List<MemberVO> memberList = memberDAO.selectMemberList();
		System.out.println(memberList);
	}	
}
