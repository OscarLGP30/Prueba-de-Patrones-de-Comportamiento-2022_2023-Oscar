package org.example;

public class Fibonacci {
    public static String analyze(String input) {
            //Asumiremos que es aleatorio
        if (Math.random() < 0.5) {
            return "para";
        } else {
            return "nunca";
        }
    }
}


    //La clase Fibonacci representa el programa "Fibonacci", que genera la secuencia de Fibonacci hasta un número determinado.
    //En este ejemplo, la lógica de análisis del programa "Fibonacci" es aleatoria.
    //La decisión de si el programa se detiene o no se basa en un número aleatorio.
    //Si el número aleatorio es menor que 0.5, se devuelve el texto "para"; de lo contrario, se devuelve el texto "nunca"
