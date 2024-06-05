package controlador;

import javax.swing.JOptionPane;

import modelo.Habitacion;
import vista.menuAdministrador;

public class controladorMenuAdministrador {
		private menuAdministrador vista;
	    
		public controladorMenuAdministrador(menuAdministrador vista) {
	        this.vista = vista;
	        initController();
	    }
	
	    private void initController() {
	        vista.btnverificar.addActionListener(e -> verificarDisponibilidad());
	        vista.btnagregar.addActionListener(e -> agregarHabitacion());
	        vista.btneditar.addActionListener(e -> editarHabitacion());
	        vista.btneliminar.addActionListener(e -> eliminarHabitacion());
	        vista.btnSalir.addActionListener(e -> salir());
	    }
	    
	    private void verificarDisponibilidad() {
	    	vista.dispose();
			vista.verificarDisponibilidad s = new vista.verificarDisponibilidad();
			new controladorVerificar(s);
        	s.setVisible(true);	
	    }
	    
	    private void agregarHabitacion() {
	    	vista.dispose();
	    	vista.agregarHabitación s = new vista.agregarHabitación();
	    	new controladorAgregarHabitacion(s);
        	s.setVisible(true);		    	
	    }
	    
	    private void editarHabitacion() {
	    	vista.dispose();
			vista.verDetallesHabitacion s = new vista.verDetallesHabitacion();
			new controladorEditarHabitacion (s);
        	s.setVisible(true);
	    }
	    
	    private void eliminarHabitacion() {
	    	vista.dispose();
	    	String numeroHabitacion = JOptionPane.showInputDialog("Ingrese la habitación que desea eliminar: ");
	    	int i = Integer.parseInt(numeroHabitacion);
	    	Habitacion ha = Habitacion.habitaciones.get(i-1);
	    	if(ha.estado.equals("NO") && ha.fechaEntrada.equals(" ")) {
	    		Habitacion.eliminarHabitacion(Habitacion.habitaciones, i);
	    		JOptionPane.showMessageDialog(null, "La habitación ha sido eliminada con éxito");
	    		vista.dispose();
	            vista.menuAdministrador s = new vista.menuAdministrador();
	            new controladorMenuAdministrador(s);
	            s.setVisible(true);
	    	}
	    	else {
	    		JOptionPane.showMessageDialog(null, "Esta habitación no se puede eliminar");
	    		vista.dispose();
	            vista.menuAdministrador s = new vista.menuAdministrador();
	            new controladorMenuAdministrador(s);
	            s.setVisible(true);
	    	}
	    }
	    
	    private void salir() {
	    	vista.dispose();
	    	vista.inicioSesion s = new vista.inicioSesion();
	        new controladorInicioSesion(s);
	        s.setVisible(true);
	    }
}
