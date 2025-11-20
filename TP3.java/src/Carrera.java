public class Carrera{
    private String nombre;
    private ListaEnlazada estudiantes;

    
    public String getNombre(){return nombre;}
    
    public Carrera(String nombre){
        this.nombre = nombre;
        this.estudiantes = new ListaEnlazada();
    }
    public void agregarEstudiante(Estudiante nuevoEstudiante){
        this.estudiantes.agregar(nuevoEstudiante);
    }
    public void listarEstudiantes(){
        Nodo actual = this.estudiantes.getInicio();
        System.out.println("Estudiantes de la carrera: " + this.nombre);
        while(actual != null){
            Estudiante estudiante = (Estudiante) actual.getDato();
            System.out.println(estudiante);
            actual = actual.getSiguiente();
        }
    }
    public Estudiante buscarEstudiante(String nombreBuscado){
        String nombreBuscadoLower = nombreBuscado.toLowerCase();
        Nodo actual = this.estudiantes.getInicio();
        while(actual != null){
            Estudiante estudiante = (Estudiante) actual.getDato();
            String nombreEstudiantem = estudiante.getNombre().toLowerCase();
            if(nombreEstudiantem.equals(nombreBuscadoLower)){
                return estudiante;
            }
            actual = actual.getSiguiente();
        }
        return null;
    }
}