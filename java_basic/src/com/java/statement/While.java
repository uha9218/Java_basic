package com.java.statement;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		boolean flag = true;
		
		while(flag) {
			System.out.println("�Է�>");
			switch(scan.nextLine()) {
			case "q":
				System.out.println("�����");
				flag= false;
				continue;	//��"�ݺ��մϴ�" ��������ʰ� �ٷ� while������ �ö� ������
			}
			System.out.println("�ݺ��մϴ�.");
		}
	}

}
