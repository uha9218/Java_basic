package com.java.class_;
/*�޼ҵ� : ������ ����Ÿ�� �޼ҵ��(�Ű�����)
 	*�޼ҵ� ���� ��ġ : �ʵ� ��(Ŭ������ ����̱� ������)
	*�޼ҵ� �ߺ����� : �޼ҵ��(�Ű�����)�� ���ƾ�
	*������� : �ʵ峻 ���� -> ������ �ʱ�ȭ �Ǿ�����(�ʱ�ȭ �ʿ����)
		but �޼ҵ� ���� ������ ������ ������� �ƴ�
*/

public class FieldArea {

	int k;

	public void print() {
		int k = 10; // ������ �ʱ�ȭ �ȵ�, ���� k �� �ߺ����� ���� -> �ٸ� �������� ����
		System.out.println(k);
		System.out.println(this.k); // k=0 -> ������ �ʱ�ȭ

	}
	
	//�����ε�
	public void print(int k) {
		System.out.println(k);
	}

	public void print(String k) {
		System.out.println(k);
	}

	public void print(float k) {
		System.out.println(k);
	}
	
	//�������� �Ű�����
	public void print(int ...k) {
		int sum=0;
		for(int i=0;i<k.length;i++) sum=sum+k[i];
	}

	public static void main(String[] args) {
		new FieldArea().print();
		
	}
}
