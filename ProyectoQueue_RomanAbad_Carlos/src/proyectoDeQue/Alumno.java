package proyectoDeQue;

public class Alumno {
    
    private String nombre;
    private String apellidos;
    private int edad;
    private int codAlumno;
    private String telefono;
    
    public Alumno(String nombre, String apellidos, int edad, int codAlumno, String telefono) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.codAlumno = codAlumno;
        this.telefono = telefono;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }
    public int getEdad() {
        return edad;
    }
    public int getCodAlumno() {
        return codAlumno;
    }
    public String getTelefono() {
        return telefono;
    }
    @Override
    public String toString() {
        return "Alumno [nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", codAlumno=" + codAlumno
                + ", telefono=" + telefono + "]";
    }

    


}

