public class Actividad4 {
    public static void main(String[] args){

        Materia m1 = new Materia("Matemáticas", "MAT101", 5, 4);
        Materia m2 = new Materia("Programación", "PRO102", 6, 5);
        Materia m3 = new Materia("Física", "FIS103", 4, 3);

        Curso curso = new Curso("Ingeniería 1", m1, m2, m3);

        Profesor profesor = new Profesor("Carlos López", "1234", 200, m2);

        Estudiante estudiante = new Estudiante("A001", "Ana torres", 18, curso);

        System.out.println("Créditos del curso: " + curso.calcularCreditosTotales());
        System.out.println("Sueldo semanal del profesor: " + profesor.calcularSueldoSemanal());
        System.out.println("Alumnos escritos: ");
        estudiante.mostrarEstudiante();
    }   
}