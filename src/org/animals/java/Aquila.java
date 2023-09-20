package org.animals.java;

public class Aquila extends Animale implements IVolante{
	
	@Override
	public void verso() {
		System.out.println("PIO PIO");
	}

	@Override
	public void mangia() {
		System.out.println("BEC BEC sto beccando");
	}
	
	@Override
	public void vola() {
		System.out.println("Sto volando!!!");
		
	}

}
