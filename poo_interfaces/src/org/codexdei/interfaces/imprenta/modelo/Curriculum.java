package org.codexdei.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja{

    //Atributos de la clase
    private String persona;
    private String carrera;
    private List<String> experiencias;
    //Constructor
    public Curriculum(String persona, String carrera, String contenido) {

        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }
    //Metodo add
    public Curriculum addExperiencia(String experiencia){

        experiencias.add(experiencia);
        return this;
    }

    @Override
    public String imprimir() {

        StringBuilder sb = new StringBuilder("Nombre: ")
                .append(persona).append("\n")
                .append("Profesion: ").append(carrera).append("\n")
                .append("Resumen: ").append(contenido).append("\n")
                .append("Experiencias: ").append("\n");

        for (String exp : experiencias){

            sb.append("* ").append(exp).append("\n");
        }

        return sb.toString();
    }
}
