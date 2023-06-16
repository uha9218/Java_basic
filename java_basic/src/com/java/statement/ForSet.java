package com.java.statement;

public class ForSet {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7 };

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println("\n===================");

		// 집합체 for문 : num에 있는 원소들을 모두 꺼냄, null 불가능!
		if (num != null) {
			for (int i : num) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n===================");
		
	}

}
