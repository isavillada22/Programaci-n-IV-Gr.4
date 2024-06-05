package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;

public class buscarHabitacionesDisponibles extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textEntrada;
	public JTextField textSalida;
	public JTextField textNumeroHuespedes;
	public JTextField textTipo;
	public JButton btnBuscar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					buscarHabitacionesDisponibles frame = new buscarHabitacionesDisponibles();
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
	public buscarHabitacionesDisponibles() {
		setBackground(new Color(255, 255, 255));
		setTitle("Buscar Habitaciones Disponibles");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 489);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BUSCAR HABITACIONES DISPONIBLES");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(38, 10, 376, 34);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de entrada: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(38, 91, 125, 26);
		contentPane.add(lblNewLabel_1);
		
		textEntrada = new JTextField();
		textEntrada.setBounds(219, 90, 153, 34);
		contentPane.add(textEntrada);
		textEntrada.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de salida: ");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(38, 167, 125, 26);
		contentPane.add(lblNewLabel_1_1);
		
		textSalida = new JTextField();
		textSalida.setColumns(10);
		textSalida.setBounds(219, 166, 153, 34);
		contentPane.add(textSalida);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Número de huéspedes:");
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1.setBounds(38, 254, 153, 26);
		contentPane.add(lblNewLabel_1_1_1);
		
		textNumeroHuespedes = new JTextField();
		textNumeroHuespedes.setColumns(10);
		textNumeroHuespedes.setBounds(219, 246, 153, 34);
		contentPane.add(textNumeroHuespedes);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("Tipo (sencilla/múltiple):");
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1.setBounds(38, 326, 153, 26);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBounds(219, 325, 153, 34);
		contentPane.add(textTipo);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresar las fechas en el siguiente formato (DD/MM/AAAA)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(48, 45, 374, 36);
		contentPane.add(lblNewLabel_2);
		
		btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnBuscar.setBounds(159, 386, 104, 34);
		contentPane.add(btnBuscar);
	}
}
