
public class Controller {
	

	FinestraDisponibilit‡ Disp;
	SimulazioneDatabase Sim;
	public int NuovaDisponibilit‡;
	public int PrezzoTotale;
	
	
	
	public static void main(String[] args) {
		Controller c = new Controller();
		
	}
	
	public Controller() {
		Disp=new FinestraDisponibilit‡(this);
		Sim= new SimulazioneDatabase(this);
		Disp.setVisible(true);
	}
	
	public String CalcolaPrezzo() {
		PrezzoTotale=((Disp.getPrezzoAlKiloInt())*(Disp.getQuantit‡DaSottrarreInt()));
		return ""+PrezzoTotale+"Ä";
	}
	
	public String SottraiQuantit‡() {
		if(Disp.getQuantit‡DaSottrarreInt()>Sim.getDisponibilit‡InMagazzino()) {
			return"Non ci sono abbastanza scorte";
		}
		else {	
		NuovaDisponibilit‡=((Sim.getDisponibilit‡InMagazzino())-(Disp.getQuantit‡DaSottrarreInt()));
		Disp.setQuantit‡DaSottrarreInt(0);
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
