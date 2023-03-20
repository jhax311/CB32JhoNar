package cb32jhonar;

/**
 * 
 * @author Jhoel Alexander Narváez Valarezo
 */
public class LibretaAhorro extends Cuenta{
    private final double inter= 0.04;
    
    public LibretaAhorro() {
        super.saldo = 0;
    }

    public LibretaAhorro(double dinero) {
        super.saldo += dinero;
    }
    
    /**
     * metodo de actualizar libretacon 4% de interes
     */

    public void actualizar(){
        super.saldo+=(super.saldo *inter);
    }  
    
}
