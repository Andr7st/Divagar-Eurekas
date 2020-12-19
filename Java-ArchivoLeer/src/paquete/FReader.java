package paquete;
/**
 * @author Andrés Segura.
 * Leer archivos y mostarlos de texto:
 */
import java.io.File;
import java.io.FileReader;
import java.io.BufferedReader;

class LeerArchivo {

    ///public String rutaArchivo;
    // Mostrar contenido, lo nuestra por consola
    public void LeerEsteArchivo(String rutaArchivo) {

        ///this.rutaArchivo = rutaArchivo;

        // Leer el archivo (ruta), comprobar que sí exista.
        File ArchivoDeTexto = new File(rutaArchivo);

        try {
            FileReader ArchivoLeido = new FileReader(ArchivoDeTexto);
            // Mandar el archivo a la RAM (memoria).
            BufferedReader ArchivoEnMemoria = new BufferedReader(ArchivoLeido);
            // arreglo que almacenará las líneas de tu archivo
            Object[] lineas = ArchivoEnMemoria.lines().toArray();
            //
            this.objeto = lineas;
            // Se invoca con (getSaltos).
            this.saltos = lineas.length;
            // Cada linea en este caso es la posición de un arreglo.
            // por cada posicion dará un salto en la consola.
            // String[] text_ = new String[lineas.length];
            
            /*  De esta forma lo obtiene por consola, pero se desactiva al mejorar el código.
            for (int i = 0; i < lineas.length; i++) {
                System.out.println(lineas[i]);
                // text_[i] = lineas[i].toString();
                
            }*/
            // Cerrando para borrarlos de la Memoria (RAM) de tu pc.
            ArchivoLeido.close();
            ArchivoEnMemoria.close();
        } catch (Exception e) { // Si existe, pero por alguna razón no lo puede leer (casi imposible).
            // Mensaje en caso de error
            System.out.println(e.getMessage());
            System.out.println("Archivo es ilegible!!!");
        }        
    }
    // Donde se guardará el número de saltos que contiene el archivo de texto.
    private int saltos;

    // Para obtener el número de saltos que contiene el archivo de texto.
    public int SaltosLineas(){
        // Ojo: Se invoca solo si previamente se ha obtenido un archivo.
        return saltos;
    }

    private Object[] objeto;

    public Object[] getTextContent(){
        // Obtener el contenido de todo el archivo de texto. se imprime haciendo un ciclo for 
        // el limite para obtener el total es con (getSaltos).
        return objeto;
    }

    public void MostrarArchivoEnConsola(){
       // int salto = saltos;
        for (int i = 0; i < saltos; i++) {
            System.out.println(objeto[i]);
        }
    }
}

/*
Forma de invocarlo en el ejecutable: consola v1

        String ruta = "Archivo.txt";

        LeerArchivo archivo = new LeerArchivo();

        archivo.setMostrarContenido(ruta);
        
        Object[] ArregloContenido = archivo.getTextContent();

        for (int i = 0; i < archivo.getSaltos(); i++) {

            System.out.println(ArregloContenido[i]);
            
        }
*/


// Forma de invocarlo solo en consola en el ejecutable:
/*
        String rutaArchivo = "Archivo_leer.txt";
        LeerArchivo archivo = new LeerArchivo();
        archivo.setMostrarContenido(rutaArchivo);
        archivo.getMostrarEnConsola();
*/