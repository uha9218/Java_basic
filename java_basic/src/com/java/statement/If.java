package com.java.statement;

public class If {

	public static void main(String[] args) {
		
		String str = null;
		/*
		 * 에러 : null의 길이를 받아올 수 없음 
		 * if(str.length()>0&&str!=null) {
		 * System.out.println("문자열의 길이 : "+str.length()); }
		 */

		// str!=null을 먼저 판단하기 때문에 에러 안남
		if (str != null && str.length() > 0) {
			System.out.println("문자열의 길이 : " + str.length());
		}

		int k = 3;
		boolean result;
		result = k > 5 && (k = 7) < 5;
		System.out.println(result + " " + k);

		result = (k = 7) < 5 && k > 5;
		System.out.println(result + " " + k);
		
		

	}

}
