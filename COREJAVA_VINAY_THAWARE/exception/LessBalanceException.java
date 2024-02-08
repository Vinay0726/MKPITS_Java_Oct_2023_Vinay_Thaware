package com.mkpits.exception;

public class LessBalanceException extends Exception {
	int bal;

	public LessBalanceException() {
		System.out.println("Default Constructor Called");
	}

	public LessBalanceException(int bal) {
		this.bal = bal;

	}
// Always in String to print user exception it is a by Default Method provided by java ..
	@Override
	public String toString() {
		return "You Dont Have Sufficient Balance Your Balance is : " + bal;
	}
}