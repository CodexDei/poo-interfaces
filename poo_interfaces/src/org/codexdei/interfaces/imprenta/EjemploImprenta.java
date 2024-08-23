package org.codexdei.interfaces.imprenta;

import org.codexdei.interfaces.imprenta.modelo.*;

//Se importan estaticas para usar directamente los elementos del Enum
import static org.codexdei.interfaces.imprenta.modelo.Genero.PROGRAMACION;
import static org.codexdei.interfaces.imprenta.modelo.Genero.REALISMO_MAGICO;
//El siguiente import permite usar el metodo imprimir de la interface como si fuera de esta clase
import static org.codexdei.interfaces.imprenta.modelo.Imprimible.imprimir;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum(new Persona("Luis" ,"Castillo"),"Ingeniero de sistemas",
                        "Resumen laboral....");

        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Informe informe = new Informe(new Persona("Marye", "Mora"),
                          new Persona( "Samy", "Acosta"),
                "Estudio sobre microservicios");

        Libro libro1 = new Libro("Patrones de diseño: Elem. Reusables POO",
                            new Persona("Erich", "Gamma"), PROGRAMACION);

        libro1.addLibro(new Pagina("Patron Singleton"))
                .addLibro(new Pagina("Patron Observador"))
                .addLibro(new Pagina("Patron Factory"))
                .addLibro(new Pagina("composite"))
                .addLibro(new Pagina("Facade"));

        Libro libro2 = new Libro("Cien años de soledad",
                        new Persona("Gabriel", "Garcia Marquez"),REALISMO_MAGICO);

        libro2.addLibro(new Pagina("capitulo 1: Inicio del realismo mágico en Macondo"))
                .addLibro(new Pagina("Capítulo 4: La llegada de Rebeca y los misterios de su origen"))
                .addLibro(new Pagina("Capítulo 7: La muerte de José Arcadio Buendía"));

        //clase anonima de la interface
        imprimir(new Imprimible() {
            @Override
            public String imprimir() {
                return "\n******************************************\n" +
                        "*************CLASE ANONIMA****************\n" +
                        "******************************************\n";
            }
        });


        //Este metodo es de la interface Imprimible, se puede usar porque tiene un
        //import static
        imprimir(cv);
        imprimir(informe);
        libro1.autografo();
        imprimir(libro1);
        imprimir(libro2);




    }
}
