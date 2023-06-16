package com.java.array;

/* ���߹迭
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
		//����
		String[] label = {"��ȣ", "�̸�", "����","���"};
		String[] subject;
		
		final int STUDENT_NUM;	//final : ������, ���� �Ҵ簪 ����Ұ�
		final int SCORE_NUM;
		
		int num[];
		String[] name;
		int[][] score;
		int[] total;
		float[] avg;
		
		Scanner scan = new Scanner(System.in);
		
		//�Է� �� ó��
		System.out.print("�л��� ���� �Է��ϼ��� : ");
		STUDENT_NUM = scan.nextInt(); scan.nextLine();
		
		System.out.print("������ ���� �Է��ϼ���: ");
		SCORE_NUM = scan.nextInt(); scan.nextLine();
							
		num = new int[STUDENT_NUM];
		name = new String[STUDENT_NUM];
		
		subject = new String[SCORE_NUM];
		score = new int[SCORE_NUM][STUDENT_NUM];
		
		total = new int[STUDENT_NUM];
		avg = new float[STUDENT_NUM];
		
		for(int sbj=0; sbj<SCORE_NUM; sbj++) {
			System.out.print((sbj+1)+"�� ����� : ");
			subject[sbj] = scan.nextLine();	
			for(int i=0;i<=sbj;i++) {
				System.out.print((i+1)+"."+subject[i]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("-----------------------------------------");
		
		for(int studentNum=0;studentNum<STUDENT_NUM;studentNum++) {
			num[studentNum]=studentNum+1;			
			System.out.println(num[studentNum]+"�� �л��� �����͸� �Է��ϼ���. ");
			
			System.out.print(num[studentNum]+"�� �л��� �̸�: ");
			name[studentNum]=scan.next();
			
			for(int scoreNum=0;scoreNum<SCORE_NUM;scoreNum++) {
				System.out.printf("�л� %d�� %s���� : ",num[studentNum],subject[scoreNum]);
				score[scoreNum][studentNum] = scan.nextInt(); scan.nextLine();
							
				total[studentNum] = total[studentNum] + score[scoreNum][studentNum];
				total[studentNum] = total[studentNum]*10; 
				avg[studentNum] = (total[studentNum] / (float)SCORE_NUM) / 10f;
				total[studentNum] = total[studentNum] / 10;
				
			}						
		}

		System.out.println("-----------------------------------------");
		
		//���
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
