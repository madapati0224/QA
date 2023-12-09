package task;

public class Swapping2_Strings {

	public static void main(String[] args) {
// Swapping of 2 string values using 3rd variable
	
		String s1="Girija";
        String s2="Medapati";
        String s3;
     System.out.println("Before swapping values of s1 and s2:"+s1+" "+s2);	
	/*	s3=s1;
		s1=s2.substring(0,8);
		s2=s3.substring(0,6);
		
System.out.println("After swapping values of s1 and s2:"+s1+" "+s2);*/
	
//Swapping of 2 string without using 3rd variable
     
    //              0 1 2 3 4 5 6 7 8 9 10 11 12 13 -starting index
     s1=s1+s2; //s1=G i r i j a M e d a p  a  t   i
    //              1 2 3 4 5 6 7 8 9 10 11 12 13 14
     
     s2=s1.substring(0, 6);//s2=Girija  //we extract the name by using substring
     s1=s1.substring(6);//s1=Medapati
    
     
   System.out.println("After swapping values of s1 and s2:"+s1+" "+s2);
	
	



 
 
                                 



	}

}
