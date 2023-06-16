package com.java.statement;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		boolean flag = true;
		
		while(flag) {
			System.out.println("입력>");
			switch(scan.nextLine()) {
			case "q":
				System.out.println("멈춰라");
				flag= false;
				continue;	//★"반복합니다" 출력하지않고 바로 while문으로 올라가 종료함
			}
			System.out.println("반복합니다.");
		}
	}

}
