package practica5;

import java.nio.channels.Pipe.SourceChannel;
import java.util.ArrayList;

public class ProyectoListas {
    public static void main(String[] args) { 
        // ArrayList o listas en general no usan primitivos.
        // declaracion de una lista de objetos Integer

        ArrayList<Integer> lista;
        // Clases envolventes o wrapper classes
        Integer numero = 5;  //boxing
        
        int numero2 = numero;   //unboxing
        // Instanciar la lista.
        lista = new ArrayList<>();
        // Tenemos una lista vacia, sin numeros 
        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println(lista);
        // Array.length es el equivalente a lista.size()
        // Añade elementos  -  usar métodos add.
        lista.add(35);
        System.out.println("--------------------");
        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println(lista);

        lista.add(10);
        System.out.println("--------------------");
        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println(lista);

        lista.add(47);
        lista.add(20);
        // Esto es una lista de 4 elementos (size 4) y con indices 0,1,2,3.
        System.out.println("--------------------");
        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println(lista);

        lista.addFirst(1);  // mueve un elemento al principio de la lista corriendo una posicion en los indices.
        System.out.println("--------------------");
        System.out.println("Tamaño de la lista: " + lista.size());
        System.out.println(lista);

        // lista.addLast = lista.add (basicamente hace la misma función).

        
    }
}
