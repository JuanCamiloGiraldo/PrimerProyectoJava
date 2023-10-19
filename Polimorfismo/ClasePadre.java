package Polimorfismo;

import java.util.Scanner;

public abstract class ClasePadre {
    protected int valor1, valor2, resultado;
    Scanner entrada =  new Scanner(System.in);
    
    public void pedirDatos(){
        System.out.println("Dame el primer valor");
        valor1 = entrada.nextInt();
        System.out.println("Dame el segundo valor");
        valor2 = entrada.nextInt();
    }
    public abstract void Operaciones();
    public void mostrarresultado(){
        System.out.println(resultado);
    }

}
