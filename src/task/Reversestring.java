package task;

public class Reversestring {

	public static void main(String[] args) {
		// Reverse a string
	/*	String s="abc";
		String rev="0";
		
		System.out.println(s.length());//3
		for(int i=2;i>=0;i--)
			rev=rev+s.charAt(i);
		System.out.println(rev);//cba*/
		
		//Reverse string using arrays		
				String s="abc";
				String rev=" ";
				
				char c[]=s.toCharArray();
					for(int i=2;i>=0;i--) {
						rev=rev+c[i];
					}
					System.out.println(rev);
				}
	
	
	

}
