package ar.com.santiagogonzalez.ejemplos.msescuelaalumnos;

import com.netflix.discovery.EurekaClient;

import ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.controllers.AlumnosController;
import ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.controllers.impl.AlumnosControllerImpl;
import ar.com.santiagogonzalez.ejemplos.msescuelaalumnos.domain.Alumno;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class MsescuelaAlumnosApplication {

    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    public static void main(String[] args) {
        SpringApplication.run(MsescuelaAlumnosApplication.class, args);
    }

}
