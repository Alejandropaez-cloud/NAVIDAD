package practica1;

public class Programa {
    public static void main(String[] args) {
        abonoGymnasio a1 = new abonoGymnasio("Carlos", 1234, 03/12/03, 0, false, null, 0)
        System.out.println(a1);
        abonoGymnasio a2 = new abonoGymnasio(a1);
        System.out.println(a2);
    }
}  
