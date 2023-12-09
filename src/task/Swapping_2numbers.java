package task;

public class Swapping_2numbers {

	public static void main(String[] args) {
		
		int a=20;
		int b=30;
	
//method1:by using 3rd variable
		
		int c;
		c=a; //c=20
		a=b; //a=30
		b=c; //b=20
		
	//	System.out.println("value of a:"+a);//30
	//	System.out.println("value of b:"+b);//20
		
		System.out.println(a); //30
		System.out.println(b); //20

		
//method2:By using addition and subtraction	without using 3rd variable	
		
    /*  a=a+b;//50 a=50
        b=a-b;//20 50-30=20
	    a=a-b;//30 50-20=30
	    
	System.out.println("value of a is:"+a);//30
	System.out.println("value of b is:"+b);//20 */
		
//By using multiplication and division without using 3rd variable
		
	  /*a=a*b;
		b=a/b;
		a=a/b;
		System.out.println( "value of a is:"+a); //30
		System.out.println("value of b is:"+b); //20 */

	}

}
