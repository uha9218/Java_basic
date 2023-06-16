package com.java.regular;

import java.util.Scanner;

public class TestRegular2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] name = {"���̵�", "�ֹι�ȣ", "�̸���", "��ȭ��ȣ"};
		String[] form = {"^[a-zA-Z]{1}[a-zA-Z0-9_]{3,13}$", "^\\d{2}([0]\\d|[1][0-2])([0][1-9]|[1-2]\\d|[3][0-1])[-][1-4]\\d{6}$",
				"^[a-zA-Z0-9]+@[a-zA-Z0-9]+.[a-zA-Z0-9]+$","^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$"};
		
		for (int i = 0; i < 4; i++) {
			System.out.print(i + 1 + ". "+ name[i] + " : ");
			String test = sc.nextLine();
			if (test.matches(form[i])) {
				System.out.println(name[i] + " ������ �½��ϴ�.");
			}
			else {
				System.out.println(name[i] + " ������ �ƴմϴ�.");
			}
		}
		
	}

}
