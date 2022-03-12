package com.danielesteban.semillerobackend.service;

import com.danielesteban.semillerobackend.entity.CrearSolicitud;
import com.danielesteban.semillerobackend.repository.CrearSolicitudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class CrearSolicitudServiceImpl implements  CrearSolicitudService{

    @Autowired
    private CrearSolicitudRepository solicitudRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<CrearSolicitud> findAll() {
        return solicitudRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<CrearSolicitud> findAll(Pageable pageable) {
        return solicitudRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<CrearSolicitud> findById(Integer id) {
        return solicitudRepository.findById(id);
    }

    @Override
    @Transactional
    public CrearSolicitud save(CrearSolicitud crearSolicitud) {
        return solicitudRepository.save(crearSolicitud);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        solicitudRepository.deleteById(id);
    }
}
