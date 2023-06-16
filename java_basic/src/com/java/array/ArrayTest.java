package com.java.array;

/*�迭
	:���� Ÿ���� ������ ���� ���°�
	ũ�⸦ ������� ��
	���� �ƴ� ���� ���� ����(���� Ÿ���̾�� �ϱ� ����)
	
	* ���� : type[] �迭��;	//�ּڰ� null����
	 		 type[] �迭�� = new type[����];	//�ּҰ��� �� ����, �ε����� 0���� �ʱ�ȭ�Ǿ�����
	
	* ù �ε����� [0]���� ����
	  ������ �ε����� [n-1]
	  
	* �迭���� : ������.length  
*/

public class ArrayTest {

	public static void main(String[] args) {

		//�Է�
		String[] label = { "��ȣ", "�̸�", "����", "����", "����", "����", "����", "���" };
		int[] num = { 1, 2, 3, 4 };
		String[] name = { "A", "B", "C", "D" };
		int[] kor = { 95, 60, 75, 80 };
		int[] eng = { 80, 85, 85, 90 };
		int[] math = { 75, 75, 77, 81 };
		int[] scien = { 60, 90, 50, 20 };

		int[] total = new int[4];
		float[] avg = new float[4];
		
		//ó��
		for (int i = 0; i < num.length; i++) {
			total[i] = (kor[i] + eng[i] + math[i] + scien[i]) * 10;
			avg[i] = (total[i] / 4) / 10f;
			total[i] = total[i] / 10;
		}
		
		//���
		for(int i=0;i<label.length;i++) {System.out.print(label[i]+"\t");}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %d\t %.2f\n",num[i], name[i], kor[i],eng[i],math[i],scien[i],total[i],avg[i] );
		}
	}

}
