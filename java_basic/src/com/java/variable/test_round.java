package com.java.variable;

/*�Ҽ��� float�� �ݿø��Ͽ� �Ҽ��� ù°�ڸ����� ����ϱ�*/

public class test_round {

	public static void main(String[] args) {
		
		float inputNum = 1.375f;	//f ������ double�� �� 
		int intTemp;
		float result;
		
		result = (inputNum+0.05f)*10;	//�ݿø�
		intTemp = (int)result;	//�Ҽ��� ��°�ڸ����� ����
		result = intTemp/10f;	//�ٽ� float�� ��ȯ-> 10f�� f�� �ٿ���� ��
		
		System.out.println(result);
	}

}
