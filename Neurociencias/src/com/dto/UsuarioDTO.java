/**
 * 
 */
package com.dto;

import java.util.Date;

/**
 * @author Hedeon
 *
 */
public class UsuarioDTO {
	
	private int nroDocumento;
	private int tipoDocumento;
	private int tipoUsuario;
	private int idUsuario;
	
	private String nombreUsuario;
	private String apellidoUsuario;
	private String correo;
	private String contrasena;
	private String telefonoContacto1;
	private String telefonoContacto2;
	
	private Date fechaNacimientoUsuario;
	
	/**
	 * @return the idUsuario
	 */
	public int getIdUsuario() {
		return idUsuario;
	}
	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}
	/**
	 * @return the nombreUsuario
	 */
	public String getNombreUsuario() {
		return nombreUsuario;
	}
	/**
	 * @param nombreUsuario the nombreUsuario to set
	 */
	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}
	/**
	 * @return the apellidoUsuario
	 */
	public String getApellidoUsuario() {
		return apellidoUsuario;
	}
	/**
	 * @param apellidoUsuario the apellidoUsuario to set
	 */
	public void setApellidoUsuario(String apellidoUsuario) {
		this.apellidoUsuario = apellidoUsuario;
	}
	/**
	 * @return the fechaNacimientoUsuario
	 */
	public Date getFechaNacimientoUsuario() {
		return fechaNacimientoUsuario;
	}
	/**
	 * @param fechaNacimientoUsuario the fechaNacimientoUsuario to set
	 */
	public void setFechaNacimientoUsuario(Date fechaNacimientoUsuario) {
		this.fechaNacimientoUsuario = fechaNacimientoUsuario;
	}
	/**
	 * @return the nroDocumento
	 */
	public int getNroDocumento() {
		return nroDocumento;
	}
	/**
	 * @param nroDocumento the nroDocumento to set
	 */
	public void setNroDocumento(int nroDocumento) {
		this.nroDocumento = nroDocumento;
	}
	/**
	 * @return the tipoDocumento
	 */
	public int getTipoDocumento() {
		return tipoDocumento;
	}
	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	/**
	 * @return the tipoUsuario
	 */
	public int getTipoUsuario() {
		return tipoUsuario;
	}
	/**
	 * @param tipoUsuario the tipoUsuario to set
	 */
	public void setTipoUsuario(int tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
	/**
	 * @return the contrasena
	 */
	public String getContrasena() {
		return contrasena;
	}
	/**
	 * @param contrasena the contrasena to set
	 */
	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}
	/**
	 * @return the telefonoContacto1
	 */
	public String getTelefonoContacto1() {
		return telefonoContacto1;
	}
	/**
	 * @param telefonoContacto1 the telefonoContacto1 to set
	 */
	public void setTelefonoContacto1(String telefonoContacto1) {
		this.telefonoContacto1 = telefonoContacto1;
	}
	/**
	 * @return the telefonoContacto2
	 */
	public String getTelefonoContacto2() {
		return telefonoContacto2;
	}
	/**
	 * @param telefonoContacto2 the telefonoContacto2 to set
	 */
	public void setTelefonoContacto2(String telefonoContacto2) {
		this.telefonoContacto2 = telefonoContacto2;
	}
	
	
}
