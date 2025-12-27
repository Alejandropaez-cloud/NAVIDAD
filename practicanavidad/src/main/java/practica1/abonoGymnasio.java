package practica1;

import java.time.YearMonth;
import java.util.Random;

public class abonoGymnasio {
    // Atributos de clase.
    public static final String NOMBRE_GIMANSAIO = "FITLIFE";
    // Hemos creado/inicializado un atributo de clase con el
    // nombre de "NOMBRE_GYMNASIO" y le hemos dado el valor de FITLIFE.

    // Atributos de instancia.
    private final String titular;
    private final int codigo;
    private final YearMonth fechaCaducidad;
    private int sesiones;
    private boolean activo; // Método auxiliar.
    private String pin;

    // Constructor copia.
    public AbonoGimnasio (AbonoGimnasio otro){
        this.codigo = otro.codigo;
        this.titular = otro.titular;
        this.sesiones = otro.sesiones;
        this.activo = otro.activo;
        this.fechaCaducidad = otro.fechaCaducidad;
        this.pin = otro.pin;
    }

    // Constructor parametrizado.
    public abonoGymnasio(String titular, int codigo, YearMonth fechaCaducidad, int sesiones, boolean activo,
            String pin, int sesionesIniciales) {
        if (sesionesIniciales < 5 || sesionesIniciales > 50) {
            throw new IllegalArgumentException("El numero solicitado se encuentra fuera del rango permitido (5-50).");
        }

        this.titular = titular;
        this.sesiones = sesionesIniciales;
        this.activo = false;

        // generarPin() y generarCodigo() Son métodos qe se definiran mas tarde.
        this.pin = generarPin();
        this.codigo = generarcodigo();
        this.fechaCaducidad = YearMonth.now().plusMonths(6);
    }

    // Getters.
    public String getTitular() {
        return titular;
    }

    public int getCodigo() {
        return codigo;
    }

    public YearMonth getFechaCaducidad() {
        return fechaCaducidad;
    }

    public int getSesiones() {
        return sesiones;
    }

    public boolean isActivo() {
        return activo;
    }

    public String getPin() {
        return pin;
    }

    // Método to-String.
    @Override
    public String toString() {
        return "abonoGymnasio [titular=" + titular + ", codigo=" + codigo + ", fechaCaducidad=" + fechaCaducidad
                + ", sesiones=" + sesiones + ", activo=" + activo + ", pin=" + pin + "]";
    }

    // Métodos.
    public void activar(){
        if (sesiones > 0) {
            activo = true;
        }
    }
    public void desactivar(){
        activo = false;
    }
    public void cambiarPin(String nuevoPin){
        if (nuevoPin != null && nuevoPin.length() == 4) {
            pin = nuevoPin;
        }
    }
    public boolean usarAbono(String pinIntroducido){

        if (!activo) {
            System.out.println("Abono inactivo.");
            return false;
        }
        if (YearMonth.now().isAfter(fechaCaducidad)) {
            System.out.println("Abono caducado.");
            return false;
        }
        if (!pin.equals(pinIntroducido)) {
            System.out.println("PIN incorrecto.");
            return false;
        }
        if (sesiones <= 0) {
            System.out.println("No quedan sesiones.");
            return false;
        }
        if (sesiones == 0) {
            desactivar();            
        }
        return true;
    }

    // Métodos privados.
    private String generarCodigo(){
        Random r = new Random();
        String codigo = "";
        // BUCLE.
        for (int i = 0; i < 8; i++) {
            codigo = codigo + r.nextInt(10);  
        }
        return codigo;
    }
    private String generarPIN(){
        Random r = new Random();
        String codigo = ""; 
        // BUCLE.
        for (int i = 0; i < 4; i++) {
        pin = pin + r.nextInt(10);
        }
        return pin;
    }

    
}
