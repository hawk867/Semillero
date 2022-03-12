package com.danielesteban.semillerobackend.service;

import com.danielesteban.semillerobackend.entity.Tarea;
import com.danielesteban.semillerobackend.repository.TareaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class TareaServiceImpl implements TareaService{

    @Autowired
    private TareaRepository repository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Tarea> findAll() {
        return repository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Tarea> findAll(Pageable pageable) {
        return repository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Tarea> findById(Integer id) {
        return repository.findById(id);
    }

    @Override
    @Transactional
    public Tarea save(Tarea tarea) {
        return repository.save(tarea);
    }

    @Override
    public void deleteById(Integer id) {
        repository.deleteById(id);
    }
}
