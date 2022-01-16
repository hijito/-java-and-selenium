package org.college;

public class College {
private void collegeName() {
	System.out.println("Sriram engineering college");

}
private void collegeCode() {
	System.out.println("9090");

}
private void collegeRank() {
	System.out.println("67th rank");

}
public static void main(String[] args) {
	Student s = new Student();
	Dept d = new Dept();
	Hostel h = new Hostel();
	College c = new College();
	c.collegeName();
	c.collegeCode();
	c.collegeRank();
	s.studentName();
	s.studentId();
	s.studentDept();
	d.deptName();
	h.hostelName();
}
}
