package cb32jhonar;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public abstract class Cuenta {

    protected double saldo;
/**
 * constructor cuenta vacia
 */
    public Cuenta() {
        saldo = 0;
    }
/**
 * 
 * @param saldodinero constructo cuenta con dinero
 */
    public Cuenta(double saldodinero) {
        this.saldo = saldodinero;
    }
/**
 * 
 * @param dinero metodo insertar dinero
 */
    public void insertarSaldo(double dinero) {
        saldo += dinero;
    }
/**
 * 
 * @param dinero retirar dinero
 * @return true u false si se ejecuta o no la operacion
 */
    public boolean retirarSaldo(double dinero) {
      if (dinero <= saldo) {
            saldo =saldo- dinero;
            return true;
        }
        return false;
    }

    public void setSaldo(double saldoI) {
        this.saldo = saldoI;
    }

    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public String toString() {
        return "\nSu saldo es= " + saldo;
    }

}
