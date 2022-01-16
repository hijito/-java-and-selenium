package org.emp;

import org.client.Client;
import org.company.Company;
import org.project.Project;

public class Employee {
	private void empName() {
		System.out.println("Employee name is jason");

	}
	public static void main(String[] args) {
		Company c = new Company();
		Client cl = new Client();
		Project p = new Project();
		c.CompanyName();
		cl.clientName();
		p.projectName();
		
		Employee e = new Employee();
		e.empName();
		
	}

}
