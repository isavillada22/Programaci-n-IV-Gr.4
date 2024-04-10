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
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPasswordField;

class Usuario {

    static List<Usuario> usuariosRegistrados = new ArrayList<>();

	String tipoIdentificacion, documentoIdentificacion, nombres, apellidos, 
	correoElectronico, direccionResidencia, ciudadResidencia, telefono, contraseña, 
	confirmarContraseña;
	
	public Usuario(){
	}
	
	public Usuario(String tipoIdentificacion, String documentoIdentificacion, String nombres, 
			String apellidos, String correoElectronico, String direccionResidencia, 
			String ciudadResidencia, String telefono, String contraseña){
		
		this.tipoIdentificacion = tipoIdentificacion;
		this.documentoIdentificacion = documentoIdentificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correoElectronico = correoElectronico;
		this.direccionResidencia = direccionResidencia;
		this.ciudadResidencia = ciudadResidencia;
		this.telefono = telefono;
		this.contraseña = contraseña;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getDocumentoIdentificacion() {
		return documentoIdentificacion;
	}

	public void setDocumentoIdentificacion(String documentoIdentificacion) {
		this.documentoIdentificacion = documentoIdentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getDireccionResidencia() {
		return direccionResidencia;
	}

	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getConfirmarContraseña() {
		return confirmarContraseña;
	}

	public void setConfirmarContraseña(String confirmarContraseña) {
		this.confirmarContraseña = confirmarContraseña;
	}
}


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
				
				String correo = textUsuario.getText();
				char[] contraseñaTemporal = passwordField.getPassword();
				String contraseña = new String(contraseñaTemporal);
				boolean encontrado = false;
		        int intentos = 0;

		        while(!encontrado && intentos<3){
		        	if(Usuario.usuariosRegistrados.size() == 0) {
						JOptionPane.showMessageDialog(null,"Por el momento no hay usuarios registrados");
						break;
					}
		        	
		            for(int i = 0; i < Usuario.usuariosRegistrados.size();i++){
		                Usuario usuario = Usuario.usuariosRegistrados.get(i);

		                if(usuario.correoElectronico.equals(correo)){
		                    encontrado = true;

		                    if (usuario.contraseña.equals(contraseña)){
		                    	dispose();
		                    	Salida s = new Salida();
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
	}
}
