package es.babel.ejerciciospring.app;

import es.babel.ejerciciospring.domain.Alumno;
import es.babel.ejerciciospring.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Component
public class AppAlumnos {
    private final AlumnoService alumnoService;

    public AppAlumnos(AlumnoService alumnoService) {
        this.alumnoService = alumnoService;
    }

    public List<Alumno> todosAlumnos() {
        List<Alumno> alumnos = new ArrayList<>();
        Alumno elisabeth = new Alumno("Elisabeth Arjona Badia", "Málaga");
        Alumno francisco = new Alumno("Francisco de Paula Osuna Torres-Ternero", "Sevilla");
        Alumno ignacio = new Alumno("Ignacio César González-Bueno Escobar", "Madrid");
        Alumno jose = new Alumno("Jose Ayala Montes", "Málaga");
        Alumno juan = new Alumno("Juan José Gavilán Méndez", "Sevilla");
        Alumno juanMoreno = new Alumno("Juan Moreno Márquez", "Málaga");
        Alumno marcelo = new Alumno("Marecelo Herce Sanz", "Sevilla");
        Alumno maria = new Alumno("María Sisamón Márquez", "Sevilla");
        Alumno rafael = new Alumno("Rafael Galván Calvo", "Málaga");
        Alumno alberto = new Alumno("Alberto Fernández Gómez", "Sevilla");
        Alumno andres = new Alumno("Andrés Montaño Villafañe", "Bacercelona");
        Alumno mireya = new Alumno("Mireya Medalle Merino", "Málaga");

        alumnos.add(elisabeth);
        alumnos.add(francisco);
        alumnos.add(ignacio);
        alumnos.add(jose);
        alumnos.add(juan);
        alumnos.add(juanMoreno);
        alumnos.add(marcelo);
        alumnos.add(maria);
        alumnos.add(rafael);
        alumnos.add(alberto);
        alumnos.add(andres);
        alumnos.add(mireya);

        return  alumnos;
    }

    public void run() {
        List<Alumno> todosAlumnos = todosAlumnos();
        System.out.println(todosAlumnos);
    }


}
