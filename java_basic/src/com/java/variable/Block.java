package com.java.variable;

/*전역변수 지역변수*/

public class Block {
	{
		int i; 
		{
			i=100;
			int j=200;
		}
		{
			int j=300;
			int k=400;
			
			System.out.println(i);
			
			i=500;
		}
		
		System.out.println(i);
	}
	public static void main(String[] args) {
		Block block = new Block();
	}
}
