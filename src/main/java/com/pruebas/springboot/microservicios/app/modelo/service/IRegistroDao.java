package com.pruebas.springboot.microservicios.app.modelo.service;

import java.util.List;


import com.pruebas.springboot.microservicios.app.modelo.entity.Registro;

public interface IRegistroDao {
	public List<Registro> readAll();
	public Registro readBy(Long id);
}
