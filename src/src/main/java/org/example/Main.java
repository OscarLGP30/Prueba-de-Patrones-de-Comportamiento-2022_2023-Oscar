package org.example;

public class Main {
    public static void main(String[] args) {
        String[] causes = {"causa1", "causa2", "causa3"};

        // Crear instancias de las clases HaltChecker
        HaltChecker checker1 = new HaltChecker(causes[0]);
        HaltChecker checker2 = new HaltChecker(causes[1]);
        HaltChecker checker3 = new HaltChecker(causes[2]);

        // Verificar si las causas requieren parar
        boolean shouldHalt1 = checker1.shouldHalt();
        boolean shouldHalt2 = checker2.shouldHalt();
        boolean shouldHalt3 = checker3.shouldHalt();

        // Mostrar los resultados
        System.out.println("Causa 1: " + (shouldHalt1 ? "Parar" : "Continuar"));
        System.out.println("Causa 2: " + (shouldHalt2 ? "Parar" : "Continuar"));
        System.out.println("Causa 3: " + (shouldHalt3 ? "Parar" : "Continuar"));

        Factorial factorial = new Factorial(1);
        boolean shouldHaltFactorial = factorial.check();
        System.out.println("Factorial : " + (shouldHaltFactorial ? "Parar" : "Continuar"));

        Fibonacci fibonacci = new Fibonacci(0);
        boolean shouldHaltFibonacci = fibonacci.check();
        System.out.println("Fibonacci : " + (shouldHaltFibonacci ? "Parar" : "Continuar"));

        Reverser reverser = new Reverser("hola");
        boolean shouldHaltReverser = reverser.check();
        System.out.println("Reverser Palindromo: " + (shouldHaltReverser ? "Parar" : "Continuar"));





        // Analizar el programa
        System.out.println("Análisis del programa:");
        checker1.analyzeProgram();
        checker2.analyzeProgram();
        checker3.analyzeProgram();
    }

}

//Esta clase contiene el método main donde se crea instancias de las clases HaltChecker, Factorial, Fibonacci y Reverser.
//Se invoca el método shouldHalt() de los objetos HaltChecker para verificar si se deben detener o continuar según las condiciones de cada uno.
//Se realizan algunas verificaciones adicionales utilizando los objetos Factorial, Fibonacci y Reverser para mostrar ejemplos de cómo se utilizan.
//Finalmente, se llama al método analyzeProgram() de los objetos HaltChecker para analizar el programa y mostrar si debe detenerse o continuar según las condiciones verificadas.
//observer
//factory method
//chain of the responsability

