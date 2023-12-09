package task;

public class Sumofdigitsin_number {
//eg:1234=1+2+3+4=10
	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		
		while(num>0)
			
		{
		 sum=sum+num%10;
		num=num/10;
		}
		System.out.println("Sum of digits of a number:"+sum);

	}

}
