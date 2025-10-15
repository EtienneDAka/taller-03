package ejemplosSolid;

public class OpenClose {


   public class ProcesadorPagos {
    public void procesar(double monto, String tipoPago) {
        if (tipoPago.equals("EFECTIVO")) {
            System.out.println("Pago con EFECTIVO $" + monto);
        } else if (tipoPago.equals("PayPal")) {
            System.out.println("Pago con PayPal por $" + monto);
        } 
 
    }
}

    //SOLUCION
    public interface MetodoPago {
        void pagar(double monto);
    }

    public class PagoEfectivo implements MetodoPago {
    @Override
    public void pagar(double monto) {
        System.out.println("Pago con Efectivo por $" + monto);
    }
    }

    public class PagoPayPal implements MetodoPago {
        @Override
        public void pagar(double monto) {
            System.out.println("Pago con PayPal por $" + monto);
        }
    }

}
