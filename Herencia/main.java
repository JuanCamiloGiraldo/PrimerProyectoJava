package Herencia;
import operaciones.Clasehija_resta;
import operaciones.Clasehija_suma;
public class main {
    public static void main(String[] args) {
        Clasehija_suma mensajero_suma = new Clasehija_suma();
        mensajero_suma.pedirDatos();
        mensajero_suma.sumar();
        mensajero_suma.mostrarresultado();
        
        Clasehija_resta mensajero_resta = new Clasehija_resta();
        mensajero_resta.pedirDatos();
        mensajero_resta.resta();
        mensajero_resta.mostrarresultado();
    }
    
}
