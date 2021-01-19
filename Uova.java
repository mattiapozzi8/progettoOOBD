import java.util.*;

public class Uova extends Prodotto{

	private Date DataDiRaccolta;
	private Date DataDiDeposizione;
	
	public Date getDataDiRaccolta() {
		return DataDiRaccolta;
	}
	public void setDataDiRaccolta(Date dataDiRaccolta) {
		DataDiRaccolta = dataDiRaccolta;
	}
	public Date getDataDiDeposizione() {
		return DataDiDeposizione;
	}
	public void setDataDiDeposizione(Date dataDiDeposizione) {
		DataDiDeposizione = dataDiDeposizione;
	}
	
	@Override
	public void CalcolaPrezzo() {
		// TODO Auto-generated method stub
		super.CalcolaPrezzo();
	}
	
	public Uova() {
		// TODO Auto-generated constructor stub
	}

}
