public class Main{
    public static void main(String[] args){
        Carrera programacion = new Carrera("Programacion universitaria", 20);

        System.out.println("Matriculacion y asignacion de materias");

        Estudiante santiago = new Estudiante("Santiago","Morales",23, programacion.getNombre(), 7.1, 3);
        santiago.agregarMateria(new Materia("Matematica", "MAT101", 4, 7.1));
        santiago.agregarMateria(new Materia("Bases de datos", "BD102", 5, 7));
        
        Estudiante noelia = new Estudiante("Noelia", "Gonzalez", 24, programacion.getNombre(), 9.9, 3);
        noelia.agregarMateria(new Materia("Matematica","MAT101", 4, 8.5));
        noelia.agregarMateria(new Materia("Base de datos", "BD102", 5, 10));

        Estudiante ricardo = new Estudiante("Ricardo", "Tapia", 22, programacion.getNombre(), 10, 3);
        ricardo.agregarMateria(new Materia("Matematica", "MAT101", 4, 10));
        ricardo.agregarMateria(new Materia("Base de datos", "BD102", 5, 10));

        programacion.agregarEstudiante(santiago);
        programacion.agregarEstudiante(noelia);
        programacion.agregarEstudiante(ricardo);

        System.out.println("Resultados final");

        System.out.printf("Promedio de %s: %.2f\n", santiago.getNombre(), santiago.calcularPromedio());
        System.out.printf("Promedio de %s: %.2f\n", noelia.getNombre(), noelia.calcularPromedio());
        System.out.printf("Promedio de %s: %.2f\n", ricardo.getNombre(),ricardo.calcularPromedio());

        programacion.listarEstudiantes();

        System.out.println("Buscando alumno");
        Estudiante encontrado = programacion.buscarEstudiante("SanTiago");
        if(encontrado != null){
            System.out.println("Busqueda exitosa: Se encontro a " + encontrado.getNombre() +", con promedio " + String.format("%.2f", encontrado.calcularPromedio()));
        } else {
            System.out.println("Estudiante no encontrado...");
        }
    }
}