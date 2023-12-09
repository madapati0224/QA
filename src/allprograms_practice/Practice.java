package allprograms_practice;

public class Practice {

	public static void main(String[] args) {
		
	/*	int a=10;
		int b=20;

		//with 3 rd variable

		int c=0;
		c=a;//c=10
		a=b;//a=20
		b=c;//b=10

		System.out.println(a+" "+b);*/
		
//without 3rd variable		
	/*	int a=10;
		int b=20;
//Add and sub
		a=a+b;//a=30

		b=a-b;//b=10;
		a=a-b;//a=20;
//mul and div		
		a=a*b;//a=200

		b=a/b;//b=10;
		a=a/b;//a=20;

		System.out.println("Value of a:"+a);
		System.out.println("Value of b:"+b);*/
		
		
//find given number even or odd
		//int n=200;
	/*	int n=123;

		if(n%2==0)
		{
		System.out.println("Even number");
		}
	else
	{
	System.out.println("odd number");
	}*/
		
//Eligible for vote or not
	//	int age=10;
	/*	int age=19;

		if(age>=18)
		{
		System.out.println("Eligible for vote");
		}
		else
		{
		System.out.println(" Not eligible for vote");
		}*/

////Largest of 3 numbers
	/*	int a=10;
		int b=10;
		int c=10;

		if(a>b && a>c)
		{
		System.out.println("a is largest number:"+a);
		}
		else if(b>a && b>c){
		System.out.println("b is largest number:"+b);
		}
		else if(c>a && c>b){
		System.out.println("c is largest number:"+c);
		}
		else
		{
		System.out.println("All are equal");
		}*/

//print weeks using Nested if else
	/*	int day=8;

		if(day>0 && day<=7){
		  if(day==1){
		System.out.println("Monday");
		}
		  else if(day==2){
		System.out.println("Tuesday");
		}
		  else if(day==3){
		System.out.println("Wednesday");
		}
		  else if(day==4){
		System.out.println("Thursday");
		}
		  else if(day==5){
		System.out.println("Friday");
		}
		  else if(day==6){
		System.out.println("Saturday");
		}
		  else if(day==7){
		System.out.println("Sunday");
		}
		}
		else
		{
		System.out.println("invalid day");
		}*/
		
//check vowel or not using switch case
		
	/*	char alp='h';

		switch(alp)
		{
		case 'a' : System.out.println("is vowel");break;
		case 'e' : System.out.println("is vowel");break;
		case 'i' : System.out.println("is vowel");break;
		case 'o' : System.out.println("is vowel");break;
		case 'u' : System.out.println("is vowel");break;
		default : System.out.println("is consonent");
		} */
		
//Print 1 to 10 number
		//Using while
		
	/*	int  n=1; //inilisation
		while (n<=10) //condition
		{
			System.out.println(n);
			n++ ; //inc
		}*/

//using do while
	/*	int  n=1; //inilisation	
		do {
			System.out.println(n);
			n++ ; //inc	
		}
		while (n<=10); //condition*/
	
		
//usinf for loop
		/*for(int i=1;i<=10;i++)
		System.out.println(i);*/
		
//Display even numbers and count
		
/*int count=0;
		for(int n=1;n<=10;n++)
		{
		if(n%2==0)
		{
	System.out.println(n);
		count++;
		}
		}
		System.out.println("Total even count:"+count);*/
		
		
//Display odd numbers and odd
		
   /*   int count=0;
			for(int n=1;n<=10;n++)
				{
				if(n%2!=0)
				{
				System.out.println(n);
				count++;
                }
				}
			System.out.println("Total odd count:"+count); */
		
//Sum of even and odd count
		int even_count=0;
		int odd_count=0;
		for(int n=1;n<=10;n++)
		{
		if(n%2==0)
		{
		System.out.println(n);
		even_count=even_count+n;

		}
		else
		{
		System.out.println(n);
		odd_count=odd_count+n;
		
		}
		}
		System.out.println();
		System.out.println(even_count);//30
		System.out.println(odd_count);//25
		
	
		

				

//print til 5 from 1 to 10 numbrs

	/*	for(int i=1;i<=10;i++)
		{
		if(i==6)
		break;
		System.out.println(i);	
		}*/
		
//Skip 5 from 1 to 10 numbrs

	/*for(int i=1;i<=10;i++)
	{
	if(i==5)
	continue;
	System.out.println(i);	
		}*/
		
//Reverse of a number
	/*	int n=123;
		int rev=0;

		while( n!=0)
		{
		int rem=n%10;
		rev=rev*10+rem;
		n=n/10;
		}
		System.out.println(rev); //321*/
		
//Palindrome eg:121 o/p:121

/*int n=121;
int rev=0;
int temp=0;
temp=n;//temp=121

while(n!=0)
{
int rem=n%10;
rev=rev*10+rem;
n=n/10;
}
if(temp==rev)
{
System.out.println("is palindrome");
}
else
{
System.out.println("not palindrome");
}*/
		
//Count of given digits/numbers eg:1234-->count=4

	/*	int n=12345;
		int count=0;
		while(n!=0)
		{
		int rem=n%10;
		n=n/10;
		count++;
		}
		System.out.println(count);//5*/
		
//count even and odd numbers in given number eg:12345-->even2,odd-3

	/*	int n=12345;
		int even_count=0;
		int odd_count=0;

		while(n!=0)
		{
		int rem=n%10;
		if(n%2==0)
		{
		even_count++;
		}
		else
		{
		odd_count++;
		}
		n=n/10;
		}
		{
		System.out.println(even_count++);
		System.out.println(odd_count++);
		}*/
		
//Sum of Digits in a given number eg:1234=1+2+3+4=10,o/p-10
		
	/*	int n=1234;
		int sum=0;

		while(n!=0)
		{
		int rem=n%10;
		sum=sum+rem;
		n=n/10;
		}
		System.out.println(sum); */
		
//Amstrong number eg:153 -Given digits are 3 ,3 is power of every given number and after adding returns same number

	/*	int n=153;
		int ams=0;
		int temp=0;
		temp=n;//temp=153

		while(n!=0)
		{
		int rem=n%10;
		ams=ams+rem*rem*rem;
		n=n/10;
		}
		
		if(temp==ams)
		{
		System.out.println("amstrong");
		}
		else
		{
		System.out.println("Not amstrong");
		}*/
//Using for lopp		
	/*	int ams=0;
		int temp=0;
		int n=153;
		temp=n;//temp=153
		
		for(;n!=0;n=n/10)
		{
			int rem=n%10;
			ams=ams+rem*rem*rem;
			
			}
			
			if(temp==ams)
			{
			System.out.println("amstrong");
			}
			else
			{
			System.out.println("Not amstrong");
			}*/
		
		
//Print 1 to 1000 amstrong numbers

/*for(int i=1;i<=1000;i++) //to print 1 to 1000
{
	int ams=0;
	int tempn=0;
    tempn=i;//tempn=1,2,3,....
	
	for(;tempn!=0;tempn=tempn/10)
   {
	int rem=tempn%10;
	ams=ams+rem*rem*rem;
   }
	if(i==ams)
		{
		System.out.println(i);
		}
}*/

//Count of amstrong
		
/*Scanner sc=new Scanner(System.in);
System.out.println("Enter number:");
int num=sc.nextInt();*/
		
/*int count=0;						
	for (int n = 1; n <= 1000; n++)
	{
	int ams=0;					
	int tnum=0;
	tnum = n;
	
	for(;tnum > 0;tnum = tnum / 10)
	{
	int rem = tnum % 10;
	ams= ams + (rem*rem*rem);
						
	}
	if (n == ams) {
	count++;
	}
	}
	System.out.println(count);*/

//Factorial number eg: 5!=5*4*3*2*1
	/*	 int num=5;
		 int factno=1;
		for(int i=1;i<=num;i++)
		{
		factno=factno*i;
		}
		System.out.println(factno);//120*/
		
//Fibonacci series 0 1+1--> 2+3--> 5+8--> 13+21--> 34
		
	/*	int n1=0;
		int n2=1;
		int sum =0;

		System.out.println(n1+" "+n2);
		
		for(int i=2;i<=10;i++)
		{
		sum=n1+n2;
		System.out.println(" "+sum);
		
//Interchange n1 and n2
		n1=n2;//n2=1
		n2=sum;
		}*/
		
//Multiple of given number

	/*	int num=5;
		int result=0;

		for(int i=1;i<=12;i++)
		{
		 result=num*i;
		//System.out.println(result); 
		 System.out.println(num+ "*"+i+" ="+result);//num*i=result		
		 }*/
	
//Prime number or not
		
	/*	int num=10;
		int count=0;//to check number of factors to the number

		if(num>1) //1st condition
		{
		for(int i=1;i<num;i++)
		 {
		if(num%i==0);
		count++;
		}
		if(count==2)
		{
		System.out.println("is prime number");
		}
		else
		{
		System.out.println("Not a prime number");
		}
		}
		else
		System.out.println("not a prime number");*/
		
//Reverse of Triangle
		
	/*	int rows=5;

		for(int i=1;i<=rows;i++)//For loop for rows
		{
		for(int j=rows;j>=i;j--) //For loop for *
		{
		System.out.print("*");
		}
		{
		System.out.println();
		}
		
		}*/
		
			
		
		 
		




			



	}
	
}
	






		
		

		

		

		
	

		






						























				


		

		

	