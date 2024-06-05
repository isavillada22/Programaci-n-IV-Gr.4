package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Habitacion {
	public static List<Habitacion> habitaciones = new ArrayList<>();

	public String numeroHabitacion;
	public String tipo;
	public String capacidad;
	public String precio;
	public String comodidades;
	public String estado;
	public String fechaEntrada;
	public String fechaSalida;

	public Habitacion() {
	}

	public Habitacion(String numeroHabitacion, String tipo, String capacidad, String precio, String comodidades, String estado, String fechaEntrada, String fechaSalida){
		this.numeroHabitacion = numeroHabitacion;
		this.tipo = tipo;
		this.capacidad = capacidad;
		this.precio = precio;
		this.comodidades = comodidades;
		this.estado = estado;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
	}

	public static List<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public static void setHabitaciones(List<Habitacion> habitaciones) {
		Habitacion.habitaciones = habitaciones;
	}

	public String getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(String numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(String capacidad) {
		this.capacidad = capacidad;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getComodidades() {
		return comodidades;
	}

	public void setComodidades(String comodidades) {
		this.comodidades = comodidades;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFechaEntrada() {
		return fechaEntrada;
	}

	public void setFechaEntrada(String fechaEntrada) {
		this.fechaEntrada = fechaEntrada;
	}

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public static void leerArchivo(List<Habitacion> lista) {
		try {
			FileReader archivo = new FileReader("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\InformacionHabitaciones.txt");
			BufferedReader lector = new BufferedReader(archivo);
			String linea;

			while((linea = lector.readLine()) != null) {
				String[] habitacion = linea.split("\t");
				if (habitacion.length == 8) {
					String numeroHabitacion = habitacion[0];
					String tipo = habitacion[1];
					String capacidad = habitacion[2];
					String precio = habitacion[3];
					String comodidades = habitacion[4];
					String estado = habitacion[5];
					String fechaEntrada = habitacion[6];
					String fechaSalida = habitacion[7];
					lista.add(new Habitacion(numeroHabitacion, tipo, capacidad, precio, comodidades, estado, fechaEntrada, fechaSalida));
				} else {
					System.out.println("Error: línea no contiene 8 campos: " + linea);
				}
			}
			lector.close();
		}catch(Exception e){
			System.out.print("Error: " + e.getMessage());
		}
	}

	public static void escribirArchivo(List<Habitacion> lista) {
		try {
			FileWriter archivo = new FileWriter("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\InformacionHabitaciones.txt");
			BufferedWriter escritor = new BufferedWriter(archivo);
			for(Habitacion ha:habitaciones) {
				escritor.write(ha.numeroHabitacion + "\t" + ha.tipo + "\t" + ha.capacidad + "\t" + 
						ha.precio + "\t" + ha.comodidades + "\t" + ha.estado + "\t" + ha.fechaEntrada + "\t" + ha.fechaSalida);
				escritor.newLine();
			}
			escritor.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}

	public static void agregarHabitacion(Habitacion ha){
		String rutaArchivo = "C:\\\\Users\\\\isavi\\\\OneDrive\\\\Documentos\\\\UTP Cuarto Semestre\\\\Programación IV\\\\Proyecto Final\\\\Proyecto Final\\\\Login\\\\src\\\\modelo\\\\InformacionHabitaciones.txt";
		try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))){
			String lineaActual;
			String ultimaLinea = "";

			while ((lineaActual = lector.readLine()) != null) {
				ultimaLinea = lineaActual;
			}
			String[] habitacion = ultimaLinea.split("\t");
			int ultimaHabitacion = Integer.parseInt(habitacion[0]);
			ha.numeroHabitacion = String.valueOf(ultimaHabitacion+1);
			lector.close();
		} catch (Exception e) {
			System.out.print("Error: "+e.getMessage());
		}
		habitaciones.add(ha);
		escribirArchivo(habitaciones);
	}
	
	public static void eliminarHabitacion(List<Habitacion> lista, int i) {
		habitaciones.remove(i-1);
		for (i = i - 1 ; i < habitaciones.size(); i++) {
			Habitacion ha = habitaciones.get(i);
			ha.numeroHabitacion = String.valueOf(i+1);
		}
		escribirArchivo(habitaciones);
	}
}
