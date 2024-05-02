package Paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;


public class inicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsuario;
	private JButton btningresar;
	private JButton btnregistrar;
	private JPasswordField passwordField;

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
		btningresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Usuario administrador = new Usuario("isav","0822","administrador");
				Usuario.usuariosRegistrados.add(administrador);
				
				String correo = textUsuario.getText();
				char[] contraseñaTemporal = passwordField.getPassword();
				String contraseña = new String(contraseñaTemporal);
				boolean encontrado = false;
		        int intentos = 0;
		        
		        while(!encontrado && intentos<3){
		        	if(Usuario.usuariosRegistrados.size() == 1 && !correo.equals("isav")) {
						JOptionPane.showMessageDialog(null,"Por el momento no hay usuarios registrados");
						break;
					}
		        	
		            for(int i = 0; i < Usuario.usuariosRegistrados.size();i++){
		                Usuario usuario = Usuario.usuariosRegistrados.get(i);

		                if(usuario.correoElectronico.equals(correo)){
		                    encontrado = true;

		                    if (usuario.contraseña.equals(contraseña) && usuario.rol == "cliente"){
		                    	dispose();
		                    	menuCliente s = new menuCliente();
		                    	s.setVisible(true);		
		                    	break;
		                    }
		                    else if(usuario.contraseña.equals(contraseña) && usuario.rol == "administrador") {
		                    	dispose();
		                    	menuAdministrador s = new menuAdministrador();
		                    	s.setVisible(true);		
		                    	break;
		                    }
		                    else{
		                        encontrado = false;
		                    }
		                    break;
		                }
		                
		                if(!encontrado && intentos==3){
		                    System.exit(1);
		                }
		            }
		            if(!encontrado){
		                JOptionPane.showMessageDialog(null, "Usuario Incorrecto");
		                break;
		            }
		            intentos++;
		        }
			}
		});
		btningresar.setBounds(124, 212, 110, 30);
		contentPane.add(btningresar);
		
		
		btnregistrar = new JButton("Registrar Usuario");
		btnregistrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnregistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				registrarUsuario r = new registrarUsuario();
				r.setVisible(true);
			}
		});
		
		btnregistrar.setBounds(280, 212, 146, 30);
		contentPane.add(btnregistrar);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(120, 154, 135, 30);
		contentPane.add(passwordField);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();		
			}
		});
		btnSalir.setBounds(10, 212, 74, 30);
		contentPane.add(btnSalir);
	}
}
