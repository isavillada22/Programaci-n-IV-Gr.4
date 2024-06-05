package login;

import java.awt.EventQueue;
import modelo.Habitacion;
import controlador.controladorInicioSesion;
import modelo.Usuario;
import modelo.Reserva;
import vista.inicioSesion;

public class Login {
	 public static void main(String[] args) {
	        EventQueue.invokeLater(() -> {
	            inicioSesion vista = new inicioSesion();
	            Usuario.leerArchivo(Usuario.usuariosRegistrados);
	            Habitacion.leerArchivo(Habitacion.habitaciones);
	            Reserva.leerArchivo(Reserva.reservas);
	            new controladorInicioSesion(vista);
	            vista.setVisible(true);
	        });
	    }
}
