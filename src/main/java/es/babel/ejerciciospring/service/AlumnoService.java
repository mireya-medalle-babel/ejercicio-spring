package es.babel.ejerciciospring.service;

import es.babel.ejerciciospring.domain.Alumno;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Service
public class AlumnoService {
    public List<Alumno> agruparAlumnos(int numeroAgrupacion, List<Alumno> todosAlumnos) {
        double numeroGrupos = Math.ceil((double) todosAlumnos.size()/numeroAgrupacion);

        for (int i = 0; i < numeroGrupos; i++) {

        }

        return todosAlumnos;
    }




}
