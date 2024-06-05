package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

public class verificarDisponibilidad extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textEntrada;
	public JTextField textSalida;
	public JButton btnVerificar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					verificarDisponibilidad frame = new verificarDisponibilidad();
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
	public verificarDisponibilidad() {
		setTitle("Verificar Disponibilidad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Verificar Disponibilidad");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(55, 25, 334, 37);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Fecha de entrada:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(52, 134, 125, 26);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Fecha de Salida:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(52, 214, 125, 26);
		contentPane.add(lblNewLabel_1_1);
		
		textEntrada = new JTextField();
		textEntrada.setColumns(10);
		textEntrada.setBounds(236, 126, 153, 34);
		contentPane.add(textEntrada);
		
		textSalida = new JTextField();
		textSalida.setColumns(10);
		textSalida.setBounds(236, 206, 153, 34);
		contentPane.add(textSalida);
		
		JLabel lblNewLabel_2 = new JLabel("Ingresar las fechas en el siguiente formato (DD/MM/AAAA)");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(55, 65, 374, 36);
		contentPane.add(lblNewLabel_2);
		
		btnVerificar = new JButton("Verificar");
		btnVerificar.setBounds(178, 280, 85, 33);
		contentPane.add(btnVerificar);
	}

}
