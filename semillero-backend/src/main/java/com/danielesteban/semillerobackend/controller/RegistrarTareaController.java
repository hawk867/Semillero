package com.danielesteban.semillerobackend.controller;

import com.danielesteban.semillerobackend.entity.RegistrarTarea;
import com.danielesteban.semillerobackend.service.RegistrarTareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/registro")
public class RegistrarTareaController {

    @Autowired
    private RegistrarTareaService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody RegistrarTarea tarea){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(tarea));
    }
}
