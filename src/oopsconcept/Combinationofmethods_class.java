package oopsconcept;

public class Combinationofmethods_class {
	//Multiple combination of methods used in class
/*1)No parameters-No Return
  2)No parameters-return value
  3)Take parameters-No Return
  4)Take parameters-return value*/
	
//1)No parameters-No Return
	void greeting1()            // void will not return any value just it will execute the statement.
	{
		System.out.println("Hello...."); //Hello....
	}
	
//2)No parameters-return value
	String greeting2()
	{
	return ("Hello....world");   
	}
	
//3)Take parameters-No Return
	void greeting3(String name)
	{
		System.out.println("Hi....."+name); //Hi.....Girija
	}
	
//4)Take parameters-return value
	String greeting4(String name)
	{
		return("Welcome"+name);
	}



//main method
	
public static void main(String args[]) {
	Combinationofmethods_class cc=new Combinationofmethods_class();//object creation
cc.greeting1();
	
	/*String s=cc.greeting2();
			{
	System.out.println(s);//Hello....world
			}*/
	 //or
	System.out.println(cc.greeting2());//Hello....world
	
cc.greeting3("Girija");

    String s= cc.greeting4(" Girija");
    {
    	System.out.println(s);  //Welcome Girija
    }
   //or
    System.out.println(cc.greeting4(" Girija"));//Welcome Girija
	
	
}}
