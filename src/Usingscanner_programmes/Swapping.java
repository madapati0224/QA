package Usingscanner_programmes;

import java.util.Scanner;

//10.Swap of two variable without using third variable
public class Swapping {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int a=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter b value:");
		int b=sc.nextInt();
		
		a=a+b;//10+20=30//a=30
		b=a-b;//30-20//b=10
		a=a-b;//30-10//a=20
		
		System.out.println("After swapping value of a:"+a);
		System.out.println("After swapping value of b:"+b);
		
		
	}

}
