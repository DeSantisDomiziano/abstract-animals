package org.animals.java;

public abstract class Animale {
	
	public abstract void verso();
	public abstract void mangia();
	
	public void dormi() {
		System.out.println("Sto dormendo: \"ZzZzZz\"");
	}
}
