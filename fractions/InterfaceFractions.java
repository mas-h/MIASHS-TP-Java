package fractions;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InterfaceFractions {

	private JFrame frmTpFractions;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InterfaceFractions window = new InterfaceFractions();
					window.frmTpFractions.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public InterfaceFractions() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmTpFractions = new JFrame();
		frmTpFractions.setTitle("TP6: Fractions");
		frmTpFractions.setBounds(100, 100, 465, 148);
		frmTpFractions.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
										frmTpFractions.getContentPane().setLayout(new GridLayout(2, 1, 0, 0));
										
												JLabel lblNewLabel = new JLabel("Évaluer une expression ou fraction");
												frmTpFractions.getContentPane().add(lblNewLabel);
												
														textField = new JTextField();
														frmTpFractions.getContentPane().add(textField);
														textField
																.setToolTipText("Tapper une expression terminée par = (la barre de fraction est /)");
														textField.addKeyListener(new KeyAdapter() {
															@Override
															public void keyTyped(KeyEvent e) {
																if (e.getKeyChar() == '=') {
																	String s = textField.getText();
																	e.setKeyChar(Character.MIN_VALUE);
																	String res = (new Fraction().calculFraction(s)).toString();
																	textField.setText(s + "=" + res);
																}
															}
														});
														textField.setColumns(10);
	}

	public JTextField getTextField() {
		return textField;
	}
}