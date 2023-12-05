package Usingscanner_programmes;
//9.Swap of two number using third variable
import java.util.Scanner;

public class Swapping_using_3rdvariable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		
		Scanner sc1=new Scanner(System.in);
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		
		int c=a;//c=10
		a=b;//a=20
		b=c;//b=10
		System.out.println("After swpping value of a:"+a);
		System.out.println("After swpping value of b:"+b);
		

	}

}
