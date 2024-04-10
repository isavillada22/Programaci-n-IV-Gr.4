
import java.util.*;

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
    public static void main(String[] args){
        mostrarMenuLoginRegistro();
    }
}
