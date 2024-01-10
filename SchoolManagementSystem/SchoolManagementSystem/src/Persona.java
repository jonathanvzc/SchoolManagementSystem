import java.util.Date;

public class Persona {
    protected int id;
    protected String nombre;
    protected String apellido;
    protected String fechaDeNacimiento;

    // Constructor
    public Persona(int id, String nombre, String apellido, String fechaDeNacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

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
}