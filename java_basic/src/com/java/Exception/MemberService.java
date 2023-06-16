package com.java.Exception;

public class MemberService {
	public void login(String id, String pwd) throws IdNotFoundException, InvalidPasswordException{
		if(!id.equals("mimi")) throw new IdNotFoundException();
		if(!pwd.equals("mimi")) throw new InvalidPasswordException();	//아이디가 일치할때 검사, 아이디가 불일치하면 실행되지 않음 
	}
}
