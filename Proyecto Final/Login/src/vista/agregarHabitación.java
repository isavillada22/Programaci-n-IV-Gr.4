package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class agregarHabitación extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textTipo;
	public JTextField textCapacidad;
	public JTextField textPrecio;
	public JTextField textComodidades;
	public JButton btnAgregar;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					agregarHabitación frame = new agregarHabitación();
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
	public agregarHabitación() {
		setTitle("Agregar Habitación");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 521);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Agregar Habitación");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(127, 32, 193, 42);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(53, 110, 125, 26);
		contentPane.add(lblNewLabel_1);
		
		textTipo = new JTextField();
		textTipo.setColumns(10);
		textTipo.setBounds(231, 102, 153, 34);
		contentPane.add(textTipo);
		
		JLabel lblNewLabel_1_1 = new JLabel("Capacidad:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(53, 190, 125, 26);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Precio: ");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(53, 275, 125, 26);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Comodidades: ");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(53, 367, 125, 26);
		contentPane.add(lblNewLabel_1_3);
		
		textCapacidad = new JTextField();
		textCapacidad.setColumns(10);
		textCapacidad.setBounds(231, 182, 153, 34);
		contentPane.add(textCapacidad);
		
		textPrecio = new JTextField();
		textPrecio.setColumns(10);
		textPrecio.setBounds(231, 267, 153, 34);
		contentPane.add(textPrecio);
		
		textComodidades = new JTextField();
		textComodidades.setColumns(10);
		textComodidades.setBounds(231, 359, 153, 34);
		contentPane.add(textComodidades);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.setBounds(187, 440, 88, 34);
		contentPane.add(btnAgregar);
	}
}
