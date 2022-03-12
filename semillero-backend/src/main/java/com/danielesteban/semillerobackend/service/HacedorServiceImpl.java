package com.danielesteban.semillerobackend.service;

import com.danielesteban.semillerobackend.entity.Hacedor;
import com.danielesteban.semillerobackend.repository.HacedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class HacedorServiceImpl implements HacedorService{

    @Autowired
    private HacedorRepository hacedorRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Hacedor> findAll() {
        return hacedorRepository.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Page<Hacedor> findAll(Pageable pageable) {
        return hacedorRepository.findAll(pageable);
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Hacedor> findById(Integer id) {
        return hacedorRepository.findById(id);
    }

    @Override
    @Transactional
    public Hacedor save(Hacedor hacedor) {
        return hacedorRepository.save(hacedor);
    }

    @Override
    @Transactional
    public void deleteById(Integer id) {
        hacedorRepository.deleteById(id);
    }
}


