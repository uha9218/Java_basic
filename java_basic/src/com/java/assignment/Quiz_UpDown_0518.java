package com.java.assignment;

/*
 * 업다운 게임 : 랜덤값을 받은후 사용자가 랜덤값을 맞춤 
 		*스캐너 사용 -> 사용자 입력값 변수 input
 		*Math 함수로 랜덤값 받기 -> random함수사용
 		*while문 사용해서 사용자가 맞출 때 까지 진행
  1.범위 외 입력이 들어올경우 -> "입력이 올바르지 않습니다" 출력 후 다시 입력대기
 		*max,min 사용 : %d부터 %d까지의 숫자를 입력하세요 
  2.다운 : 사용자 입력값이 랜덤값보다 큰경우 -> 멘트 출력 후 다시 입력 대기 
  3.업 : 사용자 입력값이 랜덤값보다 작은경우 -> 멘트 출력 후 다시 입력 대기
  4.정답을 맞추는 경우 -> 몇번만에 맞췄는지 표시 후 게임 진행여부 확인
 		*count이용 : 정답입력 횟수 기록 
 		*flag를 사용해 게임 재진행 여부 확인->while문을 두개로
 		*end 를 사용해 사용자 게임 재진행여부 입력 받기
 */
import java.util.Scanner;

public class Quiz_UpDown_0518 {

	public static void main(String[] args) {


		int random = (int) (Math.random() * 100 + 1);
		int input;
		int count = 1;
		boolean flag = true;	//프로그램 재시작시 0
		int max;
		int min;
		char end;
		String output;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("**********업다운 게임************\n\n");
		
		while (flag == true) {

			output ="컴퓨터는 숫자를 결정했습니다.\n"+ "시작하겠습니다.\n\n" + "1부터 100사이의 숫자를 입력하세요.\n";
			System.out.println(output);
			output="";
			flag=true;
			max =100;
			min=1;
			

			while (flag == false) {
				
				input = scan.nextInt();
				output="";

				// 범위 외 입력 들어올 경우
				if (input > max || input < min) {
					output = "입력이 올바르지 않습니다.\n";
					System.out.println(output);
				} else {
					// 다운 : 사용자 입력값이 랜덤값보다 큰경우
					if (input > random) {
						max = input - 1;
						count++;
						output = "다운!!!\n" + min + "부터 " + max + "까지의 숫자를 입력하세요.\n\n";
					} // 업 : 사용자 입력값이 랜덤값보다 작은경우
					else if (input < random) {
						min = input + 1;
						count++;
						output = "업!!!\n" + min + "부터 " + max + "까지의 숫자를 입력하세요.\n\n"; 
					} // 정답
					else {
						output = "축하합니다. 정답입니다.\n" + count + "번째 맞췄습니다\n" + "게임을 종료하시겠습니까? (y/n)";
						System.out.println(output);
						end = scan.next().charAt(0);
						if (end == 'n') {
							flag=true;
							output = "게임을 계속 진행합니다.\n\n";
							count=0;
							random = (int) (Math.random() * 100 + 1);
						}
						else break;
					}
					
					System.out.println(output);					
				}

			}
		}

	}

}
