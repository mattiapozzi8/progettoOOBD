import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JToggleButton;

public class FinestraUova extends JFrame {

	private JPanel contentPane;
	private JTextField Quantit‡_TF;
	public Controller IlController;
	private double Quantit‡DaSottrarreDouble;
	private JTextField PrezzoAlKilo_TF;
	private JTextField PrezzoTot_TF;
	private JTextField DispInMagazzino_TF;
	private double PrezzoAlKiloDouble;
	private JTextField SimboloEuro;
	private String DispInMagazzinoString;
	public String TipoVerdura=null;
	private JTextField DataDeposizione_TF;
	private JTextField DataRaccoltaUova_TF;
	
	
	public String getDispInMagazzinoString() {
		return DispInMagazzinoString;
	}
	public void setDispInMagazzinoString(String dispInMagazzinoString) {
		DispInMagazzinoString = dispInMagazzinoString;
	}
	public void setQuantit‡DaSottrarreDouble(double quantit‡DaSottrarreDouble) {
		Quantit‡DaSottrarreDouble = 0.0;
	}
	public double getQuantit‡DaSottrarreDouble() {
		return Quantit‡DaSottrarreDouble;
	}
	
	public double getPrezzoAlKiloDouble() {
		return PrezzoAlKiloDouble;
	}
	


	/**
	 * Create the frame.
	 */
	public FinestraUova(Controller c) {
		
		IlController=c;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 498, 339);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel Uova_JLb = new JLabel("Uova");
		Uova_JLb.setHorizontalAlignment(SwingConstants.CENTER);
		Uova_JLb.setFont(new Font("Cambria", Font.PLAIN, 20));
		Uova_JLb.setBounds(187, 0, 109, 25);
		contentPane.add(Uova_JLb);
		
		JLabel Quantit‡_JLb = new JLabel("Quantit\u00E0(in chili) che desidera aquistare:");
		Quantit‡_JLb.setFont(new Font("Cambria", Font.PLAIN, 14));
		Quantit‡_JLb.setBounds(10, 133, 261, 25);
		contentPane.add(Quantit‡_JLb);
		
		Quantit‡_TF = new JTextField();
		Quantit‡_TF.setEditable(false);
		Quantit‡_TF.setFont(new Font("Cambria", Font.PLAIN, 13));
		Quantit‡_TF.setHorizontalAlignment(SwingConstants.CENTER);
		Quantit‡_TF.setToolTipText("Inserire quantit\u00E0 desiderata");
		Quantit‡_TF.setBounds(261, 133, 94, 23);
		contentPane.add(Quantit‡_TF);
		Quantit‡_TF.setColumns(10);
		
