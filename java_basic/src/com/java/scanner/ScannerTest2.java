package com.java.scanner;

import java.util.Scanner;

public class ScannerTest2 {

	public static void main(String[] args) {

		// 1. ���� �޴�
		System.out.println("============================================");
		System.out.println("1.���ϱ�\t2.����\t\t3.���ϱ�\n4.������(��)\t5.������(������)");
		System.out.println("============================================");
		System.out.print("�޴��� �����Ͻÿ� : ");

		// 2. �޴� �Է� / ���� �ʱ�ȭ
		int menu;
		int a;
		int b;
		int result;

		Scanner scan = new Scanner(System.in);
		while (true) {
			menu = scan.nextInt();
			if (menu < 1 || menu > 5) {
				System.out.println("�Է��� �߸��Ǿ����ϴ�. �ٽ� �Է��ϼ���.");
			} else
				break;
		}

		// 3. ���� �Է�
			System.out.print("ù���� ���� : ");
			a = scan.nextInt();
			System.out.print("�ι��� ���� : ");
			b = scan.nextInt();

		// 4. �޴� �� / ����
		switch (menu) {
		case 1:
			result = a + b;
			break;
		case 2:
			result = a - b;
			break;
		case 3:
			result = a * b;
			break;
		case 4:
			result = a / b;
			break;
		case 5:
			result = a % b;
			break;
		default:
			result = 999999999;
		}

		// 5. ���
		if (menu >= 1 && menu <= 5)
			System.out.print("�ᱣ�� :" + result);
		else
			System.out.println("�޴� ������ �ùٸ��� �ʽ��ϴ�.");
	}

}
