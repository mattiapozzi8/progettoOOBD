
public class Cliente {

	private String Nome;
	private String Cognome;
	private String Cf;
	public Carrello IlMioCarrello;
	public TesseraFedeltà LaMiaTessera;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCognome() {
		return Cognome;
	}
	public void setCognome(String cognome) {
		Cognome = cognome;
	}
	public String getCf() {
		return Cf;
	}
	public void setCf(String cf) {
		Cf = cf;
	}
	
	public void CalcolaPunti(double PrezzoFinale) {
	}
	
	public Cliente() {
		// TODO Auto-generated constructor stub
	}

}
