package controlador;

import vista.infoReservas;

public class controladorHistorialReservas {
	private infoReservas vista;

	public controladorHistorialReservas(infoReservas vista) {
		this.vista = vista;
		initController();
	}
	private void initController() {
		vista.btnSalir.addActionListener(e -> Salir());
	}

	private void Salir() {
		vista.dispose();
		System.exit(0);
	}
}
