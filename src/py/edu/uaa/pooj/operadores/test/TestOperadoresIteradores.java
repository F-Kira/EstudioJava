package py.edu.uaa.pooj.operadores.test;

public class TestOperadoresIteradores {
    /*
     * Metodo que suma un array de enteros que recibe como parametro
     * Retorna el resultado de la suma
     */
    public int sumar(int [] numeros) {
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado + numeros[i];
        }
        return resultado;
    }

    /*
     * PRACTICA: implementar la resta recibiendo un array de enteros
     */
    public int restar(int [] numeros) {
        int resultado = 0;
        for (int i = 0; i < numeros.length; i++) {
            resultado = resultado - numeros[i];
        }
        return resultado;
    }

    /*
     * PRACTICA: implementar la multiplicacion recibiendo un array de enteros
     */
    public int multiplicar(int [] numeros) {
        int resultado = numeros [0];
        for (int i = 1; i < numeros.length; i++) {
            resultado = resultado * numeros[i];
        }
        return resultado;
    }


    public static void main(String[] args) {
        //Se crea un objeto de la clase TestOperadoresIteradores, llamado testOpIt
        TestOperadoresIteradores testOpIt = new TestOperadoresIteradores();

        //Se crea un array de enteros para realizar operaciones arimeticas.
        int[] numeros = {10, 20, 30, 40, 50, 54, 81};

        System.out.println("Total suma : " + testOpIt.sumar(numeros));
        System.out.println("Total de multiplicación : " + testOpIt.multiplicar(numeros));
        System.out.println("Total de resta : " + testOpIt.restar(numeros));
    }
}
