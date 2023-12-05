package Usingscanner_programmes;

import java.util.Scanner;

public class Sumofevenoddcount {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=sc.nextInt();
		
		int oddCount = 0,evenCount=0;
		
		for (int i = 1; i <= n; i++) {
		if (i % 2 == 0) {
			evenCount= evenCount+i;
			System.out.println("even numbers"+i);
		}
		else {
			oddCount=oddCount+i;
			System.out.println("odd number"+i);
		}
		}
		System.out.println("sum of odd number is "+oddCount);
		System.out.println("sum of even number is "+evenCount);
		}
		
	}


