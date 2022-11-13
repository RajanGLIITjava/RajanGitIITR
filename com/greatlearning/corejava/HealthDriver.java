package com.greatlearning.corejava;

class Health {
	protected int age = 45;
	protected float weight = 68.5f;
	protected float bmi = 22.2f;
}

public class HealthDriver {
	public static void main(String[] args) {
		Health healthChekup = new Health();
		System.out.println("Dear Client your age is :-" + " " + healthChekup.age);
		System.out.println("Dear Client your weight is :-" + " " + healthChekup.weight);
		System.out.println("Dear Client your bmi is :-" + " " + healthChekup.bmi + " "+
						"which is above the risk pls take the precuations");

	}
}