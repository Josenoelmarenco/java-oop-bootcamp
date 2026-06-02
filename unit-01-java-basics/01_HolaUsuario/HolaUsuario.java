/*
 * Ejercicio: HolaUsuario
 * Objetivo: Leer nombre con Scanner y saludar al usuario.
 * Conceptos: Scanner, System.out, String
 *
 * Repo de referencia: https://github.com/vesavvo/Object-Oriented-Programming
 */
import java.util.Scanner;

public class HolaUsuario {
    public static void main(String[] args) {
        // TODO: implementa el ejercicio
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Hello, " + name + "!" + " You are " + age + " years old.");
        scanner.close();
    }
}
