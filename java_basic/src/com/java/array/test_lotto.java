package com.java.array;

public class test_lotto {

	public static void main(String[] args) {
		int[] lottoNum = new int[45];
		
		for(int i=0;i<lottoNum.length;i++) {
			lottoNum[i] = i+1;
		}
		 for(int i=0;i<1000000;i++) {
			 int num = (int)(Math.random()*lottoNum.length);
			 int tmp = lottoNum[num];
			 lottoNum[num] = lottoNum[0];
			 lottoNum[0] = tmp;		 
	}
		 System.out.print("[ ");
		 for(int i=0;i<6;i++) 	System.out.print(lottoNum[i]+" ");
		 System.out.print("]");
	 } 
}
