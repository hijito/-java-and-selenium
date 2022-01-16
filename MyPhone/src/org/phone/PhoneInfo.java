package org.phone;

public class PhoneInfo {
	
	private void phoneName() {
		System.out.println("samsung");

	}
	
	private void phoneMieiNum() {
		System.out.println("123r5345378389");

	}
	private void camera() {
		System.out.println("8mp");

	}
	private void storage() {
		System.out.println("32gb");

	}
	private void osName() {
		System.out.println("android");

	}
	public static void main(String[] args) {
		
		PhoneInfo p = new PhoneInfo();
		p.phoneName();
		p.phoneMieiNum();
		p.camera();
		p.storage();
		p.osName();
		
		
	}

}
