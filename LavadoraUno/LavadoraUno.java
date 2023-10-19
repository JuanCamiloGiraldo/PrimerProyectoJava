package LavadoraUno;
import java.util.Scanner;

import libreria.LLmain;

public class LavadoraUno {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("¿la ropa es blanca o de color?");
        System.out.println("1 para ropa blanca / 2 Para ropa a color");
        int TipodeRopa = entrada.nextInt();

        System.out.println("¿Cuántos kilos de ropa?");
        int kilos = entrada.nextInt();
        LLmain mensajero = new LLmain(TipodeRopa, kilos);
        mensajero.Ciclofinalizado();
    }
}
