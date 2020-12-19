package paquete;
/**
 * @author Andrés Segura
 * 
 * Ejecutar un comando cmd windows.
 */
public class Main{
    public static void main(String[] args) {
        // Instanciar.
        Comando comando = new Comando();
        // Este comando de ejemplo guardará la salida del cmd dentro de un fichero *.txt
        comando.ejecutar("ipconfig > Target/ipconfig.txt");
    }
}
class Comando{

    public void ejecutar(String command_prompt){

        try {            
            Runtime tiempoEjecucion = Runtime.getRuntime();
            // Llamar al cmd y pasarle un comando
            tiempoEjecucion.exec("cmd.exe /C " + command_prompt);

            System.out.println("El comando ha sido enviado.");
        } 
        catch (Exception e) {

            System.out.println("Error " + e);
        }
    }
}