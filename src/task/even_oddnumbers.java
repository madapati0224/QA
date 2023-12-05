package task;

public class even_oddnumbers {

	public static void main(String[] args) {
		// count of even and odd numbers in a number
		
		int num=12345;
		int even_count=0;
		int odd_count=0;
		
		while(num>0)
		
		{
		int rem=num%10;	 //extract number
		
		if(rem%2==0) //check weather xctracted number is even or add
		{
			even_count++; //if even increase the count
		}
		else
		{
			odd_count++; //if odd increase the count
		}
		num=num/10; //here it will delete the xtracted number
			
			
		}{
		System.out.println("no.of Even numbers:"+even_count);

	
	
		System.out.println("no.of odd numbers:"+odd_count);
	}}

}
		
//Using for loop
		
	/*	int Even_count=0;
		int Odd_count=0;
		
		for(int num=12345;num>0;num=num/10)
	{
	int rem=num%10;
	if(rem%2==0)
	{
	Even_count++;
	}
	else
	{
		Odd_count++;
	}
	
	{
		System.out.println("no.of Even number:"+Even_count);
	
		System.out.println("no.of odd numbers:"+Odd_count);
	}
	
	}
	}}*/
