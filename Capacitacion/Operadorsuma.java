package Capacitacion;

public class Operadorsuma {
    /* se crea la clase privada con "private", y se le asignan los valores VUno, VDos y Resultado 
    como enteros */
    private int VUno,VDos, Resultado;

    /* se crea la clase pública "Operadorsuma" y se le indica que se le ingresarán 2 valores de tipo
     entero, PrimerValor y SegundoValor del fichero suma*/

    public Operadorsuma(int PrimerValor, int SegundoValor){

        /* Se inicializan VUno y VDos con .this y se le asignan los valos de las variables
         PrimerValor y SegundoValor
         */
        this.VUno = PrimerValor;
        this.VDos = SegundoValor;
    }

    /* cuando una clase tiene void, debe retornar algo */
    public void Operacion(){
        Resultado = VUno + VDos;

    }
    public void imprimir(){
        Operacion();
        System.out.println("el resultado de la suma es: " + Resultado );
    }
}
