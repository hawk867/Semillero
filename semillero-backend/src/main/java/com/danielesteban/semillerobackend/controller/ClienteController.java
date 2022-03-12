package com.danielesteban.semillerobackend.controller;

import com.danielesteban.semillerobackend.entity.Cliente;
import com.danielesteban.semillerobackend.service.ClienteService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

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
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@RequestBody Cliente clienteDetaisl, @PathVariable(value = "id") Integer clienteId){
        Optional<Cliente> cliente = clienteService.findById(clienteId);
        if(!cliente.isPresent()){
            return ResponseEntity.notFound().build();
        }
//        BeanUtils.copyProperties(clienteDetaisl, cliente.get());
        cliente.get().setNombre(clienteDetaisl.getNombre());
        cliente.get().setApellido(clienteDetaisl.getApellido());
        cliente.get().setContrasena(clienteDetaisl.getContrasena());
        cliente.get().setUsuario(clienteDetaisl.getUsuario());
        return ResponseEntity.status(HttpStatus.CREATED).body(clienteService.save(cliente.get()));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete (@PathVariable(value = "id") Integer clienteId){
        if(!clienteService.findById(clienteId).isPresent()){
            return ResponseEntity.notFound().build();
        }
        clienteService.deleteById(clienteId);
        return ResponseEntity.ok().build();
    }
    @GetMapping
    public List<Cliente> readAll(){
        List<Cliente> clientes = StreamSupport
                .stream(clienteService.findAll().spliterator(), false)
                .collect(Collectors.toList());
        return clientes;
    }
}
