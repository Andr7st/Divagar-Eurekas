package paquete;
/**
 * @author Andrés Segura.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// Instanciar mi clase.
        EscribirArchivo escribir = new EscribirArchivo();
        /// Instanciar Scaner de consola.
        Scanner ingreso = new Scanner(System.in);


        String RutaDeArchivo = "Target/File.txt";


        System.out.println("Escribir archivo, si ya existe se sobreescibirá nuevo archivo.");
        System.out.println("Ingresa 0 para escritura predeterminada, 1 para escribir por consola");
        System.out.print("Ingresa: ");

        
        int caso = Integer.parseInt(ingreso.nextLine());

        switch (caso) {
            case 0:
                   // Ejemplo de un arreglo objeto
                Object Contenido[] = new Object[3];
                Contenido[0] = "000000000000";
                Contenido[1] = "111111111111";
                Contenido[2] = "222222222222";
                escribir.setEscribirContenido(RutaDeArchivo, Contenido);
                System.out.println("\nEl archivo ha sido escrito en la siguiente ruta:\n" + escribir.getRutaAbsoluta());
                break;
        
            case 1:

                System.out.print("Ingresa número de lineas: ");
                int lineas = Integer.parseInt(ingreso.nextLine());
                Object ingresado[] = new Object[lineas];

                for(int i=0; i<lineas; i++){
                    System.out.print("Linea " + (1+i) +": ");
                    ingresado[i] = ingreso.nextLine();
                }
                escribir.setEscribirContenido(RutaDeArchivo, ingresado);
                break;
            default:
                System.out.println("Entrada inválida, salir.");
                System.exit(0);;
                break;
        }


        ingreso.close();



 
        // Como invocar
        // Opcional mostrar la ruta en donde se guarda.
        ///System.out.println("\nEl archivo ha sido escrito en la siguiente ruta:\n" + archivo_escribir.getRutaAbsoluta());

    }
}