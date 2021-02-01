import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AcquistareQuantit‡Minore extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public Controller IlController;
	private JTextField txtDesideraAcquistarne;
	

	/**
	 * Create the dialog.
	 */
	public AcquistareQuantit‡Minore(Controller c) {
		setAlwaysOnTop(true);
		setModal(true);
		
		IlController=c;
		
		
		setBounds(100, 100, 326, 142);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtDesideraAcquistarne = new JTextField();
			txtDesideraAcquistarne.setEditable(false);
			txtDesideraAcquistarne.setText("Impossibile acquistare la quantit‡ da lei desiderata ");
			txtDesideraAcquistarne.setHorizontalAlignment(SwingConstants.CENTER);
			txtDesideraAcquistarne.setBounds(10, 31, 290, 41);
			contentPanel.add(txtDesideraAcquistarne);
			txtDesideraAcquistarne.setColumns(10);
		}
	}

}
