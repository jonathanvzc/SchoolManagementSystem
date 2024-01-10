import java.util.ArrayList;
import java.util.HashMap;

public class GestorAcademico implements ServiciosAcademicosI {
    private ArrayList<Estudiante> estudiantes;
    private ArrayList<Curso> cursos;
    private HashMap<Curso, ArrayList<Estudiante>> estudiantesPorCurso;


    // Constructor
    public GestorAcademico() {
        this.estudiantes = new ArrayList<>();
        this.cursos = new ArrayList<>();
        this.estudiantesPorCurso = new HashMap<>();
    }

    // Implementación de métodos de la interfaz

    @Override
    public void matricularEstudiante(Estudiante estudiante) throws EstudianteYaInscritoException {
        if (!estudiantes.contains(estudiante)) {
            estudiantes.add(estudiante);
            System.out.println("Estudiante matriculado: " + estudiante.getNombre());
        } else {
            throw new EstudianteYaInscritoException("Estudiante ya matriculado.");
        }
    }

    @Override
    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            estudiantesPorCurso.put(curso, new ArrayList<>());
            System.out.println("Curso agregado: " + curso.getNombre());
        } else {
            System.out.println("Curso ya existe.");
        }
    }
    @Override
    public void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException {


        Curso curso = encontrarCursoPorId(idCurso);

        if (curso != null) {
            ArrayList<Estudiante> estudiantesEnCurso = estudiantesPorCurso.get(curso);

            if (!estudiantesEnCurso.contains(estudiante)) {
                estudiantesEnCurso.add(estudiante);
                System.out.println("Estudiante inscrito en el curso: " + curso.getNombre());
            } else {
                throw new EstudianteYaInscritoException("Estudiante ya inscrito en el curso.");
            }
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    @Override
    public void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException {
        Curso curso = encontrarCursoPorId(idCurso);

        if (curso != null) {
            ArrayList<Estudiante> estudiantesEnCurso = estudiantesPorCurso.get(curso);

            for (Estudiante estudiante : estudiantesEnCurso) {
                if (estudiante.getId() == idEstudiante) {
                    estudiantesEnCurso.remove(estudiante);
                    System.out.println("Estudiante desinscrito del curso: " + curso.getNombre());
                    return;
                }
            }

            throw new EstudianteNoInscritoEnCursoException("Estudiante no inscrito en el curso.");
        } else {
            System.out.println("Curso no encontrado.");
        }
    }

    private Curso encontrarCursoPorId(int idCurso) {
        for (Curso curso : cursos) {
            if (curso.getId() == idCurso) {
                return curso;
            }
        }
        return null;
    }
}