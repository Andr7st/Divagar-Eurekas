package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */

import java.util.Scanner;


public class Asteriscos_03 {

    public void Run(){


        Scanner entrada = new Scanner(System.in);

        
        System.out.print("Introduce la altura: ");
        int laAltura = entrada.nextInt();
        entrada.close();
        
        
        for (int altura=laAltura; altura>0; altura--){
            for(int blancos=1; blancos<=laAltura-altura; blancos++){
                System.out.print(" ");
            }
            for(int asteriscos=1; asteriscos <= (altura*2)-1; asteriscos++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}

/*
for (int altura=6; altura>0; altura--){

for(int blancos=1; blancos<=6-altura; blancos++){
    System.out.print(" ");
}
for(int asteriscos=1; asteriscos <= (altura*2)-1; asteriscos++){
    System.out.print("*");
}
System.out.println();
}




*/