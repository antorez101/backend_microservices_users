package com.course.users.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.course.commons.controller.CommonsController;
import com.course.entity.Alumno;
import com.course.users.service.AlumnoService;

@RestController
public class AlumnoController extends CommonsController<Alumno, AlumnoService>{
	
	@GetMapping(path = "/{cadena}/alumnos")
	public ResponseEntity<?> findByNameOrLastName(@PathVariable String cadena){
		List<Alumno> alumnos  = service.findByNameOrLastName(cadena);
		if (CollectionUtils.isEmpty(alumnos)) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return new ResponseEntity<List<Alumno>>(alumnos, HttpStatus.OK);
	}
	
}
