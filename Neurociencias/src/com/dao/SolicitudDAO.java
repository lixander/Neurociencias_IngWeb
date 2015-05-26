package com.dao;

import java.util.List;

import com.dto.SolicitudDTO;
import com.exception.LNDaoException;

/**
 *
 * @author JM PINEDA
 * 
 */

public interface SolicitudDAO {
	
public SolicitudDTO insertar(SolicitudDTO solicitud);	

public SolicitudDTO modificar(SolicitudDTO solicitud);

public SolicitudDTO eliminar(SolicitudDTO solicitud);	
	
public List<SolicitudDTO> obtener() throws LNDaoException;	

public SolicitudDTO obtener(Integer idSolicitud) throws LNDaoException;		

}
