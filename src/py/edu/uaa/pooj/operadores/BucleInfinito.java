package py.edu.uaa.pooj.operadores;

public class BucleInfinito {

    //Crear un bucle infinito.
    public void bucleInfinito() {
        while (true) {
            System.out.println("Estudiar mucho para el primer parcial");
        }
    }
    
    public static void main (String [] args) {
        new BucleInfinito().bucleInfinito();
    }
}
