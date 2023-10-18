package capacitacion;
import java.util.Scanner;

public class InvertirPalabras {
    public static void main (String[]args){
        String palabra="", palabrainvertida=""; /* se definen los tipos de variables y se declaran */
        int longitudpalabra =0;
        Scanner entrada = new Scanner(System.in);   /* Scanner permite leer las entradas del teclado en el sistema */
        System.out.println("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();   /* nextline define la entrada como tipo String */

        longitudpalabra = palabra.length();

        while (longitudpalabra != 0) {
            palabrainvertida += palabra.substring(longitudpalabra -1, longitudpalabra); 
            longitudpalabra --;
        }
        System.out.println(palabrainvertida);
    }
};
