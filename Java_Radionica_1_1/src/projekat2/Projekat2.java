package projekat2;

import projekat2.kolekcija.IMojaLista;
import projekat2.kolekcija.impl.FifoMojaLista;
import projekat2.kolekcija.impl.LifoMojaLista;

public class Projekat2 {

	public static void main(String[] args) {

		//FifoMojaLista fifo=new FifoMojaLista();    nije dobro jer ovako ne mogu i lifo
		
		IMojaLista lista= new FifoMojaLista();
		lista.dodaj(3);
		lista.dodaj(2);
		lista.prikazi();
		
		lista = new LifoMojaLista();
		lista.dodaj(3);
		lista.dodaj(2);
		lista.prikazi();
	}

}
