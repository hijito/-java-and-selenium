package org.company;

public class CompanyInfo {
	
	private void companyName() {
		System.out.println("Cuemath");
	   

	}
	private void companyId() {
		System.out.println("03256");

	}
	private void companyAddress() {
		System.out.println("Banglore");

	}
	public static void main(String[] args) {
		
		
		CompanyInfo c = new CompanyInfo();
		c.companyId();
		c.companyName();
		c.companyAddress();
	}

}
