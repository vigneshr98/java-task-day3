package org.add;

public class GreensTech {
	private void greensomr(String a,String b,int c) {
		System.out.println("order name and payment type and order number="+a+" "+b+" "+c);

	}
	private void greensomr(String e, String f, byte g) {
	System.out.println("order name and payment type and order number="+e+" "+f+" "+g);

	}
	public static void main(String[] args) {
		GreensTech d=new GreensTech();
		d.greensomr("phone","cash",6254);
		d.greensomr("books","cash",30);
		
	}

}
