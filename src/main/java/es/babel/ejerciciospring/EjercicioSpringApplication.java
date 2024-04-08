package es.babel.ejerciciospring;

import es.babel.ejerciciospring.app.AppAlumnos;
import es.babel.ejerciciospring.config.AppConfig;
import es.babel.ejerciciospring.domain.Alumno;
import es.babel.ejerciciospring.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@SpringBootApplication
public class EjercicioSpringApplication {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        AppAlumnos appAlumnos = context.getBean(AppAlumnos.class);
        appAlumnos.run();
    }

}
