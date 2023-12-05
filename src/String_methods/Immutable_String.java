package String_methods;

public class Immutable_String {
	public static void main(String[] args) {
	 
		// String is immutable because we can change the value of a variable.
		
	String s=new String ("welcome");
	      s.concat(" to java");
		{
			System.out.println(s);//welcome   //So string is immutable bec in single object we can't store/join another string value.
		}
		
	String s1=new String ("welcome");
    String std=s1.concat(" to java");
		{
	System.out.println(std);//welcome to java  //So by using 3rd variable we can concat 
		}
		
		
		
		
	
		
	
		
		
		
		
		
		

	}

}
