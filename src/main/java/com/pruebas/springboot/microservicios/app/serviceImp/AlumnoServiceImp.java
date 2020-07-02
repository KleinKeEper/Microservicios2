package com.pruebas.springboot.microservicios.app.serviceImp;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pruebas.springboot.microservicios.app.modelo.entity.Alumno;
import com.pruebas.springboot.microservicios.app.modelo.entity.Registro;
import com.pruebas.springboot.microservicios.app.modelo.service.IRegistroDao;

@Service
public class AlumnoServiceImp implements IRegistroDao {

	@Autowired
	private RestTemplate clienteRestTemplate;
	
	@Override
	public List<Registro> readAll() {
		// TODO Auto-generated method stub
		List<Alumno> alumnos = Arrays.asList(clienteRestTemplate.getForObject("http://localhost:8081/listar", Alumno[].class));
		return alumnos.stream().map(a -> new Registro(a)).collect(Collectors.toList());
	}

	@Override
	public Registro readBy(Long id) {
		// TODO Auto-generated method stub
		Map<String, String> datos = new HashMap<String, String>();
		Alumno alumno = clienteRestTemplate.getForObject("http://localhost:8081/listar/{id}", Alumno.class, datos);
		return new Registro(alumno);
	}

	
}
