package Grafos;

import java.util.*;

class MatrizAdyacencia {
    private int V; // Número de vértices
    private int[][] matrizAdy; // Matriz de adyacencia

    // Constructor que inicializa el grafo con V vértices
    MatrizAdyacencia(int v) {
        V = v;
        matrizAdy = new int[V][V]; // Inicializa la matriz de adyacencia con tamaño VxV
    }

    // Método para agregar una arista dirigida desde el vértice v al vértice w
    void agregarArista(int v, int w) {
        matrizAdy[v][w] = 1; // Marca la conexión desde v hacia w
    }

    // Método para imprimir el grafo
    void imprimirGrafo() {
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (matrizAdy[i][j] == 1) {
                    System.out.println("Hay una arista dirigida desde " + i + " hacia " + j);
                }
            }
        }
    }

    public static void main(String args[]) {
        MatrizAdyacencia g = new MatrizAdyacencia(5); // Crea un grafo dirigido con 5 vértices
        g.agregarArista(0, 1); // Agrega arista dirigida desde vértice 0 hacia vértice 1
        g.agregarArista(0, 4); // Agrega arista dirigida desde vértice 0 hacia vértice 4
        g.agregarArista(1, 2); // Agrega arista dirigida desde vértice 1 hacia vértice 2
        g.agregarArista(1, 3); // Agrega arista dirigida desde vértice 1 hacia vértice 3
        g.agregarArista(2, 3); // Agrega arista dirigida desde vértice 2 hacia vértice 3
        g.agregarArista(3, 4); // Agrega arista dirigida desde vértice 3 hacia vértice 4

        g.imprimirGrafo(); // Imprime el grafo
    }
}
//ENTRADA
//0,1
//0,4
//1,2
//1,3
//2,3
//3,4

//SALIDA
//Hay una arista dirigida desde 0 hacia 1
//Hay una arista dirigida desde 0 hacia 4
//Hay una arista dirigida desde 1 hacia 2
//Hay una arista dirigida desde 1 hacia 3
//Hay una arista dirigida desde 2 hacia 3
//Hay una arista dirigida desde 3 hacia 4