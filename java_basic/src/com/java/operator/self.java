package com.java.operator;

/* Operator
* type무시 : 서로 다른 두개의 타입을 더할 경우 큰 용량의 타입,우선순위(실수형 우선->표현할 수 있는 범위가 넓음)로 결정
* 오버플로우, 언더플로우 조심
* 증감연산자 : 절이 기준 (전치:절실행시 먼저 연산, 후치:절실행후 연산) 
*/

public class self {

	public static void main(String[] args) {
		
		int i=0;
		
		System.out.println(++i);
		System.out.println(i++);
		System.out.println(i);
		
		i++;
		System.out.println(i);

	}

}
