package task;

public class EvenOddno_Array {

	public static void main(String[] args) {
		// Even and odd numbers from an array
		
		int a[]= {1,2,3,4,5,6};
		
		
/*	for(int i=0;i<6;i++)
		{
			if(a[i]%2==0)          //Even numbers
		System.out.println(a[i]);
			
		}
	
	
	for(int i=0;i<6;i++)
			if(a[i]%2!=0)        //odd numbers
		System.out.println(a[i]); 
	
	System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&");	*/
	
//By using Enhanced forLoop
		
System.out.println("Print even numbers");

	for(int x:a)
		{
		if(x%2==0)
	System.out.println(x);
		}
	
System.out.println("Print odd numbers");
	
	for(int y:a)
	{
	if(y%2!=0)
	System.out.println(y);
			
	}
	
		}
	
	
	
		

	}


