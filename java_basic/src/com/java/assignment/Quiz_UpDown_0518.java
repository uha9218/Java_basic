package com.java.assignment;

/*
 * ���ٿ� ���� : �������� ������ ����ڰ� �������� ���� 
 		*��ĳ�� ��� -> ����� �Է°� ���� input
 		*Math �Լ��� ������ �ޱ� -> random�Լ����
 		*while�� ����ؼ� ����ڰ� ���� �� ���� ����
  1.���� �� �Է��� ���ð�� -> "�Է��� �ùٸ��� �ʽ��ϴ�" ��� �� �ٽ� �Է´��
 		*max,min ��� : %d���� %d������ ���ڸ� �Է��ϼ��� 
  2.�ٿ� : ����� �Է°��� ���������� ū��� -> ��Ʈ ��� �� �ٽ� �Է� ��� 
  3.�� : ����� �Է°��� ���������� ������� -> ��Ʈ ��� �� �ٽ� �Է� ���
  4.������ ���ߴ� ��� -> ������� ������� ǥ�� �� ���� ���࿩�� Ȯ��
 		*count�̿� : �����Է� Ƚ�� ��� 
 		*flag�� ����� ���� ������ ���� Ȯ��->while���� �ΰ���
 		*end �� ����� ����� ���� �����࿩�� �Է� �ޱ�
 */
import java.util.Scanner;

public class Quiz_UpDown_0518 {

	public static void main(String[] args) {


		int random = (int) (Math.random() * 100 + 1);
		int input;
		int count = 1;
		boolean flag = true;	//���α׷� ����۽� 0
		int max;
		int min;
		char end;
		String output;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("**********���ٿ� ����************\n\n");
		
		while (flag == true) {

			output ="��ǻ�ʹ� ���ڸ� �����߽��ϴ�.\n"+ "�����ϰڽ��ϴ�.\n\n" + "1���� 100������ ���ڸ� �Է��ϼ���.\n";
			System.out.println(output);
			output="";
			flag=true;
			max =100;
			min=1;
			

			while (flag == false) {
				
				input = scan.nextInt();
				output="";

				// ���� �� �Է� ���� ���
				if (input > max || input < min) {
					output = "�Է��� �ùٸ��� �ʽ��ϴ�.\n";
					System.out.println(output);
				} else {
					// �ٿ� : ����� �Է°��� ���������� ū���
					if (input > random) {
						max = input - 1;
						count++;
						output = "�ٿ�!!!\n" + min + "���� " + max + "������ ���ڸ� �Է��ϼ���.\n\n";
					} // �� : ����� �Է°��� ���������� �������
					else if (input < random) {
						min = input + 1;
						count++;
						output = "��!!!\n" + min + "���� " + max + "������ ���ڸ� �Է��ϼ���.\n\n"; 
					} // ����
					else {
						output = "�����մϴ�. �����Դϴ�.\n" + count + "��° ������ϴ�\n" + "������ �����Ͻðڽ��ϱ�? (y/n)";
						System.out.println(output);
						end = scan.next().charAt(0);
						if (end == 'n') {
							flag=true;
							output = "������ ��� �����մϴ�.\n\n";
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
