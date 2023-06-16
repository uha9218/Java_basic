package com.java.inheritence;

public class Car {
	
	private String seria_number;
	private String engine;
	private int gear;
	private int accelate;
	private int carBreak;
	
	public Car() {		
		this.accelate=11;
		this.carBreak=0;
		this.engine="그랜저엔진";
	}
	
	public Car(String seria_number, String engine, int gear, int accelate, int carBreak) {
		super();
		this.seria_number = seria_number;
		this.engine = engine;
		this.gear = gear;
		this.accelate = accelate;
		this.carBreak = carBreak;
	}


	public void drive() {}
	public void speedUp() {
		this.accelate++;
	}
	public void speedDown() {
		this.accelate--;
		this.carBreak++;
	}
	public void stop() {}

	public String getSeria_number() {
		return seria_number;
	}

	public void setSeria_number(String seria_number) {
		this.seria_number = seria_number;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public int getGear() {
		return gear;
	}

	public void setGear(int gear) {
		this.gear = gear;
	}

	public int getAccelate() {
		return accelate;
	}

	public void setAccelate(int accelate) {
		this.accelate = accelate;
	}

	public int getCarBreak() {
		return carBreak;
	}

	public void setCarBreak(int carBreak) {
		this.carBreak = carBreak;
	}
	
	
	 
	
}
