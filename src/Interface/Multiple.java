package Interface;

//Multiple inheritance has 2 parent single child and is achieved by Interface concept

		interface P1{ //parent1
			int x=100; //final&static variable by default
			void m1(); //Abstract method
		}	
		interface P2{ //parent2
			int y=200;
			void m2();
		}
			
		//Main class	
		public class Multiple implements P1,P2  {//MultipleInheritance_Interface -1 child

			@Override
			public void m1() {
				//System.out.println("m1() is in  P1 class ");
				System.out.println(x); 
				
			}

			@Override
			public void m2() {
				//System.out.println("m2() is in  P2 class "); 
				System.out.println(y); 
				
			}
			public static void main(String args[]) {
				Multiple mi=new Multiple();
				mi.m1();//m1() is in  P1 class 
				mi.m2();//m2() is in  P2 class
				//System.out.println(mi.x);//100
				//System.out.println(mi.y);//200
			}
		}
			
			
			







