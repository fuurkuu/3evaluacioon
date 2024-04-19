package calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();

        int suma = calculadora.sumar(num1, num2);
        System.out.println("Suma: " + num1 + " + " + num2 + " = " + suma);

        int resta = calculadora.restar(num1, num2);
        System.out.println("Resta: " + num1 + " - " + num2 + " = " + resta);

        int multiplicacion = calculadora.multiplicar(num1, num2);
        System.out.println("Multiplicación: " + num1 + " * " + num2 + " = " + multiplicacion);

        if (num2 != 0) {
            double division = calculadora.dividir(num1, num2);
            System.out.println("División: " + num1 + " / " + num2 + " = " + division);
        } else {
            System.out.println("No se puede dividir por cero.");
        }

        scanner.close();
    }
}
