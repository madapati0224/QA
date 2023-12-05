package Usingscanner_programmes;
//6. To print the palindrome available between 0 to 100

public class Palindromebtwen_0to100 {

	public static void main(String[] args) {
		for(int i=1;i<=100;i++)
		{
			int rev=0;
			int num=i;//num =1.2.....
			
			while(num>=0)
			{
				int rem=num%10;
				rev=rev*10+rem;
				}
					if(num==rev)
					{
						System.out.println(i);
					}
			}
		}
		
	}


