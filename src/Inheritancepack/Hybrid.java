package Inheritancepack;


//Hybrid inheritance is a combination of more than two types of inheritances single and multiple.
/*Combination of 1 parent class and multiple interfaces with single child
 * We can extend only 1 class from sub child and can implement multiple interfaces from sub child
 */

//multiple interfaces

interface Parent1 { 
	int a=10;
	void m1();
}

interface Parent2 {
	int b=20;
	void m2();
}

// single class
class MNO{
	int c=30;
	void m3()
	{
		System.out.println(c);
		System.out.println("m3() from MNO class ");
	}
}



public class Hybrid extends MNO implements Parent1,Parent2 {
	
	
	@Override
	public void m2() {
		System.out.println("m2() from parent1");
		
	}

	@Override
	public void m1() {
		System.out.println("m1() from parent1");
	}
	
//main method
public static void main(String[] args) {
	Hybrid hy =new Hybrid();
	hy.m1();
	hy.m2();
	hy.m3();
	System.out.println(hy.a);
	System.out.println(hy.b);
	
		

	}


}


	


