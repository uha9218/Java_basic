package com.java.inheritence;

import java.util.Scanner;

public class ���ѹα� extends ���� {
	private String[] ��;

	public void �ð˻�(String ��) {

		super.�ּ� += ��;
	}

	@Override
	public String �ּ�() {
		Scanner scan = new Scanner(System.in);	
		String input_�� = "��";
		
		System.out.print("�ø� �Է��ϼ��� : ");
		input_�� = scan.nextLine()+" ";
		
		�ð˻�(input_��);

		return super.�ּ�();
	}

	public String[] get��() {
		return ��;
	}
	
}
