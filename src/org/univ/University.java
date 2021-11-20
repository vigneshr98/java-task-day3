package org.univ;

public class University extends College{	
@Override	
public void ug() {
	System.out.println("under graduates 10nos");
}
@Override
public void pg() {
	System.out.println("post graduates 11nos");
}
public static void main(String[] args) {
	University a=new University();
	a.ug();
	a.pg();	
}

}
