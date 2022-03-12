package com.danielesteban.semillerobackend.service;

import com.danielesteban.semillerobackend.entity.CrearSolicitud;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.Optional;

public interface CrearSolicitudService {

    public Iterable<CrearSolicitud> findAll();
    public Page<CrearSolicitud> findAll(Pageable pageable);
    Optional<CrearSolicitud> findById(Integer id);
    public CrearSolicitud save(CrearSolicitud crearSolicitud);
    public void deleteById(Integer id);
}

