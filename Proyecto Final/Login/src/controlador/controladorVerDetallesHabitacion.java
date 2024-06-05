package controlador;
import modelo.Habitacion;
import vista.verDetallesHabitacion;

public class controladorVerDetallesHabitacion {
	private verDetallesHabitacion vista;

	public controladorVerDetallesHabitacion(verDetallesHabitacion vista) {
		this.vista = vista;
		initController();
	}

	private void initController() {
		vista.btnHabitacion1.addActionListener(e -> detalles(1));
		vista.btnHabitacion2.addActionListener(e -> detalles(2));
		vista.btnHabitacion3.addActionListener(e -> detalles(3));
		vista.btnHabitacion4.addActionListener(e -> detalles(4));
		vista.btnHabitacion5.addActionListener(e -> detalles(5));
		vista.btnHabitacion6.addActionListener(e -> detalles(6));
		vista.btnHabitacion7.addActionListener(e -> detalles(7));
		vista.btnHabitacion8.addActionListener(e -> detalles(8));
		vista.btnHabitacion9.addActionListener(e -> detalles(9));
		vista.btnHabitacion10.addActionListener(e -> detalles(10));
		vista.btnHabitacion11.addActionListener(e -> detalles(11));
		vista.btnHabitacion12.addActionListener(e -> detalles(12));
		vista.btnHabitacion13.addActionListener(e -> detalles(13));
		vista.btnHabitacion14.addActionListener(e -> detalles(14));
		vista.btnHabitacion15.addActionListener(e -> detalles(15));
		vista.btnHabitacion16.addActionListener(e -> detalles(16));
		vista.btnSalir.addActionListener(e -> salir());
	}
	
	private void detalles(int i) {
		Habitacion ha = Habitacion.habitaciones.get(i-1);
        vista.detallesHabitacion s = new vista.detallesHabitacion();
        s.Titulo.setText("Habitacion # " + i);
        s.setTitle("Información Habitación # " + i);
        s.Tipo.setText("Tipo: " + ha.tipo);
        s.Capacidad.setText("Capacidad: " + ha.capacidad);
        s.Precio.setText("Precio: " + ha.precio);
        s.Comodidades.setText("Comodidades: " + ha.comodidades);
        s.setVisible(true);
	}
	
	private void salir() {
		vista.dispose();
		System.out.print("Hola");
        vista.menuCliente s = new vista.menuCliente();
        new controladorMenuCliente(s);
        s.setVisible(true);
	}
}
