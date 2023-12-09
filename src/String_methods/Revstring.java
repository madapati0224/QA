package String_methods;

//---------------------using string---------------------------------------------------
public class Revstring {

	public static void main(String[] args) {
		String s="dog";
		String rev="";
				
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
}
		
		{
		System.out.println(rev);
		
		}	
		
	
	}}
//------------------------------_usingstringbuffer--------------------------------

		/* String s="apple";
		 StringBuffer s1=new StringBuffer(s);
	 	 StringBuffer s2=s1.reverse();
	 	 System.out.println(s2);

	*/
