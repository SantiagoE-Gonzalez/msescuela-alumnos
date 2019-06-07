package ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.services;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.domain.*;

public interface CRUDAlumnos extends CrudRepository<Alumno, Long> {

}
