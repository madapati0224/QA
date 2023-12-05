package controlstatements_jumping;

public class Continue {

	public static void main(String[] args) {
// skip no5 from 1 to 10 and print rest of numbers
		
	/*	for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
		continue;
		
		}
		{
			System.out.println(i); //1 2 3 4 6 7 8 9 10*/
		
//Skip no 6 8 10
	
	for(int i =1;i<=10;i++)
	{
		if(i==6||i==8||i==10)
		{
			continue;
		}
		{
			System.out.println(i); //1 2 3 4 5 7 8 9
		}
		}
	}
	

}
