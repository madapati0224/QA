package task;

public class Smallestof3numbers {

	public static void main(String[] args) {
		// smallest of 3 number using If_else
		
		int a=20;
		int b=30;
		int c=40;
		
		if(a<b && a<c) // condition is true means a is small 
		{
		 System.out.println(" smallest number is a:"+a);
		}
		
		  else
			  if(b<a && b<c) //if condition true b is small
		{
			System.out.println(" smallest number is b:"+b);
		}
		else 
		{
			System.out.println(" smallest number is c:"+c);
		}
		 
		
		

	}

}
