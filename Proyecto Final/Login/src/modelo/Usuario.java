package modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Usuario {

    public static List<Usuario> usuariosRegistrados = new ArrayList<>();

	public String tipoIdentificacion, documentoIdentificacion, nombres, apellidos;
	public String correoElectronico;
	public String direccionResidencia;
	public String ciudadResidencia;
	public String telefono;
	public String contraseña;
	public String confirmarContraseña;
	public String rol;
	
	public Usuario(){
	}
	
	public Usuario(String correoElectronico, String contraseña, String rol) {
		this.correoElectronico = correoElectronico;
		this.contraseña = contraseña;
		this.rol = rol;
	}
	
	public Usuario(String tipoIdentificacion, String documentoIdentificacion, String nombres, 
			String apellidos, String correoElectronico, String direccionResidencia, 
			String ciudadResidencia, String telefono, String contraseña,String rol){
		
		this.tipoIdentificacion = tipoIdentificacion;
		this.documentoIdentificacion = documentoIdentificacion;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.correoElectronico = correoElectronico;
		this.direccionResidencia = direccionResidencia;
		this.ciudadResidencia = ciudadResidencia;
		this.telefono = telefono;
		this.contraseña = contraseña;
		this.rol = rol;
	}

	public String getTipoIdentificacion() {
		return tipoIdentificacion;
	}

	public void setTipoIdentificacion(String tipoIdentificacion) {
		this.tipoIdentificacion = tipoIdentificacion;
	}

	public String getDocumentoIdentificacion() {
		return documentoIdentificacion;
	}

	public void setDocumentoIdentificacion(String documentoIdentificacion) {
		this.documentoIdentificacion = documentoIdentificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getDireccionResidencia() {
		return direccionResidencia;
	}

	public void setDireccionResidencia(String direccionResidencia) {
		this.direccionResidencia = direccionResidencia;
	}

	public String getCiudadResidencia() {
		return ciudadResidencia;
	}

	public void setCiudadResidencia(String ciudadResidencia) {
		this.ciudadResidencia = ciudadResidencia;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getContraseña() {
		return contraseña;
	}

	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public String getConfirmarContraseña() {
		return confirmarContraseña;
	}

	public void setConfirmarContraseña(String confirmarContraseña) {
		this.confirmarContraseña = confirmarContraseña;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
	
	public static void leerArchivo(List<Usuario> lista) {
		 try {
			 FileReader archivo = new FileReader("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\listausuarios.txt");
			 BufferedReader lector = new BufferedReader(archivo);
			 String linea;
			 
			 while((linea = lector.readLine()) != null) {
				 String[] usuario = linea.split("\t");
				 if (usuario.length == 10) {
                   String tipoIdentificacion = usuario[0];
                   String documentoIdentificacion = usuario[1];
                   String nombres = usuario[2];
                   String apellidos = usuario[3];
                   String correoElectronico = usuario[4];
                   String direccionResidencia = usuario[5];
                   String ciudadResidencia = usuario[6];
                   String telefono = usuario[7];
                   String contraseña = usuario[8];
                   String rol = usuario[9];
                   lista.add(new Usuario(tipoIdentificacion, documentoIdentificacion, nombres, apellidos, correoElectronico,
                           direccionResidencia, ciudadResidencia, telefono, contraseña, rol));
               } else {
                   System.out.println("Error: línea no contiene 10 campos: " + linea);
               }
			 }
			 lector.close();
		 }catch(Exception e){
			 System.out.print("Error: " + e.getMessage());
		 }
	 }
	
	public static void escribirArchivo(List<Usuario> lista) {
		try {
			FileWriter archivo = new FileWriter("C:\\Users\\isavi\\OneDrive\\Documentos\\UTP Cuarto Semestre\\Programación IV\\Proyecto Final\\Proyecto Final\\Login\\src\\modelo\\listausuarios.txt");
			BufferedWriter escritor = new BufferedWriter(archivo);
			for(Usuario us: usuariosRegistrados) {
				escritor.write(us.tipoIdentificacion + "\t" + us.documentoIdentificacion + "\t" + us.nombres + "\t" + 
				us.apellidos + "\t" + us.correoElectronico + "\t" + us.direccionResidencia + "\t" + us.ciudadResidencia + 
				"\t" + us.telefono + "\t" + us.contraseña + "\t" + us.rol);
				escritor.newLine();
			}
			escritor.close();
		}catch(Exception e) {
			JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
		}
	}
}
