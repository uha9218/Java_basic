package com.java.assignment;
//�߰�����, ��ȿ�� ó��
import java.util.Scanner;

public class test_score {

	public static void main(String[] args) {
		//����
		String[] label = { "��ȣ", "�̸�", "����", "����", "����", "����", "����", "���" };
		final int STUDENT_NUM;	//final : ������, ���� �Ҵ簪 ����Ұ�
		
		int num[];
		String[] name;
		int[] kor,eng,math,scien;
		int[] total;
		float[] avg;
		
		Scanner scan = new Scanner(System.in);
		
		//ó��
		System.out.println("�л��� ���� �Է��ϼ��� : ");
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
			System.out.println(num[i]+"�� �л��� �����͸� �Է��ϼ���. ");
			
			System.out.println(num[i]+"�� �л��� �̸�: ");
			name[i]=scan.next();
			System.out.println(num[i]+"�� �л��� ��������: ");
			kor[i]=scan.nextInt(); scan.nextLine();
			System.out.println(num[i]+"�� �л��� ��������: ");
			eng[i]=scan.nextInt(); scan.nextLine();
			System.out.println(num[i]+"�� �л��� ��������: ");
			math[i]=scan.nextInt(); scan.nextLine();
			System.out.println(num[i]+"�� �л��� ��������: ");
			scien[i]=scan.nextInt(); scan.nextLine();
			
			total[i] = (kor[i] + eng[i] + math[i] + scien[i]) * 10;
			avg[i] = (total[i] / 4) / 10f;
			total[i] = total[i] / 10;
						
		}
		
		//���
		for(int i=0;i<label.length;i++) {System.out.print(label[i]+"\t");}
		System.out.println();
		for (int i = 0; i < STUDENT_NUM; i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %d\t %.1f\n",num[i], name[i], kor[i],eng[i],math[i],scien[i],total[i],avg[i] );
		}
				
	}

}
