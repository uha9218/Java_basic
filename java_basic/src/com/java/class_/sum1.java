package com.java.class_;

public class sum1 {
	public int a;
	public int b;
	
	public static int sa;
	public static int sb;
	
	public int sum() {
		return sa+sb;
	}
	
	public int sum(int c,int d) {
		return a+b+c+d;
	}
	
	//�ν��Ͻ� ��� ���� ��� ���� -> �ν��Ͻ� �����ʿ� ���� 
	//	-> static : �ν��Ͻ� ������ �ʰ� ȣ�Ⱑ��
	public static int sum(int c,int d, int e) {
		return c+d+e;
	}
}