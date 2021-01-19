import java.util.*;

public class Latticini extends Prodotto{

	private Date DataDiMungitura;
	private Date DataDiProduzione;
	private String PaeseDiCondizionamento;
	private String StabilimentoConfezionamento;
	
	
	
	public Date getDataDiMungitura() {
		return DataDiMungitura;
	}
	public void setDataDiMungitura(Date dataDiMungitura) {
		DataDiMungitura = dataDiMungitura;
	}
	public Date getDataDiProduzione() {
		return DataDiProduzione;
	}
	public void setDataDiProduzione(Date dataDiProduzione) {
		DataDiProduzione = dataDiProduzione;
	}
	public String getPaeseDiCondizionamento() {
		return PaeseDiCondizionamento;
	}
	public void setPaeseDiCondizionamento(String paeseDiCondizionamento) {
		PaeseDiCondizionamento = paeseDiCondizionamento;
	}
	public String getStabilimentoConfezionamento() {
		return StabilimentoConfezionamento;
	}
	public void setStabilimentoConfezionamento(String stabilimentoConfezionamento) {
		StabilimentoConfezionamento = stabilimentoConfezionamento;
	}

	@Override
	public void CalcolaPrezzo() {
		// TODO Auto-generated method stub
		super.CalcolaPrezzo();
	}
	
	public Latticini() {
		// TODO Auto-generated constructor stub
	}

}
