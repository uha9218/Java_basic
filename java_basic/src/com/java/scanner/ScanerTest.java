package com.java.scanner;

import java.util.Scanner;

public class ScanerTest {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���̵� �Է��ϼ���: ");
		String input = scan.nextLine();
		
		int id_length = input.length();
		
		//�񱳴���ڸ� ���ʿ�
		if(id_length>=3 && id_length<=15) {
			System.out.println("���̵� �ùٸ��� �����Ǿ����ϴ�.");
		}
		else System.out.println("���̵� ���̰� ���� �ʽ��ϴ�.");
	}

}
