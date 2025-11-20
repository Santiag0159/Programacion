public class Main{
    public static void main(String[] args) throws Exception{
        Universidad Unvime = new Universidad
        ("UNVIME", "Avenida siempre viva 123");//No me se la calle real
        String nombreCarrera = "Programador Universitario en sistemas"; //Pongo nombreCarrera para mas comodidad
        System.out.println("Matriculacion y asignacion de materias");
        //Nuevas Materias...
        Materia PROG1 = new Materia("Programacion 1", "PROG1", 4, 0.0,null);
        Materia PDP = new Materia("Paradigma de la programacion", "PDP", 5, 0.0, null);
        //Nuevos Estudiantes....
        Estudiante santiago = new Estudiante
        ("Santiago", "Morales", 23, "43765597", nombreCarrera, 7.1);
        santiago.inscribirMateria
        (new Materia("Programacion", "PROG1", 4, 7.0, null));
        santiago.inscribirMateria
        (new Materia("Paradigma de la Programacion", "PDP", 5, 8.5, null));
        //Estudiante 2
        Estudiante noelia = new Estudiante
        ("Noelia", "Gonzalez", 24, "43222111", nombreCarrera, 9.0 );
        noelia.inscribirMateria
        (new Materia("Programacion", "PROG1", 4, 7.0, null));
        noelia.inscribirMateria
        (new Materia("Paradigma de la programacion", "PDP", 5, 8.5, null));
        //Estudiante 3
        Estudiante ricardo = new Estudiante
        ("Ricardo", "Tapia", 21, "45666777", nombreCarrera, 10);
        ricardo.inscribirMateria
        (new Materia("Programacion","PROG1", 4, 10, null));
        ricardo.inscribirMateria
        (new Materia("Paradigma de la Programacion", "PDP", 5, 10, null));
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
        Unvime.agregarMiembro(santiago);
        Unvime.agregarMiembro(noelia);
        Unvime.agregarMiembro(ricardo);
        Unvime.agregarMiembro(rodrigo);
        Unvime.agregarMiembro(walter);
        Unvime.agregarMiembro(faustino);
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
        //Busqueda binaria...
        System.out.println("Busqueda binaria documento: "); 
        Estudiante encontradoDocumento = Unvime.buscarEstudianteRecursivo("43222111");{
        if(encontradoDocumento != null){
            System.out.println("Estudiante encontrado: " + encontradoDocumento.getNombre() + " " + encontradoDocumento.getApellido());
        } else {
            System.out.println("Estudiante no encontrado");
        }
        System.out.println("Busqueda binaria apellido: ");
        Estudiante encontradoApellido = Unvime.buscarEstudianteRecursivo("Marquez");
        if(encontradoApellido != null){
            System.out.println("Estudiante encontrado: " + encontradoApellido.getNombre() + " " + encontradoApellido.getApellido());
        } else {
            System.out.println("Estudiante no encontrado");
        }
        // Agregar tareas a la pila
        Tarea tarea1 = new Tarea("TP 3 de Programacion", "Programacion", "2025-11-19", Prioridad.ALTA);
        Tarea tarea2 = new Tarea("Parcial de Programacion", "Programacion", "2025-11-19", Prioridad.ALTA);

        santiago.getTareasPendientes().insertar(tarea1);
        santiago.getTareasPendientes().insertar(tarea2);

        // Ver y completar tareas pendientes

        santiago.verUltimaTareaPendiente();
        Tarea verProximatarea = santiago.verProximatarea();
        System.out.println("Proxima tarea de " + santiago.getNombre() + ": " + verProximatarea.getDescripcion());
        santiago.completarUltimaTarea();
        System.out.println("Tarea completada. Proxima tarea de " + santiago.getNombre() + ": " + ((Tarea)santiago.verProximatarea()).getDescripcion());
        // Consultas a profesores
        System.out.println("Consultas de estudiantes a profesores");
        
        TurnoConsulta consulta1 = new TurnoConsulta("Santiago", "Duda sobre TP3", "21:00", "30 minutos");
        TurnoConsulta consulta2 = new TurnoConsulta("Noelia", "Duda sobre Parcial", "22:00", "10 minutos");

        rodrigo.agregarConsulta(consulta1);
        walter.agregarConsulta(consulta2);  

        //Ver siguiente consulta sin atender
        System.out.println("Siguiente consulta para "+ rodrigo.getNombre() + ": " + ((TurnoConsulta) rodrigo.verSiguienteConsulta()).getMotivo());
        //Atender siguiente consulta
        TurnoConsulta atendida = walter.atenderSiguienteEstudiante();
        System.out.println("Consulta atendida por " + walter.getNombre() + ": " + atendida.getMotivo());
        //Consulta cambio notas
        CambioNota cambio1 = new CambioNota(43765597, 4, 8.5, 9.5, "20/11/2025" );
        CambioNota cambio2 = new CambioNota(43765597, 4, 9.3, 10.00, "21/11/2025" );
        System.out.println("Solicitudes de cambio de nota");
        System.out.println(cambio1.toString());
        System.out.println(cambio2.toString());
        //Solicitud de Inscripcion 
        SolicitudInscripcion solicitud1 = new SolicitudInscripcion("santiago", "PROG1", 20.11, EstadoSolicitud.PENDIENTE);
        SolicitudInscripcion solicitud2 = new SolicitudInscripcion("noelia", "PDP", 21.11, EstadoSolicitud.PENDIENTE);
        //Gestor de Inscripciones
        GestorInscripciones gestor = new GestorInscripciones();
        gestor.agregarSolicitud(solicitud1);
        gestor.agregarSolicitud(solicitud2);
        System.out.println("Cantidad de solicitudes pendientes: " + gestor.cantidadSolicitudesPendientes());
        
    }
   }
}
