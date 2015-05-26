package com.dto;

import java.util.Date;

/**
 * 
 * @author alexis
 *
 */

public class MultaDTO {

	int idMulta;
	String comentarios;
	int idPrestamo;
	Date fechaCreacionMulta;
	int idTipoMulta;
	float valorTotalMulta;
	float valorPagadoMulta;
	boolean multaPagada;
	/**
	 * 
	 * @return Valor Valor Total de la multa
	 */
	public float getValorTotalMulta() {
		return valorTotalMulta;
	}
	/**
	 * 
	 * @param valorTotalMulta Valor Total de la multa
	 */
	public void setValorTotalMulta(float valorTotalMulta) {
		this.valorTotalMulta = valorTotalMulta;
	}
	/**
	 * 
	 * @return Valor pagado del total de la multa
	 */
	public float getValorPagadoMulta() {
		return valorPagadoMulta;
	}
	/**
	 * 
	 * @param valorPagadoMulta Valor pagado del total de la multa
	 */
	public void setValorPagadoMulta(float valorPagadoMulta) {
		this.valorPagadoMulta = valorPagadoMulta;
	}
	/**
	 * 
	 * @return Si la multa ha sido pagada o no
	 */	
	public boolean isMultaPagada() {
		return multaPagada;
	}
	/**
	 * 
	 * @param multaPagada Si la multa ha sido pagada o no
	 */
	public void setMultaPagada(boolean multaPagada) {
		this.multaPagada = multaPagada;
	}
	/**
	 * 
	 * @return Identificador único de la multa
	 */
	public int getIdMulta() {
		return idMulta;
	}
	/**
	 * 
	 * @param idMulta Identificador único de la multa
	 */
	public void setIdMulta(int idMulta) {
		this.idMulta = idMulta;
	}
	/**
	 * 
	 * @return Comentarios asociados a la multa
	 */
	public String getComentarios() {
		return comentarios;
	}
	/**
	 * 
	 * @param comentarios Comentarios asociados a la multa
	 */
	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	/**
	 * 
	 * @return Identificador al cuál está asociado la multa
	 */
	public int getIdPrestamo() {
		return idPrestamo;
	}
	/**
	 * 
	 * @param idPrestamo Identificador al cuál está asociado la multa
	 */
	public void setIdPrestamo(int idPrestamo) {
		this.idPrestamo = idPrestamo;
	}
	/**
	 * 
	 * @return Fecha de creación de la multa
	 */
	public Date getFechaCreacionMulta() {
		return fechaCreacionMulta;
	}
	/**
	 * 
	 * @param fechaCreacionMulta Fecha de creación de la multa
	 */
	public void setFechaCreacionMulta(Date fechaCreacionMulta) {
		this.fechaCreacionMulta = fechaCreacionMulta;
	}
	/**
	 * 
	 * @return Identificador asociado al tipo(clase) de multa
	 */
	public int getIdTipoMulta() {
		return idTipoMulta;
	}
	/**
	 * 
	 * @param idTipoMulta Identificador asociado al tipo(clase) de multa
	 */
	public void setIdTipoMulta(int idTipoMulta) {
		this.idTipoMulta = idTipoMulta;
	}
	
	

}
