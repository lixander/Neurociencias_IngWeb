package com.dto;

/**
 * 
 * @author alexis
 *
 */

public class MarcaDispositivoDTO {

	int idMarcaDispositivo;
	String nombreMarcaDispositivo;
	
	/**
	 * 
	 * @return Id correspondiente a la marca del dispositivo
	 */
	public int getIdMarcaDispositivo() {
		return idMarcaDispositivo;
	}
	/**
	 * 
	 * @param idMarcaDispositivo Id correspondiente a la marca del dispositivo
	 */
	public void setIdMarcaDispositivo(int idMarcaDispositivo) {
		this.idMarcaDispositivo = idMarcaDispositivo;
	}
	/**
	 * 
	 * @return Nombre de la marca del dispositivo
	 */
	public String getNombreMarcaDispositivo() {
		return nombreMarcaDispositivo;
	}
	/**
	 * 
	 * @param nombreMarcaDispositivo Nombre de la marca del dispositivo
	 */
	public void setNombreMarcaDispositivo(String nombreMarcaDispositivo) {
		this.nombreMarcaDispositivo = nombreMarcaDispositivo;
	}
	
	
}
