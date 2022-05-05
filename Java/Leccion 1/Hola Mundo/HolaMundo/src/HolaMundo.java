
import java.util.Scanner;

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
        /*var usuario = "Osvald";
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
        */
        //Clase Scanner
        
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        var usuario2 = input.nextLine();
        System.out.println("usuario2 = " + usuario2);
        System.out.println("Ingrese su título: ");
        var titulo2 = input.nextLine();
        System.out.println(titulo2 + " " + usuario2);
        
        //Ejercicio
        System.out.println("Ingrese el nombre del libro: ");
        var libro = input.nextLine();
        System.out.println("Ingrese el autor del libro: ");
        var autor = input.nextLine();
        System.out.println("El libro: " + libro + " fue escrito por: " + autor);
        */
        
        byte numEnteroByte = 127;
        System.out.println("numEnteroByte = " + numEnteroByte);
        System.out.println("Valor mínimo del Byte:" + Byte.MIN_VALUE);
        System.out.println("Valor máximo del Byte: = " + Byte.MAX_VALUE);

        short numEnteroShort = 32767;
        System.out.println("numEnteroShort = " + numEnteroShort);
        System.out.println("Valor mínimo del Short:" + Short.MIN_VALUE);
        System.out.println("Valor máximo del Short:" + Short.MAX_VALUE);

        int numEnteroInt = 2147483647;
        System.out.println("numEnteroInt = " + numEnteroInt);
        System.out.println("Valor mínimo del Int:" + Integer.MIN_VALUE);
        System.out.println("Valor máximo del Int: = " + Integer.MAX_VALUE);

        long numEnteroLong = 9223372036854775807L;
        System.out.println("numEnteroLong = " + numEnteroLong);
        System.out.println("Valor mínimo del Long:" + Long.MIN_VALUE);
        System.out.println("Valor máximo del Long:" + Long.MAX_VALUE);

        float numFloat = 3.4028235E38F;
        System.out.println("numFloat = " + numFloat);
        System.out.println("Valor mínimo del Float:" + Float.MIN_VALUE);
        System.out.println("Valor máximo del Float:" + Float.MAX_VALUE);
        
        double numDouble = 1.7976931348623157E308;
        System.out.println("numDouble = " + numDouble);
        System.out.println("Valor mínimo del Double:" + Double.MIN_VALUE);
        System.out.println("Valor máximo del Double:" + Double.MAX_VALUE);
    }
}
