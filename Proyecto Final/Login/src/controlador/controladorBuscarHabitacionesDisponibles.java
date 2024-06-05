package controlador;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import vista.buscarHabitacionesDisponibles;

public class controladorBuscarHabitacionesDisponibles {
	private buscarHabitacionesDisponibles vista;

	public controladorBuscarHabitacionesDisponibles(buscarHabitacionesDisponibles vista) {
		this.vista = vista;
		initController();
	}

	private void initController() {
		vista.btnBuscar.addActionListener(e -> buscarHabitacion());
	}

	private void buscarHabitacion() {
		String entradaTemporal = vista.textEntrada.getText();
		String salidaTemporal = vista.textSalida.getText();
		String tipoTemporal = vista.textTipo.getText();

		List<String> disponibles = new ArrayList<>();
		try {
			FileReader archivo = new FileReader("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\InformacionHabitaciones.txt");
			BufferedReader lector = new BufferedReader(archivo);
			String linea;

			while((linea = lector.readLine()) != null) {
				String[] habitacion = linea.split("\t");
				if (habitacion.length == 8) {
					String numeroHabitación = habitacion[0];
					String estado = habitacion[5];
					String entrada = habitacion[6];
					String salida = habitacion[7];
					String tipo = habitacion[1];

					if(estado.equals("SI") && tipoTemporal.equals(tipo)) {
						disponibles.add(numeroHabitación);
					}
					else if(estado.equals("NO") && entradaTemporal.equals(" ")) {
						JOptionPane.showMessageDialog(null, "La habitación no está disponible para su reserva");
						vista.dispose();
					}
					else if (tipoTemporal.equals(tipo)){
						System.out.println(numeroHabitación);
						DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

						LocalDate fechaEntrada = LocalDate.parse(entrada, formatter);
						LocalDate fechaSalida = LocalDate.parse(salida, formatter);
						LocalDate fechaEntradaTemporal = LocalDate.parse(entradaTemporal, formatter);
						LocalDate fechaSalidaTemporal = LocalDate.parse(salidaTemporal, formatter);

						if(fechaEntradaTemporal.isEqual(fechaEntrada) || (fechaEntradaTemporal.isAfter(fechaEntrada) &&
								fechaEntradaTemporal.isBefore(fechaSalida)) || (fechaSalidaTemporal.isAfter(fechaEntrada) &&
										fechaSalidaTemporal.isBefore(fechaSalida)) || (fechaSalidaTemporal.isEqual(fechaSalida))){
						}
						else {
							disponibles.add(numeroHabitación);
						}
					}
					else {
					}
				}
			}
			lector.close();
		}catch(Exception e){
			System.out.print("Error: " + e.getMessage());
		}

		try {
			FileWriter archivo = new FileWriter("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\HabitacionesDisponibles.txt");
			BufferedWriter escritor = new BufferedWriter(archivo);
			for(int i = 0; i < disponibles.size();i++) {
				escritor.write(disponibles.get(i));
				escritor.newLine();
			}
			escritor.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}

		vista.dispose();
		vista.habitacionesDisponibles s = new vista.habitacionesDisponibles();
		new controladorHabitacionesDisponibles(s);
		s.setVisible(true);
	}
}
