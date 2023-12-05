package task;

public class Palindrome {

	public static void main(String[] args) {
		/*int num=12121;
		int rev=0;
		int temp; //temporary variable
		
		temp=num; //comparing temp number with reverse number
		
		while(num>0)
		{
	  int rem=num%10; //343%10=3
		  rev=rev*10+rem; //0+3=3
		  num=num/10; //343/10=34
		  
		}
		if(temp==rev)
		{
			System.out.println("Is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}*/
		
//using for loop
		
		int rev=0;
		int num=1221;
		int temp=0;
		temp=num;
		
		
		for( ;num>0;num=num/10)
			
			
		 {
		int rem=num%10;//4;8;
		rev=rev*10+rem; //4;48;480+4=484
		}
		
		
		if(temp==rev)
		
		{
			System.out.println("is palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
			
		
		
		
		
		
		
			
		
			

	}
	}


