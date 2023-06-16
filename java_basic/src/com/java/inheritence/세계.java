package com.java.inheritence;

import java.util.Scanner;

public class 세계 extends 지도 {
	private String[] 국적;
	

	public void 국적검색(String 국적) {

		super.주소 += 국적;
	}

	@Override
	public String 주소() {
		
		Scanner scan = new Scanner(System.in);
		String input_국적 = "국적";
		
		System.out.print("국가를 입력하세요 : ");
		input_국적=scan.nextLine()+" ";
		
		국적검색(input_국적);

		return super.주소();
	}

	public String[] get국적() {
		return 국적;
	}
	
}
