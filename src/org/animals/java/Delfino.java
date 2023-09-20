package org.animals.java;

public class Delfino extends Animale implements INuotante {

	@Override
	public void verso() {
		System.out.println("verso ambiguo");
		
	}

	@Override
	public void mangia() {
		System.out.println("Mi sto divertendo con la preda 😀");
		
	}

	@Override
	public void nuota() {
		System.out.println("Sto nuotando!!!");
	}

}
