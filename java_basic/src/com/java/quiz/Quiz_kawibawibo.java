package com.java.quiz;

import java.util.Scanner;

public class Quiz_kawibawibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] kawebawebo = { "가위", "바위", "보" };
		int kawebaweboNum = 0;
		String menu = null;
		String result="";
		while (true) {
			int comKawebawebo = (int) (Math.random() * 3);

			System.out.println("[1]가위");
			System.out.println("[2]바위");
			System.out.println("[3]보");			
			System.out.print("선택하세요. 종료[y/n] : ");

			menu = scan.nextLine();
			switch (menu.toLowerCase()) {
			case "1":
			case "2":
			case "3":
				kawebaweboNum = Integer.parseInt(menu) - 1;
				break;
			case "q":
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("정확하게 선택하시기 바랍니다.");
				continue;
			}
			
			
			result += "당신은 : " + kawebawebo[kawebaweboNum]+"\n";
			result += "컴퓨터 : " + kawebawebo[comKawebawebo]+"\n";
			if (comKawebawebo == (kawebaweboNum + 1) % 3 ) {
				result+="졌네요...\n";
			} else if (kawebaweboNum == comKawebawebo) {
				result+="비겼어요...\n";
			}else{
				result+="이기셨네요..축하합니다....\n";
			}
			result+="\n";
			
			System.out.println(result);
		}

	}
}
