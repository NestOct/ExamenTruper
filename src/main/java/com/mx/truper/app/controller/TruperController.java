package com.mx.truper.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.truper.app.model.service.IClienteService;
import com.mx.truper.app.model.service.IListaCompraService;
import com.mx.truper.app.modelo.entity.Cliente;

@RestController
@RequestMapping("/truper")
public class TruperController {

	@Autowired
	private IClienteService clienteService;

	@Autowired
	private IListaCompraService listaService;

	@GetMapping("/{IdCliente}")
	public Cliente getLista(@PathVariable("IdCliente") Integer idCliente) {
		
		Cliente cliente = clienteService.buscaPorID(idCliente); 

		return cliente;
	}

}
