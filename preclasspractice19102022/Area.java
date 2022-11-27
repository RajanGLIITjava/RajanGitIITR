package com.greatlearning.corejava;

import java.util.Scanner;

public class Area{

public static void main(String[] args) {
	int r;
	int radius;
	final float pi;
	pi=3.14f;

	System.out.println("Enter the Circul Radius");
	Scanner sc = new Scanner(System.in);
	r = sc.nextInt();
	radius = r*r;
	float totalArea= pi*radius;
	System.out.println("Total Area of the Circle is:" + " " + totalArea);

}	
}