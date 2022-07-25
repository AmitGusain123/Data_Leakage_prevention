import java.awt.EventQueue;

import javax.swing.JDialog;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.SwingConstants;

public class EncryptionProgressBar extends JDialog {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EncryptionProgressBar dialog = new EncryptionProgressBar();
					dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
					dialog.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public EncryptionProgressBar() {
		setBackground(SystemColor.controlHighlight);
		setResizable(false);
		getContentPane().setBackground(SystemColor.controlHighlight);
		setBounds(100, 100, 314, 190);
		getContentPane().setLayout(null);
		final Toolkit toolkit = Toolkit.getDefaultToolkit();
		final Dimension screenSize = toolkit.getScreenSize();
		final int x = (screenSize.width - getWidth()) / 2;
		final int y = (screenSize.height - getHeight()) / 2;
		setLocation(x, y);
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setFont(new Font("Calibri", Font.BOLD, 12));
		progressBar.setForeground(new Color(255, 140, 0));
		progressBar.setBackground(SystemColor.controlHighlight);
		progressBar.setBounds(40, 81, 221, 29);
		getContentPane().add(progressBar);
		
		JTextArea txtrEncryptingYourFile = new JTextArea();
		txtrEncryptingYourFile.setEditable(false);
		txtrEncryptingYourFile.setFont(new Font("Calibri", Font.BOLD, 16));
		txtrEncryptingYourFile.setBackground(SystemColor.controlHighlight);
		txtrEncryptingYourFile.setText("Encrypting your file ...");
		txtrEncryptingYourFile.setBounds(70, 36, 156, 22);
		getContentPane().add(txtrEncryptingYourFile);

	}

}
