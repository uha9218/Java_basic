package com.java.inheritence;

public class fireEngine extends Car{
	private int accelate = super.getAccelate();
	
	private int water=1000;
	
	public fireEngine() {
		//���� Ŭ���� �����ڴ� ������ ù�ٿ� 
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
//	@Override 	-> ���� : ����Ŭ������ �ִ� �޼ҵ常 ����
//	public void speedUp(int k) {
//		System.out.println("�ӵ��� �ø��ϴ�.");
//	}
// �����ڴ� ��� �Ұ���
	
	@Override	//���� �ִ� �޼ҵ��� ������(source -> override~)
	public void speedUp() {
		this.accelate = this.accelate + 3;
		super.speedUp(); 
	}

}
