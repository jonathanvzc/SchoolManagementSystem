
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // Crear instancias de Estudiante

        Estudiante estudiante1 = new Estudiante(1, "Juan", "Perez", "01/01/2000", "Matriculado");
        Estudiante estudiante2 = new Estudiante(2, "Carolina", "Lopez", "15-05-1995", "Matriculado");


        // Crear instancias de Cursos
        Curso curso1 = new Curso(101, "Programación Java", "Introducción a Java", 3, "1.0");

        Curso curso2 = new Curso();
        curso2.setId(102);
        curso2.setNombre("Base de datos");
        curso2.setDescripcion("Diseño y administración de bases de datos");
        curso2.setNumeroCreditos(4);
        curso2.setVersion("1.0");


        // Instanciar GestorAcademico
        GestorAcademico gestorAcademico = new GestorAcademico();


        // Probar inscripción de estudiantes
        try {
            gestorAcademico.matricularEstudiante(estudiante1);
            gestorAcademico.matricularEstudiante(estudiante1); // Esto debería lanzar EstudianteYaInscritoException
        } catch (EstudianteYaInscritoException e) {
            System.out.println("Error al matricular estudiante: El estudiante ya está matriculado.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }

        // Probar creación de cursos
        gestorAcademico.agregarCurso(curso1);
        gestorAcademico.agregarCurso(curso2);

        // Probar inscripción de estudiantes en cursos
        try {
            gestorAcademico.inscribirEstudianteCurso(estudiante1, curso1.getId());
            gestorAcademico.inscribirEstudianteCurso(estudiante2, curso1.getId());
            gestorAcademico.inscribirEstudianteCurso(estudiante1, curso1.getId());
        } catch (EstudianteYaInscritoException e) {
            System.out.println("Error al matricular estudiante: El estudiante ya está matriculado.");
        } catch (Exception e) {
            System.out.println("Error inesperado: " + e.getMessage());
        }


        // Probar desinscripción de estudiantes en cursos
        try {
            gestorAcademico.desinscribirEstudianteCurso(estudiante1.getId(), curso1.getId());
            gestorAcademico.desinscribirEstudianteCurso(estudiante2.getId(), curso2.getId());
        } catch (EstudianteNoInscritoEnCursoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}