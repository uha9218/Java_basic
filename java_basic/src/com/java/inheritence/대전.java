package com.java.inheritence;

import java.util.Scanner;

public class ���� extends ����{
	private String[] ��;
	
	public void ���˻�(String ��) {
	
		super.�ּ� += ��;
	}

	@Override
	public String �ּ�() {
		
		Scanner scan = new Scanner(System.in);	
		String input_�� ="��";
		
		System.out.print("���� �Է��ϼ��� : ");
		input_��= scan.nextLine()+" ";
		
		���˻�(input_��);
		
		return super.�ּ�();
	}

	public String[] get��() {
		return ��;
	}
	
}
