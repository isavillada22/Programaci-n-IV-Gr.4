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
import java.awt.Color;
import javax.swing.JPasswordField;


public class inicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textUsuario;
	public JButton btningresar;
	public JButton btnregistrar;
	public JPasswordField passwordField;
	public JButton btnSalir;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					inicioSesion frame = new inicioSesion();
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
	public inicioSesion() {
		setTitle("Login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 223, 239));
		contentPane.setBorder(new EmptyBorder(50, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("LOGIN");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblNewLabel.setBounds(181, 10, 74, 45);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario: ");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(36, 93, 74, 24);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña: ");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_2.setBounds(36, 160, 116, 13);
		contentPane.add(lblNewLabel_2);
		
		textUsuario = new JTextField();
		textUsuario.setBounds(120, 87, 135, 30);
		contentPane.add(textUsuario);
		textUsuario.setColumns(10);
		
		btningresar = new JButton("Iniciar Sesion");
		btningresar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btningresar.setBounds(124, 212, 110, 30);
		contentPane.add(btningresar);
		
		
		btnregistrar = new JButton("Registrar Usuario");
		btnregistrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnregistrar.setBounds(280, 212, 146, 30);
		contentPane.add(btnregistrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 154, 135, 30);
		contentPane.add(passwordField);
		
		btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalir.setBounds(10, 212, 74, 30);
		contentPane.add(btnSalir);
	}
}
