package oopsconcept;

/*Interface is blue print of class
 * Interface supports the data abstraction
 * All variable in interface are final and static 
 * All methods in interface are public
 * Data Abstraction means hiding of implementation part and able to use functionlity by the use.
 * Abstraction consists of abstract methods.from java8 default methods and static methods are also supporting
 * Abstract means partially implemeted or un-implemented.
 * Unimplemented methods in Interface should be implemented by class i.e.,public classname implements Interface 
 */

interface Shape{
//By default variables in Interface are final and static
	int length=10;
	int width=20;
//method
	void circle();//un-implemented method
   
	default void square() //we have to use default keyword to implement body in interface
	{
	System.out.println("Square is default method..");	//implemented method
	}
	
	static void triangle() //we have to use static keyword to implement body in interface
	{
		System.out.println("Triangle is static method");
	}
	
	
}


public class Abstraction implements Shape {
	
@Override
	public void circle() {
	{

	System.out.println("circle is public method" );
}}
		public static void main (String args[]) {
	//we can create object for class
		/*	Interface_Abstraction ia=new Interface_Abstraction();
			ia.circle();//circle is public method
			ia.square();//Square is default method..
			
			Shape.triangle();//Triangle is static method so noneed to create obj can call directly with class name
			
			System.out.println(ia.length);//10
			System.out.println(ia.width);//20*/
	
//we can create variable to Interface name but we can't instantiate means parent class can hold child class variables and methods
			Shape sh= new Abstraction();
			sh.circle();
			sh.square();
			
			Shape.triangle();//Triangle is static method so noneed to call with variable reference.can call directly with class name
		}
		
	}



