package com.java.inheritence;

import java.util.Scanner;

public class ������ extends ���� {

	private String[] ��;
	private String[] ��;
	private String[] ��;

	private void ���˻�(String ��) {
		// �� �˻� �� �ּҿ� ���� �߰�
		super.�ּ� += ��;
	}
	private void ���˻�(String ��) {
		// �� �˻� �� �ּҿ� ���� �߰�
		super.�ּ� += ��;
	}
	private void ���˻�(String ��) {
		// �� �˻� �� �ּҿ� ���� �߰�
		super.�ּ� += ��;
	}
	
	@Override
	public String �ּ�() {
		
		Scanner scan= new Scanner(System.in);
		
		String input_�� = "��";
		String input_�� = "��";
		String input_�� = "��";
		
		System.out.print("���� �Է��ϼ���:\t");
		input_�� = scan.nextLine()+" ";
			
		System.out.print("���� �Է��ϼ���:\t");
		input_�� = scan.nextLine()+" ";
		
		System.out.print("���� �Է��ϼ���:\t");
		input_�� = scan.nextLine()+" ";
		
		���˻�(input_��);
		���˻�(input_��);
		���˻�(input_��);
		
		return super.�ּ�;
	}
	public String[] get��() {
		return ��;
	}
	public String[] get��() {
		return ��;
	}
	public String[] get��() {
		return ��;
	}
	

}
