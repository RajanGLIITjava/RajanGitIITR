package com.greatlearning.corejava;

class ConstructorDemoTest {
	
	ConstructorDemoTest()
	{
		System.out.println("My Name is Rajan Singh");
	} 
	
}


public class ConstructorDemo{
	public static void main(String[]args) {
		//intializing default constructor
		ConstructorDemoTest defaulTest= new ConstructorDemoTest();
		System.out.println(defaulTest);
}
}