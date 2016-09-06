package py.edu.uaa.pooj.operadores.test;

import static java.lang.System.out;
import java.util.Arrays;

public class TestCadenas {

    public String concatenar(String cadena1, String cadena2) {
        // retorna la concatenacion de la cadena1 con la cadena2
        return cadena1 + cadena2;
    }

    public String convertirMinusculas(String cadena) {
        // retona la cadena pasada como parametro, convertida a minusculas
        return cadena.toLowerCase();
    }

    public String convertirMayusculas(String cadena) {
        // retorna la cadena pasada como parametro, convertida a mayusculas
        return cadena.toUpperCase();
    }

    public int obtenerLongitudCadena(String cadena) {
        // obtiene la longitud de la cadena (cantidad de caracteres que tiene)
        return cadena.length();
    }

    public boolean compararCadenaDiferenciandoMayusculas(String cadena1,
        String cadena2) {
        // retorna true si las cadenas son iguales y false si las cadenas son
        // diferentes
        // IMPORTANTE: diferencia entre mayusculas y minusculas
        return cadena1.equals(cadena2);
    }

    public boolean compararCadenaSinDiferenciarMayusculasYMinusculas(
        String cadena1, String cadena2) {
        // retorna true si las cadenas son iguales y false si las cadenas son
        // diferentes
        // IMPORTANTE: NO diferencia entre mayusculas y minusculas
        return cadena1.equalsIgnoreCase(cadena2);
    }

    public String[] divisionCadenas(String cadena) {
        // retorna un array de String conteniendo el resultado de la division de
        // la cadena ingresada, utilizando como delimitador
        // el pasado como parametro al metodo split, que en este caso es ";"

        String arrayString[];
        // el caracter por el que se separara la cadena es pasado como parametro
        arrayString = cadena.split(";");
        return arrayString;
    }

    public String subcadena(String cadena, int inicio, int fin) {
        // Se obtiene la cadena delimitada en las posiciones 2 y 4
        return cadena.substring(inicio, fin);
    }

    public char obtenerCaracterCadena(String cadena, int posicion) {
        // retona el caracter de una cierta posicion de la cadena
        return cadena.charAt(posicion);
    }

    public boolean verificarSiComienzaCon(String cadena, String cadenaAVerificar) {
        // retorna true si la cadena comienza con la subcadena ingresada como
        // parametro
        return cadena.startsWith(cadenaAVerificar);
    }

    public boolean verificarSiTerminaCon(String cadena, String cadenaAVerificar) {
        // retorna true si la cadena termina con la subcadena ingresada como
        // parametro
        return cadena.endsWith(cadenaAVerificar);
    }

    public boolean verificarSiContiene(String cadena, String cadenaAVerificar) {
        // retorna true si la cadena contiene la subcadena pasada como parametro
        return cadena.contains(cadenaAVerificar);
    }

    public int obtenerIndiceSubcadena(String cadena, String subcadena) {
        // retorna el indice de la cadena donde comienza la subcadena ingresada
        // como parametro
        return cadena.indexOf(subcadena);
    }

    public static void main(String[] args) {
        TestCadenas testC = new TestCadenas();

        out.println("Concatenar : " + testC.concatenar("Hola", " Que tal?"));
        out.println("Convertir a minuscula : " + testC.convertirMinusculas("HOLA Mundo"));
        out.println("Convertir a mayuscula : " + testC.convertirMayusculas("HOLA Mundo"));
        out.println("Logitud de cadena : " + testC.obtenerLongitudCadena("Java"));
        out.println("Comparar cadena diferenciando mayusculas : "
                + testC.compararCadenaDiferenciandoMayusculas("Hola", " Que tal?"));
        out.println("Comparar cadena sin diferencia mayuscula : " + testC.compararCadenaSinDiferenciarMayusculasYMinusculas("Hola", " Que tal?"));
        out.println("División de cadenas : " + Arrays.toString(testC.divisionCadenas("Hola; Mundo; Java")));
        out.println("Subcadena : " + testC.subcadena("Hola", 1, 3));
        out.println("Obtener caracter cadena : " + testC.obtenerCaracterCadena("HolaMundo", 4));
        out.println("Verificar si comienza con : " + testC.verificarSiComienzaCon("Hola", "H"));
        out.println("Verificar si termina con : " + testC.verificarSiTerminaCon("Hola", "a"));
        out.println("Verificar si contiene : " + testC.verificarSiContiene("Hola", "k"));
        out.println("Obtener indice : " + testC.obtenerIndiceSubcadena("Hola", "l"));
    }
}
