import javax.swing.JDialog;
import javax.swing.JTextField;

public class Controller {
	

	FinestraDisponibilit‡ Disp=new FinestraDisponibilit‡(this);
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
	
	public void ApriFinestraFrutta() {
		Disp.setVisible(true);
	}
	
	public void setQuantit‡TfToZero() {
		Disp.setQuantit‡DaSottrarreDouble(0);
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
	
	public void JDialogOpzioneSi() {
		
	}
	
	public void TornaAllaHome() {
		Disp.setVisible(false);
		PopUp.setVisible(false);
		hp.setVisible(true);
	}

	
	public String CalcolaPrezzo() {
		PrezzoTotale=((Disp.getPrezzoAlKiloDouble())*(Disp.getQuantit‡DaSottrarreDouble()))+PrezzoTotale;
		return ""+PrezzoTotale+"Ä";
	}
	
	public String SottraiQuantit‡() {
		if(Disp.getQuantit‡DaSottrarreDouble()>Sim.getDisponibilit‡InMagazzino()) {
			return"Non ci sono abbastanza scorte";
		}
		else {	
			NuovaDisponibilit‡=((Sim.getDisponibilit‡InMagazzino())-(Disp.getQuantit‡DaSottrarreDouble()));
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
