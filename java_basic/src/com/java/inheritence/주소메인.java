package com.java.inheritence;

import java.util.Scanner;

public class �ּҸ��� {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String menu = null;
		���� map = null;
		
		//map = new ����();
		//���� Ÿ������ �����Ǿ ������ �޼ҵ���� ����� �� ����.
		//�������� �޼ҵ���� ���� ������ ��������ȯ�� �ؾ��Ѵ�.
		
		//((������)map).get��(); -> ���� : �ν��Ͻ��� ũŰ�� ��Ŀ����
		
		//map = new ���ѹα�();
		
		//((������)map).get��(); // ����
		//((����)map).get����();  //-> ����
		
		System.out.println("1.���� 2.�� 3.�� 4.�� 5.����");
		System.out.print("�˻� ������ �Է��Ͻÿ� : ");
		menu = scan.nextLine();

		switch (menu) {
		case "1":
			map = new ����();
			break;
		case "2":
			map = new ���ѹα�();
			break;
		case "3":
			map = new ����();
			break;
		case "4":
			map = new ������();
			break;
		case "5":
			break;
		default:
		}

		System.out.println(map.�ּ�());
		
		System.out.println("���� �ν��Ͻ� : "+(map instanceof ����));
		
                           
	}

}