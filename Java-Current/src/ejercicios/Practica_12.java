package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */
public class Practica_12 {
    
    public void Run(){

        //// USO DEL FOREACH DE JAVA
 
        Object lenguajes[] = new Object[10];

        lenguajes[0] = "1";
        lenguajes[1] = "2";
        lenguajes[2] = "3";
        lenguajes[3] = "4";
        lenguajes[4] = "5";
        lenguajes[5] = "6";
        lenguajes[6] = "7";
        lenguajes[7] = "8";
        lenguajes[8] = "9";
        lenguajes[9] = "10";

        for (Object lenguaje: lenguajes) {

            System.out.println(lenguaje);
            
        }
    }
}
