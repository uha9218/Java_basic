package com.java.class_;

public class Main {

	public static void main(String[] args) {
		//���۷��� -> �ν��Ͻ�
		sum2 sum = new sum2();
		
		System.out.println(sum.sum(1,1));
		System.out.println(sum.sum(1,1,1));
		System.out.println(sum.sum(1,1,1,1));
		System.out.println(sum.sum(1,1,1,1,1));
		
		int[] data = {1,1,1,1,1,1};
		System.out.println(sum.sum(data));
		
	}

}
