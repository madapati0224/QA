package task;

import java.util.Scanner;

public class countofeachcharater {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String s=sc.next();
		int length =s.length();
		for(int i=0;i<length;i++);
		System.out.println(s.charAt(3));
	}

}
