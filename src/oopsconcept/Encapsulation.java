package oopsconcept;

//Encapsulation means binding of variables and method into single unit.
//All varibles should be private ,when we want to apply encapsulation.
//We can access variables only through methods(SETTERS&GETTERS)

public class Encapsulation {
	private int acc_no;  //variables
	private String name;
	private double amount;
	
//Getters and setters  source-generate setter and getter
	
	public int getAcc_no() {
		return acc_no;
	}
	public void setAcc_no(int acc_no) {
		this.acc_no = acc_no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	
//method
	
void display()
	{
		System.out.println(acc_no);
		System.out.println(name);
		System.out.println(amount);
	}
	
//main method

	public static void main (String args[]) {
	Encapsulation ens=new Encapsulation();
	
//setted the variables with object reference
	ens.setAcc_no(12345689);
	ens.setName("Savings account");
	ens.setAmount(20000);
	
//Get the values with object referance
	ens.getAcc_no();
	ens.getName();
	ens.getAmount();
	ens.display();
	
	   //  or
	//System.out.println(ens.getAcc_no());
	//System.out.println(ens.getName());
	//System.out.println(ens.getAmount());
	
	}}


		
	
	
	
	


