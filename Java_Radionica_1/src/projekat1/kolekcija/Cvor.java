package projekat1.kolekcija;

public class Cvor {

	private int podatak;
	private Cvor sledeci;
	
	public Cvor(int podatak) {
		this.podatak=podatak;
	}
	public void setSledeci(Cvor sledeci) {
		this.sledeci = sledeci;
	}
	public void setPodatak(int podatak) {
		this.podatak = podatak;
	}
	public int getPodatak() {
		return podatak;
	}
	public Cvor getSledeci() {
		return sledeci;
	}
}
