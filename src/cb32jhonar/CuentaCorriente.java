package cb32jhonar;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class CuentaCorriente extends Cuenta {

    private LibretaAhorro cuAho;

    public CuentaCorriente() {
        super.saldo = 0;
    }

    public CuentaCorriente(double dinero) {
        super.saldo += dinero;
        this.cuAho = null;
    }
/**
 * 
 * @param dinero constructor cuenta con dinero
 * @param libre  asociada a libreta ahorros
 */
    public CuentaCorriente(double dinero, LibretaAhorro libre) {
        super.saldo += dinero;
        this.cuAho = libre;
    }
/**
 * 
 * @param dinero realiza pagos
 * @return 0 u -1 segun si se realiza el pago o no
 */
    public int pagar(double dinero) {
        if (dinero <= getSaldo()) {
            super.retirarSaldo(dinero);
            return 0;
        } else if (this.cuAho != null  && dinero <= (this.cuAho.getSaldo() + saldo)) {
            cuAho.retirarSaldo(dinero-super.saldo);
                super.setSaldo(0);
                return 0;
        }
        return -1;
    }
}

