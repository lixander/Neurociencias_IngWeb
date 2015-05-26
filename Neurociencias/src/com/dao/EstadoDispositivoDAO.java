package com.dao;

/**
 * Clase que define los metodos del DAO para estado de dispositivo
 * @author JM PINEDA
 * 
 */

import java.util.List;

import com.dto.EstadoDispositivoDTO;
import com.exception.LNDaoException;

public interface EstadoDispositivoDAO {
	
public List<EstadoDispositivoDTO> obtener() throws LNDaoException;	

public EstadoDispositivoDTO obtener(Integer idEstadoDispositivo) throws LNDaoException;	

}
