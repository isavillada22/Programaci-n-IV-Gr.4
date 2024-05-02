package controlador;

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
        	s.setVisible(true);	
	    }
	    
	    private void agregarHabitacion() {
	    	vista.dispose();
	    	vista.agregarHabitación s = new vista.agregarHabitación();
        	s.setVisible(true);		    	
	    }
	    
	    private void editarHabitacion() {
	    	vista.dispose();
			vista.editarHabitación s = new vista.editarHabitación();
        	s.setVisible(true);
	    }
	    
	    private void eliminarHabitacion() {
	    	vista.dispose();
	    	vista.eliminarHabitacion s = new vista.eliminarHabitacion();
        	s.setVisible(true);
	    }
	    
	    private void salir() {
	    	vista.dispose();
	    }
}
