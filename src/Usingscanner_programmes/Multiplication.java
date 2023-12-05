package Usingscanner_programmes;

import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		

		
				
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter the table number:");
				int num=sc.nextInt();//num=2
				
				for(int i=1;i<=12;i++)//Loop//2*12=24
				{
					int result=num*i;//2*1 2 3 4....=
					System.out.println(result);
					//System.out.println(num+"*"+i+"="+result);//2*1=2
				}

	}

}
