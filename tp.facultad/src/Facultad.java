import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Facultad implements Informacion {

    private String nombre;
    private List<Carrera> carreras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        carreras = new ArrayList<Carrera>();
    }

    public void agregarCarrera(Carrera carrera) {
        carreras.add(carrera);
    }

    public void eliminarCarrera(String nombre) {
        for (Carrera carrera : carreras) {
            if (carrera.getNombre().equals(nombre)) {
                carreras.remove(carrera);
                break;
            }
        }
    }

    public void eliminarEstudiante(Estudiante estudiante) {
        for (Carrera carrera : carreras) {
            for (Materia materia : carrera.getMaterias()) {
                materia.getEstudiantes().remove(estudiante);
            }
        }
    }


    @Override
    public int verCantidad() {
        return carreras.size();
    }

    @Override
    public String listarContenidos() {
        StringBuilder sb = new StringBuilder();
        sb.append("==========================================\n");
        sb.append(String.format("Facultad: %s \n", this.nombre));
        Collections.sort(carreras);
        for (Carrera carrera : carreras) {
            sb.append(carrera.toString());
        }
        sb.append("==========================================\n");
        return sb.toString();
    }
}