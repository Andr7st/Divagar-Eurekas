package paquete;
/**
 * @author Andrés Segura.
 */
public class Main{
    public static void main(String[] args) {
        LeerArchivo lee = new LeerArchivo();
        lee.LeerEsteArchivo("Target\\Read.txt");
        //System.out.println("\033[34m");
        lee.MostrarArchivoEnConsola();
       // System.out.println("\033[0m");
        System.out.println("\n\nSaltos de linea del archivo: " + lee.SaltosLineas() + "\n\n");
    }
}