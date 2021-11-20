package org.bank;

public class BankInfo extends AxisBank{
private void savings() {
	System.out.println("saving = 10000");
}
private void fixed() {
	System.out.println("fixed = 400000");	
}
@Override
public void deposit() {
	System.out.println("deposit = 10000");
}
public static void main(String[] args) {
	BankInfo a=new BankInfo();
	a.savings();
	a.fixed();
	a.deposit();	
}


}
