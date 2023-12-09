package Usingscanner_programmes;
//4. Check whether the number is amstrong or not
import java.util.Scanner;

/*A number is thought of as an Armstrong number 
 * if the sum of its own digits raised to the power number
 *  of digits gives the number itself. 
 *  For example, 0, 1, 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers and there are many more.
 */
public class Amstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		
	   int ams=0;//temp variable to store
	   int  temp=num;
	   
	   for(;num!=0;num=num/10)
	   {
		   int rem=num%10;
		  // ams=ams+rem;
		   ams=ams+rem*rem*rem;//for cube//153
		  //ams=ams+rem*rem*rem*rem;//for 4digits   //8208              
	   }
	   if(temp==ams)
	   {
	   System.out.println("Is a amstrong number");
	   }
	   else 
	   {
		 System.out.println("is not amstrong number:");
		   }
	
	   
	   
	   
		

	}

}
