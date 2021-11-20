package org.emp;

public class Employee {
	private void employee(String a,int b) {
		System.out.println("emploeename and pc no=" +a+" "+b);
	}

	private void employee(int d, char c) {
		System.out.println("employee city pincode and initial="+d+" "+c);
	}

	public static void main(String[] args) {
		Employee e = new Employee();
		e.employee("vignesh",614);
		e.employee(6141,'r');

	}

}
