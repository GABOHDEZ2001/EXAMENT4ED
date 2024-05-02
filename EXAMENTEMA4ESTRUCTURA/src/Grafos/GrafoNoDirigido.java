package Grafos;

import java.util.*;

class GrafoNoDirigido {
    private int V; // Número de vértices
    private LinkedList<Integer> adj[]; // Lista de adyacencia para cada vértice

    // Constructor que inicializa el grafo con V vértices
    GrafoNoDirigido(int v) {
        V = v;
        adj = new LinkedList[v]; // Inicializa la lista de adyacencia para cada vértice
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList(); // Crea una lista de adyacencia vacía para cada vértice
    }

    // Método para agregar una arista entre los vértices v y w
    void agregarArista(int v, int w) {
        adj[v].add(w); // Agrega w a la lista de adyacencia de v
        adj[w].add(v); // Agrega v a la lista de adyacencia de w (grafo no dirigido)
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
        GrafoNoDirigido g = new GrafoNoDirigido(5); // Crea un grafo no dirigido con 5 vértices
        g.agregarArista(0, 1); // Agrega arista entre vértices 0 y 1
        g.agregarArista(0, 4); // Agrega arista entre vértices 0 y 4
        g.agregarArista(1, 2); // Agrega arista entre vértices 1 y 2
        g.agregarArista(1, 3); // Agrega arista entre vértices 1 y 3
        g.agregarArista(1, 4); // Agrega arista entre vértices 1 y 4
        g.agregarArista(2, 3); // Agrega arista entre vértices 2 y 3
        g.agregarArista(3, 4); // Agrega arista entre vértices 3 y 4

        g.imprimirGrafo(); // Imprime el grafo
    }
}

//ENTRADA
//0,1
//0,4
//1,2
//1,3
//1,4
//2,3
//3,4

//SALIDA
//Lista de adyacencia del vértice 0
//head -> 1 -> 4
//Lista de adyacencia del vértice 1
//head -> 0 -> 2 -> 3 -> 4
//Lista de adyacencia del vértice 2
//head -> 1 -> 3
//Lista de adyacencia del vértice 3
//head -> 1 -> 2 -> 4
//Lista de adyacencia del vértice 4
//head -> 0 -> 1 -> 3
