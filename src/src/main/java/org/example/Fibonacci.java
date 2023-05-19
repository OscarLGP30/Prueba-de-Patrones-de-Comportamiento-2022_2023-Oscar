package org.example;

public class Fibonacci {
    private int number;

    public Fibonacci(int number) {
        this.number = number;
    }

    public boolean check() {
        // Lógica para verificar la condición de Fibonacci
        // Devuelve true si se cumple la condición, false de lo contrario
        if (number < 0) {
            return false; // La secuencia de Fibonacci no está definida para números negativos
        }

        int fib1 = 0;
        int fib2 = 1;
        int fib = fib1 + fib2;

        while (fib <= number) {
            if (fib == number) {
                return true; // Se cumple la condición de Fibonacci
            }

            fib1 = fib2;
            fib2 = fib;
            fib = fib1 + fib2;
        }

        return false; // No se cumple la condición de Fibonacci
    }
}


//Esta clase se encarga de verificar si un número cumple la condición de pertenecer a la secuencia de Fibonacci.
//El constructor recibe un parámetro number que representa el número a verificar.
//El método check() verifica si el número es negativo y retorna false en ese caso.
//Luego, realiza un bucle para calcular los números de la secuencia de Fibonacci y compara si alguno coincide con el número original.
//Si lo hace, retorna true indicando que se cumple la condición de Fibonacci.