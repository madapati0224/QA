package Usingscanner_programmes;
//1.Find the Factorial of the given number
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// 5!=5*4*3*2*1=120 or 5!=1*2*3*4*5=120
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter factorial number:");
		int num=sc.nextInt();
		
		long factorial=1;//Temporary variable
		
	/*	for(int i=1;i<=num;i++) //5!=1*2*3*4*5=120
		{
			factorial=factorial*i;
		}
		
		System.out.println("Factorial of number is:"+factorial);

	}

}*/

// 5!=5*4*3*2*1=120
for(int i=num;i>=1;i--) //5!=5*4*3*2*1=120
{
	factorial=factorial*i;
}

System.out.println("Factorial of number is:"+factorial);

}

}
