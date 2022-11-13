package com.greatlearning.corejava;

 class Health {
	protected int age;
	protected float weight;
	protected float bmi;
}

public class HealthDriver{
	public static void main(String[]args);
	Health healthChekup = new Health();
	healthChekup.age= 45;
	healthChekup.weight=65.6f;
	healthChekup.bmi=66.25f;
	System.out.println(healthChekup.age);
	System.out.println(healthChekup.weight);
	System.out.prntln(healthChekup.bmi);
}