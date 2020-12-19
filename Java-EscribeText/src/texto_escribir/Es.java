package texto_escribir;

import java.io.File;
import java.io.PrintWriter;

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