package com.danielesteban.semillerobackend.service;

import com.danielesteban.semillerobackend.entity.RegistrarTarea;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface RegistrarTareaService {
    public Iterable<RegistrarTarea> findAll();
    public Page<RegistrarTarea> findAll(Pageable pageable);
    Optional<RegistrarTarea> findById(Integer id);
    public RegistrarTarea save(RegistrarTarea registrarTarea);
    public void deleteById(Integer id);
}
