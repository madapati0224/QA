package Usingscanner_programmes;

import java.util.Scanner;

//2. Find the reverse of the number
public class Reverse {

	public static void main(String[] args) {
		//int num=123;
		
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number to Reverse:");
	 int num=sc.nextInt();
	   
		int rev=0;//Temporary vrariable
		for(;num!=0;num=num/10)
		{
		int rem=num%10;//remainder //3 2 1
		rev=rev*10+rem; //3 2 1
		{
			System.out.println("After reverse of a number:"+rev);
		}

	}

}}
