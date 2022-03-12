package com.danielesteban.semillerobackend.repository;

import com.danielesteban.semillerobackend.entity.Hacedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HacedorRepository extends JpaRepository<Hacedor, Integer> {
}
