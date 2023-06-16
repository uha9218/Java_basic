package com.java.scanner;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {

		// 1. 연산 메뉴
		System.out.println("============================================");
		System.out.println("1.더하기\t2.빼기\t\t3.곱하기\n4.나누기(몫)\t5.나누기(나머지)");
		System.out.println("============================================");
		System.out.print("메뉴를 선택하시오 : ");

		// 2. 메뉴 입력 / 변수 초기화
		int menu;
		int a;
		int b;
		int result;

		Scanner scan = new Scanner(System.in);
		while (true) {
			menu = scan.nextInt();
			if (menu < 1 || menu > 5) {
				System.out.println("입력이 잘못되었습니다. 다시 입력하세요.");
			} else
				break;
		}

		// 3. 정수 입력
			System.out.print("첫번재 정수 : ");
			a = scan.nextInt();
			System.out.print("두번재 정수 : ");
			b = scan.nextInt();

		// 4. 메뉴 비교 / 연산
		switch (menu) {
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			result = a * b;
			break;
		case 4:
			result = a / b;
			break;
		case 5:
			result = a % b;
			break;
		default:
			result = 999999999;
		}

		// 5. 출력
		if (menu >= 1 && menu <= 5)
			System.out.print("결괏값 :" + result);
		else
			System.out.println("메뉴 선택이 올바르지 않습니다.");
	}

}
