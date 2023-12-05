package accessmodifiers_private_specifier;
//Private-can access within the class.

public class Private1 {
	private int x=10;
	private void m3() {
		System.out.println("m3() belongs to Private");
	}
//maim method
	/*public static void main(String args[]) {
		Private1 p=new Private1();
		p.m3();
		System.out.println(p.x);
		
	}*/

}
