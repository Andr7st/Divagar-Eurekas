package src;
/**
 * @author Andrés Segura
 * Guardar contenido dentro de un archivo de texto simple.
 */
import java.io.File;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {

        EscribirArchivo $write = new EscribirArchivo();
        //// dentro de la raiz del proyecto se encuentra una carpeta llamada out.
        String ruta = "out\\File.txt";
        //// Una forma de definir el contenido que se guardará dentro del archivo.
        Object contenido[] = new Object[10];
        ////
        contenido[0] = "Ejercicio: Fichero escrito desde Java\nAndrés Segura\n";
        contenido[1] = "Colombia";
        contenido[2] = "España";
        contenido[3] = "Mexico";
        contenido[4] = "Brasil";
        contenido[5] = "Ecuador";
        contenido[6] = "Perú";
        contenido[7] = "Venezuela";
        contenido[8] = "Argentina";
        contenido[9] = "Alemania";
        //// 
        $write.setEscribirContenido(ruta, contenido);
        //// Obtener la ruta donde se guardó.
        String guardado_en = (String)($write.getRutaAbsoluta());
        //// 
        System.out.println("Se ha guardado es: " + guardado_en);
    }
}

class EscribirArchivo {

    public String rutaEscribir;
    private String rutaTotal; // La ruta absoluta del archivo
    public Object[] Contenido;
    // El contenido debe ser un arreglo de objetos.
    // cada posicion del arreglo es un salto de linea
    public void setEscribirContenido(String rutaEscribir, Object[] Contenido){

        this.rutaEscribir = rutaEscribir;
        this.Contenido = Contenido;

        File ArchivoEscribir = new File(rutaEscribir);
        try {
            PrintWriter EscribirLinea = new PrintWriter(ArchivoEscribir);

            for(int i=0; i<Contenido.length; i++) {
                EscribirLinea.println(Contenido[i]);
            }
            EscribirLinea.close();
            // Mostrar un mensaje que confirme que ya ha sido fuardado
            //System.out.println(ArchivoEscribir.getAbsolutePath());
            // Para el getter
            this.rutaTotal = ArchivoEscribir.getAbsolutePath();

        } catch (Exception err) {
            System.out.println(err.getMessage());
        }
    }
    // Para mostrar la ruta absoluta en donde se ha escrito el archivo (opcional).
    public String getRutaAbsoluta(){
        return rutaTotal;
    }
}