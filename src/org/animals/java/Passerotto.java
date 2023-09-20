package org.animals.java;

public class Passerotto extends Animale implements IVolante{

	@Override
	public void verso() {
		System.out.println("chip chip");
		
	}

	@Override
	public void mangia() {
		System.out.println("bec bec");
		
	}

	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

}
