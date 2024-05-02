package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class registrarUsuario extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public JTextField textTipoDocumento;
	public JTextField textDocumento;
	public JTextField textNombres;
	public JTextField textApellidos;
	public JTextField textCorreo;
	public JTextField textDireccion;
	public JTextField textCiudad;
	public JTextField textTelefono;
	public JPasswordField passwordField;
	public JPasswordField passwordFieldconfirmacion;
	public JButton btnregistrar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registrarUsuario frame = new registrarUsuario();
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
	public registrarUsuario() {
		setTitle("Formulario de Registro");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 600);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("FORMULARIO DE REGISTRO");
		lblNewLabel.setBounds(86, 10, 263, 22);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Tipo de documento:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(36, 60, 128, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Documento de Identificación:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(36, 102, 190, 32);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Apellidos:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(36, 186, 128, 32);
		contentPane.add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_3 = new JLabel("Nombres:");
		lblNewLabel_1_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_3.setBounds(36, 144, 128, 32);
		contentPane.add(lblNewLabel_1_3);
		
		JLabel lblNewLabel_1_4 = new JLabel("Correo Electrónico:");
		lblNewLabel_1_4.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_4.setBounds(36, 228, 128, 32);
		contentPane.add(lblNewLabel_1_4);
		
		JLabel lblNewLabel_1_5 = new JLabel("Dirección de Residencia:");
		lblNewLabel_1_5.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_5.setBounds(36, 270, 152, 32);
		contentPane.add(lblNewLabel_1_5);
		
		JLabel lblNewLabel_1_6 = new JLabel("Ciudad de Residencia:");
		lblNewLabel_1_6.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_6.setBounds(36, 312, 152, 32);
		contentPane.add(lblNewLabel_1_6);
		
		JLabel lblNewLabel_1_7 = new JLabel("Teléfono de Contacto:");
		lblNewLabel_1_7.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_7.setBounds(36, 354, 152, 32);
		contentPane.add(lblNewLabel_1_7);
		
		JLabel lblNewLabel_1_8 = new JLabel("Contraseña:");
		lblNewLabel_1_8.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_8.setBounds(36, 396, 128, 32);
		contentPane.add(lblNewLabel_1_8);
		
		textTipoDocumento = new JTextField();
		textTipoDocumento.setBounds(244, 65, 166, 28);
		contentPane.add(textTipoDocumento);
		textTipoDocumento.setColumns(10);
		
		textDocumento = new JTextField();
		textDocumento.setColumns(10);
		textDocumento.setBounds(244, 106, 166, 28);
		contentPane.add(textDocumento);
		
		textNombres = new JTextField();
		textNombres.setColumns(10);
		textNombres.setBounds(244, 144, 166, 28);
		contentPane.add(textNombres);
		
		textApellidos = new JTextField();
		textApellidos.setColumns(10);
		textApellidos.setBounds(244, 186, 166, 28);
		contentPane.add(textApellidos);
		
		textCorreo = new JTextField();
		textCorreo.setColumns(10);
		textCorreo.setBounds(244, 228, 166, 28);
		contentPane.add(textCorreo);
		
		textDireccion = new JTextField();
		textDireccion.setColumns(10);
		textDireccion.setBounds(244, 270, 166, 28);
		contentPane.add(textDireccion);
		
		textCiudad = new JTextField();
		textCiudad.setColumns(10);
		textCiudad.setBounds(244, 312, 166, 28);
		contentPane.add(textCiudad);
		
		textTelefono = new JTextField();
		textTelefono.setColumns(10);
		textTelefono.setBounds(244, 354, 166, 28);
		contentPane.add(textTelefono);
		
		btnregistrar = new JButton("Registrar Usuario");
		btnregistrar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnregistrar.setBounds(130, 502, 137, 39);
		contentPane.add(btnregistrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(244, 396, 166, 28);
		contentPane.add(passwordField);
		
		JLabel lblNewLabel_1_8_1 = new JLabel("Confirmar Contraseña:");
		lblNewLabel_1_8_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_8_1.setBounds(36, 438, 152, 32);
		contentPane.add(lblNewLabel_1_8_1);
		
		passwordFieldconfirmacion = new JPasswordField();
		passwordFieldconfirmacion.setBounds(244, 443, 166, 28);
		contentPane.add(passwordFieldconfirmacion);
	}
}
