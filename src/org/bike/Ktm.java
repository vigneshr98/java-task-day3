package org.bike;

public class Ktm implements Bike{
	@Override
	public void cost() {
		System.out.println("ktm 2021 model = 120000Rs");
	}
	@Override
	public void speed() {
			System.out.println("ktm bike = 210km/hr");	
	}
	public static void main(String[] args) {
		Ktm a=new Ktm();
		a.cost();
		a.speed();		
	}	


}
