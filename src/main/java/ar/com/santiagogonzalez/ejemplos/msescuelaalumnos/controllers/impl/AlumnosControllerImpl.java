package ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.controllers.impl;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

//import javax.annotation.Generated;
import org.springframework.web.bind.annotation.RestController;

import ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.controllers.AlumnosController;
import ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.domain.Alumno;
import ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.services.CRUDAlumnos;

@RestController
public class AlumnosControllerImpl implements AlumnosController {

    @Autowired
    private CRUDAlumnos crudAlumnos;

    @Override
    public Iterable<Alumno> getAllAlumnos() {
        return crudAlumnos.findAll();
    }

    @Override
    public Optional<Alumno> getAlumnoById(@PathVariable("dni") long dni) {
        return crudAlumnos.findById(dni);
    }

    @Override
    public void createAlumno(Alumno alumno) {
        crudAlumnos.save(alumno);

    }

    @Override
    public void deleteAlumnoById(long dni) {
        Optional<Alumno> alumno = crudAlumnos.findById(dni);
        crudAlumnos.delete(alumno.get());
    }
}
