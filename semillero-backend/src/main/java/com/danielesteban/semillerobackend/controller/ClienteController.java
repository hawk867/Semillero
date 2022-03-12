package com.danielesteban.semillerobackend.controller;

import com.danielesteban.semillerobackend.entity.Cliente;
import com.danielesteban.semillerobackend.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping("/{id}")
    public ResponseEntity<?> read (@PathVariable Integer id){
        Optional<Cliente> oCliente = clienteService.findById(id);
        if(!oCliente.isPresent()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(oCliente);
    }
    @PostMapping
    public ResponseEntity<?> create(@RequestBody Cliente cliente){
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(cliente));
    }
}
