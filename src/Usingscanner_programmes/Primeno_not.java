package Usingscanner_programmes;

import java.util.Scanner;

public class Primeno_not {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
	    int num=sc.nextInt();
	    
	    int count=0;//to check the no.of factors to that num
	    
 if(num>1) //1st condition if true enter to loop
	    {
		for(int i=1;i<num;i++) 
		{
			if(num%i==0);
			count++;
		}
		if(count==2)//1 and itself 2 factors
		{
			System.out.println("Is prime number");
		}
	  
	     else
	  {
	      System.out.println("not prime number");
	  }
 }
 
else//1st condition not true execute the else statement
	{
		System.out.println("not prime number");
	}

	}

}
