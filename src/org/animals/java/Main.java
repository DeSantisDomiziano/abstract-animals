package org.animals.java;

public class Main {
	
	static void faiVolare(IVolante animale) {
		animale.vola();
	}
	static void faiNuotare(INuotante animale) {
		animale.nuota();
	}

	public static void main(String[] args) {
		
		Cane c = new Cane();
		c.verso();
		c.mangia();
		c.dormi();
		System.out.print("Cane: ");
		faiNuotare(c);
		System.out.println("\n-----------------------\n");
		
		Delfino d = new Delfino();
		d.verso();
		d.mangia();
		d.dormi();
		System.out.print("Delfino: ");
		faiNuotare(d);
		System.out.println("\n-----------------------\n");
		
		Passerotto p = new Passerotto();
		p.verso();
		p.mangia();
		p.dormi();
		System.out.print("Passerotto: ");
		faiVolare(p);
		System.out.println("\n-----------------------\n");
		
		
		Aquila a = new Aquila();
		a.verso();
		a.mangia();
		a.dormi();
		System.out.print("Aquila: ");
		faiVolare(a);
		System.out.println("\n-----------------------\n");
	}
}