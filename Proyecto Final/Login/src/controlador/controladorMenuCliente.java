package controlador;

import javax.swing.JOptionPane;

import modelo.Reserva;
import vista.menuCliente;

public class controladorMenuCliente {
	private menuCliente vista;

	public controladorMenuCliente(menuCliente vista) {
		this.vista = vista;
		initController();
	}

	private void initController() {
		vista.btnBuscar.addActionListener(e -> buscarHabitaciones());
		vista.btnVerDetalles.addActionListener(e -> verDetalles());
		vista.btnRealizarReserva.addActionListener(e -> realizarReserva());
		vista.btnModificar.addActionListener(e -> modificarReserva());
		vista.btnCancelar.addActionListener(e -> cancelarReserva());
		vista.btnHistorial.addActionListener(e -> historialReservas());
		vista.btnSalir.addActionListener(e -> salir());
	}

	private void buscarHabitaciones() {
		vista.dispose();
		vista.buscarHabitacionesDisponibles s = new vista.buscarHabitacionesDisponibles();
		new controladorBuscarHabitacionesDisponibles(s);
		s.setVisible(true);	
	}

	private void verDetalles() {
		vista.dispose();
		vista.verDetallesHabitacion s = new vista.verDetallesHabitacion();
		new controladorVerDetallesHabitacion(s);
		s.setVisible(true);		    	
	}

	private void realizarReserva() {
		vista.dispose();
		vista.verDetallesHabitacion s = new vista.verDetallesHabitacion();
		new controladorRealizarReserva(s);
		s.setVisible(true);
	}

	private void modificarReserva() {
		vista.dispose();
		if(Reserva.reservas.size() == 0) {
			JOptionPane.showMessageDialog(null, "Aún no hay reservas registradas");
			vista.dispose();
			salir();
		}
		else {
			String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del propietario de la reserva:");
			vista.infoReservas s = new vista.infoReservas();
			s.Titulo.setText(nombre);
			String texto = "Número de habitación  \t Fecha de entrada  \t Fecha de Salida \t  Número de Huéspedes";
			for(int i = 0; i < Reserva.reservas.size();i++) {
				Reserva reserva = Reserva.reservas.get(i);
				if(reserva.nombre.equals(nombre)) {
					texto = (texto + "\n\n" + "\t\t\t\t" + reserva.numeroHabitacion + "\t\t\t\t\t\t\t\t" + reserva.fechaEntrada + "\t\t\t\t\t" + reserva.fechaSalida + "\t\t\t\t\t\t\t" + reserva.numeroHuespedes);
				}
				else {
				}
			}
			if (texto.length() == 82) {
				JOptionPane.showMessageDialog(null, "No se encuentran reservas a su nombre");
				salir();
			}
			else {
				texto = "<html>" + texto.replaceAll("\n", "<br>").replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;") + "</html>";
				s.Texto.setText(texto);
				s.setVisible(true);
			}
		}
	}

	private void cancelarReserva() {
		vista.dispose();
		if(Reserva.reservas.size() == 0) {
			JOptionPane.showMessageDialog(null, "Aún no hay reservas registradas");
			vista.dispose();
			salir();
		}
		else {
			String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del propietario de la reserva:");
			vista.cancelarReserva s = new vista.cancelarReserva();
			s.Titulo.setText(nombre);
			String texto = "Número de habitación  \t Fecha de entrada  \t Fecha de Salida \t  Número de Huéspedes";

			for(int i = 0; i < Reserva.reservas.size();i++) {
				Reserva reserva = Reserva.reservas.get(i);
				if(reserva.nombre.equals(nombre)) {
					texto = (texto + "\n\n" + "\t\t\t\t" + reserva.numeroHabitacion + "\t\t\t\t\t\t\t\t" + reserva.fechaEntrada + "\t\t\t\t\t" + reserva.fechaSalida + "\t\t\t\t\t\t\t" + reserva.numeroHuespedes);
				}
				else {
				}
			}
			if (texto.length() == 82) {
				JOptionPane.showMessageDialog(null, "No se encuentran reservas a su nombre");
				vista.dispose();
			}
			else {
				texto = "<html>" + texto.replaceAll("\n", "<br>").replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;") + "</html>";
				s.Texto.setText(texto);
				s.setVisible(true);
			}
		}
	}

	private void historialReservas() {
		vista.dispose();
		String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del propietario de la reserva:");
		vista.infoReservas s = new vista.infoReservas();
		new controladorHistorialReservas(s);
		s.Titulo.setText(nombre);
		s.setVisible(true);
		String texto = "Número de habitación  \t Fecha de entrada  \t Fecha de Salida \t  Número de Huéspedes \t Estado";

		for(int i = 0; i < Reserva.reservas.size();i++) {
			Reserva reserva = Reserva.reservas.get(i);
			if(reserva.nombre.equals(nombre)) {
				texto = (texto + "\n\n" + "\t\t\t\t" + reserva.numeroHabitacion + "\t\t\t\t\t\t\t\t" + reserva.fechaEntrada + "\t\t\t\t\t" + reserva.fechaSalida + "\t\t\t\t\t\t\t" + reserva.numeroHuespedes + "\t\t\t\t\t\t" + Reserva.estado(reserva));
			}
			else {
			}
		}
		texto = "<html>" + texto.replaceAll("\n", "<br>").replaceAll("\t", "&nbsp;&nbsp;&nbsp;&nbsp;") + "</html>";
		s.Texto.setText(texto);
	}

	private void salir() {
		vista.dispose();
		vista.inicioSesion s = new vista.inicioSesion();
		new controladorInicioSesion(s);
		s.setVisible(true);
	}
}
