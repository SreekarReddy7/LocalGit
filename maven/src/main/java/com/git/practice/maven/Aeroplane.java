package com.git.practice.maven;

public class Aeroplane implements Flyable {

	public void fly() {
		System.out.println(Flyable.fly);
		System.out.println("aeroplane");
	}

	public static void main(String[] args) {

		Aeroplane aero =  new Aeroplane();
		aero.fly();
	}

}
