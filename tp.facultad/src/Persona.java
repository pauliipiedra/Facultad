public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected int legajo;

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public Persona(String nombre, String apellido, int legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.legajo = legajo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public abstract void modificarDatos();

    @Override
    public String toString() {
        return "\n{\n" +
                "  nombre='" + nombre + "'\n" +
                "  apellido='" + apellido + "'\n" +
                "  legajo='" + legajo + "'\n" +
                '}'+ '\n';
    }


}
