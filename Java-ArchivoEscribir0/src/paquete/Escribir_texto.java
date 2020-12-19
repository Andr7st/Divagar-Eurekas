/**
 * Imprimir texto por consola.
 * Imprimir texto en un archivo de texto externo.
 */
package paquete;

import java.io.FileNotFoundException;
import java.io.PrintStream;

/**
 * @author ANDRÉS SEGURA
 * Basado en 
 */

public class Escribir_texto{
    public static void main(String[] args) throws FileNotFoundException {

        // iMPRIMIR POR CONSOLA:
        PrintStream por_consola = new PrintStream(System.out);
        por_consola.println("Dato");
        por_consola.println("Ingresado");
        por_consola.println("hacia \nla");
        por_consola.println("consola");
        por_consola.println(7);
        por_consola.close();

        /**
         *  IMPRIMIR EN UN ARCHIVO EXTERNO EN RUTA ESPECIFICADA:
         *  - La carpeta ya debe estar creada previamente.
         */
        try(PrintStream archivo_externo = new PrintStream("Target\\Archivo0.txt")){
            archivo_externo.println("ANDRÉS FELIPE SEGURA MURILLO");
            archivo_externo.println("archivo de texto");
            archivo_externo.close();
        }
        //System.out.println("\nSe ha escrito en un archivo de texto satisfactoriamente!!");
    }
}