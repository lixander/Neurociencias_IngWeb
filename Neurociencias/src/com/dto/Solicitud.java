package com.dto;

/**
 * Clase dto para los datos de las solicitudes
 * @author JM PINEDA
 * 
 */

import java.util.Date;

public class Solicitud {

/**
 * Codigo de la solicitud 	
 */
private Integer idSolicitud;
/**
 * Codigo referente al usuario 	
 */
private Integer idUsuarioSolicitante;
/**
 * Codigo referente al administrador
 */
private Integer idUsuarioAdmin;
/**
 * Fecha de realizacion de la solicitud  	
 */
private Date fechaCreacionSolicitud;
/**
 * Codigo referente al estado de la solicitud 
 */
private Integer estadoSolicitud;
/**
 * Fecha de evaluacion de la solicitud  	
 */
private Date fechaEvaluacionSolicitud;
/**
 * Texto de justificacion de prestamo especial  	
 */
private String justificacion;

public Integer getIdSolicitud() {
	return idSolicitud;
}
public void setIdSolicitud(Integer idSolicitud) {
	this.idSolicitud = idSolicitud;
}
public Integer getIdUsuarioSolicitante() {
	return idUsuarioSolicitante;
}
public void setIdUsuarioSolicitante(Integer idUsuarioSolicitante) {
	this.idUsuarioSolicitante = idUsuarioSolicitante;
}
public Integer getIdUsuarioAdmin() {
	return idUsuarioAdmin;
}
public void setIdUsuarioAdmin(Integer idUsuarioAdmin) {
	this.idUsuarioAdmin = idUsuarioAdmin;
}
public Date getFechaCreacionSolicitud() {
	return fechaCreacionSolicitud;
}
public void setFechaCreacionSolicitud(Date fechaCreacionSolicitud) {
	this.fechaCreacionSolicitud = fechaCreacionSolicitud;
}
public Integer getEstadoSolicitud() {
	return estadoSolicitud;
}
public void setEstadoSolicitud(Integer estadoSolicitud) {
	this.estadoSolicitud = estadoSolicitud;
}
public Date getFechaEvaluacionSolicitud() {
	return fechaEvaluacionSolicitud;
}
public void setFechaEvaluacionSolicitud(Date fechaEvaluacionSolicitud) {
	this.fechaEvaluacionSolicitud = fechaEvaluacionSolicitud;
}
public String getJustificacion() {
	return justificacion;
}
public void setJustificacion(String justificacion) {
	this.justificacion = justificacion;
}


}





