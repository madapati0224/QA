package wrapper;
/*Wrapper classes in java provides a mechanism to convert primitive into Object
 and object to primitive*/

public class WrapperclassDemo {

	public static void main(String[] args) {
//Primitive datat types
		byte b=10;
		short s=20;
		int i=30;
		long l=40;
		float f=50.0f;
		double d=60.0D;
		char c='a';
		boolean boo=true;
//Converting primitive into objects is called Autoboxing
		
		Byte bytobj=b;
		Short sobj=20;
		Integer iobj=30;
		Long lobj=40l;
		Float fobj=50.0f;
		Double dobj=60.0D;
		Character cobj='a';
		Boolean booobj=true;
		
//Printing values of the Objects
		System.out.println("Byteobject:"+bytobj);
		System.out.println("Shortobject:"+sobj);
		System.out.println("Integerobject:"+iobj);
		System.out.println("Longobject:"+lobj);
		System.out.println("Floatobject:"+fobj);
		System.out.println("Doubleobject:"+cobj);
		System.out.println("Characterobject:"+cobj);
		System.out.println("Booleanobject:"+booobj);
		
//Converting  object into primitive
		Byte bytevalue= bytobj;
		Short shortvalue=sobj;
		Integer intvalue=iobj;
		Long longvalue=lobj;
		Float floatvalue=fobj;
		Double doublevalue=dobj;
		Character charvalue= cobj;
		Boolean booleanvalue= booobj;
		
//Printing values of the Primitive
		System.out.println("bytevalue:"+bytobj);
		System.out.println("shortvalue:"+sobj);
		System.out.println("intvalue:"+iobj);
		System.out.println("longvalue:"+lobj);
		System.out.println("floatvalue:"+fobj);
		System.out.println("doublevalue:"+cobj);
		System.out.println("charvalue:"+cobj);
		System.out.println("booleanvalue:"+booobj);
		
		
	}

}
