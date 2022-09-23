package com.mx.truper.app.modelo.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.truper.app.modelo.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Integer>{

}
