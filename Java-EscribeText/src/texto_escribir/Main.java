package texto_escribir;
/**
 * 
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        EscribirArchivo esc = new EscribirArchivo();

        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribir hacia un archivo de texto.");

        System.out.println();

        int caso = 1;

        switch(caso){
            case 1: // Ingresar desde consola
                System.out.print("saltos de linea: ");
                int lineas = entrada.nextInt();

                Object $content[] = new Object[lineas];
                for(int i=0; i<lineas; i++){
                    $content[i] = entrada.nextLine();
                    System.out.print("\033[32mentrada[" + i + "]: \033[0m");
                }
            
                esc.setEscribirContenido("Creado.txt", $content);
            
            break;
            default: // Escribir algo preestablecido:
            
                Object $content0[] = new Object[4];
                $content0[0] = "1";
                $content0[1] = "2";
                $content0[2] = "3";
                $content0[3] = "4";
                esc.setEscribirContenido("P.txt", $content0);

            break;
        }


        entrada.close();
    }
}