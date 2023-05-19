package org.example;

public class HaltChecker {
    public static String analyzeProgram(String program, String input) {
        if (program.equals("Reverser")) {
            return Reverser.analyze(input);
        } else if (program.equals("Factorial")) {
            return Factorial.analyze(input);
        } else if (program.equals("Fibonacci")) {
            return Fibonacci.analyze(input);
        } else {
            return "desconocido";
        }
    }
}


    // La clase HaltChecker actúa como un analizador de programas.
    // Tiene un método estático llamado analyzeProgram que toma dos argumentos: el nombre del programa y el input.
    // Este método determina qué programa se debe analizar y llama al método analyze correspondiente en la clase respectiva.
    // Si el programa es "Reverser", se llama al método analyze en la clase Reverser.
    // Si el programa es "Factorial", se llama al método analyze en la clase Factorial.
    // Si el programa es "Fibonacci", se llama al método analyze en la clase Fibonacci.
    // Si se proporciona un nombre de programa desconocido, se devuelve el texto "desconocido".