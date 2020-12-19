package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */
import java.util.Scanner;


public class Asteriscos_02 {

    public void Run(){


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca numero de filas: ");
        int numFilas = sc.nextInt();
        sc.close();
 
        System.out.println();
        for(int altura = 1; altura<=numFilas; altura++){
            //Espacios en blanco
            for(int blancos = 1; blancos<=numFilas-altura; blancos++){
                System.out.print(" ");
            }
 
            //Asteriscos
            for(int asteriscos=1; asteriscos<=(altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }
        
        System.out.println();



    }
    
}
