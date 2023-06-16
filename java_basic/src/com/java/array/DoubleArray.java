package com.java.array;

/* 다중배열
 * 
 * int[][] box = new int[4][3];
 * [
 * 	[1,2,3]
 * 	[4,5,6]
 * 	[7,8,9]
 * 	[10,11,12]
 * ]
 * */


import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		//선언
		String[] label = {"번호", "이름", "총점","평균"};
		String[] subject;
		
		final int STUDENT_NUM;	//final : 고정수, 최초 할당값 변경불가
		final int SCORE_NUM;
		
		int num[];
		String[] name;
		int[][] score;
		int[] total;
		float[] avg;
		
		Scanner scan = new Scanner(System.in);
		
		//입력 및 처리
		System.out.print("학생의 수를 입력하세요 : ");
		STUDENT_NUM = scan.nextInt(); scan.nextLine();
		
		System.out.print("과목의 수를 입력하세요: ");
		SCORE_NUM = scan.nextInt(); scan.nextLine();
							
		num = new int[STUDENT_NUM];
		name = new String[STUDENT_NUM];
		
		subject = new String[SCORE_NUM];
		score = new int[SCORE_NUM][STUDENT_NUM];
		
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		
		for(int sbj=0; sbj<SCORE_NUM; sbj++) {
			System.out.print((sbj+1)+"번 과목명 : ");
			subject[sbj] = scan.nextLine();	
			for(int i=0;i<=sbj;i++) {
				System.out.print((i+1)+"."+subject[i]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------------------------");
		
		for(int studentNum=0;studentNum<STUDENT_NUM;studentNum++) {
			num[studentNum]=studentNum+1;			
			System.out.println(num[studentNum]+"번 학생의 데이터를 입력하세요. ");
			
			System.out.print(num[studentNum]+"번 학생의 이름: ");
			name[studentNum]=scan.next();
			
			for(int scoreNum=0;scoreNum<SCORE_NUM;scoreNum++) {
				System.out.printf("학생 %d번 %s점수 : ",num[studentNum],subject[scoreNum]);
				score[scoreNum][studentNum] = scan.nextInt(); scan.nextLine();
							
				total[studentNum] = total[studentNum] + score[scoreNum][studentNum];
				total[studentNum] = total[studentNum]*10; 
				avg[studentNum] = (total[studentNum] / (float)SCORE_NUM) / 10f;
				total[studentNum] = total[studentNum] / 10;
				
			}						
		}

		System.out.println("-----------------------------------------");
		
		//출력
		for(int i=0;i<(label.length-2);i++) {System.out.print(label[i]+"\t");}
		for(int i=0;i<subject.length;i++) {System.out.print(subject[i]+"\t");}
		for(int i=(label.length-2);i<label.length;i++) {System.out.print(label[i]+"\t");}
		System.out.println();
		for(int studentNum=0;studentNum<STUDENT_NUM;studentNum++) {
			System.out.printf("%d\t%s",num[studentNum],name[studentNum]);
			for(int scoreNum=0; scoreNum<SCORE_NUM;scoreNum++) {
				System.out.printf("\t%d",score[scoreNum][studentNum]);
			}
			System.out.printf("\t%d\t%.2f\n",total[studentNum],avg[studentNum]);
		}
	}
}
