package com.dto;

/**
 * Clase dto para los datos del estado de solicitud
 * @author JM PINEDA
 * 
 */

public class EstadoSolicitudDTO {

/**
* Codigo del estado de solicitud 	
*/
private Integer idEstadoSolicitud;
/**
* Texto del tipo de estado de solicitud  	
*/
private String nombreEstado;

public Integer getIdEstadoSolicitud() {
	return idEstadoSolicitud;
}
public void setIdEstadoSolicitud(Integer idEstadoSolicitud) {
	this.idEstadoSolicitud = idEstadoSolicitud;
}
public String getNombreEstado() {
	return nombreEstado;
}
public void setNombreEstado(String nombreEstado) {
	this.nombreEstado = nombreEstado;
}
	
}
