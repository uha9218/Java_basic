package com.java.Exception;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TestException {

	// try : ���ܹ߻� ���� ����
	// catch : � ������ �������� ǥ��, ������ ��� ó���Ұ��� ǥ��
	public static void main(String[] args) {

		System.out.println("����ó�� �������Դϴ�.");
		while (true) {
			try {
				System.out.print("�����Է� : ");
				Scanner scan = new Scanner(System.in);
				String intStr = scan.nextLine();
				int i = Integer.parseInt(intStr);
				break;
			} catch (NumberFormatException e) {
				// e.printStackTrace(); ���� �޼��� ���
				System.out.println(e.getMessage() + "�� ������ �߻��߽��ϴ�");

			}
		}

		while (true) {
			try {
				Scanner scan = new Scanner(System.in);
				System.out.println("��¥�Է�(yyyy-mm-dd) : ");
				String dateStr =  scan.nextLine();
				Date today = new SimpleDateFormat("yyyy-mm-dd").parse(dateStr);
				break;
			} catch (ParseException e) {
				System.out.println("��¥������ �ùٸ��� �ʽ��ϴ�.");
			}
		}

			try {
				new TestException().throwExceptions();
			} catch (ClassNotFoundException | NullPointerException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	

		System.out.println("����ó�� �����������ϴ�.");

	}

	public void throwExceptions() throws ClassNotFoundException, NullPointerException {	
		if(true) {
			throw new ClassNotFoundException();
		}else {
			throw new NullPointerException();
		}
	}
}
