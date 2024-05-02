package controlador;

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
    	s.setVisible(true);	
    }
    
    private void verDetalles() {
    	vista.dispose();
    	vista.verDetallesHabitacion s = new vista.verDetallesHabitacion();
    	s.setVisible(true);		    	
    }
    
    private void realizarReserva() {
    	vista.dispose();
		vista.realizarReserva s = new vista.realizarReserva();
    	s.setVisible(true);
    }
    
    private void modificarReserva() {
    	vista.dispose();
    	vista.modificarReserva s = new vista.modificarReserva();
    	s.setVisible(true);
    }
    
    private void cancelarReserva() {
    	vista.dispose();
    	vista.cancelarReserva s = new vista.cancelarReserva();
    	s.setVisible(true);
    }
    
    private void historialReservas() {
    	vista.dispose();
    	vista.verHistorialReservas s = new vista.verHistorialReservas();
    	s.setVisible(true);
    }
    
    private void salir() {
    	vista.dispose();
    }
}
