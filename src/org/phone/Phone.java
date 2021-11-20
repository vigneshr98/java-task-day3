package org.phone;

public class Phone {
	private void phoneInfo(String a,double b) {
		System.out.println("name and price="+a+" "+b);

	}
	private void phoneInfo(double c, String d) {
		System.out.println("price and name="+c+" "+d);

	}
	public static void main(String[] args) {
		Phone e=new Phone();
		e.phoneInfo(15000, "moto e6");
		e.phoneInfo("apple i phone",1000000);
	}

}
