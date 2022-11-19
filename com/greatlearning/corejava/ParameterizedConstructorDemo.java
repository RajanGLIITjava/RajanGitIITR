package com.greatlearning.corejava;

class introduce{
	introduce(String name, int b, String location){
		System.out.println("My Name is " + name + " My age is " + b + " and am Located in " + location);
	}
}
public class ParameterizedConstructorDemo {
	public static void main(String[] args) {
		introduce result =new introduce("Rajan Singh",45,"ghana");
	}

}
