package com.java.inheritence;

import java.util.Scanner;

public class 대한민국 extends 지도 {
	private String[] 시;

	public void 시검색(String 시) {

		super.주소 += 시;
	}

	@Override
	public String 주소() {
		Scanner scan = new Scanner(System.in);	
		String input_시 = "시";
		
		System.out.print("시를 입력하세요 : ");
		input_시 = scan.nextLine()+" ";
		
		시검색(input_시);

		return super.주소();
	}

	public String[] get시() {
		return 시;
	}
	
}
