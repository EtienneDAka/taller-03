package ejemplosSolid;

import java.util.*;


public class SRP {
    //La clase generador de Reportes tiene mas de una manera de cambiar, 
    // o mejor dicho tiene más de una responsabilidad, 
    // por lo tanto no cumple SRP
    public class GeneradorDeReportes {
        private String nombreProyecto;
        public GeneradorDeReportes(String nombreProyecto) {
            this.nombreProyecto = nombreProyecto;
        }
        public String getNombreProyecto() {
            return nombreProyecto;
        }
        public void setNombreProyecto(String nombreProyecto) {
            this.nombreProyecto = nombreProyecto;
        }

        public void imprimirReportes(){
            System.out.println(nombreProyecto);
        }

        public void guardarProyecto() {         
            //logica para guardar Reporte
        }


    }

    //SOLUCION: Crear clases que tengan como prioridad aquella responsabilidad

    public class Reporte {

        private String titulo;
        private String fecha;


        public Reporte(String titulo, String fecha) {
            this.titulo = titulo;
            this.fecha = fecha;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public String getFecha() {
            return fecha;
        }

        public void setFecha(String fecha) {
            this.fecha = fecha;
        }
    }

    public class ImprimirReportes {
        ArrayList<Reporte> listReportes;

        public void imprimirReportes(){
           for(Reporte r: listReportes) {
            System.out.println(r);
           }
        }
    }

    public class GuardarProyectos {
        
        ArrayList<Reporte> listReportes;
        
        public GuardarProyectos(){
            listReportes = new ArrayList<>();
        }

        public ArrayList<Reporte> getListReportes() {
            return listReportes;
        }

        public void setListReportes(ArrayList<Reporte> listReportes) {
            this.listReportes = listReportes;
        }

    }

    public class ManejadorDeReportes {
        private ImprimirReportes imprimirReportes;
        private GuardarProyectos guardarProyectos;

        public ManejadorDeReportes (ImprimirReportes imprimirReportes, GuardarProyectos guardarProyectos ) {
            this.imprimirReportes = imprimirReportes;
            this.guardarProyectos = guardarProyectos;
        }

        public void imprimirYguardar (){

            imprimirReportes.imprimirReportes();
            guardarProyectos.getListReportes();
        }


    }




}
