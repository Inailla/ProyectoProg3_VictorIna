import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import javax.swing.DefaultListModel;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.ListSelectionModel;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.ScrollPane;

public class Ventana extends JFrame {

	private JPanel contentPane;
	JList<String> listnoticiasult ;
	NoticiasLlamada nw = new NoticiasLlamada();
	ScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws IOException 
	 */
	public Ventana() throws IOException {
		setTitle("Deusto News");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 786, 569);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel_categorias = new JPanel();
		panel_categorias.setBounds(0, 0, 764, 50);
		contentPane.add(panel_categorias);
		panel_categorias.setLayout(new GridLayout(1, 0, 0, 0));
		
		JButton btnUltimasNoticias = new JButton("Ultimas Noticias");
		panel_categorias.add(btnUltimasNoticias);
		
		JButton btnEconomia = new JButton("Economia");
		panel_categorias.add(btnEconomia);
		
		JButton btnDeportes = new JButton("Deportes");
		panel_categorias.add(btnDeportes);
		
		JButton btnInternacional = new JButton("Internacional");
		panel_categorias.add(btnInternacional);
		
		JButton btnPasatiempos = new JButton("Pasatiempos");
		panel_categorias.add(btnPasatiempos);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				vLogin log = new vLogin();
				log.setVisible(true);
				dispose();
				}
		});
		panel_categorias.add(btnLogin);
		
		scrollPane_1 = new ScrollPane();
		
		
		listnoticiasult = new JList<String>();
		listnoticiasult.setBounds(271, 345, -230, -250);
		listnoticiasult.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		listnoticiasult.setModel(new DefaultListModel<String>());
	
		
		contentPane.add(listnoticiasult);
		
		
		insertarNoticias();
	}
	
	public void insertarNoticias() throws IOException{
		 
		DefaultListModel<String> model = (DefaultListModel<String>) listnoticiasult.getModel();
		 model.removeAllElements();
		
		 for (String news : nw.llamadaEconomia()) {
			model.addElement(news);
		}
	}
}
