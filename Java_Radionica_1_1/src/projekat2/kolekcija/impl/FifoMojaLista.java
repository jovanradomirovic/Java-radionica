package projekat2.kolekcija.impl;

import projekat2.kolekcija.IMojaLista;

public class FifoMojaLista implements IMojaLista{

	@Override
	public void dodaj(int broj) {

		System.out.println("FIFO> dodaj na kraj");
	}

	@Override
	public void prikazi() {
		System.out.println("FIFO> prikazi");
		
	}

	@Override
	public boolean postoji(int broj) {
		System.out.println("FIFO> postoji");
		return true;
	}

	@Override
	public int izbaci() {
		System.out.println("FIFO> izbaci");
		return 0;
	}

}
