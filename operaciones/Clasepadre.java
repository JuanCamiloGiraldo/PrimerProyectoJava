package operaciones;

import java.util.Scanner;

public class Clasepadre {
    protected int valorUno, valorDos,resultado;
    Scanner entrada = new Scanner(System.in);

public void pedirDatos(){
    System.out.println("Primer valor");
    valorUno = entrada.nextInt();
    System.out.println("Segundo valor");
    valorDos = entrada.nextInt();
}
public void mostrarresultado(){
    System.out.println(resultado);
}
}
