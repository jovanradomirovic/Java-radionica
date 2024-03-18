package projekat1;

import projekat1.kolekcija.impl.FIFOMojaKolekcija;

public class Projekat1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FIFOMojaKolekcija mk=new FIFOMojaKolekcija();
		mk.dodaj(2);
		mk.dodaj(5);
		mk.dodaj(9);
		
		mk.prikazi();
	}

}
