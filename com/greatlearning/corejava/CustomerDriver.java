package com.greatlearning.corejava;

class Customer {
	public String fullName = "Rajan Singh";
	public int age = 45;
	public float weight = 68.5f;
	public float bmi = 22f;
	
	//private String fullNamePrivateModifer = "Rajan Singh"; //data will not visible due to private modifier.
	//private int agePrivateModifer = 45;					//data will not visible due to private modifier.
	//private float weightPrivateModifer = 68.5f;			//data will not visible due to private modifier.
	//private float bmiPrivateModifer = 22f;				//data will not visible due to private modifier.
	
	protected String fullNameProtectedModifer = "Rajan Singh";
	protected int ageProtectedModifer = 45;
	protected float weightProtectedModifer = 68.5f;
	protected float bmiProtectedModifer = 22f;
	
}

public class CustomerDriver {
	public static void main(String[] args) {
		Customer customerInfo = new Customer();
		System.out.println("This coding based on public access modifier");
		System.out.println("Customer Full name:-" + " " + customerInfo.fullName);
		System.out.println("Customer age:-" + " " + customerInfo.age);
		System.out.println("Customer weight:-" + " " + customerInfo.weight);
		System.out.println("Customer bmi:-" + " " + customerInfo.bmi);
		System.out.println("Public access modifier coding test ended");
		System.out.println();
		
		//System.out.println("This coding based on private access modifier");						//data will not visible due to private modifier.
		//System.out.println("Customer Full name:-" + " " + customerInfo.fullNamePrivateModifer);	//data will not visible due to private modifier.
		//System.out.println("Customer age:-" + " " + customerInfo.agePrivateModifer);				//data will not visible due to private modifier.
		//System.out.println("Customer weight:-" + " " + customerInfo.weightPrivateModifer);		//data will not visible due to private modifier.
		//System.out.println("Customer bmi:-" + " " + customerInfo.bmi);							//data will not visible due to private modifier.
		//System.out.println("Private access modifier coding test ended");							//data will not visible due to private modifier.
		//System.out.println();
		
		System.out.println("This coding based on protected access modifier");
		System.out.println("Customer Full name:-" + " " + customerInfo.fullNameProtectedModifer);
		System.out.println("Customer age:-" + " " + customerInfo.ageProtectedModifer);
		System.out.println("Customer weight:-" + " " + customerInfo.weightProtectedModifer);
		System.out.println("Customer bmi:-" + " " + customerInfo.bmiProtectedModifer);
		System.out.println("Protected access modifier coding test ended");
		System.out.println();
		
	}
}
