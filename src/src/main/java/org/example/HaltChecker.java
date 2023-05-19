package org.example;

public class HaltChecker {
    private Reverser reverser;
    private Factorial factorial;
    private Fibonacci fibonacci;

    public HaltChecker(String input) {
        this.reverser = new Reverser(input);
        this.factorial = new Factorial(0);  // Establecer un valor predeterminado
        this.fibonacci = new Fibonacci(0);  // Establecer un valor predeterminado
    }

    public boolean shouldHalt() {
        boolean halt1 = reverser.check();
        boolean halt2 = factorial.check();
        boolean halt3 = fibonacci.check();

        return halt1 || halt2 || halt3;
    }

    public void analyzeProgram() {
        // Lógica para analizar el programa y tomar decisiones
        if (shouldHalt()) {
            System.out.println("El programa debe detenerse.");
        } else {
            System.out.println("El programa puede continuar.");
        }
    }
}




//Esta clase se encarga de verificar si un programa debe detenerse o puede continuar en función de diferentes condiciones.
//Tiene tres atributos: reverser, factorial y fibonacci.
//El constructor recibe un parámetro input que se utiliza para inicializar el objeto reverser y establecer valores predeterminados para factorial y fibonacci.
//El método shouldHalt() verifica las condiciones de cada objeto (reverser, factorial y fibonacci) y devuelve true si alguna de las condiciones se cumple, lo que indica que el programa debe detenerse.
//El método analyzeProgram() utiliza el resultado de shouldHalt() para imprimir un mensaje indicando si el programa debe detenerse o puede continuar.