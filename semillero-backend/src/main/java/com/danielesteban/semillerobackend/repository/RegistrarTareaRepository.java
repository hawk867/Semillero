package com.danielesteban.semillerobackend.repository;

import com.danielesteban.semillerobackend.entity.RegistrarTarea;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegistrarTareaRepository extends JpaRepository<RegistrarTarea, Integer> {
}
