package com.java.quiz;

import java.util.Scanner;

public class Quiz_kawibawibo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] kawebawebo = { "����", "����", "��" };
		int kawebaweboNum = 0;
		String menu = null;
		String result="";
		while (true) {
			int comKawebawebo = (int) (Math.random() * 3);

			System.out.println("[1]����");
			System.out.println("[2]����");
			System.out.println("[3]��");			
			System.out.print("�����ϼ���. ����[y/n] : ");

			menu = scan.nextLine();
			switch (menu.toLowerCase()) {
			case "1":
			case "2":
			case "3":
				kawebaweboNum = Integer.parseInt(menu) - 1;
				break;
			case "q":
				System.out.println("���α׷��� �����մϴ�.");
				return;
			default:
				System.out.println("��Ȯ�ϰ� �����Ͻñ� �ٶ��ϴ�.");
				continue;
			}
			
			
			result += "����� : " + kawebawebo[kawebaweboNum]+"\n";
			result += "��ǻ�� : " + kawebawebo[comKawebawebo]+"\n";
			if (comKawebawebo == (kawebaweboNum + 1) % 3 ) {
				result+="���׿�...\n";
			} else if (kawebaweboNum == comKawebawebo) {
				result+="�����...\n";
			}else{
				result+="�̱�̳׿�..�����մϴ�....\n";
			}
			result+="\n";
			
			System.out.println(result);
		}

	}
}
