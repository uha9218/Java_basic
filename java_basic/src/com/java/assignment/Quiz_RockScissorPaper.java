package com.java.assignment;

import java.util.Scanner;

/* ��������������
  1. random �� �Է¹��� ->int�� (0:����,1:����,2:��)
  2. ����ڿ��� ���� �Է¹��� -> string�� ��ĳ�ʻ��
  3. ����ڿ��� �Է¹��� ���� int�� ��ȯ 
  4. ����� �Է°��� �������� ��
  	result = ������Է°� - ������
  	if result>0 result= result-3
  		1)result=-1 �� 
  		2)result=-2 �̱�
  		3)result=0 ���
  	5.�̱�ų� ����� ��� ��� �� ����	,
  	���ܿ� �ٽ� �Է¹��� -> while�� ���, boolean flag���
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

		System.out.println("******************���������� ������ �����ϰڽ��ϴ�************************\n\n");

		while (flag) {
			random = (int) (Math.random() * 3);
			System.out.println("���� ! ���� ! �� !");
			input = scan.nextLine();

			switch (random) {
			case 0:
				comp = "����";
				break;
			case 1:
				comp = "����";
				break;
			case 2:
				comp = "��";
				break;
			}

			if (input.equals("����")) {
				inputNum = 0;
			} else if (input.equals("����")) {
				inputNum = 1;
			} else if (input.equals("��")) {
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
				System.out.println(comp + "!!\n�����ϴ�\n���α׷��� �����մϴ�.\n");
				flag = false;
				break;
			case 0:
				System.out.println(comp + "!!\n�����ϴ�\n�ٽ� �Է����ּ���.\n");
				break;
			case -2:
				System.out.println(comp + "!!\n�̰���ϴ�\n���α׷��� �����մϴ�.\n");
				flag = false;
				break;
			default:
				System.out.println("�߸��� �Է��Դϴ�. �ٽ� �Է��ϼ���.\n ");
				break;
			}
		}

	}

}
