public class Main {


    public static void main(String[] args) {
        Facultad utn = new Facultad("utn");
        Carrera tup = new Carrera("tup");
        Materia lab2 = new Materia("laboratorio 2",new Profesor("facu"));
        Estudiante estudiante1 = new Estudiante("Estudiante1","Perez", 123);
        Estudiante estudiante2 = new Estudiante("Estudiante2","Perez2", 124);
        Estudiante estudiante3 = new Estudiante("Estudiante3","Perez3", 125);
        /*7- Agregar Estudiantes a una Materia.  */
        lab2.agregarEstudiante(estudiante1);
        lab2.agregarEstudiante(estudiante2);
        lab2.agregarEstudiante(estudiante3);
        tup.agregarMateria(lab2);
        /*1- Agregar Carreras a una Facultad.*/
        utn.agregarCarrera(tup);

        System.out.print(utn.listarContenidos());
        Materia ingles = new Materia("ingles",new Profesor("lugo"));
        ingles.agregarEstudiante(estudiante1);
        Carrera isi = new Carrera("isi");
        /*4-Agregar materias a una Carrera.*/
        isi.agregarMateria(ingles);

        utn.agregarCarrera(isi);
        System.out.print(utn.listarContenidos());
        /*5- Eliminar materias a una Carrera.*/
        isi.eliminarMateria(ingles);
        System.out.print(utn.listarContenidos());
        isi.agregarMateria(ingles);
        /*3- Eliminar Estudiantes de una facultad implica que se elimine
        el estudiante de cada una de las materias a las cuales se inscribió. */
        utn.eliminarEstudiante(estudiante1);

        System.out.print(utn.listarContenidos());
        /*2- Eliminar Carreras de la facultad. */
        utn.eliminarCarrera("isi");

        System.out.print(utn.listarContenidos());
        /*6 - Encontrar materias de una carrera en particular
        indicando el nombre de la materia. Si la materia existe nos deberá preguntar si deseamos eliminar.*/
        isi.encontrarMateria("ingles");

        /*8 - Eliminar Estudiante de una Materia. */
        ingles.eliminarEstudiante(estudiante1);

        /*9 - Modificar el Profesor de la materia.*/
        ingles.modificarTitular(new Profesor("Facundo Mattof"));

        ingles.getTitular().setAntiguedad(10);
        ingles.getTitular().setBasico(200000.0);
        double sueldo = ingles.getTitular().calcularSueldo();
        System.out.printf("El sueldo del profe de ingles es $ %s", sueldo);



    }
}
