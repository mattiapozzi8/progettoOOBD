
public class Controller {
	

	FinestraDisponibilit‡ Disp;
	SimulazioneDatabase Sim;
	public double NuovaDisponibilit‡;
	public double PrezzoTotale;
	
	
	
	public static void main(String[] args) {
		Controller c = new Controller();
		
	}
	
	public Controller() {
		Disp=new FinestraDisponibilit‡(this);
		Sim= new SimulazioneDatabase(this);
		Disp.setVisible(true);
	}
	
//	public void RefreshFinestraDisponibilit‡(){
//		Disp.setVisible(true);
//		Disp.dispose();
//		if(Sim.getDisponibilit‡InMagazzino()>0) {
//			Disp = new FinestraDisponibilit‡(this);
//			Disp.setVisible(true);
//		}
//	}
//	
	
	public String CalcolaPrezzo() {
		PrezzoTotale=((Disp.getPrezzoAlKiloDouble())*(Disp.getQuantit‡DaSottrarreDouble()));
		return ""+PrezzoTotale+"Ä";
	}
	
	public String SottraiQuantit‡() {
		if(Disp.getQuantit‡DaSottrarreDouble()>Sim.getDisponibilit‡InMagazzino()) {
			return"Non ci sono abbastanza scorte";
		}
		else {	
		NuovaDisponibilit‡=((Sim.getDisponibilit‡InMagazzino())-(Disp.getQuantit‡DaSottrarreDouble()));
//		Disp.setQuantit‡DaSottrarreDouble(0);
		if(NuovaDisponibilit‡>0) {
		Sim.setDisponibilit‡InMagazzino(NuovaDisponibilit‡);
		return ""+NuovaDisponibilit‡;
		}
		else {
			return"Abbiamo esaurito le scorte in magazzino";	
		}	
		}
	}
}
