package com.java.inheritence;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car();
		//Car car1 = new fireEngine(); ->����
		//car1.inputWater(); -> �Ұ��� : fireEngine�� �޼ҵ� ��� �Ұ�
		//fireEngine car = new Car(); ->�Ұ��� 
	
		System.out.println(car.getAccelate());
		
		car.speedUp();
		car.speedUp();
		
		System.out.println(car.getAccelate());

		fireEngine F_car = new fireEngine();
		
		System.out.println(F_car.getAccelate());
	
		F_car.speedUp();
		F_car.speedUp();
		
		System.out.println(F_car.getAccelate());
		
		F_car.shower();
		F_car.shower();
		
		System.out.println(F_car.getWater());
		
		
		
	}
}
