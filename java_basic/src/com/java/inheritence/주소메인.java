package com.java.inheritence;

import java.util.Scanner;

public class 주소메인 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String menu = null;
		지도 map = null;
		
		//map = new 지도();
		//지도 타입으로 선업되어서 대전의 메소드들을 사용할 수 없다.
		//유성구의 메소드들을 쓰고 싶으면 강제형변환을 해야한다.
		
		//((유성구)map).get동(); -> 에러 : 인스턴스의 크키가 더커야함
		
		//map = new 대한민국();
		
		//((유성구)map).get동(); // 가능
		//((세계)map).get국적();  //-> 에러
		
		System.out.println("1.국가 2.시 3.구 4.동 5.종료");
		System.out.print("검색 구분을 입력하시오 : ");
		menu = scan.nextLine();

		switch (menu) {
		case "1":
			map = new 세계();
			break;
		case "2":
			map = new 대한민국();
			break;
		case "3":
			map = new 대전();
			break;
		case "4":
			map = new 유성구();
			break;
		case "5":
			break;
		default:
		}

		System.out.println(map.주소());
		
		System.out.println("세계 인스턴스 : "+(map instanceof 세계));
		
                           
	}

}