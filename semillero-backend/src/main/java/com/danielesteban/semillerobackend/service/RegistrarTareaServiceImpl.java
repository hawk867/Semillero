package com.danielesteban.semillerobackend.service;

import com.danielesteban.semillerobackend.entity.RegistrarTarea;
import com.danielesteban.semillerobackend.repository.RegistrarTareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class RegistrarTareaServiceImpl implements RegistrarTareaService {

    @Autowired
    private RegistrarTareaRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<RegistrarTarea> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<RegistrarTarea> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<RegistrarTarea> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public RegistrarTarea save(RegistrarTarea registrarTarea) {
        return repository.save(registrarTarea);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
