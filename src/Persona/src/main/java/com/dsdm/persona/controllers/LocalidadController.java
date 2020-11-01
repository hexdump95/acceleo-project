package com.dsdm.persona.controllers;

import com.dsdm.persona.controllers.BaseControllerImpl;
import com.dsdm.persona.entities.Localidad;
import com.dsdm.persona.services.LocalidadServiceImpl;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidads")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}

