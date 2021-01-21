
public class SimulazioneDatabase {
	public Controller IlController;
	private double Disponibilit‡InMagazzino=100;
	
	
		
	public void setDisponibilit‡InMagazzino(double nuovaDisponibilit‡) {
		Disponibilit‡InMagazzino = nuovaDisponibilit‡;
	}
	public double getDisponibilit‡InMagazzino() {
		return Disponibilit‡InMagazzino;
	}
	


	public SimulazioneDatabase(Controller c) {
		IlController=c;
		// TODO Auto-generated constructor stub
	}

}
