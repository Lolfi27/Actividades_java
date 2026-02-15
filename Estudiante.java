public class Estudiante {
    private String nombre;
    private int edad;
    private String matricula;
    private Curso curso;

    public String getnombre(){
        return nombre;
    }
    
    public int getedad(){
        return edad;
    }
    
    public String getmatricula(){
        return matricula;
    }
                
    public Curso getcurso(){
        return curso;
    }

    public void setnombre(String nombre){
        this.nombre = nombre;
    }
    
    public  void setedad(int edad){
        this.edad = edad;
    }
    
    public void setmatricula(String matricula){
        this.matricula = matricula;
    }
                
    public void setcurso(Curso curso){
        this.curso = curso;
    }    

    public Estudiante(){
        nombre = "nd";
        edad = 0;
        matricula = "nd";
        curso = null;
    }

    public Estudiante(String matricula, String nombre, int edad, Curso curso){
        this.nombre = nombre;
        this.edad = edad;
        this.matricula = matricula;
        this.curso = curso;
    }

    public Estudiante(Estudiante otro){
        this.nombre = otro.nombre;
        this.edad = otro.edad;
        this.matricula = otro.matricula;

        if (otro.curso != null) {
            this.curso = new Curso(otro.curso); 
        } else {
            this.curso = null;
        }
    }

    public void mostrarEstudiante(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Matricula: " + matricula);
            
        if (curso != null){
            System.out.println("Curso inscrito: " + curso.getNombre());
        } else {
            System.out.println("Sin curso asignado");

        }
    }
}