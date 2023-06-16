package com.java.statement;

public class ForSet {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 5, 6, 7 };

		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
		}

		System.out.println("\n===================");

		// ����ü for�� : num�� �ִ� ���ҵ��� ��� ����, null �Ұ���!
		if (num != null) {
			for (int i : num) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println("\n===================");
		
	}

}
