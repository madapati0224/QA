package practise2;

public class controlstatements {

	public static void main(String[] args) {
		// using conditional statements
		
//even or odd if_else
	/*	int a=20;
		//int even=0;
		//int odd=0;
		if(a%2==0)
		{
	System.out.println("a is even ");
		}
		else {
	System.out.println("a is odd");
		}*/
		
//Eligible for vote
		
/*	int age=31;
	if(age>=18)
	{
		System.out.println("eligible for vote");
		
	}
	else
	{
		System.out.println("not eligible");
	}*/
		
//if else ladder
	//largest of 3 numbers
/*int a=100;
int b=100;
int c=100;

if(a>b&&a>c)
{
	System.out.println("a is greater");//false
}
else
	if(b>a&&b>c)
	{
		System.out.println("b is greater");//false
	}
	else
		if(c>a&&c>b)
	{
		System.out.println("c is greater");//true
	}
		else
		{
			System.out.println("all are same");
		}*/
		
//Nested 
		/*int weekno=8;
		
		if(weekno>=1&&weekno<=7)
		{
			if(weekno==1) {
				System.out.println("sunday");
			}
			else if(weekno==2) {
				System.out.println("monday");
			}
			else if(weekno==3) {
				System.out.println("tuesday");
			}
			else if(weekno==4) {
				System.out.println("wednesday");
			}
			else if(weekno==5) {
				System.out.println("thursday");
			}
			else if(weekno==6) {
				System.out.println("friday");
			}
			else if(weekno==7) {
				System.out.println("Saturday");
			}}
			else
			{
				System.out.println("invalid weekno");
			}*/
		
//
	/*	int month=12;
		if(month>1 &&month<=12) {
			if(month==1) {
				System.out.println("jan");
			}
			else if(month==2) {
				System.out.println("feb");
			}
			else if(month==3) {
				System.out.println("mar");
			}
			else if(month==4) {
				System.out.println("apr");
			}
			else if(month==5) {
				System.out.println("may");
			}
			else if(month==6) {
				System.out.println("june");
			}
			else if(month==7) {
				System.out.println("july");
			}
			else if(month==8) {
				System.out.println("Aug");
				
			}
			else if(month==9) {
				System.out.println("sep");
			}
			else if(month==10) {
				System.out.println("oct");
			}
			else if(month==11) {
				System.out.println("nov");
			}
			else  {
				System.out.println("dec");
				
			}}
	else
	    {
		System.out.println("not valid month");
	}*/
		
//switch case
	/*	int weekno=8;
		switch(weekno) {
		case 1:System.out.println("monday");
		break;
		case 2:System.out.println("tuesday");
		break;
		case 3:System.out.println("wednesday");
		break;
		case 4:System.out.println("thursday");
		break;
		case 5:System.out.println("friday");
		break;
		case 6:System.out.println("saturday");
		break;
		case 7:System.out.println("sunday");
		break;
		default:System.out.println("weekno invalid");
		
			
		}*/
//Looping/Iterative statements
	//	It is a collection or block of statements which can be repeated multiple times.
			
	/*	int i=10;      //starting/initilisation
		while(i>0)  //condition
		{
			//System.out.println(i);//1 2 3 4 5 6 7 8 9 10  statement;
			
			//i++;//inc/dec
			System.out.println(i);//10 9 8 7 6 5 4 3 2 1
			i--;*/
// Even and odd number		
		
/*	int i=1;
	while(i<=10)
	{
		if(i%2==0)
		System.out.println(i); //2 4 6 8 10
		i++;
		
	int i=1;
	while(i<=10)
	{
		if(i%2!=0)
		System.out.println(i); //1 3 5 7 9
		i++;*/
		
//print 1....`10
	/*	int i=1;
		do {
			System.out.println(i);//1 2 3 4 5 6 7 8 9 10
		i++;
		}
		while(i<=10);*/
		
		int i=10;
		do {
			System.out.println(i);//10 9 8 7 6 5 4 3 2 1
			i--;
		}
		while(i>0);
		
		
			   
		

		

		
	
		}
}