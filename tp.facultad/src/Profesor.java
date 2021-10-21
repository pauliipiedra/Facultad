class Profesor extends Persona {

    private double basico;

    private int antiguedad;

    public Profesor(String nombre) {
        super(nombre);
    }

    public Profesor(String nombre, String apellido, int legajo, int antiguedad, double basico) {
        super(nombre, apellido, legajo);
        this.antiguedad = antiguedad;
        this.basico = basico;
    }

    public double getBasico() {
        return basico;
    }

    public void setBasico(double basico) {
        this.basico = basico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public void modificarDatos() {

    }

    public double calcularSueldo() {
        return basico + basico * antiguedad * 0.1;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo + '\'' +
                ", basico=" + basico +
                ", antiguedad=" + antiguedad +
                '}';
    }
}
