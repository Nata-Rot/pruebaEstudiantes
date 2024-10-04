package com.example.pruebaestudiante.service;

import com.example.pruebaestudiante.model.Estudiante;
import com.example.pruebaestudiante.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepository estudianteRepository;

    public List<Estudiante> listarEstudiantes() {
        return estudianteRepository.findAll();
    }

    public Estudiante guardarEstudiante(Estudiante estudiante) {
        return estudianteRepository.save(estudiante);
    }

    public Estudiante obtenerEstudiantePorId(Long id) {
        return estudianteRepository.findById(id).orElse(null);
    }

    public void eliminarEstudiante(Long id) {
        estudianteRepository.deleteById(id);
    }
}
