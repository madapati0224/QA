package Operators;

public class Logical {

	public static void main(String[] args) {
		
		// logical operators will work on 2 or more boolean values and will return the boolean value
		//&& (AND) :If both the variable values are true then o/p is true ,
		//||(OR):either of the value is true then o/p is true ,
		//!(NOT) :It provides revise value as a result
		
		//boolean x= true; 
		//boolean y= false; 
		      //or
		boolean x=(10>20); //false
		boolean y =(10<20); //true
				
		System.out.println(x&&y);//false 
		System.out.println(x||y);//true
		System.out.println(!x);//true
		System.out.println(!y);//false
		
		

	}

}
