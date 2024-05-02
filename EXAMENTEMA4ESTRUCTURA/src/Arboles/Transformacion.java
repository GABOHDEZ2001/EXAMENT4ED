package Arboles;

import java.util.Stack;

public class Transformacion {
    // Método para verificar si el carácter es un operador
    private static boolean esOperador(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    // Método para verificar la precedencia de los operadores
    private static int precedencia(char operador) {
        switch (operador) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
        }
        return -1;
    }

    // Método para transformar la expresión de infija a postfija
    public static String infijaAPostfija(String expresion) {
        StringBuilder resultado = new StringBuilder();
        Stack<Character> pila = new Stack<>();

        for (int i = 0; i < expresion.length(); i++) {
            char caracter = expresion.charAt(i);

            // Si el caracter es un operando, lo agrega al resultado
            if (Character.isLetterOrDigit(caracter)) {
                resultado.append(caracter);
            }
            // Si el caracter es un paréntesis izquierdo, lo apila
            else if (caracter == '(') {
                pila.push(caracter);
            }
            // Si el caracter es un paréntesis derecho, desapila y agrega al resultado hasta encontrar el paréntesis izquierdo correspondiente
            else if (caracter == ')') {
                while (!pila.isEmpty() && pila.peek() != '(') {
                    resultado.append(pila.pop());
                }
                pila.pop(); // Desapila el paréntesis izquierdo
            }
            // Si el caracter es un operador
            else if (esOperador(caracter)) {
                // Desapila y agrega al resultado todos los operadores con mayor o igual precedencia
                while (!pila.isEmpty() && precedencia(caracter) <= precedencia(pila.peek())) {
                    resultado.append(pila.pop());
                }
                // Apila el operador actual
                pila.push(caracter);
            }
        }

        // Desapila y agrega al resultado los operadores restantes
        while (!pila.isEmpty()) {
            resultado.append(pila.pop());
        }

        return resultado.toString();
    }

    public static void main(String[] args) {
        String expresionInfija = "a+b*(c-d/e)";
        String expresionPostfija = infijaAPostfija(expresionInfija);
        System.out.println("Expresión infija: " + expresionInfija);
        System.out.println("Expresión postfija: " + expresionPostfija);
    }

}

//ENTRADA
//"a+b*(c-d/e)"

//SALIDA
//Expresión infija: a+b*(c-d/e)
//Expresión postfija: abcde/-*+
