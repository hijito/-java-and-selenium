package org.oddeven;

import java.util.Scanner;

public class ReverseTheNumber {
	public static void main(String[] args) {
		int n,a,reverse=0;
System.out.println("enter the number to reverse:  ");
Scanner s = new Scanner(System.in);
 n = s.nextInt();
 
  while(n>0) {
	  a= n%10;
	reverse=reverse*10 + a;
	 n= n/10;
	}
 System.out.println(reverse);
	}

}
