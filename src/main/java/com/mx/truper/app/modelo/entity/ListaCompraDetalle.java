package com.mx.truper.app.modelo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Lista_Compra_Detalle")
public class ListaCompraDetalle {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer idListaCompraDetalle;

//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer codigoProducto;

	private Integer idListaCompra;

	private Integer idCodigoProducto;
	
	private Integer cantidad;

}
