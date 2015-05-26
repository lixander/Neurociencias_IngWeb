/**
 * 
 */
package com.dto;

import java.util.Date;

/**
 * @author Hedeon
 *
 */
public class DispositivoDTO {
	private int idDispositivo;
	private int tipoDispositivo;
	private int marcaDispositivo;
	private int estadoDispositivo;
	
	private Date fechaAdquisicion;
	
	private String instrucciones;
	private String descripcion;
	/**
	 * @return the idDispositivo
	 */
	public int getIdDispositivo() {
		return idDispositivo;
	}
	/**
	 * @param idDispositivo the idDispositivo to set
	 */
	public void setIdDispositivo(int idDispositivo) {
		this.idDispositivo = idDispositivo;
	}
	/**
	 * @return the tipoDispositivo
	 */
	public int getTipoDispositivo() {
		return tipoDispositivo;
	}
	/**
	 * @param tipoDispositivo the tipoDispositivo to set
	 */
	public void setTipoDispositivo(int tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}
	/**
	 * @return the marcaDispositivo
	 */
	public int getMarcaDispositivo() {
		return marcaDispositivo;
	}
	/**
	 * @param marcaDispositivo the marcaDispositivo to set
	 */
	public void setMarcaDispositivo(int marcaDispositivo) {
		this.marcaDispositivo = marcaDispositivo;
	}
	/**
	 * @return the estadoDispositivo
	 */
	public int getEstadoDispositivo() {
		return estadoDispositivo;
	}
	/**
	 * @param estadoDispositivo the estadoDispositivo to set
	 */
	public void setEstadoDispositivo(int estadoDispositivo) {
		this.estadoDispositivo = estadoDispositivo;
	}
	/**
	 * @return the fechaAdquisicion
	 */
	public Date getFechaAdquisicion() {
		return fechaAdquisicion;
	}
	/**
	 * @param fechaAdquisicion the fechaAdquisicion to set
	 */
	public void setFechaAdquisicion(Date fechaAdquisicion) {
		this.fechaAdquisicion = fechaAdquisicion;
	}
	/**
	 * @return the instrucciones
	 */
	public String getInstrucciones() {
		return instrucciones;
	}
	/**
	 * @param instrucciones the instrucciones to set
	 */
	public void setInstrucciones(String instrucciones) {
		this.instrucciones = instrucciones;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
}
