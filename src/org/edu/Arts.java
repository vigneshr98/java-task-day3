package org.edu;

public class Arts extends Education{
	private void bsc() {
		System.out.println("b.s.c. 15nos");
	}
	private void bed() {
		System.out.println("bed 10os");
	}
	private void ba() {
		System.out.println("b.a 12nos");
	}
	private void bba() {	
System.out.println("bba 02nos");
	}
	@Override
public void ug() {
	System.out.println("arts u.g. students 10nos");
}
public void pg() {
	System.out.println("arts p.g. students 20nos");
}
public static void main(String[] args) {
	Arts a=new Arts();
	a.ba();
	a.bba();
	a.bed();
	a.bsc();
	a.ug();
	a.pg();

}


}
