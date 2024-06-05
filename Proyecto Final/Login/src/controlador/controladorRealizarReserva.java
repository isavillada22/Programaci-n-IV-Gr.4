package controlador;
import vista.verDetallesHabitacion;

public class controladorRealizarReserva {
	private verDetallesHabitacion vista;
	
	public controladorRealizarReserva(verDetallesHabitacion vista) {
		this.vista = vista;
		initController();
	}
	
	private void initController() {
		vista.btnHabitacion1.addActionListener(e -> realizarReserva(1));
		vista.btnHabitacion2.addActionListener(e -> realizarReserva(2));
		vista.btnHabitacion3.addActionListener(e -> realizarReserva(3));
		vista.btnHabitacion4.addActionListener(e -> realizarReserva(4));
		vista.btnHabitacion5.addActionListener(e -> realizarReserva(5));
		vista.btnHabitacion6.addActionListener(e -> realizarReserva(6));
		vista.btnHabitacion7.addActionListener(e -> realizarReserva(7));
		vista.btnHabitacion8.addActionListener(e -> realizarReserva(8));
		vista.btnHabitacion9.addActionListener(e -> realizarReserva(9));
		vista.btnHabitacion10.addActionListener(e -> realizarReserva(10));
		vista.btnHabitacion11.addActionListener(e -> realizarReserva(11));
		vista.btnHabitacion12.addActionListener(e -> realizarReserva(12));
		vista.btnHabitacion13.addActionListener(e -> realizarReserva(13));
		vista.btnHabitacion14.addActionListener(e -> realizarReserva(14));
		vista.btnHabitacion15.addActionListener(e -> realizarReserva(15));
		vista.btnHabitacion16.addActionListener(e -> realizarReserva(16));
	}
	
	private void realizarReserva(int i) {
		vista.dispose();
		vista.realizarReserva s = new vista.realizarReserva();
		new controladorRealizarReserva2(s, i);
		s.setVisible(true);
	}
	
	
}
