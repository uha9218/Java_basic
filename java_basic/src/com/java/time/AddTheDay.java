package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AddTheDay {

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		Date theDay = null;
		int afterDay = 0;
		
		while(true) {
			System.out.print("��¥�� �Է��Ͻÿ�.(yyyyMMdd):");
			String inputDay = scann.nextLine();
			try {
				theDay = new SimpleDateFormat("yyyyMMdd").parse(inputDay);
				if (inputDay.length() > 8) {
					System.out.println("��¥ ������ �ùٸ��� �ʽ��ϴ�.");
					continue;
				}
				break;
			}catch(Exception e) {
				e.printStackTrace();
				System.out.println("��¥ ������ �ùٸ��� �ʽ��ϴ�.");
			}
		}
		
		System.out.print("�ϼ� : ");
		afterDay = scann.nextInt();scann.nextLine();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(theDay);
		cal.add(Calendar.DATE, afterDay);
		
		System.out.println(cal.get(Calendar.YEAR) + "�� " + (cal.get(Calendar.MONTH) + 1) + "�� " + cal.get(Calendar.DATE) + "�� �Դϴ�.");
		
	}

}