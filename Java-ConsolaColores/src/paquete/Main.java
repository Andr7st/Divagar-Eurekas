package paquete;
/**
 * @author Andrés Segura.
 * Imprimir en consola con colores.
 */
public class Main{
    public static void main(String[] args) {
        Consola consola = new Consola();
        //consola.disableColor(true);
        consola.PutColor("yellow");
        System.out.println("Andrés Segura");
        consola.PutColor("azul");
        System.out.println("Andrés Segura");
        consola.PutColor("rojo");
        System.out.println("Andrés Segura");
        consola.PutColor("default");

        String color = "Green";

        consola.Println(color, "Andres Segura");

        System.exit(0);
    }
}

class Consola{ /// PrintColor
/**
 * @author Andrés Segura.
 */
    ////// Manejo de colores.
    private boolean activar_color = true;

    private String colorNegro    = "\033[30m";
    private String colorRojo     = "\033[31m";
    private String colorVerde    = "\033[32m";
    private String colorAmarillo = "\033[33m";
    private String colorAzul     = "\033[34m";
    private String colorMorado   = "\033[35m";
    private String colorCian     = "\033[36m";
    private String colorBlanco   = "\033[37m";
    private String colorDefault  = "\033[0m";


    public boolean disableColor(boolean c){
        /**
         * SIRVE PARA DESACTIVAR LA IMPRESIÓN CON COLOR EN CASO QUE NO SE QUIERA.
         */
        if(c){
            return activar_color = false;
        }
        return activar_color = true;
    }

    public void PutColor(String c){
        /**
         * IMPRIMIR STRING CON COLOR, SIN SALTO DE LÍNEA.
         */
        if (activar_color == false){

            this.colorNegro = "";
            this.colorRojo= "";
            this.colorVerde= "";
            this.colorAmarillo= "";
            this.colorAzul= "";
            this.colorMorado= "";
            this.colorCian= "";
            this.colorBlanco = "";
            this.colorDefault = "";
        }

        if(c.equalsIgnoreCase("Black")       || c.equalsIgnoreCase("Negro")    || c.equals("30")){                    
            System.out.print(colorNegro);
        }
        else if(c.equalsIgnoreCase("Red")    || c.equalsIgnoreCase("Rojo")     || c.equals("31")){
            System.out.print(colorRojo);
        }
        else if(c.equalsIgnoreCase("Green")  || c.equalsIgnoreCase("Verde")    || c.equals("32")){
            System.out.print(colorVerde);
        }
        else if(c.equalsIgnoreCase("Yellow") || c.equalsIgnoreCase("Amarillo") || c.equals("33")){
            System.out.print(colorAmarillo);
        }
        else if(c.equalsIgnoreCase("Blue")   || c.equalsIgnoreCase("Azul")     || c.equals("34")){
            System.out.print(colorAzul);
        }
        else if(c.equalsIgnoreCase("Leela")  || c.equalsIgnoreCase("Morado")   || c.equals("35")){
            System.out.print(colorMorado);
        }
        else if(c.equalsIgnoreCase("Sky")    || c.equalsIgnoreCase("Cian")     || c.equals("36")){
            System.out.print(colorCian);
        }
        else if(c.equalsIgnoreCase("White")  || c.equalsIgnoreCase("Blanco")   || c.equals("37")){
            System.out.print(colorBlanco);
        }else{
            System.out.print(colorDefault);   
        }
    }

    public void Print(String ForeColor, String PrintString){
        /**
         * IMPRIMIR STRING CON COLOR, SIN SALTO DE LÍNEA.
         */
        if (activar_color == false){
            this.colorNegro = "";
            this.colorRojo= "";
            this.colorVerde= "";
            this.colorAmarillo= "";
            this.colorAzul= "";
            this.colorMorado= "";
            this.colorCian= "";
            this.colorBlanco = "";
            this.colorDefault = "";
        }
        if(ForeColor.equalsIgnoreCase("Black")       || ForeColor.equalsIgnoreCase("Negro")    || ForeColor.equals("30")){                    
            System.out.print(colorNegro + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Red")    || ForeColor.equalsIgnoreCase("Rojo")     || ForeColor.equals("31")){
            System.out.print(colorRojo + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Green")  || ForeColor.equalsIgnoreCase("Verde")    || ForeColor.equals("32")){
            System.out.print(colorVerde + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Yellow") || ForeColor.equalsIgnoreCase("Amarillo") || ForeColor.equals("33")){
            System.out.print(colorAmarillo + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Blue")   || ForeColor.equalsIgnoreCase("Azul")     || ForeColor.equals("34")){
            System.out.print(colorAzul + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Leela")  || ForeColor.equalsIgnoreCase("Morado")   || ForeColor.equals("35")){
            System.out.print(colorMorado + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Sky")    || ForeColor.equalsIgnoreCase("Cian")     || ForeColor.equals("36")){
            System.out.print(colorCian + PrintString +  colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("White")  || ForeColor.equalsIgnoreCase("Blanco")   || ForeColor.equals("37")){
            System.out.print(colorBlanco + PrintString + colorDefault);
        }else{
            System.out.print(PrintString);   
        }
    }
    public void Println(String ForeColor, String PrintString){
        /**
         * IMPRIMIR STRING CON COLOR, CON SALTO DE LÍNEA.
         */
        if (activar_color == false){
            this.colorNegro = "";
            this.colorRojo= "";
            this.colorVerde= "";
            this.colorAmarillo= "";
            this.colorAzul= "";
            this.colorMorado= "";
            this.colorCian= "";
            this.colorBlanco = "";
            this.colorDefault = "";
        }
        if(ForeColor.equalsIgnoreCase("Black")       || ForeColor.equalsIgnoreCase("Negro")    || ForeColor.equals("30")){                    
            System.out.println(colorNegro + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Red")    || ForeColor.equalsIgnoreCase("Rojo")     || ForeColor.equals("31")){
            System.out.println(colorRojo + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Green")  || ForeColor.equalsIgnoreCase("Verde")    || ForeColor.equals("32")){
            System.out.println(colorVerde + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Yellow") || ForeColor.equalsIgnoreCase("Amarillo") || ForeColor.equals("33")){
            System.out.println(colorAmarillo + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Blue")   || ForeColor.equalsIgnoreCase("Azul")     || ForeColor.equals("34")){
            System.out.println(colorAzul + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Leela")  || ForeColor.equalsIgnoreCase("Morado")   || ForeColor.equals("35")){
            System.out.println(colorMorado + PrintString + colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("Sky")    || ForeColor.equalsIgnoreCase("Cian")     || ForeColor.equals("36")){
            System.out.println(colorCian + PrintString +  colorDefault);
        }
        else if(ForeColor.equalsIgnoreCase("White")  || ForeColor.equalsIgnoreCase("Blanco")   || ForeColor.equals("37")){
            System.out.println(colorBlanco + PrintString + colorDefault);
        }else{
            System.out.print(PrintString);   
        }
    }
}

class Terminal{
    ///// Ejecutar comando cmd windows.
    public void ejecutar_cmd(String command_prompt){
        try {            
            Runtime ejecucion = Runtime.getRuntime();
            // Llamar al cmd y pasarle un comando, externo.
            ejecucion.exec("cmd.exe /C " + command_prompt);
        } 
        catch (Exception e) {
            System.out.println("Error.\n" + e);
        }
    }
}