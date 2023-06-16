package com.java.inheritence;

public class fireEngine extends Car{
	private int accelate = super.getAccelate();
	
	private int water=1000;
	
	public fireEngine() {
		//조상 클래스 생성자는 무조건 첫줄에 
		water = 100;
	}
	
	public int shower() {
		this.water = this.water -10;
		return this.water;
	}
	public int inputWater(int water) {
		this.water = this.water + water;
		return this.water;
	}
	public int getWater() {
		return water;
	}
//	@Override 	-> 에러 : 조상클래스에 있는 메소드만 가능
//	public void speedUp(int k) {
//		System.out.println("속도를 올립니다.");
//	}
// 생성자는 상속 불가능
	
	@Override	//원래 있던 메소드의 재정의(source -> override~)
	public void speedUp() {
		this.accelate = this.accelate + 3;
		super.speedUp(); 
	}

}
