package org.codexdei.interfaces.imprenta;

import org.codexdei.interfaces.imprenta.modelo.Curriculum;
import org.codexdei.interfaces.imprenta.modelo.Hoja;
import org.codexdei.interfaces.imprenta.modelo.Informe;

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

        imprimir(cv);
        imprimir(informe);
    }

    public static void imprimir(Hoja imprimible) {

        System.out.println(imprimible.imprimir());
    }
}
