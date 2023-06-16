package com.java.inheritence;

import java.util.Scanner;

public class 유성구 extends 지도 {

	private String[] 동;
	private String[] 번;
	private String[] 지;

	private void 동검색(String 동) {
		// 동 검색 후 주소에 동을 추가
		super.주소 += 동;
	}
	private void 번검색(String 번) {
		// 번 검색 후 주소에 번을 추가
		super.주소 += 번;
	}
	private void 지검색(String 지) {
		// 지 검색 후 주소에 지을 추가
		super.주소 += 지;
	}
	
	@Override
	public String 주소() {
		
		Scanner scan= new Scanner(System.in);
		
		String input_동 = "동";
		String input_번 = "번";
		String input_지 = "지";
		
		System.out.print("동을 입력하세요:\t");
		input_동 = scan.nextLine()+" ";
			
		System.out.print("번을 입력하세요:\t");
		input_번 = scan.nextLine()+" ";
		
		System.out.print("지를 입력하세요:\t");
		input_지 = scan.nextLine()+" ";
		
		동검색(input_동);
		동검색(input_번);
		동검색(input_지);
		
		return super.주소;
	}
	public String[] get동() {
		return 동;
	}
	public String[] get번() {
		return 번;
	}
	public String[] get지() {
		return 지;
	}
	

}
