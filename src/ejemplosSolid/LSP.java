package ejemplosSolid;

public class LSP {

    public class Aves {

        public Aves() {

        }

        public void Vuelan () {
            System.out.println("Volando...");

        }

    }

    public class Pollo extends Aves{

        public Pollo() {

        }

        public void Vuelan() {
            System.out.println("Los pollos no pueden volar");
        }
    }

    //Solución

    public interface Volar {
        void vuelan();
        
    }

    public class Aves1 implements Volar {
        @Override
        public void vuelan () {
            System.out.println("Volando...");

        }
    }

    public class Pollo1 extends Aves1 {
        public Pollo1() {

        }
    }






}
