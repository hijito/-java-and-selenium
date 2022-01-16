package org.oddeven;

import java.util.Scanner;

public class CountOfEven {
	public static void main(String[] args) {
		System.out.println("Enter your range of number: ");
		Scanner s = new Scanner(System.in);
		int c = s.nextInt();
		if (c%2==0) {
			int n = c/2;
			System.out.println(n);
			
		}
		else {
			int n = (c-1)/2;
			System.out.println(n);
		}
	}
	
	}


