package com.java.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestException {

	// try : 예외발생 예상 구문
	// catch : 어떤 오류를 잡을건지 표시, 오류를 어떻게 처리할건지 표시
	public static void main(String[] args) {

		System.out.println("예외처리 연습중입니다.");
		while (true) {
			try {
				System.out.print("정수입력 : ");
				Scanner scan = new Scanner(System.in);
				String intStr = scan.nextLine();
				int i = Integer.parseInt(intStr);
				break;
			} catch (NumberFormatException e) {
				// e.printStackTrace(); 에러 메세지 출력
				System.out.println(e.getMessage() + "의 문제가 발생했습니다");

			}
		}

		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("날짜입력(yyyy-mm-dd) : ");
				String dateStr =  scan.nextLine();
				Date today = new SimpleDateFormat("yyyy-mm-dd").parse(dateStr);
				break;
			} catch (ParseException e) {
				System.out.println("날짜형식이 올바르지 않습니다.");
			}
		}

			try {
				new TestException().throwExceptions();
			} catch (ClassNotFoundException | NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

		System.out.println("예외처리 연습끝났습니다.");

	}

	public void throwExceptions() throws ClassNotFoundException, NullPointerException {	
		if(true) {
			throw new ClassNotFoundException();
		}else {
			throw new NullPointerException();
		}
	}
}
