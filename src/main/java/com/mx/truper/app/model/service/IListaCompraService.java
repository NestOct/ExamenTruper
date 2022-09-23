package com.mx.truper.app.model.service;

import java.util.List;

import com.mx.truper.app.modelo.entity.ListaCompra;

public interface IListaCompraService {
	
	public List<ListaCompra> buscarIdCliente(Integer idCliente);

}
