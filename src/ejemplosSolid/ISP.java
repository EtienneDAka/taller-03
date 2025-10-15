package ejemplosSolid;

public interface ISP {
    
    public interface ImpresoraMultifuncional {
        void imprimirDocumento(String documento);
        void escanearDocumento(String documento);
        void enviarPorFax(String documento);
    }


    public class ImpresoraAntigua implements ImpresoraMultifuncional{
        @Override
        public void imprimirDocumento(String documento) {
            System.out.println("Imprimiendo: " + documento);
        }

        @Override
        public void escanearDocumento(String documento) {
            System.out.println("Scanneando: " + documento);
        }

        @Override
        public void enviarPorFax(String documento) {
            
            System.out.println("FAX NO SOPORTADO");
        }

    }

    //SOLUCION

    public interface IImprimir {
        void imprimirDocumento(String documento);
    }


    public interface IEscaner {
        void escanearDocumento(String documento);
    }

    public interface IFax {
        void enviarPorFax(String documento);
    }

    public class ImpresoraAntigua1 implements IImprimir, IEscaner{
        @Override
        public void imprimirDocumento(String documento) {
            System.out.println("Imprimiendo: " + documento);
        }

        @Override
        public void escanearDocumento(String documento) {
            System.out.println("Scanneando: " + documento);
        }

    }



}
