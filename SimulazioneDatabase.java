
public class SimulazioneDatabase {
	public Controller IlController;
	private int Disponibilit‡InMagazzino=100;
	
	
		
	public void setDisponibilit‡InMagazzino(int disponibilit‡InMagazzino) {
		Disponibilit‡InMagazzino = disponibilit‡InMagazzino;
	}
	public int getDisponibilit‡InMagazzino() {
		return Disponibilit‡InMagazzino;
	}
	


	public SimulazioneDatabase(Controller c) {
		IlController=c;
		// TODO Auto-generated constructor stub
	}

}
