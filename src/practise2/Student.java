package practise2;

public class Student {
	
	//variable declaration
	int stid;
	String name;
	char grade;
	
//method
	void display()
	{
		System.out.println(stid);
		System.out.println(name);
		System.out.println(grade);
	}
	
//main method
	public static void main(String args[]) {
		Student std=new Student();//object creation
		std.stid=12;
		std.name="xxxx";
		std.grade='A';
		
   std.display();
		
		
	
	

	}}
