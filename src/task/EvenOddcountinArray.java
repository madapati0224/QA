package task;

public class EvenOddcountinArray {

	public static void main(String[] args) {
		
		
			int a[]={1,2,3,4,5};
			
			int evencount=0;
			int oddcount=0;
			
			for(int i=0;i<5;i++) // index loop
			{
			if(a[i]%2==0)
			{
				
				evencount++;
				System.out.println("Enter even numbers:"+a[i]);
			}
			
			else
			{
						
				oddcount++;
				System.out.println("Enter odd number:"+a[i]);
			}
			}
			
			System.out.println("number of evencount"+evencount);
			System.out.println("number of oddcount "+oddcount);
			
	}}

				