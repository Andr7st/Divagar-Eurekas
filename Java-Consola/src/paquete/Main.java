package paquete;

public class Main {
    public static void main(String[] args) {
        
        Consola consola = new Consola();

        String Nombre = "Andres Segura.";

        //System.out.print((char)27 + "[30;46m");
        System.out.print("\033[33m");
        //consola.setColor("30", "46");
        System.out.println(Nombre);
        consola.setEsperarEnter("Waiting for enter . . .");
        System.out.println(Nombre);
        //System.out.print((char)27 + "[0m");
        //System.out.print("\033[0m");
        consola.ClearColor();
        System.out.println(Nombre);
        System.out.println(Nombre);
        // Cerrar proceso ???
        System.out.print("\033[0m");
        System.gc();
        System.exit(0);
    }
}