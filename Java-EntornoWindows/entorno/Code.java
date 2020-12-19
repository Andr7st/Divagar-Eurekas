
/** - ANDRÉS FELIPE SEGURA MURILLO
 * Obtener el resutado de texto de comando ingresado a la copnsola
 * CMD almacenandolo en java
 */
package entorno;


import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;

public class Code{ // v2b guarda el contenido en un documento de texto externo 
    public static void main(String[] args) {
        String margen = "----------------------------------------------------------------------------------------!";
        final String autor = "@Seg1st - Estudiante miembro del grupo \"El Programador\"";
        String ve[] = new String[14];

        ve[0] = "ECHO VARIABLES DE ENTORNO:";
        ve[1] = "echo S.O actual........................: %OS% ";
        ve[2] = "echo Fecha actual......................: %DATE%";
        ve[3] = "echo Hora actual.......................: %TIME%";
        ve[4] = "echo Nombre del PC.....................: %COMPUTERNAME%";
        ve[5] = "echo Nombre del usuario................: %USERNAME%";
        ve[6] = "echo Directorio raiz del sistema.......: %SYSTEMROOT%";
        ve[7] = "echo Directorio en que te encuentras...: %CD%";
        ve[8] = "echo Directorio de archivos temporales.: %TEMP%";
        ve[9] = "echo Procesador........................: %PROCESSOR_IDENTIFIER%";
        ve[10] = "echo Procesador arquitectura...........: %PROCESSOR_ARCHITECTURE%";
        ve[11] = "echo Procesador nucleos................: %NUMBER_OF_PROCESSORS%";
        ve[12] = "echo Procesador modelo.................: %PROCESSOR_LEVEL%";
        ve[13] = "echo Procesador revision...............: %PROCESSOR_REVISION%";

        Scanner entrada = new Scanner(System.in);


        // llamar al cmd para ingresarle el comando, pero sin abrir la ventana CMD
        String llamar_cmd = "cmd.exe /C "; 
        // Comando cmd que ingresa al cmd
        String comando_cmd =  ve[1]+" && "+ve[2]+" && "+ve[3]+" && "+ve[4]+" && "+ve[5]+" && "+ve[6]+" && " + ve[7] +" && "+ve[8] +" && "+ve[9]+" && "+ve[10]+" && "+ve[11]+" && "+ve[12]+" && "+ve[13];

        try {      
                  
            Runtime tiempoEjecucion = Runtime.getRuntime();
            Process proceso = tiempoEjecucion.exec(llamar_cmd + comando_cmd);
            InputStream capturarProceso = proceso.getInputStream();
            InputStreamReader leerProceso = new InputStreamReader(capturarProceso);


            BufferedReader lecturaBuffer = new BufferedReader(leerProceso);
            // En esta versión se pone dentro de un arreglo
            // Cada vez que lea un salto de linea lo almacena dentro del arreglo de objeto
            Object linea[] = lecturaBuffer.lines().toArray();            
            // imrimir en archivo
            File archivo = new File("Datos.txt");
            archivo.exists(); // devuelve verdadero si existe y falso si no.

            PrintWriter escribir_archivo = new PrintWriter(archivo);

            System.out.println(margen + "\nVARIABLES DE ENTORNO:\n" + margen);
            escribir_archivo.println(margen + "\nVARIABLES DE ENTORNO:\n" + margen);

            for (int i = 0; i < linea.length; i++) {
                // capturando los datos y escribirlos en la ventana de consola
                System.out.println(linea[i].toString());
                // Capturando los datos y escribiendolo en el archivo externo
                escribir_archivo.println(linea[i]);
            }
            System.out.println(margen + "\n\n" + autor  + "\n");
            escribir_archivo.println(margen + "\n\n" + autor  + "\n");

            System.out.print("Presionar Enter para finalizar...");
            String finalizar = entrada.nextLine();
            System.out.println(finalizar);

            entrada.close();
            lecturaBuffer.close();
            escribir_archivo.close(); // Cerrando el archivo
        } 
        catch (Exception e) {
            System.out.println(e);
        }
        System.gc();
        System.exit(0); // 
    }
}