import java.util.*;

public class Verdura extends Prodotto {
	
	private Date DataDiRaccolta;
	private String Modalit‡DiConservazione;
	
	public Date getDataDiRaccolta() {
		return DataDiRaccolta;
	}
	public void setDataDiRaccolta(Date dataDiRaccolta) {
		DataDiRaccolta = dataDiRaccolta;
	}
	public String getModalit‡DiConservazione() {
		return Modalit‡DiConservazione;
	}
	public void setModalit‡DiConservazione(String modalit‡DiConservazione) {
		Modalit‡DiConservazione = modalit‡DiConservazione;
	}

	
	@Override
	public void CalcolaPrezzo() {
		// TODO Auto-generated method stub
		super.CalcolaPrezzo();
	}
	
	public Verdura() {
		// TODO Auto-generated constructor stub
	}

}
