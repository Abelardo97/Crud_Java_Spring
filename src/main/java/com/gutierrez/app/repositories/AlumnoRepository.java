package com.gutierrez.app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gutierrez.app.models.Alumno;

public interface AlumnoRepository extends JpaRepository<Alumno, Long>{
	

	  List<Alumno> findByNombreContaining(String nombre);
}
