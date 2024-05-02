package Arboles;

class Nodo {
    int dato;
    Nodo izquierda, derecha;

    public Nodo(int dato) {
        this.dato = dato;
        izquierda = derecha = null;
    }
}

public class ARBOL {
    Nodo raiz;

    public ARBOL() {
        raiz = null;
    }

    // Método para insertar un nuevo nodo en el árbol
    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    // Función auxiliar para realizar la inserción recursivamente
    private Nodo insertarRec(Nodo raiz, int dato) {
        if (raiz == null) {
            raiz = new Nodo(dato);
            return raiz;
        }

        if (dato < raiz.dato)
            raiz.izquierda = insertarRec(raiz.izquierda, dato);
        else if (dato > raiz.dato)
            raiz.derecha = insertarRec(raiz.derecha, dato);

        return raiz;
    }

    // Método para buscar un nodo en el árbol
    public boolean buscar(int dato) {
        return buscarRec(raiz, dato);
    }

    // Función auxiliar para realizar la búsqueda recursivamente
    private boolean buscarRec(Nodo raiz, int dato) {
        if (raiz == null)
            return false;

        if (raiz.dato == dato)
            return true;

        if (dato < raiz.dato)
            return buscarRec(raiz.izquierda, dato);
        else
            return buscarRec(raiz.derecha, dato);
    }

    // Método para realizar un recorrido preorden del árbol
    public void preorden() {
        preordenRec(raiz);
    }

    // Función auxiliar para realizar el recorrido preorden recursivamente
    private void preordenRec(Nodo raiz) {
        if (raiz != null) {
            System.out.print(raiz.dato + " ");
            preordenRec(raiz.izquierda);
            preordenRec(raiz.derecha);
        }
    }

    // Método para realizar un recorrido postorden del árbol
    public void postorden() {
        postordenRec(raiz);
    }

    // Función auxiliar para realizar el recorrido postorden recursivamente
    private void postordenRec(Nodo raiz) {
        if (raiz != null) {
            postordenRec(raiz.izquierda);
            postordenRec(raiz.derecha);
            System.out.print(raiz.dato + " ");
        }
    }

    // Método para realizar un recorrido inorden del árbol
    public void inorden() {
        inordenRec(raiz);
    }

    // Función auxiliar para realizar el recorrido inorden recursivamente
    private void inordenRec(Nodo raiz) {
        if (raiz != null) {
            inordenRec(raiz.izquierda);
            System.out.print(raiz.dato + " ");
            inordenRec(raiz.derecha);
        }
    }

    public static void main(String[] args) {
        ARBOL arbol = new ARBOL();

        // Insertar nodos en el árbol
        arbol.insertar(50);
        arbol.insertar(30);
        arbol.insertar(20);
        arbol.insertar(40);
        arbol.insertar(70);
        arbol.insertar(60);
        arbol.insertar(80);



        // Realizar recorridos del árbol
        System.out.print("Recorrido preorden del árbol: ");
        arbol.preorden();
        System.out.println();

        System.out.print("Recorrido inorden del árbol: ");
        arbol.inorden();
        System.out.println();

        System.out.print("Recorrido postorden del árbol: ");
        arbol.postorden();
    }
}

//ENTRADA

//Nodos: 50,30,20,40,70,60,80

//SALIDA
//Recorrido preorden del árbol: 50 30 20 40 70 60 80
//Recorrido inorden del árbol: 20 30 40 50 60 70 80
//Recorrido postorden del árbol: 20 40 30 60 80 70 50
