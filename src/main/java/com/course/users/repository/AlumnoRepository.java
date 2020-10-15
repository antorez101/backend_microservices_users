package com.course.users.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.course.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long>{
	
	@Query("select a from Alumno a where a.nameAlumno like %?1% or a.lastNameAlumno like %?1%")
	public List<Alumno> findByNameOrLastName(String cadena);
	

}
