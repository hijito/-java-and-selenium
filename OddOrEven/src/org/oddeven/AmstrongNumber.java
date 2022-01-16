package org.oddeven;

import java.util.Scanner;

public class AmstrongNumber {
	public static void main(String[] args) {
		int n, count =0,a,b,c;
				double sum =0;
		System.out.println("enter the number to check if its armstrong number:  ");
		Scanner s = new Scanner(System.in);
		 n = s.nextInt();
		 a=n;
		 c=n;
		 while(a > 0) {
			a= a/10;
			 count++;
			 }
		while(n>0) {
			b= n %10;
			sum = sum+Math.pow(b, count);
			n= n/10;
		
		}
		if(sum == c)
		{
			System.out.println("Given number is Armstrong");
		}
		else {
			System.out.println("Given number is not Armstrong");
		}
		 
	}

}
