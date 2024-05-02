package modelo;

import java.util.ArrayList;
import java.util.List;

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
}
