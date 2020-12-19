package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */
public class Practica_10 {


    public void Run(){
        ///// País - Capital
        // Imprime 10 paises con sus respectivas capitales usando un _for.

        int paises = 10;
        
        String pais[] = new String[paises];
        pais[0] = "Colombia ";
        pais[1] = "Argentina";
        pais[2] = "Brasil   ";
        pais[3] = "Chile    ";
        pais[4] = "Ecuador  ";
        pais[5] = "Uruguay  ";
        pais[6] = "Venezuela";
        pais[7] = "Peru     ";
        pais[8] = "Bolivia  ";
        pais[9] = "Paraguay ";

        String capital[] = new String[paises];
        capital[0] = "Bogota";
        capital[1] = "Buenos Aires";
        capital[2] = "Brasilia";
        capital[3] = "Santiago";
        capital[4] = "Uknown";
        capital[5] = "Uknown";
        capital[6] = "Uknown";
        capital[7] = "Uknown";
        capital[8] = "Uknown";
        capital[9] = "Uknown";

        System.out.println("PAIS       \tCAPITAL");

        for(int i=0; i<paises; i++){

            System.out.println(pais[i] + "\t" + capital[i]);

        }

    }
    
}
