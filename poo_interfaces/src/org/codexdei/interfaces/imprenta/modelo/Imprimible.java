package org.codexdei.interfaces.imprenta.modelo;

public interface Imprimible {

    //Constante que puede ser usada en una interfaz
    //No se coloca "final static" porque al declararce como interface
    //El sistema asume que es una constante
    String AUTOGRAFO = "YORKING Styles XD";

    //Metodo sin implementacion(obligatoria implementacion)
    //No se coloca public porque sobraria, el sistema asume que
    //al declararce interface todos sus metodos sin implementacion son publicos
    String imprimir();
    //Metodo default(es opcional su implementacion)
    default void autografo(){
        System.out.println(AUTOGRAFO);
    }
    //Metodo estatico
    static void imprimir(Imprimible imprimible) {

        System.out.println(imprimible.imprimir());
    }
}
