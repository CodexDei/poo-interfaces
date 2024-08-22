package org.codexdei.interfaces.imprenta.modelo;

abstract public class Hoja {
    //Atributos de la clase
    protected String contenido;
    //constructor
    public Hoja(String contenido){

        this.contenido = contenido;
    }
    //metodo abstracto
    abstract public String imprimir();

}
