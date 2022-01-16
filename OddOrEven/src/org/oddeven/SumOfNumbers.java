package org.oddeven;

import java.util.Scanner;

public class SumOfNumbers {
	public static void main(String[] args) {
		int n,a;
		int sum =0;
System.out.println("enter the number:  ");
Scanner s = new Scanner(System.in);
 n = s.nextInt();
 a=n;
 while(n>0) {
		a= n %10;
		sum = sum+a;
		n= n/10;

	}
System.out.println(sum);
}
}
