import java.util.*;

public class Confezionati extends Prodotto{
	
	private Date DataConfezionamento;
	
	public Date getDataConfezionamento() {
		return DataConfezionamento;
	}
	public void setDataConfezionamento(Date dataConfezionamento) {
		DataConfezionamento = dataConfezionamento;
	}

	@Override
	public void CalcolaPrezzo() {
		// TODO Auto-generated method stub
		super.CalcolaPrezzo();
	}

	public Confezionati() {
		// TODO Auto-generated constructor stub
	}

}
