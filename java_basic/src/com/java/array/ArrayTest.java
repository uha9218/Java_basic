package com.java.array;

/*배열
	:같은 타입을 여러개 값을 갖는것
	크기를 정해줘야 함
	행이 아닌 열에 대한 기준(같은 타입이어야 하기 때문)
	
	* 선언 : type[] 배열명;	//주솟값 null상태
	 		 type[] 배열명 = new type[갯수];	//주소값이 들어가 있음, 인덱스가 0으로 초기화되어있음
	
	* 첫 인덱스는 [0]부터 시작
	  마지막 인덱스는 [n-1]
	  
	* 배열길이 : 변수명.length  
*/

public class ArrayTest {

	public static void main(String[] args) {

		//입력
		String[] label = { "번호", "이름", "국어", "영어", "수학", "과학", "총점", "평균" };
		int[] num = { 1, 2, 3, 4 };
		String[] name = { "A", "B", "C", "D" };
		int[] kor = { 95, 60, 75, 80 };
		int[] eng = { 80, 85, 85, 90 };
		int[] math = { 75, 75, 77, 81 };
		int[] scien = { 60, 90, 50, 20 };

		int[] total = new int[4];
		float[] avg = new float[4];
		
		//처리
		for (int i = 0; i < num.length; i++) {
			total[i] = (kor[i] + eng[i] + math[i] + scien[i]) * 10;
			avg[i] = (total[i] / 4) / 10f;
			total[i] = total[i] / 10;
		}
		
		//출력
		for(int i=0;i<label.length;i++) {System.out.print(label[i]+"\t");}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.printf("%d\t %s\t %d\t %d\t %d\t %d\t %d\t %.2f\n",num[i], name[i], kor[i],eng[i],math[i],scien[i],total[i],avg[i] );
		}
	}

}
