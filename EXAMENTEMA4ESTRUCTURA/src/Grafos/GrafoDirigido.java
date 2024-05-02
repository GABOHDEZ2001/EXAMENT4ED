package Grafos;

import java.util.*;

class GrafoDirigido {
    private int V; // Número de vértices
    private LinkedList<Integer> adj[]; // Lista de adyacencia para cada vértice

    // Constructor que inicializa el grafo con V vértices
    GrafoDirigido(int v) {
        V = v;
        adj = new LinkedList[v]; // Inicializa la lista de adyacencia para cada vértice
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList(); // Crea una lista de adyacencia vacía para cada vértice
    }

    // Método para agregar una arista dirigida desde el vértice v al vértice w
    void agregarArista(int v, int w) {
        adj[v].add(w); // Agrega w a la lista de adyacencia de v
    }

    // Método para imprimir el grafo
    void imprimirGrafo() {
        for (int i = 0; i < V; ++i) {
            System.out.println("Lista de adyacencia del vértice " + i);
            System.out.print("head");
            for (Integer integer : adj[i]) {
                System.out.print(" -> " + integer); // Imprime los vértices adyacentes al vértice i
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        GrafoDirigido g = new GrafoDirigido(5); // Crea un grafo dirigido con 5 vértices
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
//Lista de adyacencia del vértice 0
//head -> 1 -> 4
//Lista de adyacencia del vértice 1
//head -> 2 -> 3
//Lista de adyacencia del vértice 2
//head -> 3
//Lista de adyacencia del vértice 3
//head -> 4
//Lista de adyacencia del vértice 4
//head
