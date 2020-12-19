package paquete;
/**
 * @author Andrés Segura.
 * 
 * Clase para ponerle los colores a aplicacviones de consola más fácil.
 */
class Consola {


    ///// ORGANIZAR COLORES
    // String ANSI_code = "\u001B[35m";
    // System.out.println((char)27 + "[34;43mEjemplo de texto azul y fondo amarillo");
    
    //// Restaurar color
    private final String reset_color = "\u001B[0m";
    /* final String reset_color2 = (char)27 + "[0m";
    final String reset_color3 = "\033[0m"; */
    //// Colores de frente:
    private final String ForeColor_0 = "\033[30m"; // Negro
    private final String ForeColor_1 = "\033[31m"; // Rojo
    private final String ForeColor_2 = "\033[32m"; // Verde
    private final String ForeColor_3 = "\033[33m"; // Amarillo
    private final String ForeColor_4 = "\033[34m"; // Azul
    private final String ForeColor_5 = "\033[35m"; // Morado
    private final String ForeColor_6 = "\033[36m"; // Cian
    private final String ForeColor_7 = "\033[37m"; // Blanco
    //// Colores de fondo:
    private final String BackColor_0 = "\033[40m"; // Negro
    private final String BackColor_1 = "\033[41m"; // Rojo
    private final String BackColor_2 = "\033[42m"; // Verde
    private final String BackColor_3 = "\033[43m"; // Amarillo
    private final String BackColor_4 = "\033[44m"; // Azul
    private final String BackColor_5 = "\033[45m"; // Morado
    private final String BackColor_6 = "\033[46m"; // Cian
    private final String BackColor_7 = "\033[47m"; // Blanco
    //// Colores frente y fondo;
    // String colores1 = "\033[47;30m"; // Frente negro y fondo blanco
    // String colores2 = "\033[43;30m"; // Frente negro y fondo amarillo
    // String colores3 = "\033[42;30m"; // Frente negro y fondo Verde
    
