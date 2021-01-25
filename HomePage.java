import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class HomePage extends JFrame {

	private JPanel contentPane;
	public String tipo = null;
	
	/**
	 * Create the frame.
	 */
	public HomePage(Controller c) {
		setTitle("Home Page");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel WelcomeLabel = new JLabel("BENVENUTO");
		WelcomeLabel.setFont(new Font("Calibri", Font.PLAIN, 25));
		WelcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		WelcomeLabel.setBounds(137, 11, 160, 47);
		contentPane.add(WelcomeLabel);
		
		JLabel HPLabel = new JLabel("Scegli che tipo di prodotto\r\n vuoi acquistare");
		HPLabel.setFont(new Font("Tahoma", Font.PLAIN, 10));
		HPLabel.setHorizontalAlignment(SwingConstants.CENTER);
		HPLabel.setBounds(109, 29, 215, 65);
		contentPane.add(HPLabel);
		
		JComboBox HPcomboBox = new JComboBox();
		HPcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Frutta", "Verdura", "Farinacei", "Latticini", "Uova", "Confezionati"}));
		HPcomboBox.setToolTipText("");
		HPcomboBox.setSelectedItem(null);
		HPcomboBox.setBounds(137, 92, 160, 22);
		contentPane.add(HPcomboBox);
		
		JButton HPNextButton = new JButton("Avanti");
		HPNextButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				tipo = (String) HPcomboBox.getSelectedItem();
				
				switch(tipo) {
				
				case "Frutta":
					c.hp.setVisible(false);
				    c.ApriFinestraFrutta();
					
				case "Verdura":
					c.hp.setVisible(false);
				    //aprire jframe scelta verdura
					
				case "Farinacei":
					c.hp.setVisible(false);
				    //aprire jframe scelta farinacei
					
				case "Latticini":
					c.hp.setVisible(false);
				    //aprire jframe scelta latticini
					
				case "Uova":
					c.hp.setVisible(false);
				    //aprire jframe scelta uova
					
				case "Confezionati":
					c.hp.setVisible(false);
				    //aprire jframe scelta confezionati
				
				}
					
				
				
				
			}
		});
		HPNextButton.setBounds(335, 209, 89, 23);
		contentPane.add(HPNextButton);
		
		JButton HPCloseButton = new JButton("Chiudi");
		HPCloseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(NORMAL);
			}
		});
		HPCloseButton.setBounds(10, 209, 89, 23);
		contentPane.add(HPCloseButton);
		
		JButton CartButton = new JButton("Carrello");
		CartButton.setFont(new Font("Tahoma", Font.PLAIN, 10));
		CartButton.setBounds(355, 11, 69, 32);
		contentPane.add(CartButton);
	}
}
