
public class SimulazioneDatabase {
	public Controller IlController;
	private double Disponibilit‡FruttaInMagazzino=100;
	private double Disponibilit‡VerduraInMagazzino=100;
	
	
		
	public void setDisponibilit‡InMagazzino(double nuovaDisponibilit‡) {
		Disponibilit‡FruttaInMagazzino = nuovaDisponibilit‡;
	}
	public double getDisponibilit‡InMagazzino() {
		return Disponibilit‡FruttaInMagazzino;
	}
	


	public SimulazioneDatabase(Controller c) {
		IlController=c;
		// TODO Auto-generated constructor stub
	}

}
