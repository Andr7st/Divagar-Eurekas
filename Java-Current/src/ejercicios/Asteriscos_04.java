package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */
import java.util.Scanner;

public class Asteriscos_04 {
    public void Run(){

        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduzca el lado del cuadrado: ");
        int lado = entrada.nextInt();
        entrada.close();
 
        System.out.println();
        for(int row=1; row<=lado; row++){
            for(int col=1; col<=lado; col++){
                if(row==1 || row==lado || col==1 || col==lado){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
