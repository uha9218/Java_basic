package com.java.variable;

/* ����� ���������� �ؾ� ������ ���� �ȵ�*/

public class Variable {
	public static void main(String[] args) {
		
		int kor, eng, math, scien;
		int total;
		float avg;
		
		kor=95; eng=65; math=75; scien=80;
		
		total = (kor+eng+math+scien)*10;	//�ڸ��� �����÷ο� Ȯ���� ��
		avg=(total/4)/10f;	// �Ҽ��� ��ȿó���� ����
		
		System.out.println("����\t ����\t ����\t ����\t");
		System.out.printf("%d\t %d\t %d\t %d\n",kor, eng, math, scien);
		System.out.println("���� : "+total);
		System.out.println("��� : "+avg);
	
	}
}
