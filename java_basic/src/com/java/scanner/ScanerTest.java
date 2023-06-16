package com.java.scanner;

import java.util.Scanner;

public class ScanerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("아이디를 입력하세요: ");
		String input = scan.nextLine();
		
		int id_length = input.length();
		
		//비교대상자를 왼쪽에
		if(id_length>=3 && id_length<=15) {
			System.out.println("아이디가 올바르게 생성되었습니다.");
		}
		else System.out.println("아이디 길이가 맞지 않습니다.");
	}

}
