package projekat1.kolekcija;

public abstract class AbstractMojaKolekcija implements IMojaLista{

	protected Cvor glava;
	
	public AbstractMojaKolekcija() {
		glava=null;
	}
	
	protected void dodajNaPocetak(int broj) {
		//kreiraj cvor
				Cvor novi=new Cvor(broj);
				//povezi sa listom, ubaci na pocetak
				System.out.println("Promeni me.....");
				if(glava==null) {
					glava=novi;
				}else {
					novi.setSledeci(glava);
					glava=novi;
				}
	}
	
	protected void dodajNaKraj(int broj) {
		Cvor novi = new Cvor(broj);
		//novi.setSledeci(null);
		if(glava==null) {
			glava=novi;
			return;
		}
		Cvor tek=glava;
		while(tek.getSledeci()!=null) {
			tek=tek.getSledeci();
		}
		tek.setSledeci(novi);
	}
	
	protected void izbaciSaKraja() {
		Cvor tek = glava; 
		while(tek.getSledeci().getSledeci()!=null) {
			tek=tek.getSledeci();
		}
		tek.setSledeci(null);
	}
	
	protected void izbaciSaPocetka() {
		Cvor tek = glava;
		glava = glava.getSledeci();
		tek.setSledeci(null);
	}
	
	protected void izbaciBroj(int broj) {
		if(glava == null) {
			return;
		}
		if(glava.getPodatak()==broj) {
			izbaciSaPocetka();
		}
		Cvor prethodni = glava;
		Cvor tek = glava.getSledeci();
		while(prethodni.getSledeci()!=null) {
			if(tek.getPodatak()==broj) {
				prethodni.setSledeci(tek.getSledeci());
				return;
			}
			prethodni = prethodni.getSledeci();
			tek=tek.getSledeci();
		}
	}
	
	public boolean postoji(int broj) {
		Cvor tek=glava;
		while(tek!=null) {
			if(tek.getPodatak()==broj) {
				return true;
			}else{
				tek=tek.getSledeci();
			}
		}
		return false;
	}
	
	public void prikazi() {
		Cvor tek=glava;
		while(tek!=null) {
			System.out.println(tek.getPodatak());
			tek=tek.getSledeci();
		}
	}
}
