//Hola Mundo en Java

public class HolaMundo {

    public static void main(String[] args) {
        /*System.out.println("Hola Mundo");
        int miVariable = 10;
        System.out.println(miVariable);
        miVariable = 5;
        System.out.println(miVariable);
        //Tipo String
        String miVariableCadena = "HEY";
        System.out.println(miVariableCadena);
        miVariableCadena = "Seguimos creciendo en programación";
        System.out.println(miVariableCadena);
         */

        //VAR - Inferencia en tipos en JAVA
        /*var miVariableEntera2 = 10;
        var miVariableCadena2 = "Seguimos estudiando!";
        System.out.println("miVariableEntera2 = " + miVariableEntera2);
        System.out.println("miVariableCadena2 = " + miVariableCadena2); //soutv + tab
         */
        //Inferencia de tipos
        var usuario = "Osvald";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);

        var a = 8;
        var b = 4;
        System.out.println(usuario + (a + b)); //Paréntesis cambian la PRIORIDAD!

        //Caracteres Especiales en JAVA
        var nombre = "Fulano";
        System.out.println("Nueva linea: \n" + nombre); //Salto de línea \n
        System.out.println("Tabulador: \t" + nombre);
        System.out.println("\t\t.:MENU:.");
        System.out.println("Retroceso: \b\b\b\b\b" + nombre); //Retrocede de a un espacio
        System.out.println("Comillas simples: \'" + nombre + "\'");
        System.out.println("Comillas dobles: \"" + nombre + "\"");
    }
}
