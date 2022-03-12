package com.danielesteban.semillerobackend.repository;

import com.danielesteban.semillerobackend.entity.CrearSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CrearSolicitudRepository extends JpaRepository<CrearSolicitud, Integer> {
}
