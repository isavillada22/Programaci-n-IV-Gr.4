package vista;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class realizarReserva extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textEntrada;
	public JTextField textSalida;
	public JTextField textNumeroHuespedes;
	public JButton btnReservar;
	public JTextField textNombre;
	public JLabel Titulo;
	private JLabel lblNumeroHabitacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					realizarReserva frame = new realizarReserva();
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
	public realizarReserva() {
		setBackground(new Color(255, 255, 255));
		setTitle("Realizar una Reserva");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 553);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Titulo = new JLabel("RESERVA HABITACION");
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		Titulo.setBounds(38, 10, 376, 34);
		contentPane.add(Titulo);
		
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
		
		JLabel lblNewLabel_2 = new JLabel("Ingresar las fechas en el siguiente formato (DD/MM/AAAA)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(48, 45, 374, 36);
		contentPane.add(lblNewLabel_2);
		
		btnReservar = new JButton("Reservar");
		btnReservar.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReservar.setBounds(160, 395, 104, 34);
		contentPane.add(btnReservar);
		
		JLabel lblNewLabel_1_1_1_1_1 = new JLabel("Nombre: ");
		lblNewLabel_1_1_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1_1_1_1.setBounds(38, 329, 153, 26);
		contentPane.add(lblNewLabel_1_1_1_1_1);
		
		textNombre = new JTextField();
		textNombre.setColumns(10);
		textNombre.setBounds(219, 328, 153, 34);
		contentPane.add(textNombre);
		
		lblNumeroHabitacion = new JLabel("");
		lblNumeroHabitacion.setHorizontalAlignment(SwingConstants.CENTER);
		lblNumeroHabitacion.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNumeroHabitacion.setBounds(344, 10, 92, 34);
		contentPane.add(lblNumeroHabitacion);
	}
}
