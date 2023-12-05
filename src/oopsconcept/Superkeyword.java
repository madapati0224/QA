package oopsconcept;

class Animal { //parent/super/base class
	
	//Super keyword is related to overriding concept
	//It is used only in Inheritance
	
String s="white";
void eat()
{
	System.out.println("eating grass");
}

}

class Bear extends Animal{ //Bear is child/derived/sub class
	String s="Black"; //overriding
	
	void displaycolor()
	{
//      System.out.println(s);//black
		System.out.println(super.s);//white
		
	}
	
	void eat()
	{
	System.out.println("eating meat");//overriding
	//	super.eat();//eating grass ,calling immediate class method statement
	}}

public class Superkeyword { //main class
public static void main(String args[]) {
	Bear be=new Bear();
	be.eat();
	be.displaycolor();
	
}}


