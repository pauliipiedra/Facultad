import java.util.*;

public class Carrera implements Informacion, Comparable<Carrera> {
    private String nombre;
    private List<Materia> materias;

    public String getNombre() {
        return this.nombre;
    }

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.materias = new ArrayList<Materia>();
    }

    public List<Materia> getMaterias() {
        return this.materias;
    }

    public void agregarMateria(Materia materia) {
        getMaterias().add(materia);
    }

    public void eliminarMateria(Materia materia) {
        getMaterias().remove(materia);
    }

    public void encontrarMateria(String nombre) {
        boolean encontrada = false;
        for (Materia materia : getMaterias()) {
            if (materia.getNombre().equals(nombre)) {
                System.out.println("Materia encontrada,desea eliminarla? si/no");
                encontrada = true;
                Scanner in = new Scanner(System.in);
                String s = in.nextLine();
                if (s.equalsIgnoreCase("si")){
                    this.eliminarMateria(materia);
                }
            }
        }
        if (!encontrada){
            throw new NoSuchElementException("no se encontro la materia buscada.");
        }
    }

    @Override
    public int verCantidad() {
        return materias.size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Carrera: %s \n", this.nombre));
        sb.append("- - - - - - -  - - -  - - -  - - - - - - - \n");
        Collections.sort(materias);
        for (Materia materia : materias) {
            sb.append(materia.toString());
        }
        sb.append("- - - - - - -  - - -  - - -  - - - - - - - \n");
        return sb.toString();
    }

    @Override
    public String listarContenidos() {
        return this.toString();
    }


    @Override
    public int compareTo(Carrera o) {
        return this.getNombre().compareTo(o.getNombre());
    }
}
