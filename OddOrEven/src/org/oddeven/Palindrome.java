package org.oddeven;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		int n,a,b,reverse=0;
System.out.println("enter the number to reverse:  ");
Scanner s = new Scanner(System.in);
 n = s.nextInt();
 b =n;
  while(n!=0) {
	  a= n%10;
	reverse=reverse*10 + a;
	 n= n/10;
	}
  
if(reverse == b) {
	System.out.println("The number is palindrome");
}
else {
	System.out.println("The number is not a palindrome");
}
}
	}



