package com.java.statement;

import java.util.Scanner;

//switch :  ����� ��

public class Switch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int menu=0;
		
		System.out.println("=================================");
		System.out.println("1.ȸ����ȸ\t 2.ȸ�����\t");
		System.out.println("3.ȸ������\t 4.ȸ������\t");
		System.out.println("=================================");
		System.out.println("�޴��� �Է��ϼ��� : ");
		
		menu = scan.nextInt();
		
		switch(menu) {
			case 1:
				System.out.println("ȸ�� ��ȸ�� �����մϴ�.");
				break;
			case 2:
				System.out.println("ȸ�� ����� �����մϴ�.");
				break;
			case 3:
				System.out.println("ȸ�� ������ �����մϴ�.");
				break;
			case 4:
				System.out.println("ȸ�� ������ �����մϴ�.");
				break;
			default: 
				System.out.println("�޴� ������ �ùٸ��� �ʽ��ϴ�.");
		}		
	}
}
