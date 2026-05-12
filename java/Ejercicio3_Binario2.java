class Nodo {

    int valor;
    Nodo izquierdo, derecho;

    Nodo(int valor) {
        this.valor = valor;
    }
}

// TODO: Implementa tu lógica aquí
public class Ejercicio3_Binario2 {
    static int calcularAltura(Nodo raiz) { //Quitamos el public para que la clase reciba y devulva datos
        // Caso base: si el nodo es nulo, la altura es 0
        if (raiz == null) {
            return 0;
        }

        // Calculamos la altura de los subárboles izquierdo y derecho
        int alturaIzquierda = calcularAltura(raiz.izquierdo);
        int alturaDerecha = calcularAltura(raiz.derecho);

        // La altura actual es 1 (el nodo actual) más el máximo entre sus hijos
        return 1 + Math.max(alturaIzquierda, alturaDerecha);
    }

    public static void main(String[] args) {
        //        1
        //         \
        //          2
        //         /
        //        3
        Nodo raiz = new Nodo(1);
        raiz.derecho = new Nodo(2);
        raiz.derecho.izquierdo = new Nodo(3);
        
        System.out.println("--- Prueba Ejercicio 3 ---");
        System.out.println("Altura esperada: 3");
        System.out.println("Altura calculada: " + calcularAltura(raiz));
        System.out.println("Altura de árbol nulo (esperado 0): " + calcularAltura(null));
    }
}
