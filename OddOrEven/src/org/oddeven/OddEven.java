package org.oddeven;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		System.out.println("Enter your number: ");
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		if (x % 2 == 0) {
			System.out.println("It is an even number");
		}
			else {
				System.out.println("it is an odd number");
			
			
		}
		
	}

}
