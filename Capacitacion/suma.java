package Capacitacion;
import java.util.Scanner;
public class suma {
    public static void main(String args[]) {
        /* se importa Scanner, y se asigna la función Scanner a una variable, 
        System.in registra los valores ingresados por teclado*/
        
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Escribe el primer valor");
        /*Se asigna una nueva variable, pero esta vez no es a la función, sino que es a la
         nueva variable PrimerValor. next.Int() indica que el tipo de valor que se va a pedir por teclado
         tiene que ser un entero
         */
        int PrimerValor = entrada.nextInt();
        System.out.println("escribe el segundo valor");
        int SegundoValor = entrada.nextInt();
        /* Se asignan los valores ingresados por teclado a la variable valores para
        "registrarlo como método de" Operadorsuma y para reservar
         en memoria los valores y enviarlos al fichero con el objeto Operadorsuma 
         */
        Operadorsuma valores = new Operadorsuma(PrimerValor, SegundoValor);

        /* Se llama a la función imprimir desde Operación suma a través del objeto valores */
        valores.imprimir();
    }

}
