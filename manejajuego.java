package juego;

import java.util.Random;
import java.util.Scanner;

public class manejajuego {
    private int numeroAdivinar;
    private boolean haGanado;

    public manejajuego() {
        Random random = new Random();
        this.numeroAdivinar = random.nextInt(100) + 1; // Generar número aleatorio entre 1 y 100
        this.haGanado = false;
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de adivinanza!");
        System.out.println("Intenta adivinar un número entre 1 y 100.");

        while (!haGanado) {
            System.out.print("Introduce tu suposición: ");
            int suposicion = scanner.nextInt();

            if (suposicion < numeroAdivinar) {
                System.out.println("El número a adivinar es mayor.");
            } else if (suposicion > numeroAdivinar) {
                System.out.println("El número a adivinar es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
                haGanado = true;
            }
        }

        scanner.close();
    }
}
