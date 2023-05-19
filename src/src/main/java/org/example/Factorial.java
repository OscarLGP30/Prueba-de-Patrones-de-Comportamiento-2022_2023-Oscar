package org.example;

public class Factorial {
    private int number;

    public Factorial(int number) {
        this.number = number;
    }



    public boolean check() {
        // Lógica para verificar la condición de factorial
        // Devuelve true si se cumple la condición, false de lo contrario
        if (number < 0) {
            return false; // El factorial no está definido para números negativos
        }

        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            if (factorial == number) {
                return true; // Se cumple la condición de factorial
            }
        }

        return false; // No se cumple la condición de factorial
    }
}

//Esta clase se encarga de verificar si un número cumple la condición de ser un factorial.
//El constructor recibe un parámetro number que representa el número a verificar.
//El método check() verifica si el número es negativo y retorna false en ese caso.
//Luego, realiza un bucle para calcular el factorial y compara si el resultado coincide con el número original.
//Si lo hace, retorna true indicando que se cumple la condición de factorial.