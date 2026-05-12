#include <iostream>
#include <algorithm> // util para std::max
using namespace std;

// Asumiendo la estructura Nodo del Ejercicio 2
struct Nodo {
    int valor;
    Nodo* izquierdo;
    Nodo* derecho;
    Nodo(int v) : valor(v), izquierdo(nullptr), derecho(nullptr) {}
};

// TODO: Implementa tu lógica aquí
int calcularAltura(Nodo* raiz) {
    // Caso base: si el nodo es nulo, la altura es 0
    if (raiz == nullptr) {
        return 0;
    }

    // Calculamos la altura de cada subárbol
    int alturaIzquierda = calcularAltura(raiz->izquierdo);
    int alturaDerecha = calcularAltura(raiz->derecho);

    // La altura del nodo actual es 1 más el máximo de sus hijos
    return 1 + max(alturaIzquierda, alturaDerecha);
}

int main() {
    Nodo* raiz = new Nodo(1);
    raiz->derecho = new Nodo(2);
    raiz->derecho->izquierdo = new Nodo(3);
    
    cout << "--- Prueba Ejercicio 3 ---" << endl;
    cout << "Altura esperada: 3" << endl;
    cout << "Altura calculada: " << calcularAltura(raiz) << endl;
    cout << "Altura de arbol nulo (esperado 0): " << calcularAltura(nullptr) << endl;

    return 0;
}