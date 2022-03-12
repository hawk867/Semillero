package com.danielesteban.semillerobackend.controller;

import com.danielesteban.semillerobackend.entity.Tarea;
import com.danielesteban.semillerobackend.service.TareaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tareas")
public class TareaController {

    @Autowired
    private TareaService service;

    @PostMapping
    public ResponseEntity<?> create(@RequestBody Tarea tarea){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.save(tarea));
    }
}
