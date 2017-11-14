import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class vLogin extends JFrame {

	private JPanel contentPane;
	private JTextField textField_usu;
	private JPasswordField passwordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					vLogin frame = new vLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public vLogin() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 571, 458);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(76, 95, 85, 23);
		contentPane.add(lblUsuario);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setBounds(76, 203, 85, 20);
		contentPane.add(lblContrasea);
		
		textField_usu = new JTextField();
		textField_usu.setBounds(193, 92, 287, 26);
		contentPane.add(textField_usu);
		textField_usu.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(193, 200, 287, 26);
		contentPane.add(passwordField);
		
		JButton btnOk = new JButton("OK");
		btnOk.setBounds(365, 315, 115, 29);
		contentPane.add(btnOk);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSalir.setBounds(112, 315, 115, 29);
		contentPane.add(btnSalir);
		
		JPanel panel_usu = new JPanel();
		panel_usu.setBounds(15, 86, 46, 53);
		contentPane.add(panel_usu);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon(vLogin.class.getResource("/datos/Places-user-identity-icon.png")));
		panel_usu.add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setBounds(15, 184, 46, 53);
		contentPane.add(panel);
		
		JLabel lblT = new JLabel("");
		lblT.setIcon(new ImageIcon(vLogin.class.getResource("/datos/lock-icon.png")));
		panel.add(lblT);
	}
}
