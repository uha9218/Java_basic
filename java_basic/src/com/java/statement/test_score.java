package com.java.statement;

import java.util.Scanner;

/*
 * ���� ���α׷����� ������ ������ ���� ���� �߰�
 */
public class test_score {

	public static void main(String[] args) {
		int kor=0, eng=0, math=0, scien=0;
		int total;
		float avg;
		char score=' ';
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��Ͻÿ�.");
		System.out.print("���� : ");
		kor = scan.nextInt();
		System.out.print("���� : ");
		eng = scan.nextInt();
		System.out.print("���� : ");
		math = scan.nextInt();
		System.out.print("���� : ");
		scien = scan.nextInt();
		
		total = (kor+eng+math+scien)*10;	//�ڸ��� �����÷ο� Ȯ���� ��
		avg=(total/4)/10f;	// �Ҽ��� ��ȿó���� ����
		total = total/10;
		
		//����� 10���� ������ ���� �ڸ����� �������� ������ ���� 
		if(avg/10>=9) {score='A';}
		else if(avg/10>8) {score='B';}
		else if(avg/10>7) {score='C';}
		else if(avg/10>6) {score='D';}
		else  {score='F';}
		
		System.out.println("����\t ����\t ����\t ����\t");
		System.out.printf("%d\t %d\t %d\t %d\n",kor, eng, math, scien);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
		System.out.println("���� : "+score);
	

	}

}
