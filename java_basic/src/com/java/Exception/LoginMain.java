package com.java.Exception;

public class LoginMain {

	public static void main(String[] args) {
		MemberService ms = new MemberService();
		
		try {
			ms.login("mimi","nnn");
		} catch (IdNotFoundException | InvalidPasswordException e) {
			System.out.println(e.getMessage());
		}
	}

}
