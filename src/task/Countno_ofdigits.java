package task;

public class Countno_ofdigits {

	public static void main(String[] args) {
		int num=1234567;  //initialisation
		int count=0;
		
		while(num>0)   //while loop
			
		{
			int rem=num%10;
			num=num/10;
			count++;     //end condition
		}
		System.out.println("Number of digits:"+count);
			

	}

}

//Using for loop
		
	/*	int count=0;
		
		for(int num=1234;num>0;num=num/10)
		
		{
			count++;
			
		}
		
		System.out.println("number of digits:"+count);
	}}*/
			
			
			

