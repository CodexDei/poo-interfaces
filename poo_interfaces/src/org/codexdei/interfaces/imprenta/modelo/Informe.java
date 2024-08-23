package org.codexdei.interfaces.imprenta.modelo;

public class Informe extends Hoja implements Imprimible{

    //Atributos de la clase
    private Persona autor;
    private Persona revisor;

    //Constructor
    public Informe(Persona autor, Persona revisor, String contenido){

        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + this.autor + "\n" +
               "Revisado por: " + this.revisor + "\n" +
               this.contenido + "\n";
    }
}
