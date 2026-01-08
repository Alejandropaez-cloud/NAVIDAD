package practica4.ex19dic;

import java.time.YearMonth;
import java.util.Random;


public class TarjetaCrédito {
    
    private final static String ENTIDAD_EMISORA = "Dawnbank";

    private final String Titular;
    private final String numeroTarjeta; //Tamaño 16.
    private final YearMonth fechacaducidad;
    private double credito;
    private boolean estado;
    private String pin;

    public TarjetaCrédito(String titular, double credito){
        if (credito<500 || credito>3000) {
            throw new IllegalArgumentException("El credito debe ser entre 500 y 3000");
        }
        RandomStringUtils Random = RandomStringUtils.secure();

        this.titular = titular;
        this.credito = credito;
        this.numeroTarjeta = random.nextNumeric(16);
        this.estado = false;
        this.pin = random.nextNumeric(4);
        this.fechacaducidad = YearMonth.now().plusYears(5);
    }

    public TarjetaCrédito (TarjetaCrédito otro){
        this.Titular = otro.Titular;
        this.credito = otro.credito;
        this.estado = otro.estado;
        this.fechacaducidad = otro.fechacaducidad;
        this.numeroTarjeta = this.numeroTarjeta;
        
    }
}
