package Polimorfismo;

public class claseprincipal {
    public static void main(String[] args) {
        ClasePadre mensajero_suma = new Clasehija();
        mensajero_suma.pedirDatos();
        mensajero_suma.Operaciones();
        mensajero_suma.mostrarresultado();

        ClasePadre mensajero_resta = new clasehija_resta();
        mensajero_resta.pedirDatos();
        mensajero_resta.Operaciones();
        mensajero_resta.mostrarresultado();

    }
}
