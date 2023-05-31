package com.gutierrez.app.models;

import jakarta.persistence.*;

@Entity
@Table(name = "alumnos")
public class Alumno {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "edad")
	private Integer edad;
	
	@Column(name = "carrera")
	private String carrera;
	
	@Column(name = "salon")
	private String salon;
	
	
	public  Alumno() {
		// TODO Auto-generated constructor stub
	}

	

	public Alumno(String nombre, Integer edad, String carrera, String salon) {
		this.nombre = nombre;
		this.edad = edad;
		this.carrera = carrera;
		this.salon = salon;

	}
	
	
	public long getId() {
		return id;
	}



	public void setId(long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public String getSalon() {
		return salon;
	}

	public void setSalon(String salon) {
		this.salon = salon;
	}
	
	@Override
	public String toString() {
		return "Alumno [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", carrera=" + carrera + " , salon=" + salon + "]";
	}
	

}
