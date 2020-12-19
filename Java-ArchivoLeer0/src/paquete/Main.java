package paquete;
/**
 * @author Andrés Segura. 
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException {


        mostrarTexto("Target\\Leer.txt");
        /*
        try {
            mostrarTexto("Target\\Leer.txt");
        } catch (Exception e) {
            System.out.println("El archivo no existe o es ilegible!!!");
        }
        */

    }

    public static void mostrarTexto(String ruta_archivo) throws FileNotFoundException, IOException {
        String cadena_de_texto;
        FileReader f = new FileReader(ruta_archivo);
        BufferedReader b = new BufferedReader(f);
        while((cadena_de_texto = b.readLine())!=null) {
            System.out.println(cadena_de_texto);
        }
        b.close();
    }
}