package practica3;

import java.util.Scanner;

public class edad {
    public static void main(String[] args) {
        // Scanner.
        Scanner teclado = new Scanner(System.in);
        // Variable nombre.
        String nombre;
        System.out.println("Introducide tu nombre: ");
        nombre = teclado.nextLine();
        // Variable edad.
        int edad;
        System.out.println("Introduce tu edad: ");
        edad = teclado.nextInt();
        // Impresión.
        System.out.println("Hola! Mi nombre es " + nombre + " y mi edad es de " + edad + ".");
        if (edad > 0 || edad < 18) {
            System.out.println("El usuario es menor de edad.");
        } if (edad > 18) {
            System.out.println("El usuario es mayor de edad.");
        } if (edad < 0) {
            throw new IllegalArgumentException("Número fuera de rango.");
        }
        


        teclado.close();

    }
}
