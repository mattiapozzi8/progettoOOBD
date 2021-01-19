import javax.swing.JDialog;

public class Controller {
	

	FinestraDisponibilit‡ Disp;
	SimulazioneDatabase Sim;
	NuovaDisponibilit‡_Jdialog NewDispJdialog;
	public int NuovaDisponibilit‡;
	
	
	
	public static void main(String[] args) {
		Controller c = new Controller();
		
		
	}
	
	public Controller() {
		Disp=new FinestraDisponibilit‡(this);
		Disp.setVisible(true);
	}
	
	public void ApriJDialog() {
		NewDispJdialog=new NuovaDisponibilit‡_Jdialog(this);
		NewDispJdialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		NewDispJdialog.setVisible(true);
	}

//	public void StampaNuovaDisp() {
//		System.out.println(""+NuovaDisponibilit‡);
//	}
	public void SottraiQuantit‡() {
//		System.out.println(""+Sim.getDisponibilit‡InMagazzino());
		NuovaDisponibilit‡=(Sim.getDisponibilit‡InMagazzino())-(Disp.getQuantit‡DaSottrarreInt());
	}
	
	@Override
	public String toString() {
		return "NuovaDisponibilit‡=" + NuovaDisponibilit‡;
	}
}
