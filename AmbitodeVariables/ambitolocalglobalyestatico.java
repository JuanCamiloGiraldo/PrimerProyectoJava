package AmbitodeVariables;

public class ambitolocalglobalyestatico {

    public static int variable_estatica; // las variables estáticas, pueden ser usadas por todas las clases sin necesidad de métodos adicionales.

    //toda variable se tiene que declarar dentro de las llaves que encierran la clase

    int variableGlobal; //son las variables que se declaran fuera de cualquier método o función se puede usar en cualquier parte del código, no se tienen que inicializar cuando se declaran.

    public void variable(){
        int VariableLocal = 0; //Son las variables que se declaran dentro de un método o función, Solo se puede acceder a esta dentro del bloque en el que se inicializó, 
                                //Por otro lado, sí o sí deben estar inicializadas. 

    // mientras que se puede usar una variable global dentro 
        variableGlobal = variableGlobal + VariableLocal;
    }
    // esto lanza error, debido a que "VariableLocal" se instanció dentro de variable
        VariableLocal =  VariableLocal + 2;

}
