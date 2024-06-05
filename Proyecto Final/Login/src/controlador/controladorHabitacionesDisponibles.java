package controlador;

import vista.habitacionesDisponibles;

public class controladorHabitacionesDisponibles {
private habitacionesDisponibles vista;
	
	public controladorHabitacionesDisponibles(habitacionesDisponibles vista) {
        this.vista = vista;
        initController();
    }
	private void initController() {
        vista.btnSalir.addActionListener(e -> Salir());
    }
	
	private void Salir() {
		vista.dispose();
        vista.menuCliente s = new vista.menuCliente();
        new controladorMenuCliente(s);
        s.setVisible(true);
	}
}
