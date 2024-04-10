
import java.util.*;
package Paquete;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;

public class Usuario {
	
	static Scanner leerDatoTeclado = new Scanner(System.in);

    public static List<Usuario> usuariosRegistrados = new ArrayList<>();

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
	

	
	public static void registrarUsuario() {
        String tipoIdentificacion, documentoIdentificacion, nombres, apellidos, correoElectronico,
        direccionResidencia, ciudadResidencia, telefono, contraseña, confirmarContraseña;
		
		System.out.println("----------------------------------------------");
        System.out.println("Formulario de registro");
        System.out.println("Para completar el registro, por favor facilitar la siguiente información:");
        System.out.println("----------------------------------------------");
        System.out.println("Tipo de identificación: ");
        tipoIdentificacion = leerDatoTeclado.nextLine();
        System.out.println("Documento de identificación: ");
        documentoIdentificacion = leerDatoTeclado.nextLine();
        System.out.println("Nombres: ");
        nombres = leerDatoTeclado.nextLine();
        System.out.println("Apellidos: ");
        apellidos = leerDatoTeclado.nextLine();
        System.out.println("Correo electrónico: ");
        correoElectronico = leerDatoTeclado.nextLine();
        System.out.println("Dirección de residencia: ");
        direccionResidencia = leerDatoTeclado.nextLine();
        System.out.println("Ciudad de residencia: ");
        ciudadResidencia = leerDatoTeclado.nextLine();
        System.out.println("Teléfono de contacto: ");
        telefono = leerDatoTeclado.nextLine();
        System.out.println("Contraseña: ");
        contraseña = leerDatoTeclado.nextLine();
        System.out.println("Confirmar contraseña: ");
        confirmarContraseña = leerDatoTeclado.nextLine();

        while (!confirmarContraseña.equals(contraseña)){
            System.out.println("La contraseña es diferente... Vuelva a ingresar la contraseña");
            System.out.println("Contraseña: ");
            contraseña = leerDatoTeclado.nextLine();
            System.out.println("Confirmar contraseña: ");
            confirmarContraseña = leerDatoTeclado.nextLine();
        }

        Usuario usuario = new Usuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos, correoElectronico, 
        direccionResidencia, ciudadResidencia, telefono, contraseña);

        usuariosRegistrados.add(usuario);
        System.out.println(usuario.apellidos);
	}

    public static void iniciarSesion(List <Usuario> usuariosRegistrados) {

        boolean encontrado = false;
        int intentos = 0;

        while(!encontrado && intentos<3){
            System.out.print("correo electrónico: ");
            String correo = leerDatoTeclado.nextLine();

            if(usuariosRegistrados.size() == 0){
                System.out.println("\nPor el momento no hay usuarios registrados.");
                break;
            }

            for(int i = 0; i<usuariosRegistrados.size();i++){
                Usuario usuario = usuariosRegistrados.get(i);

                if(usuario.correoElectronico.equals(correo)){
                    encontrado = true;
                    System.out.print("contraseña: ");
                    String contraseña = leerDatoTeclado.nextLine();

                    if (usuario.contraseña.equals(contraseña)){
                        System.out.println("Usuario logueado correctamente.");
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
                System.out.println("Usuario incorrecto.\n");
            }
            intentos++;
        }
    }

    public static void mostrarMenuLoginRegistro(){
        System.out.println("\n\nBienvenidos a MyHotel...");
        System.out.println("Más que un lugar para descansar.");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Ingrese la opción deseada");
        System.out.println("1. Registrarse como cliente.");
        System.out.println("2. Iniciar Sesión.");
        System.out.println("3. Salir");

        int opcion = leerDatoTeclado.nextInt();
        leerDatoTeclado.nextLine();

        switch(opcion){
            case 1:
                registrarUsuario();
                break;
            
            case 2:
                iniciarSesion(usuariosRegistrados);
                break;

            case 3:
                System.out.println("¡Hasta pronto!");
                return;

            default:
                System.out.println("Opcion no válida.");
        }
        mostrarMenuLoginRegistro();
    }

public class inicioSesion extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textUsuario;
	private JButton btningresar;
	private JButton btnregistrar;
	private JTextField textContraseña;

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
		contentPane.setBackground(new Color(255, 128, 192));
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
                boolean encontrado = false;
                int intentos = 0;

                while(!encontrado && intentos<3){
                    String correo = textUsuario.getText();

                    if(usuariosRegistrados.size() == 0){
                        System.out.println("\nPor el momento no hay usuarios registrados.");
                        break;
                    }

                    for(int i = 0; i<usuariosRegistrados.size();i++){
                        Usuario usuario = usuariosRegistrados.get(i);

                        if(usuario.correoElectronico.equals(correo)){
                            encontrado = true;
                            System.out.print("contraseña: ");
                            String contraseña = leerDatoTeclado.nextLine();

                            if (usuario.contraseña.equals(contraseña)){
                                System.out.println("Usuario logueado correctamente.");
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
                        System.out.println("Usuario incorrecto.\n");
                    }
                    intentos++;
                }
			}
		});
		btningresar.setBounds(124, 212, 110, 30);
		contentPane.add(btningresar);
		
		btnregistrar = new JButton("Registrar Usuario");
		btnregistrar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnregistrar.setBounds(305, 212, 121, 30);
		contentPane.add(btnregistrar);
		
		textContraseña = new JTextField();
		textContraseña.setColumns(10);
		textContraseña.setBounds(120, 148, 135, 30);
		contentPane.add(textContraseña);
	}
}
    }
}
