package task;

public class Missingno_Array {

	public static void main(String[] args) {
		//  Find Missing in Number in array
        //  *  numbers should be in range
		//* should not have duplicates
		
      int a[]={1,3,4,5};
      
    // sum1=1+3+4+5=13
    // sum2=1+2+3+4+5=15
    // sum2-sum1=15-13=2
      
  int sum1=0;         //i=0 is index value we have initilisation
      
      for(int i=0;i<a.length;i++)   
      {
    	sum1=sum1+a[i] ;
      }
    System.out.println("sum of elements in a array :"+sum1);
      

int sum2=0 ;       //inilisation of numbers in array
	
	for(int i=1;i<=5;i++)
	{
	 sum2=sum2+i; //1,3,6,10,15	
	}
	{
	System.out.println("sum of elements in array :"+sum2);
	System.out.println("Missing number in a array is:"+(sum2-sum1));

	}}
      


}


