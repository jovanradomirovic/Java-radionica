package projekat1.kolekcija.impl;

import projekat1.kolekcija.AbstractMojaKolekcija;
import projekat1.kolekcija.Cvor;
import projekat1.kolekcija.IMojaLista;

public class LIFOMojaKolekcija extends AbstractMojaKolekcija{

	@Override
	public void dodaj(int broj) {
		super.dodajNaKraj(broj);
	}

	@Override
	public void izbaci() {
		super.izbaciSaKraja();
	}

}
