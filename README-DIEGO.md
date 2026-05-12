# Estructuras de Datos - Resolución de Ejercicios (Árboles)

Este repositorio contiene la solución a una serie de ejercicios prácticos sobre estructuras de datos no lineales, específicamente **Árboles N-arios** y **Árboles Binarios de Búsqueda (BST)**. Las implementaciones han sido realizadas en los lenguajes **C++** y **Java**, aplicando conceptos fundamentales como recursividad, punteros y gestión de memoria.

## Contenido de los Ejercicios

### Ejercicio 1: Conteo de Nodos (Árbol N-ario)
*   **Descripción:** Implementación de una función recursiva para contar el número total de nodos en un árbol donde cada nodo puede tener múltiples hijos.
*   **Conceptos:** Recursividad, Listas dinámicas (`vector` en C++, `List` en Java).
*   Captura de Ejecución Cpp
<img width="1000" height="162" alt="Ejercicio1 cpp" src="https://github.com/user-attachments/assets/d23826e5-2564-413f-99a5-5cf45b2fdfc1" />

*   Captura de ejecución  de Código Java
<img width="907" height="131" alt="Ejercicio1 java" src="https://github.com/user-attachments/assets/c5f069e8-3373-44b5-90b1-6ea587e3c47c" />


### Ejercicio 2: Inserción en Árbol Binario de Búsqueda (BST)
*   **Descripción:** Lógica para insertar valores en un árbol binario manteniendo la propiedad de búsqueda: menores a la izquierda, mayores o iguales a la derecha.
*   **Conceptos:** Punteros, Referencias, Estructura jerárquica.
*   Captura de Ejecución Cpp
<img width="1037" height="152" alt="Ejercicio2 cpp" src="https://github.com/user-attachments/assets/e3991a38-b512-4018-939f-73c845726f35" />

*   Captura de ejecución  de Código Java
<img width="937" height="158" alt="Ejercicio2 java" src="https://github.com/user-attachments/assets/3f52c271-614a-4d3d-aa71-619fa985bdaa" />



### Ejercicio 3: Cálculo de Altura
*   **Descripción:** Función para determinar la altura (nivel máximo) de un árbol binario.
*   **Conceptos:** Divide y vencerás, Casos base de recursión.
*   Captura de Ejecución Cpp
<img width="1011" height="156" alt="Ejercicio3 cpp" src="https://github.com/user-attachments/assets/5dc3282a-9fb9-45a4-8b8a-7fc52b6f5482" />

*   Captura de ejecución  de Código Java
<img width="956" height="151" alt="Ejercicio3 java" src="https://github.com/user-attachments/assets/ec841eef-0946-4e5c-b53b-c210c9a3c144" />



### Ejercicio 4: Recorrido In-Order
*   **Descripción:** Implementación del recorrido en orden (Izquierda-Raíz-Derecha) para obtener los elementos de un BST de forma ascendente.
*   **Conceptos:** Recorridos de árboles, Acumulación en estructuras de datos.
*   Captura de Ejecución Cpp
<img width="1055" height="132" alt="Ejercicio4 cpp" src="https://github.com/user-attachments/assets/94ee7522-a3f2-4af0-8a96-4f558047dfe0" />

*   Captura de ejecución  de Código Java
<img width="922" height="138" alt="Ejercicio4(Inorder) java" src="https://github.com/user-attachments/assets/41782df5-8055-44dd-9806-3e2ef933378b" />



### Ejercicio 5: Inversión de Árbol (Efecto Espejo)
*   **Descripción:** Transformación de un árbol binario mediante el intercambio de sus subárboles izquierdo y derecho en todos sus niveles.
*   **Conceptos:** Manipulación de punteros/referencias, Transformación de estructuras.
*   Captura de Ejecución Cpp
<img width="1073" height="200" alt="Ejercicio5 cpp" src="https://github.com/user-attachments/assets/447cf654-0781-4702-bd5a-29cb683e12b1" />

*   Captura de ejecución  de Código Java
<img width="1005" height="198" alt="Ejercicio5 java" src="https://github.com/user-attachments/assets/478d0d14-ed30-4a3b-bf3a-455eca292391" />


## Tecnologías Utilizadas
*   **C++:** Estándar C++11 o superior.
*   **Java:** JDK 17 o superior.
*   **Editor:** Visual Studio Code.

## Estructura del Proyecto
```text
├── cpp/
│   ├── Ejercicio1.cpp
│   ├── Ejercicio2.cpp
│   └── ...
└── java/
|   ├── Ejercicio1_Basico.java
|   ├── Ejercicio2_Binario.java
|   └── ...
└──  doc/
|   ├── Informe Ape 3.docx
|   └──  Informe Ape 3.pdf
└──  Capturas Ejecucion/
    └── cpp/
    ├── Ejercicio1 cpp.png
    ├── Ejercicio2 cpp.png
    ├── ...
    └── java/
    ├── Ejercicio1 java.png
    ├── Ejercicio2 java.png
    ├── ...
