package ejercicios;
/**
 * @author Andrés Segura
 * @author Andr7st
 * - Practica de programación en Java.
 */
public class practica_08 {

    public void run(){

        
        //// Practica con String.fotmat
        // String
        String salida = String.format("%s / %d", "Abril", 2020 );
        System.out.println(salida); // Abril / 2020
        // String
        String miNombre = "Andrés Segura";
        System.out.printf("Mi nombre es %s%n", miNombre); // Mi nombre es Andrés
        // Cualquier valor.
        System.out.printf("Learning programming: %b%n", true);
        // Imprimir caracter casteando
        int num = 64;
        char caracter = (char)num;
        System.out.printf("Caracter %c%n", caracter);
        // Imprimir caracter 
        char caracterUnicode = '\u0057';
        System.out.printf("Caracter unicode: %c%n", caracterUnicode);
        // Integer
        byte  numByte = 42;
        Short numShort = 36;
        int   numInt = 2030;
        long  numLong = 95863154L;
        System.out.printf("Numeros enteros: %d %d %d %d \n", numByte, numShort, numInt, numLong );
        // Flotantes notacion cientifica
        float realFloat = 1.526e4f;
        System.out.printf("Notacion cientifica: %e%n", realFloat);
        // Flotantes
        System.out.printf("Numero flotante: %f \n", 15.24f);
        // Separar las milesimas
        int pagoMensual = 182424;
        System.out.printf("Total pagar: %,d \n", pagoMensual);
        // Especificar longitud minima del texto.
        System.out.printf("%.14s \n", "habia una vez un barco bien chiquitito");
        
        /*
        System.out.printf();
        %o	integer (incl. byte, short, int, long, bigint)	Octal number
        %s	any type	String value
        %t	Date/Time (incl. long, Calendar, Date and TemporalAccessor)	%t is the prefix for Date/Time conversions. More formatting flags are needed after this. See Date/Time conversion below.
        %x	integer (incl. byte, short, int, long, bigint)	Hex string.
        */


    }
    
}
