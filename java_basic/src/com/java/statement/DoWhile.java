package com.java.statement;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int menu=0;
		
		while(menu != 5) {
		
			System.out.println("=================================");
			System.out.println("1.회원조회\t 2.회원등록\t");
			System.out.println("3.회원수정\t 4.회원삭제\t");
			System.out.println("5.종료");
			System.out.println("=================================");
			System.out.println("메뉴를 입력하세요 : ");
		
			menu = scan.nextInt();
		
			switch(menu) {
				case 1:
					System.out.println("회원 조회를 시작합니다.");
					break;
				case 2:
					System.out.println("회원 등록을 시작합니다.");
					break;
				case 3:
					System.out.println("회원 수정을 시작합니다.");
					break;
				case 4:
					System.out.println("회원 삭제를 시작합니다.");
					break;
				case 5:
					System.out.println("종료합니다.");
					 break;
				default: 
					System.out.println("메뉴 선택이 올바르지 않습니다.");
		}		
	
		}
	}

}
