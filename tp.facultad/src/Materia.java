import java.util.*;

public class Materia implements Informacion, Comparable<Materia>{
    private String nombre;
    Profesor titular;
    private List<Estudiante> estudiantes;

    public Materia(String nombre, Profesor titular){
        this.nombre = nombre;
        this.titular = titular;
        estudiantes = new ArrayList<Estudiante>();
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void agregarEstudiante(Estudiante estudiante){
        getEstudiantes().add(estudiante);
    }
    public void eliminarEstudiante(Estudiante estudiante){
        getEstudiantes().remove(estudiante);

    }

    public void modificarTitular(Profesor profesor){
        this.titular = profesor;
    }
    public void modificarDatos(Estudiante estudiante){

    }

    @Override
    public int verCantidad() {
        return estudiantes.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Collections.sort(getEstudiantes());
        for(Estudiante estudiante: getEstudiantes()){
            sb.append(estudiante.toString());
        }
        return sb.toString();
    }

    @Override
    public String listarContenidos() {
        return this.toString();
    }

    public Profesor getTitular() {
        return this.titular;
    }

    @Override
    public int compareTo(Materia o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
