package es.babel.ejerciciospring.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@AllArgsConstructor
public class Alumno {
    private String nombre;
    private String ciudad;
}
