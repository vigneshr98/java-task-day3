package org.computer;

public class Desktop implements HardWare,Software{
private void desktopModel() {
	System.out.println("intel  i5");
}
public static void main(String[] args) {
	Desktop a=new Desktop();
	a.hardwareResources();
	a.desktopModel();
	a.softwareResources();	
}
@Override
public void softwareResources() {
	System.out.println("global software resources");	
}
@Override
public void hardwareResources() {
	System.out.println("world hardware resources");	
}


}
