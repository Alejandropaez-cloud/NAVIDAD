package practica5.EjerciciosListas;

import java.util.ArrayList;
import java.util.Random;

import javax.swing.JOptionPane;

public class Ejercicio3Listas {
    public static void main(String[] args) {

        // Leeer el tamaño de las listas.
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño de las listas: "));

        // Crear las dos Arraylist.
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> lista2 = new ArrayList<>();

        // Rellenar las listas con elementos random entre 1 y 100.
        Random r = new Random();
        for (int i = 0; i < tamaño; i++) {
            lista1.add(r.nextInt(100) + 1);
            lista2.add(r.nextInt(100) + 1);

        }
        // Multiplicar las listas.
        ArrayList<Integer> resultado = multiplicarListas(lista1, lista2);

        // Imprimir las listas.
        imprimirLista("Lista 1", lista1);
        imprimirLista("Lista 2", lista2);
        imprimirLista("Resultado (Multiplicación dos a dos)", resultado);

        // Ya hemos terminado el programa falta definir los dos métodos:
        // El de imprmir las listas y el de multiplicar las listas.

    }

    // Método que mltiplica de dos elementos en dos elementos.
    public static ArrayList<Integer> multiplicarListas(
            ArrayList<Integer> l1,
            ArrayList<Integer> l2) {

        ArrayList<Integer> resultado = new ArrayList<>();

        for (int i = 0; i < l1.size(); i++) {
            int multiplicacion = l1.get(i) * l2.get(i);
            resultado.add(multiplicacion);
        }
        return resultado;

    }

    // Método para imprimir una lista.
    public static void ImprimirLista(String nombre, ArrayList<Integer> lista){
        System.out.println(nombre + ": " + lista);
    }
    // Como ya vimos hay varias maneras de imprimir una lista en concreto hay cuatro,
    // la mas facil de ellas sería el sout 
}
