package com.mx.truper.app.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.truper.app.modelo.dao.IListaCompraDao;
import com.mx.truper.app.modelo.entity.ListaCompra;

@Service
public class ListaCompraServiceImp implements IListaCompraService {

	@Autowired
	private IListaCompraDao listaCompraDao;

	@Override
	@Transactional(readOnly = true)
	public List<ListaCompra> buscarIdCliente(Integer idCliente) {
		return listaCompraDao.listaPorIdCliente(idCliente);
	}

}
