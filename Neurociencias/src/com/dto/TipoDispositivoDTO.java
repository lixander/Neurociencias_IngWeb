package com.dto;

/**
 * Clase dto para los datos del tipo de dispositivo
 * @author JM PINEDA
 * 
 */

public class TipoDispositivoDTO {

/**
* Codigo del tipo de dispositivo 	
*/
private Integer idtipoDispositivo;
/**
 * Texto del nombre de dispositivo  	
 */
private String nombreDispositivo;

public Integer getIdtipoDispositivo() {
	return idtipoDispositivo;
}
public void setIdtipoDispositivo(Integer idtipoDispositivo) {
	this.idtipoDispositivo = idtipoDispositivo;
}
public String getNombreDispositivo() {
	return nombreDispositivo;
}
public void setNombreDispositivo(String nombreDispositivo) {
	this.nombreDispositivo = nombreDispositivo;
}

	
}
