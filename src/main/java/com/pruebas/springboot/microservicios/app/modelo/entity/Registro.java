package com.pruebas.springboot.microservicios.app.modelo.entity;

public class Registro {

	private Alumno alumno;

	
	
	public Registro() {
		// TODO Auto-generated constructor stub
	}



	public Registro(Alumno alumno) {
		this.alumno = alumno;
	}



	public Alumno getAlumno() {
		return alumno;
	}



	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}
	
	
	
}
