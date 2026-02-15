public class Profesor {
    private String nombre;
    private String numeroNomina;
    private double sueldoPorHora;
    private Materia materia;


        public Profesor() {
        this.nombre = "ND";
        this.numeroNomina = "000";
        this.sueldoPorHora = 0;
        this.materia = null;
    }


    public Profesor(String nombre, String numeroNomina, double sueldoPorHora, Materia materia){
        this.nombre = nombre;
        this.numeroNomina = numeroNomina;
        this.sueldoPorHora = sueldoPorHora;
        this.materia = materia;
    }


    public Profesor(Profesor otro){
        this.nombre = otro.nombre;
        this.numeroNomina = otro.numeroNomina;
        this.sueldoPorHora = otro.sueldoPorHora;

        if (otro.materia != null) {
            this.materia = new Materia(otro.materia);
        } else {
            this.materia = null;
        }
    }

    public double calcularSueldoSemanal() {
        if (materia != null) {
            return materia.getHorasSemanales() * sueldoPorHora;
        }
        return 0;
    }

}
