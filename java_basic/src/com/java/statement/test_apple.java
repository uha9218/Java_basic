package com.java.statement;

/*사과가 총 127개. 
 * 한바구니에 들어가는 사과 10개. 
 * 사과를 모두 담기위한 최소바구니 갯수 구하기
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
