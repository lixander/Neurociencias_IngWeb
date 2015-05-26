package com.dto;

/**
 * Clase dto para los datos del estado de dispositivo
 * @author JM PINEDA
 * 
 */

public class EstadoDispositivo {

/**
* Codigo del estado de dispositivo 	
*/
private Integer idEstadoDispositivo;
/**
* Texto del tipo de estado de dispositivo  	
*/
private String nombreEstadoDispositivo;

public Integer getIdEstadoDispositivo() {
	return idEstadoDispositivo;
}
public void setIdEstadoDispositivo(Integer idEstadoDispositivo) {
	this.idEstadoDispositivo = idEstadoDispositivo;
}
public String getNombreEstadoDispositivo() {
	return nombreEstadoDispositivo;
}
public void setNombreEstadoDispositivo(String nombreEstadoDispositivo) {
	this.nombreEstadoDispositivo = nombreEstadoDispositivo;
}	

}
