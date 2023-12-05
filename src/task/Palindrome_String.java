package task;

public class Palindrome_String {

	public static void main(String[] args) {
		// MADAM
		
		String s="MADAM"; 
		String rev=""; // Initializing an empty string to store the reverse
		String temp;//Temporary variable
		
		temp=s;//i.e.,temp=MADAM
		
		int len=s.length(); //length of string value
		System.out.println("Length of String value:"+len);//5
		
	 for(int i=4;i>=0;i--)//String value starts with 0//for(int i=len-1;i>=0;i--) //for(int i=s.length()-1;i>=0;i--)
	{
	 rev=rev+s.charAt(i);// extract characters-charAT will return single value based on index
	}
	 if(temp.equals(rev)) //.equals check the String name of variable,==checks reference/variable of a value
	 {
		 System.out.println(temp);
		 System.out.println(rev);
		 System.out.println("Palindrome");
	 }
	 else //if(temp!=rev)
	 {
		 System.out.println(temp);
		 System.out.println(rev);
		 System.out.println(" Not a Palindrome"); 
	 }
	
		 

	}

}
