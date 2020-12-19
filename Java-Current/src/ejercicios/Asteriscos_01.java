package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */

import java.util.Scanner;

public class Asteriscos_01 {
    
    public void Run(){


        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el número de pisos: ");
        int numFilas = sc.nextInt();
 
        for(int i=1; i<=numFilas; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
 
        sc.close();




    }
}
