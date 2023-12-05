package task;

public class SumofelementsinArray {

	public static void main(String[] args) {
		// Sum of elements in a Array
		
		int a[]= {1,2,3,4,5}; //Declaration of variable with values
		int sum=0; //Temporary variable
		
	/*	for(int i=0;i<5;i++)
		{
		 sum=sum+a[i];	
		} 
		  System.out.println("sum of elements:"+sum); //15*/
		
//By using enhanced for loop
		
		for(int value:a)
		{
			sum=sum+value;
		}
		System.out.println("Sum of elements:"+sum); //15
		
		

	}

}
