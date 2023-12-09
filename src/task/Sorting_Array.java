package task;


import java.util.Arrays;

public class Sorting_Array {

	public static void main(String[] args) {
		//Sorting elements of elements
		
		int a[]={50,10,40,10,100};
		
		
		
	System.out.println("Before sorting:"+Arrays.toString(a));//Display all elements
	
	//Arrays.parallelSort(a);  //By using parallel sort method
	  Arrays.sort(a);          //By using sort method
	
	System.out.println("After sorting:"+Arrays.toString(a));
		

	}

}
