package String_methods;

public class String_Methods {

	public static void main(String[] args) {
	 
		//String s ="Welcome";
		// String s=new String("welcome"); //Welcome
	//System.out.println("welcome"); //Welcome
	
//Length():		
	//System.out.println(s.length()); //7
	//System.out.println("Welcome".length());//7
	
//concat():
//using 2 varibles
	   // String a="welcome";
	   // String b=" to java";
   //System.out.println(a+b);//welcome to java
  // System.out.println(a.concat(b));//welcome to java
  // System.out.println("welcome".concat(" to java"));//Welcome to java
	
//using 3 variables	
	   // String a="welcome";
	   // String b=" to java";
	  //  String c=" world";
//	System.out.println(a+b+c);  //welcome to java world
//	System.out.println(a.concat(b).concat(c)); //welcome to java world
  //  System.out.println("Welcome".concat(" to java").concat(" world"));//Welcome to java world

//trim(): Decrease the spaces
  // String course= " Automation ";
    // System.out.println(course);// Automation //
   //  System.out.println(course.length());//12
    
  //   System.out.println(course.trim());//Automation
  //   System.out.println(course.trim().length());//10

//charAt(): It will dispaly based on index
 /*  a="Welcome";
   System.out.println(a.charAt(4));//o
   System.out.println(a.charAt(0));//w
   System.out.println(a.charAt(2));//l*/
   
//contains(); Returns boolean values
  /* a="Beautiful";
   System.out.println(a.contains("ful"));//true
   System.out.println(a.contains("Ful"));//false-case sensitive
   System.out.println(a.contains("full"));//false
   System.out.println(a.contains("ate"));//false -Not in sequence*/
   
//equals() equalsIgnoreCase():
   
/*  String s1="welcome";
  String s2="welcome";
  System.out.println(s1.equals(s2));//true 
  System.out.println(s1.equals("Welcome")); //false s1 has lower case w,s2 has upper case W
  
  System.out.println(s1.equalsIgnoreCase(s2));//True EqualsIgnoreCase will ignore the case sensitive
  System.out.println(s1.equalsIgnoreCase("welcom"));//false	
  System.out.println(s1.equalsIgnoreCase("Welcome"));	//true

//Replace():
  s1="welcome";
  System.out.println(s1.replace('e','a'));//walcoma -'a' is replaced in place of' e'
  System.out.println(s1.replace('l','t'));//wetcome -'l' is replaced with 't'
	
  s1="1234";
  System.out.println(s1.replace('3', '1'));//1214
  System.out.println(s1.replace('4','2'));//1232*/
   
 /* Substring()
          // 0123456 -Starting
   String s="Welcome";
         //  1234567 -ending
   System.out.println(s.substring(0));//welcome
   System.out.println(s.substring(2));//lcome
   
   System.out.println(s.substring(0, 7));//Welcome
   System.out.println(s.substring(3, 7));//come
   
}
	
	

	}

//Split()
		  // 0         1     //Index values
/* String s="Learning @java";
 {
	 String a[]=s.split("@"); //@ or,dalimeter(Symbols used to divide any string is called delimeter)
 
	 System.out.println(a[0]);
	 System.out.println(a[1]);
 }*/
		
//toUpperCase() ,toLowerCase()
	/*	String s="wElCome";
		System.out.println(s.toUpperCase());//WELCOME
		System.out.println(s.toLowerCase());//welcome*/
 
	

//String comparsion:with == ,.equals
		
//case1:		
String s1="country";      //will be created in string constant pool(scp)
String s2="country";       //will be created in string constant pool(scp)
System.out.println(s1==s2);//true          //==checks the object reference
System.out.println(s1.equals(s2));// true  //.equals checks the value to the variable

//cas2:
String s3="India";
System.out.println(s1==s3);//false
System.out.println(s1.equals(s3));//false

//case3:
String s4="welcome";               // will be created in string constant pool(scp)
String s5=new String("welcome");   //obj will be created in heap memory
System.out.println(s4==s5);//false
System.out.println(s4.equals(s5));//true

//case4:
String s6="welcome";               
String s7=new String("welcome"); 
String s8=s7;
  System.out.println(s6);//welcome
  System.out.println(s7);//welcome
  System.out.println(s8);//welcome
System.out.println(s6==s7);//false
System.out.println(s6.equals(s7));//true
System.out.println(s6.equals(s8));//true
System.out.println(s7==s8);//true

//case5:
String s=new String("welcome");
String st=new String("welcome");
System.out.println(s==st);//false
System.out.println(s.equals(st));//true





	}
	

	    }

		
		





