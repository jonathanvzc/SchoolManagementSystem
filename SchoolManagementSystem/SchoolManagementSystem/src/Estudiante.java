import java.util.Date;

public class Estudiante extends Persona {
    private int id;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String estado;

    // Constructor
    public Estudiante(int id, String nombre, String apellido, String fechaDeNacimiento, String estado) {
        super(id, nombre, apellido, fechaDeNacimiento);
        this.estado = estado;
    }
    // Constructor vacio


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public java.lang.String getNombre() {
        return nombre;
    }

    public void setNombre(java.lang.String nombre) {
        this.nombre = nombre;
    }

    public java.lang.String getApellido() {
        return apellido;
    }

    public void setApellido(java.lang.String apellido) {
        this.apellido = apellido;
    }

    public java.lang.String getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(java.lang.String fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public java.lang.String getEstado() {
        return estado;
    }

    public void setEstado(java.lang.String estado) {
        this.estado = estado;
    }
}