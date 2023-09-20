package org.animals.java;

public class Cane extends Animale implements INuotante{

	@Override
	public void verso() {
		System.out.println("Bau bau!");
		
	}

	@Override
	public void mangia() {
		System.out.println("Sto mangiando i croccantini del discount");
		
	}
	
	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}

}
