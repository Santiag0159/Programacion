public class Main{
    public static void main(String[] args){
        Universidad Unvime = new Universidad
        ("UNVIME", "Avenida siempre viva 123");//No me se la calle real
        String nombreCarrera = "Programador Universitario en sistemas"; //Pongo nombreCarrera para mas comodidad
        System.out.println("Matriculacion y asignacion de materias");
        //Nuevas Materias...
        Materia PROG1 = new Materia("Programacion 1", "PROG1", 4, 0.0,null);
        Materia PDP = new Materia("Paradigma de la programacion", "PDP", 5, 0.0, null);
        //Nuevos Estudiantes....
        Estudiante santiago = new Estudiante
        ("Santiago ", "Morales ", 23, "43765597 ", nombreCarrera, 7.1);
        santiago.inscribirMateria
        (new Materia("Programacion ", " PROG1 ", 4, 7.0, null));
        santiago.inscribirMateria
        (new Materia("Paradigma de la Programacion ", " PDP ", 5, 8.5, null));
        //Estudiante 2
        Estudiante noelia = new Estudiante
        ("Noelia ", " Gonzalez ", 24, " 43222111 ", nombreCarrera, 9.0 );
        noelia.inscribirMateria
        (new Materia(" Programacion ", " PROG1 ", 4, 7.0, null));
        noelia.inscribirMateria
        (new Materia(" Paradigma de la programacion ", " PDP ", 5, 8.5, null));
        //Estudiante 3
        Estudiante ricardo = new Estudiante
        ("Ricardo ", " Tapia ", 21, " 45666777 ", nombreCarrera, 10);
        ricardo.inscribirMateria
        (new Materia("Programacion ","PROG1", 4, 10, null));
        ricardo.inscribirMateria
        (new Materia("Paradigma de la Programacion ", "PDP", 5, 10, null));
        //Nuevos Profesores...
        Profesor rodrigo = new Profesor
        ("Rodrigo", "Silva", 30, "40111222", "Profesor de programacion", 5);
        rodrigo.asignarMateria(PROG1);
        rodrigo.asignarMateria(PDP);
        Profesor walter = new Profesor
        ("Walter", "Molina", 30, "40222111", "Profesor de programacion", 6);
        walter.asignarMateria(PROG1);
        walter.asignarMateria(PDP);
        //Personal...
        Personal faustino = new Personal
        ("Faustino", "Perez", 39, "40333444", "Administrativo", "Recepcionista", "03/05/2020");
        //Miembros Universidad...
        System.out.println("Miembros de la univesidad");
        Unvime.agregarMiembro(santiago );
        Unvime.agregarMiembro(noelia );
        Unvime.agregarMiembro(ricardo );
        Unvime.agregarMiembro(rodrigo );
        Unvime.agregarMiembro(walter );
        Unvime.agregarMiembro(faustino );
        //Ver todos los miembros...
        System.out.println("Todos los miembros, generales");
        Unvime.listarTodosLosMiembros();
        //Ver promedios...
        System.out.println("Promedios de los estudiantes");
        System.out.println("Promedio de " + santiago.getNombre() + ": " + santiago.calcularPromedioRecursivo());
        System.out.println("Promedio de " + noelia.getNombre() + ": " + noelia.calcularPromedioRecursivo());
        System.out.println("Promedio de " + ricardo.getNombre() + ": " + ricardo.calcularPromedioRecursivo());
        //Por roles...
        System.out.println("Miembros por roles");
        Unvime.buscarMiembrosPorRol("Estudiante");
        Unvime.buscarMiembrosPorRol("Profesor");
        Unvime.buscarMiembrosPorRol("Personal");
        System.out.println("Busqueda binaria de miembros: ");
        Estudiante encontrado = Unvime.buscarEstudianteRecursivo("Santiago");
        if(encontrado != null){
            System.out.println("Estudiante encontrado: " + encontrado.getNombre() + " " + encontrado.getApellido());
        } else {
            System.out.println("Estudiante no encontrado");
        }
        System.out.println("Busqueda binaria apellido: ");
        Estudiante encontradoApellido = Unvime.buscarEstudianteIterativo("Marquez");
        if(encontradoApellido != null){
            System.out.println("Estudiante encontrado: " + encontradoApellido.getNombre() + " " + encontradoApellido.getApellido());
        } else {
            System.out.println("Estudiante no encontrado");
        }
        
    }
}