public class Ejercicio5_Transformacion {
    // TODO: Implementa tu lógica aquí
    static Nodo invertir(Nodo raiz) { //Quitamos el public para que la clase reciba y devulva datos
        // Caso base: si el nodo es nulo, no hay nada que invertir
        if (raiz == null) {
            return null;
        }

        // Intercambiamos los hijos izquierdo y derecho del nodo actual
        Nodo temporal = raiz.izquierdo;
        raiz.izquierdo = raiz.derecho;
        raiz.derecho = temporal;

        // Llamamos a la función recursivamente para invertir los subárboles
        invertir(raiz.izquierdo);
        invertir(raiz.derecho);

        return raiz;
    }

    public static void main(String[] args) {
        //        1                 1
        //      /   \    -->      /   \
        //     2     3           3     2
        Nodo raiz = new Nodo(1);
        raiz.izquierdo = new Nodo(2);
        raiz.derecho = new Nodo(3);

        System.out.println("--- Prueba Ejercicio 5 ---");
        System.out.println("Antes de invertir:");
        System.out.println("Hijo Izq: " + raiz.izquierdo.valor + " | Hijo Der: " + raiz.derecho.valor);
        
        invertir(raiz);
        
        System.out.println("\nDespués de invertir (Esperado: Izq 3 | Der 2):");
        String izq = (raiz.izquierdo != null) ? String.valueOf(raiz.izquierdo.valor) : "null";
        String der = (raiz.derecho != null) ? String.valueOf(raiz.derecho.valor) : "null";
        
        System.out.println("Hijo Izq: " + izq + " | Hijo Der: " + der);
    }
}