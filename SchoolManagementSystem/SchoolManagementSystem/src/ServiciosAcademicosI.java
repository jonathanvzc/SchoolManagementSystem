
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public interface ServiciosAcademicosI {

    void matricularEstudiante(Estudiante estudiante) throws EstudianteYaInscritoException;

    void agregarCurso(Curso curso);
    void inscribirEstudianteCurso(Estudiante estudiante, int idCurso) throws EstudianteYaInscritoException;
    void desinscribirEstudianteCurso(int idEstudiante, int idCurso) throws EstudianteNoInscritoEnCursoException;
}