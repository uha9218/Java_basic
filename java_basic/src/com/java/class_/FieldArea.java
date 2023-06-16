package com.java.class_;
/*메소드 : 제한자 리턴타입 메소드명(매개변수)
 	*메소드 선언 위치 : 필드 내(클래스의 멤버이기 때문에)
	*메소드 중복기준 : 메소드명(매개변수)가 같아야
	*멤버변수 : 필드내 변수 -> 묵시적 초기화 되어있음(초기화 필요없음)
		but 메소드 내에 생성된 변수는 멤버변수 아님
*/

public class FieldArea {

	int k;

	public void print() {
		int k = 10; // 묵시적 초기화 안됨, 위의 k 와 중복판정 안함 -> 다른 영역으로 따짐
		System.out.println(k);
		System.out.println(this.k); // k=0 -> 묵시적 초기화

	}
	
	//오버로딩
	public void print(int k) {
		System.out.println(k);
	}

	public void print(String k) {
		System.out.println(k);
	}

	public void print(float k) {
		System.out.println(k);
	}
	
	//가변길이 매개변수
	public void print(int ...k) {
		int sum=0;
		for(int i=0;i<k.length;i++) sum=sum+k[i];
	}

	public static void main(String[] args) {
		new FieldArea().print();
		
	}
}
