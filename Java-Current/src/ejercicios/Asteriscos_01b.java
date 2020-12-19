package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */
import java.util.Scanner;

public class Asteriscos_01b {

    public void Run(){


        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingresa el numero de pisos: ");
        int numPisos = Integer.parseInt(entrada.nextLine());
        entrada.close();

        // El caracter que compone la pirámide.
        char caracter = '\u0668';

        // Crea una pirámide de caracteres.
        int i = 0;
        for (int j=0; j<=numPisos; j++){
            int k = 0;
            while(k <= i){
                System.out.printf("%c", caracter);
                k++;
            }
            i++;
            System.out.println();
        }
       
    }
    
}
