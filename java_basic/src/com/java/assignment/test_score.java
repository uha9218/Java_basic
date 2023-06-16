package com.java.assignment;
//중간저장, 유효성 처리
import java.util.Scanner;

public class test_score {

	public static void main(String[] args) {
		//선언
		String[] label = { "번호", "이름", "국어", "영어", "수학", "과학", "총점", "평균" };
		final int STUDENT_NUM;	//final : 고정수, 최초 할당값 변경불가
		
		int num[];
		String[] name;
		int[] kor,eng,math,scien;
		int[] total;
		float[] avg;
		
		Scanner scan = new Scanner(System.in);
		
		//처리
		System.out.println("학생의 수를 입력하세요 : ");
		STUDENT_NUM = scan.nextInt(); scan.nextLine();
		
		num = new int[STUDENT_NUM];
		name = new String[STUDENT_NUM];
		kor = new int[STUDENT_NUM];
		eng = new int[STUDENT_NUM];
		math = new int[STUDENT_NUM];
		scien = new int[STUDENT_NUM];		
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];

		for(int i=0;i<STUDENT_NUM;i++) {
			num[i]=i+1;			
			System.out.println(num[i]+"번 학생의 데이터를 입력하세요. ");
			
			System.out.println(num[i]+"번 학생의 이름: ");
			name[i]=scan.next();
			System.out.println(num[i]+"번 학생의 국어점수: ");
			kor[i]=scan.nextInt(); scan.nextLine();
			System.out.println(num[i]+"번 학생의 영어점수: ");
			eng[i]=scan.nextInt(); scan.nextLine();
			System.out.println(num[i]+"번 학생의 수학점수: ");
			math[i]=scan.nextInt(); scan.nextLine();
			System.out.println(num[i]+"번 학생의 과학점수: ");
			scien[i]=scan.nextInt(); scan.nextLine();
			
			total[i] = (kor[i] + eng[i] + math[i] + scien[i]) * 10;
			avg[i] = (total[i] / 4) / 10f;
			total[i] = total[i] / 10;
						
		}
		
		//출력
		for(int i=0;i<label.length;i++) {System.out.print(label[i]+"\t");}
		System.out.println();
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %d\t %.1f\n",num[i], name[i], kor[i],eng[i],math[i],scien[i],total[i],avg[i] );
		}
				
	}

}
