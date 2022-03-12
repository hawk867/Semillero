package com.danielesteban.semillerobackend.controller;

import com.danielesteban.semillerobackend.entity.Cliente;
import com.danielesteban.semillerobackend.entity.Hacedor;
import com.danielesteban.semillerobackend.service.HacedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/hacedores")
public class HacedorController {

    @Autowired
    private HacedorService hacedorService;

    @GetMapping("/{id}")
    public ResponseEntity<?> read (@PathVariable Integer id){
        Optional<Hacedor> oHacedor = hacedorService.findById(id);
        if(!oHacedor.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oHacedor);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Hacedor hacedor){
        return ResponseEntity.status(HttpStatus.CREATED).body(hacedorService.save(hacedor));
    }
}
