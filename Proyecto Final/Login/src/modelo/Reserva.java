package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Reserva {
	public static List<Reserva> reservas = new ArrayList<>();
	
	public int numeroHabitacion;
	public String nombre;
	public String fechaEntrada;
	public String fechaSalida;
	public String numeroHuespedes;
	
	public Reserva() {
	}
	
	public Reserva(int numeroHabitacion, String nombre, String fechaEntrada, String fechaSalida, String numeroHuespedes){
		this.numeroHabitacion = numeroHabitacion;
		this.nombre = nombre;
		this.fechaEntrada = fechaEntrada;
		this.fechaSalida = fechaSalida;
		this.numeroHuespedes = numeroHuespedes;
	}

	public int getNumeroHabitacion() {
		return numeroHabitacion;
	}

	public void setNumeroHabitacion(int numeroHabitacion) {
		this.numeroHabitacion = numeroHabitacion;
	}

	public static List<Reserva> getReservas() {
		return reservas;
	}

	public static void setReservas(List<Reserva> reservas) {
		Reserva.reservas = reservas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
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

	public String getNumeroHuespedes() {
		return numeroHuespedes;
	}

	public void setNumeroHuespedes(String numeroHuespedes) {
		this.numeroHuespedes = numeroHuespedes;
	}
	
	public static void leerArchivo(List<Reserva> lista) {
		 try {
			 FileReader archivo = new FileReader("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\Reservas.txt");
			 BufferedReader lector = new BufferedReader(archivo);
			 String linea;
			 
			 while((linea = lector.readLine()) != null) {
				 String[] reserva = linea.split("\t");
				 if (reserva.length == 5) {
                   String numeroHabitacion = reserva[0];
                   int num = Integer.parseInt(numeroHabitacion);
                   String nombre = reserva[1];
                   String fechaEntrada = reserva[2];
                   String fechaSalida = reserva[3];
                   String numeroHuespedes = reserva[4];
                   lista.add(new Reserva(num, nombre, fechaEntrada, fechaSalida, numeroHuespedes));
               } else {
                   System.out.println("Error: línea no contiene 5 campos: " + linea);
               }
			 }
			 lector.close();
		 }catch(Exception e){
			 System.out.print("Error: " + e.getMessage());
		 }
	 }
	
	public static void escribirArchivo(List<Reserva> lista) {
		try {
			FileWriter archivo = new FileWriter("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\Reservas.txt");
			BufferedWriter escritor = new BufferedWriter(archivo);
			for(Reserva re:reservas) {
				escritor.write(re.numeroHabitacion + "\t" + re.nombre + "\t" + re.fechaEntrada + "\t" + re.fechaSalida + "\t" + re.numeroHuespedes);
				escritor.newLine();
			}
			escritor.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
	
	public static void eliminarReserva(List<Reserva> lista, String nombre, int numeroHabitacion) {
		for(int i=0; i < reservas.size(); i++) {
            Reserva reserva = Reserva.reservas.get(i);
            if (reserva.nombre.equals(nombre) && (reserva.numeroHabitacion == numeroHabitacion)) {
            	reservas.remove(i);
            }
            else {
            }
		}
		Reserva.escribirArchivo(reservas);
	}
	
	public static void cancelarReserva(Reserva re){
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaEntrada = LocalDate.parse(re.fechaEntrada, formatter);
		LocalDate fechaSalida = LocalDate.parse(re.fechaSalida, formatter);
		LocalDate fechaMaxima = fechaEntrada.minus(5, ChronoUnit.DAYS);
		LocalDate fechaActual = LocalDate.now();
		LocalDate mesAntes = fechaEntrada.minusMonths(1);
		LocalDate quinceDias = fechaEntrada.minus(10, ChronoUnit.DAYS);
		long dias = ChronoUnit.DAYS.between(fechaEntrada, fechaSalida);
		
		double precio = 0;
		
		switch(re.numeroHabitacion) {
		case 1,2,3,4:
			precio = 100000*dias;
			break;
		case 5,6,7,8:
			precio = 150000*dias;
			break;
		case 9,10,11,12:
			precio = 250000*dias;
			break;
		case 13,14,15,16:
			precio = 300000*dias;
			break;
		}
		
		if(fechaActual.isAfter(fechaMaxima)) {
			JOptionPane.showMessageDialog(null, "El plazo máximo ya pasó (recuerda que tienes 5 días antes para poder cancelar)");
		}
		else if(fechaActual.isBefore(mesAntes)) {
			Reserva.eliminarReserva(reservas, re.nombre, re.numeroHabitacion);
			Habitacion.habitaciones.get(re.numeroHabitacion - 1).estado = "SI";
			Habitacion.habitaciones.get(re.numeroHabitacion - 1).fechaEntrada = " ";
			Habitacion.habitaciones.get(re.numeroHabitacion - 1).fechaSalida = " ";
			Habitacion.escribirArchivo(Habitacion.habitaciones);
			JOptionPane.showMessageDialog(null, "Tu reserva ha sido cancelada");
			JOptionPane.showMessageDialog(null, ("Tienes un reembolso del 70% = $" + 0.70*precio));
		}
		else if(fechaActual.isBefore(quinceDias)) {
			Reserva.eliminarReserva(reservas, re.nombre, re.numeroHabitacion);
			Habitacion.habitaciones.get(re.numeroHabitacion - 1).estado = "SI";
			Habitacion.habitaciones.get(re.numeroHabitacion - 1).fechaEntrada = " ";
			Habitacion.habitaciones.get(re.numeroHabitacion - 1).fechaSalida = " ";		
			Habitacion.escribirArchivo(Habitacion.habitaciones);
			JOptionPane.showMessageDialog(null, "Tu reserva ha sido cancelada");
			JOptionPane.showMessageDialog(null, ("Tienes un reembolso del 50% = $" + 0.50*precio));
		}
		else {
		}
	}
	
	public static String estado(Reserva re) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate fechaEntrada = LocalDate.parse(re.fechaEntrada, formatter);
		LocalDate fechaSalida = LocalDate.parse(re.fechaSalida, formatter);
		LocalDate fechaActual = LocalDate.now();
		String estado;
		
		if (fechaActual.isAfter(fechaSalida)) {
			estado = "vencida";
		}
		else if((fechaActual.isEqual(fechaEntrada) || (fechaActual.isAfter(fechaEntrada)) &&
				fechaActual.isBefore(fechaSalida)) || (fechaActual.isEqual(fechaSalida))) {
			estado = "en curso";
		}
		else {
			estado = "Próxima"; 
		}
		
		return estado;
	}
}
