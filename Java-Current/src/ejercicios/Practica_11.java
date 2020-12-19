package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */
public class Practica_11 {
    public void Run(){

        // Arreglo bidimensional.
        // Ciclo for anidado.
        
        int paises = 10;
        int capital = 2;

        char tablulacion = '\t';

        String pais[][] = new String[paises][capital];

        pais[0][0] = "Colombia ";
        pais[0][1] = tablulacion + "Bogota";
        pais[1][0] = "Argnetina";
        pais[1][1] = tablulacion + "Buenos Aires";
        pais[2][0] = "Brasil   ";
        pais[2][1] = tablulacion + "Brasilia";
        pais[3][0] = "Chile    ";
        pais[3][1] = tablulacion + "Santiago";
        pais[4][0] = "Ecuador  ";
        pais[4][1] = tablulacion + "-";
        pais[5][0] = "Uruguay  ";
        pais[5][1] = tablulacion + "Montevideo";
        pais[6][0] = "Venezuela";
        pais[6][1] = tablulacion + "-";
        pais[7][0] = "Peru     ";
        pais[7][1] = tablulacion + "-";
        pais[8][0] = "Bolivia  ";
        pais[8][1] = tablulacion + "-";
        pais[9][0] = "Paraguay ";
        pais[9][1] = tablulacion + "Asuncion";
        

        for(int i=0; i<paises; i++){

            for(int j=0; j<capital; j++){

                System.out.print(pais[i][j]);
                
            }

            System.out.println();
        }

    }
}
