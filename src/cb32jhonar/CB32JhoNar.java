package cb32jhonar;

/**
 *
 * @author Jhoel Alexander Narváez Valarezo
 */
public class CB32JhoNar {

    public static void main(String[] args) {
        // Programa ejecutable
        LibretaAhorro lb= new LibretaAhorro(200);
        CuentaCorriente cc= new CuentaCorriente(300,lb);
        Libreta2020 l20= new Libreta2020(200);
        
        System.out.println("libreta ahorro"+lb);
        System.out.println("cuenta corriente"+cc);
        System.out.println("libreta 2020"+l20);
        System.out.println("Se paga 400?");
        switch (cc.pagar(400)) {
            case -1:
                System.out.println("No hay suficiente saldo");
                break;
            case 0:
                System.out.println("Pago correcto");
                break;
        }
        System.out.println("Se imprime cuenta corriente"+cc);
        System.out.println("libreta ahorro"+lb);
        System.out.println("Se retira 100? de libreta 2020");
        l20.retirarSaldo(100);
        System.out.println(l20);
        System.out.println("Se actualiza cuenta ahorros");
        lb.actualizar();
        System.out.println("libreta ahorro"+lb);
        System.out.println("se actualiza libreta 2020");
        l20.actualizar();
         System.out.println("libreta 2020"+l20);
        
    }

}
