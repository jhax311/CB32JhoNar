package cb32jhonar;

/**
 * 
 * @author Jhoel Alexander Narváez Valarezo
 */
public class Libreta2020 extends LibretaAhorro{
    
    private final double inter=0.08, penal=0.02;
   /**
    * Constructor de libreta vacia
    */ 
    public Libreta2020() {
        super.saldo = 0;
    }
    /**
     * 
     * @param dinero constructor con parametro de dinero
     */
    public Libreta2020(double dinero) {
        super.saldo += dinero;
    }   
    
    /**
     * metodo que calcula el interes
     */
        public void actualizar(){
        super.saldo= super.saldo+(super.saldo *inter);
    }
        /**
         * 
         * @param dinero  metodo que retira el dinero
         */
  @Override
     public boolean retirarSaldo(double dinero){
            if (super.retirarSaldo(dinero+dinero*penal)) {
            return true;
        }
        return false;
     }
    
}
