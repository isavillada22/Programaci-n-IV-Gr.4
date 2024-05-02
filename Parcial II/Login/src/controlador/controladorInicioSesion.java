package controlador;

import javax.swing.JOptionPane;

import modelo.Usuario;
import vista.inicioSesion;

public class controladorInicioSesion {
	private inicioSesion vista;
    
	public controladorInicioSesion(inicioSesion vista) {
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.btningresar.addActionListener(e -> verificarUsuario());
        vista.btnregistrar.addActionListener(e -> registrarUsuario());
        vista.btnSalir.addActionListener(e -> salir());
    }
    
    private void verificarUsuario() {
    	Usuario administrador = new Usuario("isav","0822","administrador");
		Usuario.usuariosRegistrados.add(administrador);
		
		String correo = vista.textUsuario.getText();
		char[] contraseñaTemporal = vista.passwordField.getPassword();
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

                    if (usuario.contraseña.equals(contraseña) && usuario.rol.equals("cliente")){
                    	vista.dispose();
                    	vista.menuCliente s = new vista.menuCliente();
                    	new controladorMenuCliente(s);
                    	s.setVisible(true);		
                    	break;
                    }
                    else if(usuario.contraseña.equals(contraseña) && usuario.rol.equals("administrador")) {
                    	vista.dispose();
                    	vista.menuAdministrador s = new vista.menuAdministrador();
                    	new controladorMenuAdministrador(s);
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
    
    private void registrarUsuario() {
    	vista.dispose();
        vista.registrarUsuario s = new vista.registrarUsuario();
        new controladorRegistroUsuario(s);
        s.setVisible(true);
    }
    
    private void salir() {
    	vista.dispose();
    }
}
