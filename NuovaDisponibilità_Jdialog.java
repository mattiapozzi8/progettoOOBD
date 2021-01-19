import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NuovaDisponibilità_Jdialog extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public Controller IlController;
	private JTextField MostraNuovaDisponibilità_TF;
	

	

	/**
	 * Create the dialog.
	 */
	public NuovaDisponibilità_Jdialog(Controller c) {
		IlController=c;
		
		setBounds(100, 100, 317, 125);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			MostraNuovaDisponibilità_TF = new JTextField();
			MostraNuovaDisponibilità_TF.setEditable(false);
			MostraNuovaDisponibilità_TF.setHorizontalAlignment(SwingConstants.CENTER);
			MostraNuovaDisponibilità_TF.setBounds(10, 48, 279, 20);
			MostraNuovaDisponibilità_TF.setText(c.toString());
			contentPanel.add(MostraNuovaDisponibilità_TF);
			MostraNuovaDisponibilità_TF.setColumns(10);
		}
		{
			JLabel lblNewLabel = new JLabel("La nuova disponibilit\u00E0 \u00E8:");
			lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
			lblNewLabel.setBounds(55, 23, 200, 14);
			contentPanel.add(lblNewLabel);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
		}
	}

}
