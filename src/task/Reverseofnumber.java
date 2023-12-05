package task;

public class Reverseofnumber {

	public static void main(String[] args) {
// Reverse of a number 1234 to 4321 using while
//Arithematic operations
		
	int num= 789; //initilisation
    int rev=0;  //temporary variable
	 
	  while(num>0)  //loop condition
				
	{	
	int rem=num%10;
	rev=rev*10+rem;   
	num=num/10; 
	
	}
	System.out.println("reverse of a num:"+rev);
	{
	
	
    }
		
		
//method2 using Forloop
		
	/*	int rev=0;  //temporary variable
				
		for(int num=56789;num!=0;num=num/10) // initilisation,condition,end statement
				
		{	
		 int rem=num%10;   //4 //1st find remainder for given number
		 rev=rev*10+rem;   //4 //multiple the reverse with 10 and add remainder
			     
			}	
					
		{
		System.out.println("reverse of a num:"+rev);
		}*/
				

			}


				

	}


