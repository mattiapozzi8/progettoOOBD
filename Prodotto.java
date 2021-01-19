import java.util.*;

public class Prodotto {
	
	private int Disponibilità;
	private String Marca;
	private String CodiceID;
	private double PrezzoAlKilo;
	private double Quantità;
	private Date DataDiScadenza;
	
	public ArrayList<Carrello> IlCarrello= new ArrayList<Carrello>();

	public int getDisponibilità() {
		return Disponibilità;
	}
	public void setDisponibilità(int disponibilità) {
		Disponibilità = disponibilità;
	}
	public String getMarca() {
		return Marca;
	}
	public void setMarca(String marca) {
		Marca = marca;
	}
	public String getCodiceID() {
		return CodiceID;
	}
	public void setCodiceID(String codiceID) {
		CodiceID = codiceID;
	}
	public double getPrezzoAlKilo() {
		return PrezzoAlKilo;
	}
	public void setPrezzoAlKilo(double prezzoAlKilo) {
		PrezzoAlKilo = prezzoAlKilo;
	}
	public double getQuantità() {
		return Quantità;
	}
	public void setQuantità(double quantità) {
		Quantità = quantità;
	}
	public Date getDataDiScadenza() {
		return DataDiScadenza;
	}
	public void setDataDiScadenza(Date dataDiScadenza) {
		DataDiScadenza = dataDiScadenza;
	}
	
	public void CalcolaPrezzo(){
	}
	
	public Prodotto() {
		
	}

}
