import java.util.*;

public class proyectoFinal {
    static Scanner leerDatoTeclado = new Scanner(System.in);

    public static final byte TIPO_DOCUMENTO_IDENTIFICACION = 0;
    public static final byte DOCUMENTO_IDENTIFICACION = 1;
    public static final byte NOMBRES = 2;
    public static final byte APELLIDOS = 3;
    public static final byte CORREO_ELECTRONICO = 4;
    public static final byte DIRECCION_RESIDENCIA = 5;
    public static final byte CIUDAD_RESIDENCIA = 6;
    public static final byte TELEFONO = 7;
    public static final byte CONTRASEÑA = 8;
    public static final byte CONFIRMAR_CONTRASEÑA = 9;
    
    public static List < String [] > usuarios = new ArrayList < >() ;

    public static void registrarUsuario(String tipoIdentificacion, String documentoIdentificacion, String nombres, String apellidos, 
    String correoElectronico, String direccionResidencia, String ciudadResidencia, String telefono, String contraseña, String confirmarContraseña){

        String[] usuario = new String[10];

        usuario[TIPO_DOCUMENTO_IDENTIFICACION] = tipoIdentificacion;
        usuario[DOCUMENTO_IDENTIFICACION] = documentoIdentificacion;
        usuario[NOMBRES] = nombres;
        usuario[APELLIDOS] = apellidos;
        usuario[CORREO_ELECTRONICO] = correoElectronico;
        usuario[DIRECCION_RESIDENCIA] = direccionResidencia;
        usuario[CIUDAD_RESIDENCIA] = ciudadResidencia;
        usuario[TELEFONO] = telefono;
        usuario[CONTRASEÑA] = contraseña;
        usuario[CONFIRMAR_CONTRASEÑA] = confirmarContraseña;

        usuarios.add(usuario);
    }

    public static void solicitarDatosDeRegistro(){
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
            contraseña = leerDatoTeclado.next();
            System.out.println("Confirmar contraseña: ");
            confirmarContraseña = leerDatoTeclado.next();
        }

        registrarUsuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos, correoElectronico, direccionResidencia, 
        ciudadResidencia, telefono, contraseña, confirmarContraseña);
    }

    public static void iniciarSesion(List <String[]> usuarios) {

        boolean encontrado = false;
        int intentos = 0;

        while(!encontrado && intentos<3){
            System.out.print("correo electrónico: ");
            String correo = leerDatoTeclado.next();

            if(usuarios.size() == 0){
                System.out.println("\nPor el momento no hay usuarios registrados.");
                break;
            }

            for(int i = 0; i<usuarios.size();i++){
                String[] usuario = usuarios.get(i);

                if(usuario[CORREO_ELECTRONICO].equals(correo)){
                    encontrado = true;
                    System.out.print("contraseña: ");
                    String contraseña = leerDatoTeclado.next();

                    if (usuario[CONTRASEÑA].equals(contraseña)){
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
                System.out.println("Usuario incorrecto, intente una vez más.\n");
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
                solicitarDatosDeRegistro();
                break;
            
            case 2:
                iniciarSesion(usuarios);
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
