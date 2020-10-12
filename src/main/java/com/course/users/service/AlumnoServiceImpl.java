package com.course.users.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.course.commons.service.CommonsServiceImpl;
import com.course.entity.Alumno;
import com.course.users.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl extends CommonsServiceImpl<Alumno, AlumnoRepository> implements AlumnoService{
	
	
	@Autowired
	AlumnoService service;
	
	
	public Alumno update(Alumno alumno) {
		Optional<Alumno> alumnodb = null;
		if (null != alumno) {
			alumnodb = service.findById(alumno.getIdAlumno());
			if (alumnodb.isPresent()) {
				alumnodb.get().setNameAlumno(alumno.getNameAlumno());
				alumnodb.get().setLastNameAlumno(alumno.getLastNameAlumno());
				alumnodb.get().setEmail(alumno.getEmail());
				service.update(alumnodb.get());
				return alumnodb.get();
			}
		}
		
		return null;
	}
	

}
