package com.java.assignment;

import java.util.Scanner;

public class studentMenu {
	private int menu;
	private static int studentNum = 0;
	private static int[] student;

	Scanner scan = new Scanner(System.in);

	public void studentMenu() {
		System.out.println("------------------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("------------------------------------------------------");

		System.out.print("선택>");

	}

	public boolean menu(int menu) {
		this.menu = menu;
		switch (menu) {
		case 1:
			menu1();
			break;
		case 2:
			menu2();
			break;
		case 3:
			menu3();
			break;
		case 4:
			menu4();
			break;
		case 5:
			System.out.println("시스템종료");
			return false;
		default:
			System.out.println("메뉴에 없는 번호를 입력하셨습니다.");
		}
		return true;
	}

	private void menu1() {
		System.out.print("학생수>");
		this.studentNum = scan.nextInt();
		student = new int[studentNum];
	}

	private boolean menu2() {
		if(studentNum == 0) {
			System.out.println("학생 수가 없습니다.");
			return true;
		}
		for (int i = 0; i < studentNum; i++) {
			System.out.print("scores[" + i + "]>");
			student[i] = scan.nextInt();
		}
		return true;
	}

	private boolean menu3() {
		if(studentNum == 0) {
			System.out.println("학생 수가 없습니다.");
			return true;
		}
		for (int i = 0; i < studentNum; i++) {
			System.out.println("scores[" + i + "]: " + student[i]);
		}
		return true;
	}

	private boolean menu4() {
		int maxNum = 0;
		int sum = 0;
		float avg = 0;
		if(studentNum == 0) {
			System.out.println("학생 수가 없습니다.");
			return true;
		}
		for (int i = 0; i < studentNum; i++) {
			maxNum = (student[i] > maxNum) ? student[i] : maxNum;
			sum = sum + student[i];
			avg = ((sum * 10) / (float) studentNum) / 10;
		}
		System.out.println("최고점수: " + maxNum);
		System.out.println("평균점수: " + avg);
		return true;
	}
}
