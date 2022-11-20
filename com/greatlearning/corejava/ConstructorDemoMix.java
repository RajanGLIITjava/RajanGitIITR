package com.greatlearning.corejava;

/*
 Write a program to implement Constructor
Create a class ConstructorDemo.
Create a default constructor for the class and print “I am default constructor.”
Execute the constructor created.
Create a parameterized constructor with arguments of type  integer, float, string and character.
Print “I am Parameterized constructor. I take various arguments as input.”.
Create squares from integer and float values and print them in new lines.
Print string and character in new lines.
Execute the class constructors 
 */
class ConstructorDemonstration {
	ConstructorDemonstration() {
		System.out.println("I am a default Constructor");
	}

	ConstructorDemonstration(String s1) {
		System.out.println("I am a " + s1);
	}

	ConstructorDemonstration(int num, float f1, String s1, char ch) {
		System.out.print("int square value" +" " + (num * num));
		System.out.print("float square value" + " " + (f1 * f1));
		System.out.println("String value" + " " + s1);
		System.out.println("Character value" + " " + ch);
	}
}

public class ConstructorDemoMix {
	public static void main(String[] args) {
		// default constructor
	ConstructorDemonstration defaultresult = new ConstructorDemonstration();

		// parameterized constructor with one value
	ConstructorDemonstration defaultresult1 = new ConstructorDemonstration(
			"parameterized Constructor & I take various arguments as input");
		
		// parameterized constructor with multiple value
		ConstructorDemonstration defaultresult2 = new ConstructorDemonstration(10, 30.2f,"test successfully",
		'R');
	}
}
