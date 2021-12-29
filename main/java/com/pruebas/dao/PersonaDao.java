package com.pruebas.dao;

import com.pruebas.models.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaDao extends JpaRepository<Persona, Integer> {
}
