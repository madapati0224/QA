package array;

import java.util.Arrays;

public class Practise {

	public static void main(String[] args) {
		
		//Declaration of array
		//size of array
		//get particular value from array
		//get all values from array
		
//Declaration
		
	//int a[] =new int[3]; //Array syntax
	
//Insert the values into array
		
//Approach1:
	        /*a[0]=100;
		      a[1]=200;
		      a[2]=300;*/
		
//Approach2:
		  // int a[]= {100,200,300,400};
		
 //Size/length of array		
		//System.out.println(a.length);
		
//Read single value of array
		//System.out.println(a[2]);
		
//Read 2 values  of array
		//System.out.println(a[2]+" "+a[0]);
		
//Read multiple values of array
	  //System.out.println(Arrays.toString(a)); //Import java.util
		
//Read multiple values of array using For loop
	/*	for( int i=0;i<3;i++)
		
		{
			System.out.println(a[i]);
		}*/
		
//Read multiple values of arrays using for each loop or  enhanced loop
		
	/*	for(int x:a)
		{
			System.out.println(x);
		}*/
	
//To store multiple data type values by using Object class
		
/*Object a[]=new Object[5];

	    a[0]=10;
		a[1]=10.5;
		a[2]="Girija";
		a[3]='a';
		a[4]=true;*/
		
Object a[]= {20,20.5,"xxxx",'d'}; 
		
//Single value in array
	  System.out.println(a[3]);
	  
//multiple values in a array		
     // System.out.println(Arrays.toString(a));
      
 //Read multiple values of array using For loop
/*	for(int i=0;i<a.length;i++)	
	{
	System.out.println(a[i]);	
	}*/
	
//Read multiple values of array using For Each loop(enhanced loop)
	for(Object x:a)
	
		System.out.println(x);
	
	
	

		
		

		
	    
		
		

	}

}
