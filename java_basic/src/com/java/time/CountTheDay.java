package com.java.time;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CountTheDay{

	public static void main(String[] args) {
		
		Scanner scann = new Scanner(System.in);
		Date toDay = new Date();
		Date theDay = null;
		
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
		
		long count = toDay.getTime() - theDay.getTime();
		int day = (int)(Math.ceil(count / (1000 * 60 * 60 * 24))); //ms * 60s * 60min * 24h
		
		System.out.println(day + "��");
	}

}