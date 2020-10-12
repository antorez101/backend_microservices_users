package com.course.users.controller;

import org.springframework.web.bind.annotation.RestController;

import com.course.commons.controller.CommonsController;
import com.course.entity.Alumno;
import com.course.users.service.AlumnoService;

@RestController
public class AlumnoController extends CommonsController<Alumno, AlumnoService>{
	
}
