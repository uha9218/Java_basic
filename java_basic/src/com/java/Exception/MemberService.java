package com.java.Exception;

public class MemberService {
	public void login(String id, String pwd) throws IdNotFoundException, InvalidPasswordException{
		if(!id.equals("mimi")) throw new IdNotFoundException();
		if(!pwd.equals("mimi")) throw new InvalidPasswordException();	//���̵� ��ġ�Ҷ� �˻�, ���̵� ����ġ�ϸ� ������� ���� 
	}
}
