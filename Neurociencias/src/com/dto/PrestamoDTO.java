/**
 * 
 */
package com.dto;

import java.util.Date;

/**
 * @author Hedeon
 *
 */
public class PrestamoDTO {
	private int idPrestamo;
	private int idSolicitud;
	private int idDispositivo;
	private int estadoDispositivoEntrega;
	
	private Date fechaSolicitudPrestamo;
	private Date fechaSolicitudEntrega;
	private Date fechaRealPrestamo;
	private Date fechaRealEntrega;
	/**
	 * @return the idPrestamo
	 */
	public int getIdPrestamo() {
		return idPrestamo;
	}
	/**
	 * @return the idPrestamo
	 */
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	/**
	 * @return the idSolicitud
	 */
	public int getIdSolicitud() {
		return idSolicitud;
	}
	/**
	 * @param idSolicitud the idSolicitud to set
	 */
	public void setIdSolicitud(int idSolicitud) {
		this.idSolicitud = idSolicitud;
	}
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
	 * @return the estadoDispositivoEntrega
	 */
	public int getEstadoDispositivoEntrega() {
		return estadoDispositivoEntrega;
	}
	/**
	 * @param estadoDispositivoEntrega the estadoDispositivoEntrega to set
	 */
	public void setEstadoDispositivoEntrega(int estadoDispositivoEntrega) {
		this.estadoDispositivoEntrega = estadoDispositivoEntrega;
	}
	/**
	 * @return the fechaSolicitudPrestamo
	 */
	public Date getFechaSolicitudPrestamo() {
		return fechaSolicitudPrestamo;
	}
	/**
	 * @param fechaSolicitudPrestamo the fechaSolicitudPrestamo to set
	 */
	public void setFechaSolicitudPrestamo(Date fechaSolicitudPrestamo) {
		this.fechaSolicitudPrestamo = fechaSolicitudPrestamo;
	}
	/**
	 * @return the fechaSolicitudEntrega
	 */
	public Date getFechaSolicitudEntrega() {
		return fechaSolicitudEntrega;
	}
	/**
	 * @param fechaSolicitudEntrega the fechaSolicitudEntrega to set
	 */
	public void setFechaSolicitudEntrega(Date fechaSolicitudEntrega) {
		this.fechaSolicitudEntrega = fechaSolicitudEntrega;
	}
	/**
	 * @return the fechaRealPrestamo
	 */
	public Date getFechaRealPrestamo() {
		return fechaRealPrestamo;
	}
	/**
	 * @param fechaRealPrestamo the fechaRealPrestamo to set
	 */
	public void setFechaRealPrestamo(Date fechaRealPrestamo) {
		this.fechaRealPrestamo = fechaRealPrestamo;
	}
	/**
	 * @return the fechaRealEntrega
	 */
	public Date getFechaRealEntrega() {
		return fechaRealEntrega;
	}
	/**
	 * @param fechaRealEntrega the fechaRealEntrega to set
	 */
	public void setFechaRealEntrega(Date fechaRealEntrega) {
		this.fechaRealEntrega = fechaRealEntrega;
	}
	
}
