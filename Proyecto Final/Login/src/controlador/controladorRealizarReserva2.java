package controlador;
import java.io.BufferedReader;
import java.io.FileReader;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import modelo.Habitacion;
import modelo.Reserva;
import vista.realizarReserva;

public class controladorRealizarReserva2 {
	private realizarReserva vista;

	public controladorRealizarReserva2(realizarReserva vista, int i) {
		this.vista = vista;
		initController(i);
	}

	private void initController(int i) {
		vista.btnReservar.addActionListener(e -> reservar(i));
	}

	private void reservar(int i) {
		String nombre = vista.textNombre.getText();
		String entradaTemporal = vista.textEntrada.getText();
		String salidaTemporal = vista.textSalida.getText();
		String numeroHuespedes = vista.textNumeroHuespedes.getText();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaActual = LocalDate.now();
		LocalDate fechaEntradaTemporal = LocalDate.parse(entradaTemporal, formatter);
		LocalDate fechaSalidaTemporal = LocalDate.parse(salidaTemporal, formatter);
		if (fechaEntradaTemporal.isBefore(fechaActual) || fechaSalidaTemporal.isBefore(fechaEntradaTemporal)) {
			JOptionPane.showMessageDialog(null, "Fecha inválida");
			salir();
		}
		try {
			FileReader archivo = new FileReader("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\InformacionHabitaciones.txt");
			 BufferedReader lector = new BufferedReader(archivo);
			 String linea;
			while((linea = lector.readLine()) != null) {
				String[] habitacion = linea.split("\t");
				if (habitacion.length == 8) {
					String numeroHabitación = habitacion[0];
					if (Integer.parseInt(numeroHabitación) == i) {
						String tipo = habitacion[1];
						String capacidad = habitacion[2];
						int capacity = Integer.parseInt(capacidad);
						String precio = habitacion[3];
						String comodidades = habitacion[4]; 
						String estado = habitacion[5];
						String entrada = habitacion[6];
						String salida = habitacion[7];
						if (Integer.parseInt(numeroHuespedes) <= capacity) {
						}
						else {
							JOptionPane.showMessageDialog(null, "La capacidad máxima de esta habitación son " + capacity + " personas");
							salir();
							break;
						}
						if(estado.equals("SI")) {
							estado = "NO";
							entrada = entradaTemporal;
							salida = salidaTemporal;
							Habitacion cambio = new Habitacion(numeroHabitación, tipo, capacidad, precio, comodidades, estado, entrada, salida);
							Habitacion.habitaciones.set(i-1, cambio);
							Reserva.reservas.add(new Reserva(i, nombre, entradaTemporal, salidaTemporal, numeroHuespedes));
							JOptionPane.showMessageDialog(null, "Su reserva ha sido registrada con exito");
							salir();
						}
						else if(estado.equals("NO") && entradaTemporal.equals(" ")) {
		                	 JOptionPane.showMessageDialog(null, "La habitación no está disponible para su reserva");
		                	 salir();
		                 }
						else{
							LocalDate fechaEntrada = LocalDate.parse(entrada, formatter);
							LocalDate fechaSalida = LocalDate.parse(salida, formatter);

							if(fechaEntradaTemporal.isEqual(fechaEntrada) || (fechaEntradaTemporal.isAfter(fechaEntrada) &&
								fechaEntradaTemporal.isBefore(fechaSalida)) || (fechaSalidaTemporal.isAfter(fechaEntrada) &&
								fechaSalidaTemporal.isBefore(fechaSalida)) || (fechaSalidaTemporal.isEqual(fechaSalida))){
								JOptionPane.showMessageDialog(null, "La habitación no está disponible en estas fechas");
								salir();
							}
							else {
								estado = "NO";
								entrada = entradaTemporal;
								salida = salidaTemporal;
								Habitacion cambio = new Habitacion(numeroHabitación, tipo, capacidad, precio, comodidades, estado, entrada, salida);
								Habitacion.habitaciones.set(i-1, cambio);
								Reserva.reservas.add(new Reserva(i, nombre, entradaTemporal, salidaTemporal, numeroHuespedes));
								JOptionPane.showMessageDialog(null, "Su reserva ha sido registrada con exito");
								salir();
							}
						}
					}
				}
			}
			lector.close();
		}catch(Exception e){
			System.out.print("Error: " + e.getMessage());
		}
		Habitacion.escribirArchivo(Habitacion.habitaciones);
		Reserva.escribirArchivo(Reserva.reservas);
	}
	
	private void salir() {
		vista.dispose();
        vista.menuCliente s = new vista.menuCliente();
        new controladorMenuCliente(s);
        s.setVisible(true);
	}
}
