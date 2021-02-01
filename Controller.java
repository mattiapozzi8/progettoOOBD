import javax.swing.JDialog;
import javax.swing.JTextField;

public class Controller {
	

	FinestraFrutta FruttaWindow=new FinestraFrutta(this);
	FinestraUova UovaWindow=new FinestraUova(this);
	FinestraVerdura VerduraWindow=new FinestraVerdura(this);
	FinestraLatticini LatticiniWindow=new FinestraLatticini(this);
	FinestraFarinacei FarinaceiWindow=new FinestraFarinacei(this);
	FinestraConfezionati ConfezionatiWindow=new FinestraConfezionati(this);
	SimulazioneDatabase Sim=new SimulazioneDatabase(this);
	public double NuovaDisponibilit‡;
	public double PrezzoTotale=0.0;
	HomePage hp = new HomePage(this);
	AcquistareQuantit‡Minore PopUp=new AcquistareQuantit‡Minore(this);
	
	
	
	public static void main(String[] args) {
		Controller c = new Controller();
		
	}
	
	public Controller() {
		hp.setVisible(true);
	}
	
	public void ApriFinestraUova() {
		UovaWindow.setVisible(true);
	}
	
	public void ApriFinestraFrutta() {
		FruttaWindow.setVisible(true);
	}
	
	public void ApriFinestraVerdura() {
		VerduraWindow.setVisible(true);
	}
	
	public void ApriFinestraLatticini() {
		LatticiniWindow.setVisible(true);
	}
	
	public void ApriFinestraFarinacei() {
		FarinaceiWindow.setVisible(true);
	}
	
	public void ApriFinestraConfezionati() {
		ConfezionatiWindow.setVisible(true);
	}
	
	public void setQuantit‡TfToZero() {
		FruttaWindow.setQuantit‡DaSottrarreDouble(0);
	}
	
	public void ApriJDialogAcquistareQuantit‡Minore() {
		try {
			PopUp.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			PopUp.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void ChiudiJDialogAcquistareQuantit‡Minore() {
		PopUp.setVisible(false);
	}
	
	
	public void TornaAllaHome() {
		FruttaWindow.setVisible(false);
		VerduraWindow.setVisible(false);
		LatticiniWindow.setVisible(false);
		FarinaceiWindow.setVisible(false);
		ConfezionatiWindow.setVisible(false);
		UovaWindow.setVisible(false);
		PopUp.setVisible(false);
		hp.setVisible(true);
	}

	
	public String CalcolaPrezzo() {
		PrezzoTotale=((FruttaWindow.getPrezzoAlKiloDouble())*(FruttaWindow.getQuantit‡DaSottrarreDouble()))+PrezzoTotale;
		return ""+PrezzoTotale+"Ä";
	}
	
	public String SottraiQuantit‡() {
		if(FruttaWindow.getQuantit‡DaSottrarreDouble()>Sim.getDisponibilit‡InMagazzino()) {
			return"Non ci sono abbastanza scorte";
		}
		else {	
			NuovaDisponibilit‡=((Sim.getDisponibilit‡InMagazzino())-(FruttaWindow.getQuantit‡DaSottrarreDouble()));
			if(NuovaDisponibilit‡>0) {
				Sim.setDisponibilit‡InMagazzino(NuovaDisponibilit‡);
				return ""+NuovaDisponibilit‡;
			}
			else {
				return"Queste erano le ultime scorte in magazzino";	
			}	
		}
	}
}
