package Usingscanner_programmes;

import java.util.Scanner;

//3. Check whether the number is palindrome or not ,121

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the palindrome number:");
		int num=sc.nextInt();
		
		int rev=0;
		int temp=num;//temp=121
		for(;num!=0;num=num/10)
		{	
		int rem=num%10;
		rev=rev*10+rem;
		}
			if(temp==rev)
			{
				System.out.println("Given number is palindrome");
			}
			else {
				System.out.println("Not a palindrome");
			}
		}}
		
		
		

	


