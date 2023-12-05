package Usingscanner_programmes;

import java.util.Arrays;
import java.util.Scanner;

public class Input_Arrays{
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter size of array");
	int n = sc.nextInt(); 
	
	int []a=new int [n];
	
	for(int index =0;index<a.length-1;)
	
	
	{
		System.out.println("enter index");
		 index=sc.nextInt();
		 
	System.out.println("enter value");
	int value=sc.nextInt();
	
	a[index]=value;
	}
	System.out.println(java.util.Arrays.toString(a));   }}


