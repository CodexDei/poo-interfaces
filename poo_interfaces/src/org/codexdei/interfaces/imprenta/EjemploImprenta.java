package org.codexdei.interfaces.imprenta;

import org.codexdei.interfaces.imprenta.modelo.*;

//Se importan estaticas para usar directamente los elementos del Enum
import static org.codexdei.interfaces.imprenta.modelo.Genero.PROGRAMACION;
import static org.codexdei.interfaces.imprenta.modelo.Genero.REALISMO_MAGICO;

public class EjemploImprenta {

    public static void main(String[] args) {

        Curriculum cv = new Curriculum("Luis Castillo","Ingeniero de sistemas",
                        "Resumen laboral....");

        cv.addExperiencia("Java")
                .addExperiencia("Oracle DBA")
                .addExperiencia("Spring Framework")
                .addExperiencia("Desarrollador fullstack")
                .addExperiencia("Angular");

        Informe informe = new Informe("Marye Mora", "Samy Acosta",
                "Estudio sobre microservicios");

        Libro libro1 = new Libro("Patrones de diseño: Elem. Reusables POO",
                            "Erich Gamma", PROGRAMACION);

        libro1.addLibro(new Pagina("Patron Singleton"))
                .addLibro(new Pagina("Patron Observador"))
                .addLibro(new Pagina("Patron Factory"))
                .addLibro(new Pagina("composite"))
                .addLibro(new Pagina("Facade"));

        Libro libro2 = new Libro("Cien años de soledad",
                        "Gabriel Garcia Marquez",REALISMO_MAGICO);

        libro2.addLibro(new Pagina("capitulo 1: Inicio del realismo mágico en Macondo"))
                .addLibro(new Pagina("Capítulo 4: La llegada de Rebeca y los misterios de su origen"))
                .addLibro(new Pagina("Capítulo 7: La muerte de José Arcadio Buendía"));

        imprimir(cv);
        imprimir(informe);
        imprimir(libro1);
        imprimir(libro2);
    }

    public static void imprimir(Imprimible imprimible) {

        System.out.println(imprimible.imprimir());
    }
}
