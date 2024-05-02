package controlador;

import javax.swing.JOptionPane;

import modelo.Usuario;
import vista.registrarUsuario;

public class controladorRegistroUsuario {
	private registrarUsuario vista;
	
	public controladorRegistroUsuario(registrarUsuario vista) {
        this.vista = vista;
        initController();
    }

    private void initController() {
        vista.btnregistrar.addActionListener(e -> registrar());
    }
    
    private void registrar() {
    	String tipoIdentificacion = vista.textTipoDocumento.getText();
		String documentoIdentificacion = vista.textDocumento.getText();
		String nombres = vista.textNombres.getText();
		String apellidos = vista.textApellidos.getText();
		String correoElectronico = vista.textCorreo.getText();
		String direccionResidencia = vista.textDireccion.getText();
		String ciudadResidencia = vista.textCiudad.getText();
		String telefono = vista.textTelefono.getText();
		char[] contraseñaTemporal = vista.passwordField.getPassword();
		String contraseña = new String(contraseñaTemporal);
		char[] confirmacionTemporal = vista.passwordFieldconfirmacion.getPassword();
		String confirmacion = new String(confirmacionTemporal);
		
		while (!confirmacion.equals(contraseña)){
            JOptionPane.showMessageDialog(null, "La contraseña no coincide con la confirmación. Por favor, inténtelo de nuevo.");
            contraseña = JOptionPane.showInputDialog(null, "Ingrese su contraseña:");
            confirmacion = JOptionPane.showInputDialog(null, "Confirme su contraseña:");
        }
		String rol = "cliente";
		Usuario usuario = new Usuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos, correoElectronico, 
		        direccionResidencia, ciudadResidencia, telefono, contraseña, rol);
		
		Usuario.usuariosRegistrados.add(usuario);
		
		JOptionPane.showMessageDialog(null, "Usuario registrado satisfactoriamente");
		vista.dispose();
        vista.inicioSesion s = new vista.inicioSesion();
        new controladorInicioSesion(s);
        s.setVisible(true);
	}
}
    