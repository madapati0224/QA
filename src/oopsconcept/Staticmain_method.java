package oopsconcept;

public class Staticmain_method {
	
		public static void main (String args[]) {
			
			System.out.println(Static_keyword.a); //a static variable
			Static_keyword.m1(); // m1 static method
		
			Static_keyword sk=new Static_keyword();
			System.out.println(sk.b); // b is non static variable
			sk.m2(); //m2 non-static method
			
			sk.m3(); //m3 non static
			
		}

	}



