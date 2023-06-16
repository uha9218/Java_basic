package com.java.variable;

/*소수점 float를 반올림하여 소수점 첫째자리까지 출력하기*/

public class test_round {

	public static void main(String[] args) {
		
		float inputNum = 1.375f;	//f 없으면 double이 됨 
		int intTemp;
		float result;
		
		result = (inputNum+0.05f)*10;	//반올림
		intTemp = (int)result;	//소숫점 둘째자리부터 버림
		result = intTemp/10f;	//다시 float로 변환-> 10f에 f를 붙여줘야 함
		
		System.out.println(result);
	}

}
