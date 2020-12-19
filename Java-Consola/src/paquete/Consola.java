package paquete;
/**
 * @author Andrés Segura.
 * Creando mi propia clase para manejar algúnas propiedades para mis programas de consola.
 * 
 * - Esta clase sólo es para uso personal, no compartirla hasta que se compruebe
 * - Version 1.1.1
 */

import java.io.IOException;

class Consola{

    final private String autor = "Andrés Segura"; // Mi nombre, soy el autor intelectual de esta clase.
    private String Frente; // Color
    private String Fondo; // Color

    public void getLimpiarTerminal(){
        // Limpiar la terminal linux, para su uso en windows, previamente debe 
        // ser configurado el cmd/powershell para usar coracteres especiales - colores.
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void getLimpiarConsola(){
        // Limpiar la consola de comandos, es decir borrar todo.
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();            
        } catch (Exception e) {/*No hacer nada*/}
    }
    
    // Esperar que el usuario oprima la tecla enter para continuar con la ejecucion del programa.
    public void setEsperarEnter(String Mensaje){

        if(Mensaje.equals("Default") || Mensaje.equals("0")){
            Mensaje = "Presionar Enter para continuar . . .";
        }

        System.out.print(Mensaje);
        // Una forma de esperar la tecla enter para continuar.
        // Requisitos: - import java.io.IOException;
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getNombreAutor(){
        return autor;
    }



    public void setColor(String ColorFrente, String ColorFondo){
        // Pasando todo a minusculas
        ColorFrente = ColorFrente.toLowerCase();
        ColorFondo = ColorFondo.toLowerCase(); 
        // this.Frente = frente...
        Frente = ColorFrente;
        Fondo = ColorFondo;
        // 
        String separador = ";";
        // Coplores de frente 
        if(Frente.equals("negro")         || Frente.equals("black")  || Frente.equals("30")){ Frente = "30";}
        else if(Frente.equals("rojo")     || Frente.equals("red")    || Frente.equals("31")){ Frente = "31";}
        else if(Frente.equals("verde")    || Frente.equals("green")  || Frente.equals("32")){ Frente = "32";}
        else if(Frente.equals("amarillo") || Frente.equals("yellow") || Frente.equals("33")){ Frente = "33";}
        else if(Frente.equals("azul")     || Frente.equals("blue")   || Frente.equals("34")){ Frente = "34";}
        else if(Frente.equals("rosa")     || Frente.equals("pink")   || Frente.equals("35")){ Frente = "35";}
        else if(Frente.equals("celeste")  || Frente.equals("cian")   || Frente.equals("36")){ Frente = "36";}
        else if(Frente.equals("blanco")   || Frente.equals("white")  || Frente.equals("37")){ Frente = "37";}
        else{ Frente = ""; separador = ""; }
        // colores de fondo
        if(Fondo.equals("negro")         || Fondo.equals("black")  || Fondo.equals("40")){ Fondo = "40";}
        else if(Fondo.equals("rojo")     || Fondo.equals("red")    || Fondo.equals("41")){ Fondo = "41";}
        else if(Fondo.equals("verde")    || Fondo.equals("green")  || Fondo.equals("42")){ Fondo = "42";}
        else if(Fondo.equals("amarillo") || Fondo.equals("yellow") || Fondo.equals("43")){ Fondo = "43";}
        else if(Fondo.equals("azul")     || Fondo.equals("blue")   || Fondo.equals("44")){ Fondo = "44";}
        else if(Fondo.equals("rosa")     || Fondo.equals("pink")   || Fondo.equals("45")){ Fondo = "45";}
        else if(Fondo.equals("celeste")  || Fondo.equals("cian")   || Fondo.equals("46")){ Fondo = "46";}
        else if(Fondo.equals("blanco")   || Fondo.equals("white")  || Fondo.equals("47")){ Fondo = "47";}
        else{ Fondo = ""; separador = ""; }
        // "\033[33;43m"
        String ColorActual = "\033[" + Frente + separador + Fondo + "m";
        //
        System.out.print(ColorActual);
    }

    public void ClearColor(){
        // Resetear color al predeterminado de la consola.
        // Resetear color de frente: Funcionan las tres formas.
        // (char)27 +"[0m"
        // "\u001B[0m"
        // "\033[0m"
        System.out.print("\033[0m");
        // Limpiar color fondo: ???
    }
}