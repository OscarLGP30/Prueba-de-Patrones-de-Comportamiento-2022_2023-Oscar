package org.example;

public class Reverser {
    private String input;

    public Reverser(String input) {
        this.input = input;
    }

    public boolean check() {
        if (input == null) {
            return false; // No se cumple la condición de reverser si el input es nulo
        }

        String reversedInput = reverseString(input);
        return input.equals(reversedInput);
    }

    private String reverseString(String str) {
        StringBuilder reversed = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed.append(str.charAt(i));
        }
        return reversed.toString();
    }
}

//Esta clase se encarga de verificar si una cadena de texto es un palíndromo, es decir, si se lee igual de izquierda a derecha y de derecha a izquierda.
//El constructor recibe un parámetro input que representa la cadena de texto a verificar.
//El método check() verifica si la cadena de texto es nula y retorna false en ese caso.
//Luego, invoca al método privado reverseString() para obtener la versión invertida de la cadena de texto y compara si es igual a la cadena original.
//El método privado reverseString() recibe una cadena de texto y la invierte utilizando un StringBuilder.
//Retorna la versión invertida de la cadena.
