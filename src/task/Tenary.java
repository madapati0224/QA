package task;

public class Tenary {

	public static void main(String[] args) {
		// largest of 2 numbers
		
	/*	int a =20;
		int b=30;
		   int result= (a>b)?20:30;
		   System.out.println(result); */
		
//Largest of 3 numbers using ternary operator
		
		int a=10;
		int b=20;
		int c=30;
		
		int result=((a<b)&&(a<c)?a:((b<a)&&(b<c))?b:c);
    {
	System.out.println("Smallest number is:"+result);

	}}

}
