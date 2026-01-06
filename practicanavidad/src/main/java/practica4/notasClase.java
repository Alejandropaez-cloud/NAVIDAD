package practica4;

import javax.swing.JOptionPane;

public class notasClase {

    /* 
     * VARIABLES GLOBALES
     * Se declaran fuera de los métodos para que TODOS
     * los métodos puedan usarlas (main, mostrar, media, etc.)
     */

    static String nombre1, nombre2, nombre3, nombre4, nombre5;
    static double nota1, nota2, nota3, nota4, nota5;

    public static void main(String[] args) {

        /*
         * ANTES DE MOSTRAR EL MENÚ
         * primero pedimos los datos a los alumnos.
         * Si no hacemos esto, las variables estarían vacías (null y 0.0)
         */
        pedirDatos();

        int opcion; // Variable para guardar la opción del menú

        /*
         * BUCLE DO-WHILE
         * El menú se mostrará al menos una vez
         * y se repetirá mientras la opción no sea 0
         */
        do {
            opcion = Integer.parseInt(
                    JOptionPane.showInputDialog(
                            "MENÚ\n"
                          + "1. Mostrar todas las notas\n"
                          + "2. Mostrar aprobados\n"
                          + "3. Mostrar suspensos\n"
                          + "4. Mostrar nota media\n"
                          + "0. Salir"
                    )
            );

            /*
             * SWITCH
             * Dependiendo de la opción elegida,
             * se llama a un método diferente
             */
            switch (opcion) {
                case 1:
                    mostrarNotas();
                    break;

                case 2:
                    mostrarAprobados();
                    break;

                case 3:
                    mostrarSuspensos();
                    break;

                case 4:
                    mostrarMedia();
                    break;

                case 0:
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción incorrecta");
            }

        } while (opcion != 0); // El programa termina cuando la opción es 0
    }

    /*
     * MÉTODO pedirDatos
     * Pide el nombre y la nota de los 5 alumnos
     */
    public static void pedirDatos() {

        nombre1 = JOptionPane.showInputDialog("Nombre del alumno 1:");
        nota1 = pedirNota();

        nombre2 = JOptionPane.showInputDialog("Nombre del alumno 2:");
        nota2 = pedirNota();

        nombre3 = JOptionPane.showInputDialog("Nombre del alumno 3:");
        nota3 = pedirNota();

        nombre4 = JOptionPane.showInputDialog("Nombre del alumno 4:");
        nota4 = pedirNota();

        nombre5 = JOptionPane.showInputDialog("Nombre del alumno 5:");
        nota5 = pedirNota();
    }

    /*
     * MÉTODO pedirNota
     * Sirve para pedir una nota válida entre 0 y 10
     * Devuelve un double
     */
    public static double pedirNota() {

        double nota;

        /*
         * BUCLE DO-WHILE
         * Se repite mientras la nota esté fuera del rango
         */
        do {
            nota = Double.parseDouble(
                    JOptionPane.showInputDialog("Introduce una nota entre 0 y 10")
            );
        } while (nota < 0 || nota > 10);

        return nota; // Se devuelve la nota correcta
    }

    /*
     * MÉTODO mostrarNotas
     * Muestra todos los alumnos con sus notas
     */
    public static void mostrarNotas() {

        JOptionPane.showMessageDialog(null,
                nombre1 + ": " + nota1 + "\n" +
                nombre2 + ": " + nota2 + "\n" +
                nombre3 + ": " + nota3 + "\n" +
                nombre4 + ": " + nota4 + "\n" +
                nombre5 + ": " + nota5
        );
    }

    /*
     * MÉTODO mostrarAprobados
     * Muestra solo los alumnos con nota >= 5
     */
    public static void mostrarAprobados() {

        String texto = "Aprobados:\n";

        if (nota1 >= 5) texto += nombre1 + "\n";
        if (nota2 >= 5) texto += nombre2 + "\n";
        if (nota3 >= 5) texto += nombre3 + "\n";
        if (nota4 >= 5) texto += nombre4 + "\n";
        if (nota5 >= 5) texto += nombre5 + "\n";

        JOptionPane.showMessageDialog(null, texto);
    }

    /*
     * MÉTODO mostrarSuspensos
     * Muestra solo los alumnos con nota < 5
     */
    public static void mostrarSuspensos() {

        String texto = "Suspensos:\n";

        if (nota1 < 5) texto += nombre1 + "\n";
        if (nota2 < 5) texto += nombre2 + "\n";
        if (nota3 < 5) texto += nombre3 + "\n";
        if (nota4 < 5) texto += nombre4 + "\n";
        if (nota5 < 5) texto += nombre5 + "\n";

        JOptionPane.showMessageDialog(null, texto);
    }

    /*
     * MÉTODO mostrarMedia
     * Calcula y muestra la nota media de la clase
     */
    public static void mostrarMedia() {

        double media = (nota1 + nota2 + nota3 + nota4 + nota5) / 5;
        JOptionPane.showMessageDialog(null, "Nota media: " + media);
    }
}
