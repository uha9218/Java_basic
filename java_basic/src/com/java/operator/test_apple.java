package com.java.operator;

/*사과가 총 127개. 
 * 한바구니에 들어가는 사과 10개. 
 * 사과를 모두 담기위한 최소바구니 갯수 구하기
 */

public class test_apple {
	public static void main() {
		float apple = 127;
		float basketV = 10;
		int result;
		
		result=(int)(apple/basketV+0.9);
		
		System.out.println(result);		
	}
}
