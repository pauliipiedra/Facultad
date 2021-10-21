public class Estudiante extends Persona implements Comparable<Estudiante> {


    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);

    }

    @Override
    public void modificarDatos() {

    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compareTo(Estudiante o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
