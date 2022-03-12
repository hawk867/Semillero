package com.danielesteban.semillerobackend.service;

import com.danielesteban.semillerobackend.entity.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface ClienteService {
    public Iterable<Cliente> findAll();
    public Page<Cliente> findAll(Pageable pageable);
    Optional<Cliente> findById(Integer id);
    public Cliente save(Cliente cliente);
    public void deleteById(Integer id);
}
