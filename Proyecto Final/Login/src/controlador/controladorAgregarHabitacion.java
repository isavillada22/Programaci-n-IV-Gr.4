package controlador;
import vista.agregarHabitación;

import javax.swing.JOptionPane;

import modelo.Habitacion;

public class controladorAgregarHabitacion {
	private agregarHabitación vista;
	
	public controladorAgregarHabitacion(agregarHabitación vista) {
        this.vista = vista;
        initController();
    }
	
	private void initController() {
        vista.btnAgregar.addActionListener(e -> agregarHabitacion());
    }
	
	private void agregarHabitacion() {
		String numeroHabitacion = "0";
		String tipo = vista.textTipo.getText();
		String capacidad = vista.textCapacidad.getText();
		String precio = vista.textPrecio.getText();
		String comodidades = vista.textComodidades.getText();
		String estado = "SI";
		String fechaEntrada = " ";
		String fechaSalida = " ";
		
		Habitacion ha = new Habitacion(numeroHabitacion, tipo, capacidad, precio, comodidades, estado, fechaEntrada, fechaSalida);
		Habitacion.agregarHabitacion(ha);
		JOptionPane.showMessageDialog(null, "Habitación agregada");
		vista.dispose();
        vista.menuAdministrador s = new vista.menuAdministrador();
        new controladorMenuAdministrador(s);
        s.setVisible(true);
	}
}
