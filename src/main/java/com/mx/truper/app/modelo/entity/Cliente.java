package com.mx.truper.app.modelo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(nullable = false)
	private Integer idCliente;

	@Column(nullable = false)
	private String nombre;

	@Column(nullable = false)
	private Integer activo;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private List<ListaCompra> listaCompra;

	public Cliente() {
		this.listaCompra = new ArrayList<ListaCompra>();
	}

	public void agregarLista(ListaCompra listaCompra) {
		this.listaCompra.add(listaCompra);
	}

	public void eliminarLista(ListaCompra listaCompra) {
		this.listaCompra.remove(listaCompra);
	}

	public Integer getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Integer idCliente) {
		this.idCliente = idCliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	public List<ListaCompra> getListaCompra() {
		return listaCompra;
	}

	public void setListaCompra(List<ListaCompra> listaCompra) {
		this.listaCompra = listaCompra;
	}

}
