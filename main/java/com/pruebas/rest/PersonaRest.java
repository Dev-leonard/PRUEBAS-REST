package com.pruebas.rest;

import com.pruebas.dao.PersonaDao;
import com.pruebas.models.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("personas")//localhost:8090/personas
public class PersonaRest {

    @Autowired
    private PersonaDao personaDao;

    //METODOS HTTP-SOLICITUD AL SERVIDOR

    @PostMapping("/guardar") //localhost:8090/personas/guardar
    public void guardar(@RequestBody Persona persona){
        personaDao.save(persona);
    }

    @GetMapping("/listar")
    public List<Persona> listar(){
        return personaDao.findAll();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        personaDao.deleteById(id);
    }

    @PutMapping ("/actualizar") //localhost:8090/personas/guardar
    public void actualizar(@RequestBody Persona persona){
        personaDao.save(persona);
    }
}
