package com.prog2.labs;

public class Bird {
	public int age;

	public String fly() {
		return age < 10 ? "flying" : "too old";
	}
}
