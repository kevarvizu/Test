package beans;

/**
 * Created by atempa on 12/12/16.
 */
public class Alumno {
    private int id_alumno;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String noControl;
    private Carrera carrera;

    public Alumno() {
    }

    public Alumno(int id_alumno, String nombre, String apellidoPaterno, String apellidoMaterno, String noControl, Carrera carrera) {
        this.id_alumno = id_alumno;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.noControl = noControl;
        this.carrera = carrera;
    }

    public int getIdAlumno() {
        return id_alumno;
    }

    public void setIdAlumno(int id_alumno) {
        this.id_alumno = id_alumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public String getNoControl() {
        return noControl;
    }

    public void setNoControl(String noControl) {
        this.noControl = noControl;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "id_alumno=" + id_alumno +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", noControl='" + noControl + '\'' +
                ", carrera=" + carrera +
                '}';
    }
}
