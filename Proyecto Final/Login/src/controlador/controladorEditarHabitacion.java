package controlador;
import vista.verDetallesHabitacion;

public class controladorEditarHabitacion {
	private verDetallesHabitacion vista;
	
	public controladorEditarHabitacion(verDetallesHabitacion vista) {
		this.vista = vista;
		initController();
	}

	private void initController() {
		vista.btnHabitacion1.addActionListener(e -> editar(1));
		vista.btnHabitacion2.addActionListener(e -> editar(2));
		vista.btnHabitacion3.addActionListener(e -> editar(3));
		vista.btnHabitacion4.addActionListener(e -> editar(4));
		vista.btnHabitacion5.addActionListener(e -> editar(5));
		vista.btnHabitacion6.addActionListener(e -> editar(6));
		vista.btnHabitacion7.addActionListener(e -> editar(7));
		vista.btnHabitacion8.addActionListener(e -> editar(8));
		vista.btnHabitacion9.addActionListener(e -> editar(9));
		vista.btnHabitacion10.addActionListener(e -> editar(10));
		vista.btnHabitacion11.addActionListener(e -> editar(11));
		vista.btnHabitacion12.addActionListener(e -> editar(12));
		vista.btnHabitacion13.addActionListener(e -> editar(13));
		vista.btnHabitacion14.addActionListener(e -> editar(14));
		vista.btnHabitacion15.addActionListener(e -> editar(15));
		vista.btnHabitacion16.addActionListener(e -> editar(16));
	}
	
	private void editar(int i) {
		vista.editarHabitación s = new vista.editarHabitación();
		new controladorEditarFinal(s,i);
        s.Titulo.setText("Habitacion # " + i);
        s.setTitle("Editar Habitación # " + i);
        s.setVisible(true);
	}

}
