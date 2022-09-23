package com.mx.truper.app.modelo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.mx.truper.app.modelo.entity.ListaCompra;

public interface IListaCompraDao extends CrudRepository<ListaCompra, Integer> {

	@Query(value = "SELECT * FROM lista_compra lc where lc.customer_id = :idCliente", nativeQuery = true)
	public List<ListaCompra> listaPorIdCliente(@Param("idCliente") Integer idCliente);

}
