package Usingscanner_programmes;

import java.util.Scanner;

//7. Print the count of the given number
public class CountOfNumbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
		int count=0;//temporary variable to store
		for(;num>0;num=num/10)
		{
			count++	;
		}
				System.out.println("no.of given digits:"+count);
			
		}
	
	
}
