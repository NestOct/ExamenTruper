package com.mx.truper.app.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.truper.app.modelo.dao.IClienteDao;
import com.mx.truper.app.modelo.entity.Cliente;

@Service
public class ClienteServiceImp implements IClienteService {

	@Autowired
	private IClienteDao clienteDao;
	
	@Override
	@Transactional(readOnly = true)
	public Cliente buscaPorID(Integer id) {
		return clienteDao.findById(id).orElse(null);
	}

}
