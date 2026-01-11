package practica5.EjerciciosListas;

import java.util.ArrayList;

import javax.annotation.processing.SupportedOptions;

public class Ejercicio1Listas {
    // Este archivo tiene un método main.
    public static void main(String[] args) {
        
        // Crear una lista vacía (Instanciarla)
        ArrayList<Integer> lista;
        lista = new ArrayList<>();

        // Añadir cuatro elementos.
        lista.add(35);
        lista.add(47);
        lista.add(20);
        lista.add(10);

        System.out.println("--------------------------------------------------------------");

        // Imprimir la lista de cuatro formas distintas.
        // 1º Sout
        System.out.println(lista);

        // 2º Bucle clásico. (For)
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i) + "");
        }
        System.out.println();

        // 3º Buble foreach.
        for (Integer n : lista) {
            System.out.println(n + " ");
        }

        // 4º Método forEach.
        lista.forEach(n -> System.out.println(n + " "));
        System.out.println();

        System.out.println("--------------------------------------------------------------");

        // Suma de números pares.
        int sumaPares = 0;
        for (Integer n : lista) {
            if (n % 2 == 0) { // cualquier numero divisible entre dos es par.
                sumaPares += n;      
            }
            
        }
        System.out.println("Suma de pares: " + sumaPares);

        System.out.println("--------------------------------------------------------------");

        // Cantidad de números impares.
        int contadorImpares = 0;
        for (Integer integer : lista) {
            if (integer % 2 != 0) {
                contadorImpares++;

            }
        }
        System.out.println("Cantidad de impares: " + contadorImpares);

        System.out.println("--------------------------------------------------------------");

        // Elemento mayor 
        int mayor = lista.get(0);
        for (Integer integer : lista) {
            if (integer > mayor) {
                mayor = integer;
            }
        }
        System.out.println("Mayor elemento:" + mayor);

        System.out.println("--------------------------------------------------------------");

        // Elemento menor 
        int menor = lista.get(0);
        for (Integer integer : lista) {
            if (integer < menor) {
                menor = integer;
            }
        }
        System.out.println("Menor elemento:" + menor);

        System.out.println("--------------------------------------------------------------");

        // Tamaño de la lista.
        System.out.println("El tamaño de la lista es: " + lista.size());

        System.out.println("--------------------------------------------------------------");

        // Borrar elemento en posición 2.
        lista.remove(2);
        System.out.println("Después de borrar la posición 2 la lista se quedaria tal que asi: " + lista);

        System.out.println("--------------------------------------------------------------");

        // Borrar elemento segun su valor (ejemplo: 47)
        Integer valor = 47;
        while (lista.remove(valor)) {
            System.out.println("Después de modificar la posicon 1:" + lista);
        }

        System.out.println("--------------------------------------------------------------");

        // Obtener array de int a partir de una lista.
        int[] array = new int[lista.size()]; // Establecemos que el tamaños del array sera el mismo que el tamaño de la lista.
        for (int i = 0; i < lista.size(); i++) {
            array[i] = lista.get(i);        
        }

        System.out.println("Array: ");
        for (int i : array) {
            System.out.println(i + " ");
        }
        
    }
}
