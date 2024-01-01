import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GestorAcademico {
    private List<Estudiante> estudiantes;
    private List<Curso> cursos;
    private Map<Curso, List<Estudiante>> inscritosPorCurso;

    // Constructor
    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.inscritosPorCurso = new HashMap<>();
        /**/
    }

    // Métodos para gestionar estudiantes, cursos y sus inscripciones
    // ...

    // Otros métodos si es necesario
    // ...
}