package org.emp;

public class Employee {
	
	
	private void empId() {
		System.out.println("101893020");

	}
	private void empName() {
		System.out.println("john");

	}
	private void empDob() {
		System.out.println("30-06-1997");

	}
	private void empPhone() {
		System.out.println("9442057295");

	}
	private void empEmail() {
		System.out.println("johnsharonkumar2gmail.com");

	}
	private void empAddress() {
		System.out.println("11/42 B3 chennai");

	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.empId();
		e.empName();
		e.empDob();
		e.empPhone();
		e.empAddress();
		e.empEmail();
	}

}
