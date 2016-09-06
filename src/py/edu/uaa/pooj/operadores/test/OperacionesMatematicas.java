package py.edu.uaa.pooj.operadores.test;

import java.util.ArrayList;

public class OperacionesMatematicas {

    //TODO "Encontrar el valor minimo de un array de enteros"
    public static int encontrarMinimo(int [] numeros) {
        int menor = numeros [0];
        
        for (int i = 1; i < numeros.length; i ++) {
            if (menor > numeros [i]) {
                menor = numeros [i];
            }
        }
        return menor;
    }

    //TODO "Encontrar el valor maximo de un array de enteros"
    public int encontrarMaximo(int [] numeros) {
        int mayor = numeros [0];
        
        for (int i = 1; i < numeros.length; i ++) {
            if (mayor < numeros [i]) {
                mayor = numeros [i];
            }
        }
        return mayor;
    }

    //TODO En base a un array de enteros recibidos como parametros, filtrar solamente los numeros impares.
    
    /*
    El ejercicio original solo devolvía un "int" considero que eso es un error
    ya que pide que le filtres todos los números impares; a no ser que halla
    entendido mal lo que quiere que hagamos. Así que yo lo que hice
    es hacer que retorne un arrays que contendrá dentro los números impares.
    
    Realizar de esta forma tiene algunas ineficiencias:
    #Puede el arrays recibido no contener valores impares.
    #Si no contiene impares devuelve un arrays vacío, con su valor por defecto 0.
    #Si hay valores impares puede tener valores repetidos.
    #Puede no utilizarse todas las posiciones del vector.
    */
    public int [] filtrarImpares(int [] numeros) {
        int [] numPares = new int [numeros.length];
        int j = 0;
        
        for (int i = 0; i < numeros.length; i ++) {
            if (numeros [i] % 3 == 0) {
                numPares [j ++] = numeros [i];
            }
        }
        return numPares;
    }
}
