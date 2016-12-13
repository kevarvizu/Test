package beans;

/**
 * Created by atempa on 12/12/16.
 */
public class Carrera {
    private int id_carrera;
    private String nombre;

    public Carrera() {
    }

    public Carrera(int id_carrera, String nombre) {
        this.id_carrera = id_carrera;
        this.nombre = nombre;
    }

    public int getIdCarrera() {
        return id_carrera;
    }

    public void setIdCarrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "id_carrera=" + id_carrera +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
