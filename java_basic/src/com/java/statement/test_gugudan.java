package com.java.statement;

import java.util.Scanner;

public class test_gugudan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int dan = 2;
		int gop = 1;
		
		int danLimit = 9;
		int gopLimit = 9;
		
		String output="";	//��ó�� ������ ����
		
		System.out.println("�ܼ�: ");
		danLimit = scan.nextInt();
		System.out.println("����: ");
		gopLimit = scan.nextInt();
		
		for(;dan<=danLimit;dan++) {
			output = output+dan+"��\n"; 
			for(gop=1;gop<=gopLimit;gop++) {
				output = output+dan+" * "+gop+" = "+(dan*gop)+"\n";
			}
			output = output+"\n";
		}
		
		System.out.println(output);
	}
}
