package com.course.users.service;

import java.util.List;

import com.course.commons.service.CommonsService;
import com.course.entity.Alumno;

public interface AlumnoService extends CommonsService<Alumno>{
	
	public List<Alumno> findByNameOrLastName(String cadena);
	
}
