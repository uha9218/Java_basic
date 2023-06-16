package com.java.inheritence;

public class Main {
	
	public static void main(String[] args) {
		Car car = new Car();
		//Car car1 = new fireEngine(); ->가능
		//car1.inputWater(); -> 불가능 : fireEngine의 메소드 사용 불가
		//fireEngine car = new Car(); ->불가능 
	
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
