package arearectangulo;

import java.util.Scanner;

public class rectangulo {
    public static void main(String args[]) {
      
        Scanner entrada = new Scanner(System.in);
        System.out.println("Tamaño de la base");
        int base = entrada.nextInt();
        System.out.println("Tamaño de la altura");
        int altura = entrada.nextInt();

        arearectangulo valores = new arearectangulo(base,altura);
        valores.imprimir();
    }
        
}
