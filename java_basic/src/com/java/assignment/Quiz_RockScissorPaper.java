package com.java.assignment;

import java.util.Scanner;

/* 가위바위보게임
  1. random 값 입력받음 ->int형 (0:가위,1:바위,2:보)
  2. 사용자에게 값을 입력받음 -> string형 스캐너사용
  3. 사용자에게 입력받은 값을 int로 변환 
  4. 사용자 입력값과 랜덤값을 비교
  	result = 사용자입력값 - 랜덤값
  	if result>0 result= result-3
  		1)result=-1 짐 
  		2)result=-2 이김
  		3)result=0 비김
  	5.이기거나 질경우 결과 출력 후 종료	,
  	비길겨우 다시 입력받음 -> while문 사용, boolean flag사용
*/

public class Quiz_RockScissorPaper {

	public static void main(String[] args) {

		int random = 3;
		String input = "";
		String comp = "";
		int inputNum = 3;
		boolean flag = true;
		String output = "";
		int result;

		Scanner scan = new Scanner(System.in);

		System.out.println("******************가위바위보 게임을 시작하겠습니다************************\n\n");

		while (flag) {
			random = (int) (Math.random() * 3);
			System.out.println("가위 ! 바위 ! 보 !");
			input = scan.nextLine();

			switch (random) {
			case 0:
				comp = "가위";
				break;
			case 1:
				comp = "바위";
				break;
			case 2:
				comp = "보";
				break;
			}

			if (input.equals("가위")) {
				inputNum = 0;
			} else if (input.equals("바위")) {
				inputNum = 1;
			} else if (input.equals("보")) {
				inputNum = 2;
			} else {
				inputNum = 10;
			}

			result = inputNum - random;
			if (result > 0) {
				result = result - 3;
			}


			switch (result) {
			case -1:
				System.out.println(comp + "!!\n졌습니다\n프로그램을 종료합니다.\n");
				flag = false;
				break;
			case 0:
				System.out.println(comp + "!!\n비겼습니다\n다시 입력해주세요.\n");
				break;
			case -2:
				System.out.println(comp + "!!\n이겼습니다\n프로그램을 종료합니다.\n");
				flag = false;
				break;
			default:
				System.out.println("잘못된 입력입니다. 다시 입력하세요.\n ");
				break;
			}
		}

	}

}
