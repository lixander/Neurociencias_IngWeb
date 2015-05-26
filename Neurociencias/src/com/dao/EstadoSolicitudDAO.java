package com.dao;

import java.util.List;

import com.dto.EstadoSolicitudDTO;
import com.exception.LNDaoException;

/**
 * Clase que define los metodos del DAO para estado de solicitud
 * @author JM PINEDA
 * 
 */

public interface EstadoSolicitudDAO {

public List<EstadoSolicitudDTO> obtener() throws LNDaoException;	

public EstadoSolicitudDTO obtener(Integer idEstadoSolicitud) throws LNDaoException;	
	
}
