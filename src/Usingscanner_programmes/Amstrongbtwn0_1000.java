package Usingscanner_programmes;

import java.util.Scanner;


//5. Print the amstrong number available between 0 to 1000
public class Amstrongbtwn0_1000 {

	public static void main(String[] args) {
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 0 to 1000:");
	   int input=sc.nextInt();*/
	   
//print 1to1000	   
	  for(int i=1;i<=1000;i++) //1st loop to print 0 to1000 numbers
	  {
		 int num,amst=0;
		 
		 num=i;
		
		 while(num>0)
		 {
		int rem=num%10;
		 amst=amst+(rem*rem*rem);
		 num=num/10;
	  }
		  if(i==amst) 
		  {
			System.out.println(i);  
		  }
	  }}}
	  
	   
		

	


