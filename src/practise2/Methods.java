package practise2;

public class Methods {
	
	//no parameters-no return
	//no parameters-return
	//take parameter-no return
	//take parameters-returns value
	
//no parameters-no return
	
	void greeting1()
	{
		System.out.println("Hello..");
	}
//no parameters-return
	
	String greeting2()
	{
	 return("how are you...");
	}

	//take parameter-no return
	void greeting3(String name)
	{
		System.out.println("Hi.."+name);
	}
	
////take parameters-returns value
	int greeting4(int x)
	{
		return(x);
	}
	
	


//main method
public static void main (String args[]) {
	Methods me=new Methods();
	me.greeting1();
	
System.out.println(me.greeting2());

me.greeting3("yyyy");

System.out.println(me.greeting4(12));
	
	
	
}}