		JButton CalcolaPrezzoButton = new JButton("Calcola Prezzo");
		CalcolaPrezzoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String PrezzoAlKiloString = PrezzoAlKilo_TF.getText();
				try {
					PrezzoAlKiloDouble = Double.parseDouble(PrezzoAlKiloString);	
				}
				catch (NumberFormatException Nfe){
					System.err.println("");
				}
				PrezzoTot_TF.setText(c.CalcolaPrezzo());
				CalcolaPrezzoButton.setEnabled(false);
				if((DispInMagazzinoString.equals("Queste erano le ultime scorte in magazzino"))){
					PrezzoTot_TF.setText(PrezzoTot_TF.getText());
					CalcolaPrezzoButton.setEnabled(false);
				};
			}
		});
		CalcolaPrezzoButton.setBounds(10, 203, 121, 23);
		contentPane.add(CalcolaPrezzoButton);
		
		JButton ConfermaButton = new JButton("Conferma");
		ConfermaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Quantit‡DaSottrarreString=Quantit‡_TF.getText();
				try {
					Quantit‡DaSottrarreDouble = Double.parseDouble(Quantit‡DaSottrarreString);	
				}
				catch (NumberFormatException Nfe){
					System.err.println("");
				}
				DispInMagazzinoString=c.SottraiQuantit‡();
				DispInMagazzino_TF.setText(DispInMagazzinoString);
				if((DispInMagazzinoString.equals("Non ci sono abbastanza scorte"))){
					Quantit‡_TF.setEditable(false);
					ConfermaButton.setEnabled(false);
					CalcolaPrezzoButton.setEnabled(false);
				}
					else {
						DispInMagazzino_TF.setText(DispInMagazzinoString);
						ConfermaButton.setEnabled(false);
						Quantit‡_TF.setEditable(false);
					}
				
			}
		});
		ConfermaButton.setBounds(365, 133, 94, 23);
		contentPane.add(ConfermaButton);
		
		JLabel PrezzoAlKilo_JLb = new JLabel("Prezzo al Chilo:");
		PrezzoAlKilo_JLb.setFont(new Font("Cambria", Font.PLAIN, 14));
		PrezzoAlKilo_JLb.setBounds(10, 172, 109, 14);
		contentPane.add(PrezzoAlKilo_JLb);
		
		PrezzoAlKilo_TF = new JTextField();
		PrezzoAlKilo_TF.setFont(new Font("Cambria", Font.PLAIN, 13));
		PrezzoAlKilo_TF.setHorizontalAlignment(SwingConstants.CENTER);
		PrezzoAlKilo_TF.setEditable(false);
		PrezzoAlKilo_TF.setBounds(107, 170, 35, 20);
		contentPane.add(PrezzoAlKilo_TF);
		PrezzoAlKilo_TF.setColumns(10);
		
		
		
		JLabel PrezzoTot_JLb = new JLabel("Prezzo Totale:");
		PrezzoTot_JLb.setFont(new Font("Cambria", Font.PLAIN, 14));
		PrezzoTot_JLb.setBounds(10, 237, 109, 17);
		contentPane.add(PrezzoTot_JLb);
		
		PrezzoTot_TF = new JTextField();
		PrezzoTot_TF.setFont(new Font("Cambria", Font.PLAIN, 13));
		PrezzoTot_TF.setText("0,00\u20AC");
		PrezzoTot_TF.setEditable(false);
		PrezzoTot_TF.setHorizontalAlignment(SwingConstants.CENTER);
		PrezzoTot_TF.setBounds(112, 235, 109, 20);
		contentPane.add(PrezzoTot_TF);
		PrezzoTot_TF.setColumns(10);
		
		JLabel DispInMagazzino_JLb = new JLabel("Disponibilit\u00E0 in magazzino:");
		DispInMagazzino_JLb.setFont(new Font("Cambria", Font.PLAIN, 15));
		DispInMagazzino_JLb.setBounds(10, 39, 257, 17);
		contentPane.add(DispInMagazzino_JLb);
		
		DispInMagazzino_TF = new JTextField();
		DispInMagazzino_TF.setFont(new Font("Cambria", Font.PLAIN, 14));
		DispInMagazzino_TF.setText("100");
		DispInMagazzino_TF.setHorizontalAlignment(SwingConstants.LEFT);
		DispInMagazzino_TF.setEditable(false);
		DispInMagazzino_TF.setBounds(197, 38, 214, 20);
		contentPane.add(DispInMagazzino_TF);
		DispInMagazzino_TF.setColumns(10);
		
		
		
		JButton AcquistaDiNuovoButton = new JButton("Acquista di nuovo");
		AcquistaDiNuovoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {	
				try {
					if((DispInMagazzinoString.equals("Non ci sono abbastanza scorte"))){
						c.ApriJDialogAcquistareQuantit‡Minore();
					}
					else if((DispInMagazzinoString.equals("Queste erano le ultime scorte in magazzino"))) {
						AcquistaDiNuovoButton.setEnabled(false);
					}
					else {
						Quantit‡_TF.setText("");
						c.setQuantit‡TfToZero();
						ConfermaButton.setEnabled(true);
						CalcolaPrezzoButton.setEnabled(true);
						Quantit‡_TF.setEditable(true);
					}
				} catch (Exception e1) {
					System.out.println("Selezioni una quantit‡ prima di acquistare di nuovo");
//					e1.printStackTrace();
				}
				
			}
		});
		AcquistaDiNuovoButton.setBounds(318, 236, 154, 25);
		contentPane.add(AcquistaDiNuovoButton);
		

		JButton TornaHomeButton = new JButton("Torna alla home");
		TornaHomeButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				c.TornaAllaHome();
			}
		});
		TornaHomeButton.setBounds(318, 265, 154, 25);
		contentPane.add(TornaHomeButton);
		
		SimboloEuro = new JTextField();
		SimboloEuro.setEditable(false);
		SimboloEuro.setFont(new Font("Cambria", Font.PLAIN, 13));
		SimboloEuro.setHorizontalAlignment(SwingConstants.CENTER);
		SimboloEuro.setText("\u20AC");
		SimboloEuro.setBounds(146, 170, 18, 20);
		contentPane.add(SimboloEuro);
		SimboloEuro.setColumns(10);
		
		JLabel DataDeposizione_JLb = new JLabel("Data Deposizione:");
		DataDeposizione_JLb.setFont(new Font("Cambria", Font.PLAIN, 15));
		DataDeposizione_JLb.setBounds(10, 72, 183, 17);
		contentPane.add(DataDeposizione_JLb);
		
		DataDeposizione_TF = new JTextField();
		DataDeposizione_TF.setEditable(false);
		DataDeposizione_TF.setBounds(197, 70, 214, 20);
		contentPane.add(DataDeposizione_TF);
		DataDeposizione_TF.setColumns(10);
		
		JLabel DataRaccoltaUova_JLb = new JLabel("Data Raccolta Uova: ");
		DataRaccoltaUova_JLb.setFont(new Font("Cambria", Font.PLAIN, 15));
		DataRaccoltaUova_JLb.setBounds(10, 103, 170, 17);
		contentPane.add(DataRaccoltaUova_JLb);
		
		DataRaccoltaUova_TF = new JTextField();
		DataRaccoltaUova_TF.setEditable(false);
		DataRaccoltaUova_TF.setBounds(197, 101, 214, 20);
		contentPane.add(DataRaccoltaUova_TF);
		DataRaccoltaUova_TF.setColumns(10);
		
	}
	
}