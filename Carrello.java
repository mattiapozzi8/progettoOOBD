import java.util.*;

public class Carrello {
	
	private double PrezzoTotale;
	public Cliente Acquirente;
	
	
	public ArrayList<Prodotto> ProdottiInCarrello = new ArrayList<Prodotto>();
	

	public double getPrezzoTotale() {
		return PrezzoTotale;
	}
	public void setPrezzoTotale(double prezzoTotale) {
		PrezzoTotale = prezzoTotale;
	}

	public void AggiungiAlCarrello(Prodotto prodotto) {
		
	}

	public Carrello() {
		// TODO Auto-generated constructor stub
	}

}
