/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.domain.*;

/**
 *
 * @author santiago
*/
public interface AlumnosController {
    @RequestMapping("/alumnos")
    Iterable<Alumno> getAllAlumnos();
    
    @RequestMapping("/alumnos/{dni}")
    Optional<Alumno> getAlumnoById(@PathVariable("dni") long dni);
    //@RequestMapping("/alumnos/{id}")
    //Alumno getAlumnoById(String id);
    
    @RequestMapping(value = "/alumnos", method = RequestMethod.POST)
    void createAlumno(@RequestBody Alumno alumno);
    
}
