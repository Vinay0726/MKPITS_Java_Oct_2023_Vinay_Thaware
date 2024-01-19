package com.mkpits.collection;

public class Recursion {

	public static void main(String[] args) {

		Recursion recursion = new Recursion();
		recursion.callMethod();

	}

	private void callMethod() {

		int counter = 0;
		while (counter < 5) {
			System.out.println("Recursion Call");
			callMethod();
			counter--;
		}

	}

}
