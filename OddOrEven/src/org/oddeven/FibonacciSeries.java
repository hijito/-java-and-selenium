package org.oddeven;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		System.out.println("Enter fibonacci series: ");
	
		 int n1=0,n2=1,n3,i;
		 Scanner s = new Scanner(System.in);
			int n = s.nextInt();
		 System.out.print(n1+" "+n2);//printing 0 and 1    
		    
		 for(i=2;i<n;i++)//loop starts from 2 because 0 and 1 are already printed    
		 {    
		  n3=n1+n2;    
		  System.out.print(" "+n3);    
		  n1=n2;    
		  n2=n3;    
		 }    
		  
		
		
	}
	
	

}

//0 1 1 2 3 5 8 13 21 34
