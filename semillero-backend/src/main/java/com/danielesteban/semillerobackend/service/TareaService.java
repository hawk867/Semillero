package com.danielesteban.semillerobackend.service;

import com.danielesteban.semillerobackend.entity.Tarea;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface TareaService {

    public Iterable<Tarea> findAll();
    public Page<Tarea> findAll(Pageable pageable);
    Optional<Tarea> findById(Integer id);
    public Tarea save(Tarea tarea);
    public void deleteById(Integer id);
}
