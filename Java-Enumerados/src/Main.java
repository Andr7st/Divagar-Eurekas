/**
 * @author Andr7st
 * 
 * - EJERCICIO: Ejercicio rápido con la clase esprecial de enumerados.
 */

public class Main {

    public static String mensaje(String MM, int DD){
        return "El mes de " + MM + " tiene " + DD + " días.";
    }

    public static void main(String[] args) {

        int numeroMes = 0;
        int dias = 0;
        String mes = null;


        System.out.println("De 0 a 11\n");
        
        System.out.print("Ingresa el número del més: ");
        
        numeroMes = Integer.parseInt(System.console().readLine());
    

        if (numeroMes > -1 && numeroMes < 12){

            switch (numeroMes) {
                case 0:
                    mes = Mes.ENERO.getNombre();
                    dias = Mes.ENERO.getDias();
                    break;
                case 1:
                    mes = Mes.FEBRERO.getNombre();
                    dias = Mes.FEBRERO.getDias();
                    break;
                case 2:
                    mes = Mes.MARZO.getNombre();
                    dias = Mes.MARZO.getDias();
                    break;
                case 3:
                    mes = Mes.ABRIL.getNombre();
                    dias = Mes.ABRIL.getDias();
                    break;
                case 4:
                    mes = Mes.MAYO.getNombre();
                    dias = Mes.MAYO.getDias();
                    break;
                case 5:
                    mes = Mes.JUNIO.getNombre();
                    dias = Mes.JUNIO.getDias();
                    break;
                case 6:
                    mes = Mes.JULIO.getNombre();
                    dias = Mes.JULIO.getDias();
                    break;
                case 7:
                    mes = Mes.AGOSTO.getNombre();
                    dias = Mes.AGOSTO.getDias();
                    break;
                case 8:
                    mes = Mes.SEPTIEMBRE.getNombre();
                    dias = Mes.SEPTIEMBRE.getDias();
                    break;
                case 9:
                    mes = Mes.OCTUBRE.getNombre();
                    dias = Mes.OCTUBRE.getDias();
                    break;
                case 10:
                    mes = Mes.NOVIEMBRE.getNombre();
                    dias = Mes.NOVIEMBRE.getDias();
                    break;
                case 11:
                    mes = Mes.DICIEMBRE.getNombre();
                    dias = Mes.DICIEMBRE.getDias();
                    break;
            }
            /// En java 13+ es case CASO ->
            System.out.println(mensaje(mes, dias)) ;
        }
        else {


            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
            } catch (Exception e) {}



            main(args); // Reinicia el programa.
        }
    }
}