package com.java.assignment;

import java.util.Scanner;

public class studentMain {
	
	public static void main(String[] args) {
		
		int menu=0;
		boolean flag = true;
		
		studentMenu stm = new studentMenu();
		Scanner scan = new Scanner(System.in);
		
		
		while(flag) {
			stm.studentMenu();
			menu = scan.nextInt();
			flag = stm.menu(menu);	
			
		}
	}
}
