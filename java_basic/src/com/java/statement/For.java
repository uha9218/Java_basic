package com.java.statement;

public class For {

	public static void main(String[] args) {
		int sum = 0;
		
		for (int i=1; i<=10; i++) { //초계치와 증감치는 필수가 아님
			System.out.println(i);
			if(i>5) continue;
			sum=sum+i; 
			}	
		
		System.out.println(sum);

	}

}
