package Usingscanner_programmes;
//8. Find the Sum of the digit
import java.util.Scanner;

public class SumOfDigits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be added:");
		int num=sc.nextInt();
		
		int sum=0;//Temporary variable to store
		
		for( ;num!=0;num=num/10)
		{
			
			sum=sum+num%10;
		}
				System.out.println("Sum of the given digits:"+sum);
			
			
		}
		

	}