    public String resetColor(){
        /// Devolviendo la consola a su color predeterminado.
        return reset_color; 
    }
    public String getForeColor(String FORECOLOR){
        /// Colores de la letra.
        if(FORECOLOR.equalsIgnoreCase("Black") || FORECOLOR.equalsIgnoreCase("Negro") || FORECOLOR.equals("30")){return ForeColor_0;}
        else if(FORECOLOR.equalsIgnoreCase("Red") || FORECOLOR.equalsIgnoreCase("Rojo") || FORECOLOR.equals("31")){return ForeColor_1;}
        else if(FORECOLOR.equalsIgnoreCase("Green") || FORECOLOR.equalsIgnoreCase("Verde") || FORECOLOR.equals("32")){return ForeColor_2;}
        else if(FORECOLOR.equalsIgnoreCase("Yellow") || FORECOLOR.equalsIgnoreCase("Amarillo") || FORECOLOR.equals("33")){return ForeColor_3;}
        else if(FORECOLOR.equalsIgnoreCase("Blue") || FORECOLOR.equalsIgnoreCase("Azul") || FORECOLOR.equals("34")){return ForeColor_4;}
        else if(FORECOLOR.equalsIgnoreCase("Leela") || FORECOLOR.equalsIgnoreCase("Morado") || FORECOLOR.equals("35")){return ForeColor_5;}
        else if(FORECOLOR.equalsIgnoreCase("Sky") || FORECOLOR.equalsIgnoreCase("Cian") || FORECOLOR.equals("36")){return ForeColor_6;}
        else if(FORECOLOR.equalsIgnoreCase("White") || FORECOLOR.equalsIgnoreCase("Blanco") || FORECOLOR.equals("37")){return ForeColor_7;}
        return "\u001B[0m"; // Reset
    }
    public String getBackColor(String BACKCOLOR){
        /// colores del fondo de la letra.
        if(BACKCOLOR.equalsIgnoreCase("Black") || BACKCOLOR.equalsIgnoreCase("Negro") || BACKCOLOR.equals("40")){return BackColor_0;}
        else if(BACKCOLOR.equalsIgnoreCase("Red") || BACKCOLOR.equalsIgnoreCase("Rojo") || BACKCOLOR.equals("41")){return BackColor_1;}
        else if(BACKCOLOR.equalsIgnoreCase("Green") || BACKCOLOR.equalsIgnoreCase("Verde") || BACKCOLOR.equals("42")){return BackColor_2;}
        else if(BACKCOLOR.equalsIgnoreCase("Yellow") || BACKCOLOR.equalsIgnoreCase("Amarillo") || BACKCOLOR.equals("43")){return BackColor_3;}
        else if(BACKCOLOR.equalsIgnoreCase("Blue") || BACKCOLOR.equalsIgnoreCase("Azul") || BACKCOLOR.equals("44")){return BackColor_4;}
        else if(BACKCOLOR.equalsIgnoreCase("Leela") || BACKCOLOR.equalsIgnoreCase("Morado") || BACKCOLOR.equals("45")){return BackColor_5;}
        else if(BACKCOLOR.equalsIgnoreCase("Sky") || BACKCOLOR.equalsIgnoreCase("Cian") || BACKCOLOR.equals("46")){return BackColor_6;}
        else if(BACKCOLOR.equalsIgnoreCase("White") || BACKCOLOR.equalsIgnoreCase("Blanco") || BACKCOLOR.equals("47")){return BackColor_7;}
        return "\u001B[0m"; // Reset
    }
    
    
    public String getBothColors(String BACKcolor, String FOREcolor){
        /// Ambos colores: Frente y fondo.
        int colorFodo = 40, colorFrente = 37;
        //// Si BACK equivale a numeros o a palabras.
        if (BACKcolor.equals("40") || BACKcolor.equalsIgnoreCase("Black") || BACKcolor.equalsIgnoreCase("Negro")){colorFodo = 40;}
        else if(BACKcolor.equals("41") || BACKcolor.equalsIgnoreCase("Red") || BACKcolor.equalsIgnoreCase("Rojo")){colorFodo = 41;}
        else if(BACKcolor.equals("42") || BACKcolor.equalsIgnoreCase("Green") || BACKcolor.equalsIgnoreCase("Verde")){colorFodo = 42;}
        else if(BACKcolor.equals("43") || BACKcolor.equalsIgnoreCase("Yellow") || BACKcolor.equalsIgnoreCase("Amarillo")){colorFodo = 43;}
        else if(BACKcolor.equals("44") || BACKcolor.equalsIgnoreCase("Blue") || BACKcolor.equalsIgnoreCase("Azul")){colorFodo = 44;}
        else if(BACKcolor.equals("45") || BACKcolor.equalsIgnoreCase("Leela") || BACKcolor.equalsIgnoreCase("Morado")){colorFodo = 45;}
        else if(BACKcolor.equals("46") || BACKcolor.equalsIgnoreCase("Sky") || BACKcolor.equalsIgnoreCase("Cian")){colorFodo = 46;}
        else if(BACKcolor.equals("47") || BACKcolor.equalsIgnoreCase("White") || BACKcolor.equalsIgnoreCase("Blanco")){colorFodo = 47;}
        else {
            colorFodo = 40;
        }
        //// Si FORE equivale a numeros o a palabras.
        if(FOREcolor.equals("30") || FOREcolor.equalsIgnoreCase("Black") || FOREcolor.equalsIgnoreCase("Negro")){colorFrente = 30;}
        else if(FOREcolor.equals("31") || FOREcolor.equalsIgnoreCase("Red") || FOREcolor.equalsIgnoreCase("Rojo")){colorFrente = 31;}
        else if(FOREcolor.equals("32") || FOREcolor.equalsIgnoreCase("Green") || FOREcolor.equalsIgnoreCase("Verde")){colorFrente = 32;}
        else if(FOREcolor.equals("33") || FOREcolor.equalsIgnoreCase("Yellow") || FOREcolor.equalsIgnoreCase("Amarillo")){colorFrente = 33;}
        else if(FOREcolor.equals("34") || FOREcolor.equalsIgnoreCase("Blue") || FOREcolor.equalsIgnoreCase("Azul")){colorFrente = 34;}
        else if(FOREcolor.equals("35") || FOREcolor.equalsIgnoreCase("Leela") || FOREcolor.equalsIgnoreCase("Morado")){colorFrente = 35;}
        else if(FOREcolor.equals("36") || FOREcolor.equalsIgnoreCase("Sky") || FOREcolor.equalsIgnoreCase("Cian")){colorFrente = 36;}
        else if(FOREcolor.equals("37") || FOREcolor.equalsIgnoreCase("White") || FOREcolor.equalsIgnoreCase("Blanco")){colorFrente = 37;}
        else{
            colorFrente = 37;
        }
        //// Recibe los dos parametros y los convierde a los colores deseados.
        String COLORES = String.format("\033[%d;%dm", colorFodo, colorFrente);
        //
        return COLORES;
    }




    ////// VACIAR LA TERMINAL
    boolean supervisado;
    public void setClearTerminal(boolean supervisado){

        //// Para vaciar la consola, es decir que la consola que borra todo.
        this.supervisado = supervisado;
        if(supervisado){
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
        else{
            /// Si no está supervisado, es decir si supervisado es falso, 
            // ejecurará esto, que es más compatible con windows.
            try {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
                
            } catch (Exception e) {}
        }
    }
}