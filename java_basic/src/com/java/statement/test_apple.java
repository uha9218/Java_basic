package com.java.statement;

/*����� �� 127��. 
 * �ѹٱ��Ͽ� ���� ��� 10��. 
 * ����� ��� ������� �ּҹٱ��� ���� ���ϱ�
 */ 

public class test_apple {
	public static void main(String[] args) {
		int apples = 127;
		int basketVolume = 10;
		int result = 0;
		
		result = apples/basketVolume;
		if(apples%basketVolume>0) {result++;}
		
		System.out.println(result);
		}
}
