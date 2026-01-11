package practica5.EjerciciosListas;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Ejercicio2Listas {
    public static void main(String[] args) {
        
        // Pedir una frase y guardarla en un String.
        String frase = JOptionPane.showInputDialog("Introduce la frase: ");

        // Mostrar la frase y su tamaño.
        JOptionPane.showMessageDialog(null, 
            "Frase: " + frase + "\nTamaño de la frase: " + frase.length());

        // Indica el indice de la primera ocurrencia de la letra 'a'. Usa el método indexOf 
        int indiceA = frase.indexOf('a');
        JOptionPane.showMessageDialog(null, "Indice de la primera 'a' :  " + indiceA);

        // Pasar cada caracter del String a una lista de Character.
        ArrayList<Character> listaCaracteres = new ArrayList<>();
            for (int i = 0; i < frase.length(); i++) {
                listaCaracteres.add(frase.charAt(i));   
                // El metodo charAt lo que hace es extraer y devolver 
                // un caracter especifico de una cadena de texto en 
                // una posición (inidice) determinada.
            }
        JOptionPane.showMessageDialog(null, "Lista de caracteres: " + listaCaracteres);
            
        // Método que devuelve posiciones de un carácter.
        ArrayList<Integer> posiciones = posicionesChar(listaCaracteres, 'a');
        JOptionPane.showMessageDialog(null, "String generado desde la lista:\n" + nuevaFrase);
    }   

}
