package org.company;

public class CompanyInfo {
	private void companyName(String a,int b) {
		System.out.println("college name and code="+a+" "+b);

	}
	private void companyName(String c,int d,boolean e) {
	System.out.println("college and code and certified college="+c+" "+d+e);

	}
	public static void main(String[] args) {
		CompanyInfo e=new CompanyInfo();
				e.companyName("selvam college of technology",625);
				e.companyName("V.S.B.Engineering college",142,true);
	}


}
