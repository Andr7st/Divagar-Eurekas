/**
 * Escribir dentro de un documento de texto plano.
 */
package paquete;

import java.io.File;
import java.io.PrintWriter;
/**
 * @author ANDRES SEGURA
 */
public class Escribir_archivo_2 {
    public static void main(String[] args) {
        String texto = "contenido \ndentro \ndel \ntexto";
        try {
            File mi_archivo = new File("Target\\FileToWrtite2.txt");
            // devuelve verdadero si existe y falso si no.
            mi_archivo.exists();             
            // podría escribir el String del nombre de archivo entre los parentesis
            PrintWriter Pw = new PrintWriter(mi_archivo);
            Pw.println(texto);
            // Para qque cierre el proceso de escritura, equivalente a un console.close()
            Pw.close(); 
            // Obtener la ruta absoluta hacia el archivo
            String Ruta_archivo = String.format(mi_archivo.getAbsolutePath());
            // Mostrar un mensaje que confirme que ya ha sido fuardado
            System.out.println("\nEl archivo ha sido guardado satisfactoriamente en: \n" + Ruta_archivo + "\nFin de la ejecucion.\n");
        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
        System.exit(0);
    }
}