package com.danielesteban.semillerobackend.controller;

import com.danielesteban.semillerobackend.entity.CrearSolicitud;
import com.danielesteban.semillerobackend.service.CrearSolicitudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/creacion")
public class CrearSolicitudController {

    @Autowired
    private CrearSolicitudService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody CrearSolicitud solicitud){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(solicitud));
    }
}
