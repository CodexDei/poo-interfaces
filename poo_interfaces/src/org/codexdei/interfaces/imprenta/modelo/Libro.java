package org.codexdei.interfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Libro implements Imprimible{

    //Atributos de la clase
    private List<Imprimible> paginas;
    private String titulo;
    private Persona autor;
    private Genero genero;

    //Contructor
    public Libro(String titulo, Persona autor, Genero genero){

        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        paginas = new ArrayList<>();
    }
    //metodos de la clase
    //metodo add
    public Libro addLibro(Imprimible pagina){

        paginas.add(pagina);
        return this;
    }
    //metodo imprimir
    @Override
    public String imprimir(){

        StringBuilder sb = new StringBuilder("Titulo: ")
                .append(titulo).append("\n").append("Autor: ").append(autor).append("\n")
                .append("Genero: ").append(genero).append("\n").append("TEMAS:\n");

        for (Imprimible pag: paginas){

            sb.append(pag.imprimir()).append("\n");
        }
        return sb.toString();
    }
}
