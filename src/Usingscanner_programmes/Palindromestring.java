package Usingscanner_programmes;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		
		//String s="MADAM";
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the string:");
				 String s=sc.next();
				
				 String rev="";
				 String temp;
				 temp=s;//temp=MADAM
				 
				for(int i=s.length()-1;i>=0;i--)
				{
			    rev=rev+s.charAt(i);
				}
			    
			    	if(temp.equals(rev))
			    	{
			    System.out.println("String is palindrome:");
			    	}
			    	else
			    	{
			    		 System.out.println("String is not palindrome:");		
			    	}
			
				
			    
				

			



	}

}
