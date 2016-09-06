package py.edu.uaa.pooj.operadores.test;

public class TestCadenasIteradores {

    /*
     * metodo que concatena todas las palabras almacenadas en el array de String recibido
     * como parametro, agregando un espacio en blanco despues de cada palabra
     */

    //TODO: "concatenar las palabras contenidas en el array recibido como parametro "
    public String concatenarCadenas(String [] arrayString){
        String palabra = "";
        
        for (int i = 0; i < arrayString.length; i ++) {
            palabra += arrayString [i] + " ";
        }
        return palabra;
    }
    
    public static void main (String [] args) {
        
        TestCadenasIteradores t = new TestCadenasIteradores();
        
        String [] palabras = {"Hola", "Java", "Mundo"};
        System.out.println(t.concatenarCadenas(palabras));
    }
}
