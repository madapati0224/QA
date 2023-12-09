package task;

public class Searchelementinarray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		
		int search_element=3;
		boolean found_element=false;
		
		for(int i=0;i<a.length;i++)
		{
			if(search_element==a[i])
			{
				System.out.println("Element found at:"+i);
				found_element=true;
				break;
			}}
			if(found_element==false)
			{
				System.out.println("element not found");
			}
			

	}}

		

