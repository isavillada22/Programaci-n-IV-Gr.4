package login;

import java.awt.EventQueue;

import controlador.controladorInicioSesion;
import modelo.Usuario;
import vista.inicioSesion;

public class Login {
	 public static void main(String[] args) {
	        EventQueue.invokeLater(() -> {
	            inicioSesion vista = new inicioSesion();
	            Usuario modelo = new Usuario(null, null, null); 
	            controladorInicioSesion controlador = new controladorInicioSesion(vista);
	            vista.setVisible(true);
	        });
	    }
}
