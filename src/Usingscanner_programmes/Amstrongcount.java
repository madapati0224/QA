package Usingscanner_programmes;
import java.util.Scanner;
public class Amstrongcount {

	public static void main(String[] args) {
		
    int c=0;
	int num=1000;	
				
/*Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int num=sc.nextInt();*/
				
		for (int n = 1; n <= num; n++) {
				int a, i = 0, j = 0;
				a = n;
				while (a > 0) {
				i = a % 10;
				j = j + (i * i * i);
				a = a / 10;
				}
				if (n == j) {
				c++;
				}
				}
				System.out.println(c);

			}

		


	}

