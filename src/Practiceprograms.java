import java.util.Arrays;
import java.util.Scanner;

public class Practiceprograms {

	public static void main(String[] args) {

//Swapping of numbers
		
	/*	int a=10;
		int b=20;
		
		a=a+b;//a=30
		b=a-b;//b=10;
		a=a-b;//a=20;
		
		System.out.println("value of a:"+a + "value of b:"+b);*/

/*print 1 to 10 nunbers
		
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
		
//print 10 to 1 nunbers
		
		for(int i=10;i>0;i--)
		{
			System.out.println(i);
		}*/
		
//Print Even and odd numbers
		
		 
	/*	for(int i=1;i<=10;i++)
		{
			if(i%2==0)
				System.out.println(i);
			else 
		System.out.println(i);
		
		}*/
	
//Print even and odd count
	/*	int e_count=0;
		int o_count=0;
		
		for(int i=1;i<=9;i++)
		{
			if(i%2==0)
			e_count++;
			else 
				o_count++;
			}
		{
			System.out.println(e_count);
			System.out.println(o_count);
		}*/

//Given number is even or odd
		
	/*	int i=2;
		
			if(i%2==0)
			{
				System.out.println("Even number");
			}
			else
			{
				System.out.println("odd number");
			}*/
		
/*Break at 4
		
		for (int i=1;i<=10;i++)
		{
			if(i==5)
				break;
			System.out.println(i);
		}
		
//Skip number 5
		for(int n=1;n<=10;n++)
		{
			if(n==5)
				continue;
			System.out.println(n);
			
		}*/
		
//Print vowels
		
	/*	 char alp='a';
		 
		 switch(alp)
		 {
		 case 'a' :System.out.println("vowel");
		 break;
		 case 'e':System.out.println("vowel");
		 break;
		 case 'i':System.out.println("vowel");
		 break;
		 case 'o':System.out.println("vowel");
		 break;
		 case 'u':System.out.println("vowel");
		 break;
		  default :System.out.println("Consonent");
		 }*/
		
//Reverse of number
	/*	int n=126;
		int rev=0;
		
		while(n!=0)
		{
			int rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
			System.out.println(rev);
		*/
		
//palindrome
		
	/*	int n=123;
		int rev=0;
		int temp;
		temp=n;//temp=121
		
		while(n>0)
		{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		if(temp==rev)
		{
			System.out.println("palindrome");
		}else
			System.out.println("not palindrome");
		*/
		
//count of given number
	/*	int n=12347;
		int count=0;
		
		while(n>0)
		{
			n=n/10;
			count++;
		}
			System.out.println(count);*/
		
//Even and odd count
	/*	 int n=12345;
		 
		int e_count=0;
		int o_count=0;
		
		while(n>0)
		{
			int rem=n%10;
			if(rem%2==0)
			{
				e_count++;
			}
			else
			{
				o_count++;
			}
			n=n/10;
		}
			{
				System.out.println(e_count);
				System.out.println(o_count);
			}*/
		
	//Sum of numbers
		
	/*	int n=12345;
		int sum=0;
		
		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);*/
		
//Amstrong
		
	/*	int n=154;
		
		int amst=0;
		int temp=0;
		
		temp=n;//temp=153
		
		while(n>0)
		{
			int rem=n%10;
			amst=amst+rem*rem*rem;
			n=n/10;
		}
		if(temp==amst)
		{
			System.out.println("amst");
		}else
			System.out.println("not amst");*/
		
//Amstrong 1 to 1000
		
	/*	for(int i=0;i<=1000;i++)
		{
			int amst=0;
			int num=0;
			num=i;
			
			for(;num!=0;num=num/10)
			{
			int rem=num%10;
			amst=amst+rem*rem*rem;
			}
			if(i==amst)
			{
				System.out.println(i);
			}
		
			}*/
		
//sum of elements in array
	/*	int a[]= {1,2,3,4,5};
		int sum=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);*/
		
//Even and odd array
	/*	int a[]= {1,2,3,5,6};
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
			
		}*/
		
//Reverse the array
		/*int a[]= {1,2,3,4,5};
		
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.print(a[i]);
			
		}*/
		
//Sort of Array -ordea
		
		/*	int a[]= {1,5,3,6,3,7};
		
		//Arrays.sort(a);
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));*/
		
//search n elemnt in array
		
	/*int a[]= {1,2,3,4};
		int search_ele=3;
		boolean found_ele=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("Element found at index:"+i);
			found_ele=true;
		    break;
		}
		}	
	if(found_ele==false)
	
			System.out.println("Element not found");*/
		
//Reverse of String
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter String:");
		String s=sc.next();
		
		//String s="welcome";
		String rev="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
			System.out.println(rev);*/
			
//Convert string to array and rev
		
		
		/*	String s="welcome";
				String rev="0";
				
				char a[]=s.toCharArray();
				
				for(int i=6;i>0;i--)
				{
					rev=rev+a[i];
				}
				System.out.println(rev);*/
		
//String palindrome
	/*	Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String s=sc.next();
		
	//	String s="madam";
		String rev="";
		String temp=s;//temp=s
		
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		if(temp.equals(rev))
		{
			System.out.println("palindrome");
		}
		
		else
		{
			System.out.println(temp);
			System.out.println(rev);
			System.out.println("not a palindrome");
		}*/
		
//Swapping of 2 Strings
		
	/*	String s1="Girija";
		String s2="Devi";
		
		String s=s1+s2;//s=GirijaDevi
		s2=s.substring(0, 6);
		s1=s.substring(6);
		
		System.out.println(s1+" "+s2);*/
		
//Factorial number
		
	/*	int n=6;
		long factorial=1;
		
		for(int i=1;i<=n;i++)
		{
			factorial=factorial*i	;
		}
		System.out.println(factorial);*/
		
//Multiplication
		
	/*	int n=6;
		
		for(int i=1;i<=12;i++)
		{
			int res=n*i;
		
		System.out.println(res);
		}*/
		

			
		
		
		
		
		
		
		
		
	
	

}}
