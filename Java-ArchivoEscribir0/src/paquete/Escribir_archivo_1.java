/**
 * Escribir dentro de un documento de texto plano.
 */
package paquete;

import java.io.File;
import java.io.PrintWriter;
/**
 * @author ANDRES SEGURA
 */
public class Escribir_archivo_1 {
    public static void main(String[] args) {
        String texto = "contenido \ndentro \ndel \ntexto";
        try {
            PrintWriter Pw = new PrintWriter(new File("Target/FileToWrite1.txt"));
            Pw.println(texto);
            // Para que cierre el proceso de escritura, equivalente a un console.close()
            Pw.close();
            // Mostrar un mensaje que confirme que ya ha sido fuardado
            System.out.println("\nEl archivo ha sido guardado satisfactoriamente!!!\n");
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        System.exit(0);
    }
}