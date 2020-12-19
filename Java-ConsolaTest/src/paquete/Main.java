package paquete;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	boolean complejo = true;
    	
        Consola COLOR = new Consola();

        String resetColor = COLOR.resetColor();

        String micolor = COLOR.getForeColor("VERDE");
        
        if(complejo == false) {
        	
        	micolor = "";
        	resetColor = "";
        }


        for (int i=0; i<25; i++){

        	
            System.out.println(micolor + "Andrés Felipe Segura Murillo" + resetColor);
            
        }
        


        Scanner entrada = new Scanner(System.in);

        System.out.print("1 para limpiar teminal: ");
        String clear = entrada.nextLine();


        if (clear.equals("1")){
        	
            COLOR.setClearTerminal(true);
            
        }

        entrada.close();
    }
}