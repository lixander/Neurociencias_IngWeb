package com.dao;

import java.util.List;

import com.dto.TipoDispositivoDTO;
import com.exception.LNDaoException;

/**
 * Clase que define los metodos del DAO para tipo de dispositivo
 * @author JM PINEDA
 * 
 */

public interface TipoDispositivoDAO {

public List<TipoDispositivoDTO> obtener() throws LNDaoException;	

public TipoDispositivoDTO obtener(Integer idtipoDispositivo) throws LNDaoException;		
	
}
