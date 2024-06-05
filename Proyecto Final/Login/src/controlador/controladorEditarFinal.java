package controlador;
import modelo.Habitacion;
import vista.editarHabitación;

public class controladorEditarFinal {
	private editarHabitación vista;
	
	public controladorEditarFinal(editarHabitación vista, int i) {
		this.vista = vista;
		initController(i);
	}
	
	private void initController(int i) {
		vista.btnEditar.addActionListener(e -> editar(i));
	}
	
	private void editar(int i) {
		Habitacion ha = Habitacion.habitaciones.get(i-1);
		ha.precio = vista.textPrecio.getText();
		ha.estado = vista.textDispo.getText();
		ha.comodidades = vista.textComodidades.getText();
		ha.fechaEntrada = " ";
		ha.fechaSalida = " ";
		Habitacion.escribirArchivo(Habitacion.habitaciones);	
		vista.dispose();
        vista.menuAdministrador s = new vista.menuAdministrador();
        new controladorMenuAdministrador(s);
        s.setVisible(true);
	}
}
