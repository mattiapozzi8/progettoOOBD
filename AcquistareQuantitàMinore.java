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
		
		
		setBounds(100, 100, 303, 142);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			txtDesideraAcquistarne = new JTextField();
			txtDesideraAcquistarne.setEditable(false);
			txtDesideraAcquistarne.setText("Desidera acquistarne una quantit\u00E0 minore? ");
			txtDesideraAcquistarne.setHorizontalAlignment(SwingConstants.CENTER);
			txtDesideraAcquistarne.setBounds(10, 11, 267, 33);
			contentPanel.add(txtDesideraAcquistarne);
			txtDesideraAcquistarne.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			buttonPane.setLayout(new FlowLayout(FlowLayout.CENTER, 50, 5));
			{
				JButton SÏButton = new JButton("Si");
				SÏButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
					}
				});
				SÏButton.setHorizontalAlignment(SwingConstants.RIGHT);
				SÏButton.setActionCommand("OK");
				buttonPane.add(SÏButton);
				getRootPane().setDefaultButton(SÏButton);
			}
			{
				JButton NoButton = new JButton("No");
				NoButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						c.TornaAllaHome();
					}
				});
				NoButton.setActionCommand("Cancel");
				buttonPane.add(NoButton);
			}
		}
	}

}
