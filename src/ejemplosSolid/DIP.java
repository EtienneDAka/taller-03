package ejemplosSolid;

public class DIP {

    
    public static class Serviciopostal {
      
        
        public void enviar(String mensaje) {
            System.out.println("Servicio Postal: Enviando mensaje -> " + mensaje);
        }
    }

    
    public static class Mensajero {
        
        Serviciopostal servicio = new Serviciopostal();

        public void notificar() {
            servicio.enviar("Hola desde el Mensajero fuertemente acoplado.");
        }
    }

public class DIP_Aplicacion {

  
    public interface IEnviadorMensaje {
        void enviar(String mensaje);
    }

    public static class ServicioPostal implements IEnviadorMensaje {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Servicio Postal (DIP): Procesando -> " + mensaje);
        }
    }
    
    
    public static class ServicioEmail implements IEnviadorMensaje {
        @Override
        public void enviar(String mensaje) {
            System.out.println("Servicio Email (DIP): Enviando -> " + mensaje);
        }
    }

    public static class Mensajero {
        
    
        private final IEnviadorMensaje servicio; 
        public Mensajero(IEnviadorMensaje servicio) {
            this.servicio = servicio;
        }
        
        public void notificar(String mensaje) {
            this.servicio.enviar(mensaje);
        }
    }
    
}
}