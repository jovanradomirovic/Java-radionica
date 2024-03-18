package projekat1.kolekcija;

public class SetMojaKolekcija extends AbstractMojaKolekcija{

	@Override
	public void dodaj(int broj) {
		//proveri da li postoji taj broj u listi, ako NE postoji dodaj na pocetak
		if(!postoji(broj)) {
			super.dodajNaPocetak(broj);
		} else {
			System.out.println("Vec postoji u listi");
		}
	}
	
	public void izbaci() {
		
	}

}
