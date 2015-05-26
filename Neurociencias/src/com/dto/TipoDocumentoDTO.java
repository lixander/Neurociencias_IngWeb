/**
 * 
 */
package com.dto.neurociencias;

/**
 * @author alexis
 *
 */
public class TipoDocumento {

	int idTipoDocumento;
	String nombreTipoDocumento;
	
	/**
	 * 
	 * @return Retorna ID correpondiente al documento
	 */
	public int getIdTipoDocumento() {
		return idTipoDocumento;
	}
	
	/**
	 * 
	 * @param idTipoDocumento Id del documento
	 */
	public void setIdTipoDocumento(int idTipoDocumento) {
		this.idTipoDocumento = idTipoDocumento;
	}
	
	/**
	 * 
	 * @return Retorna nombre del documento
	 */
	public String getNombreTipoDocumento() {
		return nombreTipoDocumento;
	}
	
	/**
	 * 
	 * @param nombreTipoDocumento Nombre del documento (Cedula,Tarjeta de Identidad,etc)
	 */
	public void setNombreTipoDocumento(String nombreTipoDocumento) {
		this.nombreTipoDocumento = nombreTipoDocumento;
	}
	
	
}
