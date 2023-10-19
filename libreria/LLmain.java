package libreria;
public class LLmain {
    /*se indica que son privadas y que solo la clase LLmain puede modificarlas con el modificador de acceso
    private
     */
    private int kilos = 0, TipodeRopa = 0, LlenadoCompleto = 0, LavadoCompleto = 0, SecadoCompleto = 0; 


    public LLmain(int kilos, int TipodeRopa){
        this.kilos = kilos;
        this.TipodeRopa = TipodeRopa;

    }
    /* Se crean 3 métodos privados (encaptulados) y 1 método público, los métodos privados solo pueden ser
     modificados dentro de la misma función, en este caso LLmain.
     */
    /*llenado valida que el peso no sea mayor al indicado */
    private void Llenado(){

        if(kilos<=12){
            LlenadoCompleto = 1;
            System.out.println("llenando");
            System.out.println("llenado completo");
        }else{
            System.out.println("la carga de ropa es muy pesada, reduce la carga");
        }
    }
    /* Verifica que se haya llenado y comienza el ciclo de lavado */
    private void Lavado(){
        Llenado();
        if(LlenadoCompleto == 1){
            if(TipodeRopa == 1){
                System.out.println("lavado ropa blanca / lavado suave");
                LavadoCompleto = 1;
            }else if(TipodeRopa == 2){
                System.out.println("Ropa de color / Lavado Intenso");
                LavadoCompleto = 1;
            }else{
                
                System.out.println("se lavará como ropa de color / lavado intenso");
                LavadoCompleto = 1;
            }
        }else if(kilos == 0){
            System.out.println( "la lavadora no se ha llenado");
            System.out.println("iniciando llenado");
            LlenadoCompleto = 1;
        }
    }
    /*verifica que el lavado se haya completado y comienza a secar */
    private void secado(){
        Lavado();
        if(LavadoCompleto == 1){
            System.out.println("secando");
            SecadoCompleto = 1;
        }
    }
    /* Verifica que el secado haya finalizado para dar el mensaje de finalizado */
    public void Ciclofinalizado(){
        secado();
        if(SecadoCompleto == 1){
            System.out.println("Ciclo Finalizado");

        }
    }

//setter y getter
    public int getTipodeRopa(){
        return TipodeRopa;
    }
    public void setTipodeRopa(int TipodeRopa){
        this.TipodeRopa= TipodeRopa;
    }
}
