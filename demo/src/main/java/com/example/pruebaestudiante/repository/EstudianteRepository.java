package com.example.pruebaestudiante.repository;

import com.example.pruebaestudiante.model.Estudiante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
