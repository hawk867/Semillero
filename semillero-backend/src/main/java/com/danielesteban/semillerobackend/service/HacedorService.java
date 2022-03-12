package com.danielesteban.semillerobackend.service;

import com.danielesteban.semillerobackend.entity.Hacedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface HacedorService {

    public Iterable<Hacedor> findAll();
    public Page<Hacedor> findAll(Pageable pageable);
    Optional<Hacedor> findById(Integer id);
    public Hacedor save(Hacedor hacedor);
    public void deleteById(Integer id);
}

