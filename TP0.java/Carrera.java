public class Carrera {
    private String nombre;
    private Estudiante[] estudiantes;
    private int contadorE;
    
    public Carrera(String nombre, int Maxcap){
        this.nombre = nombre;
        this.estudiantes = new Estudiante[Maxcap];
        this.contadorE = 0;
    }
    public void agregarEstudiante(Estudiante estudiante){
        if(contadorE < estudiantes.length){
            this.estudiantes[contadorE] = estudiante;
            this.contadorE++;
            System.out.println("Inscripcion exitosa para: " + estudiante.getNombre());
        } else {
            System.err.println("La carrera " + this.nombre + " alcanzo su capacidad maxima.");
        }
    }
    public void listarEstudiantes(){
        System.out.println("Listado de estudiantes en la carrera " + this.nombre);
        for(int i = 0; i < contadorE; i++){
            Estudiante e = this.estudiantes[i];
            System.out.printf("%d. Nombre: %s, Promedio: %.2f\n",
            (i+1), e.getNombre(), e.calcularPromedio());
        }
        if(contadorE == 0 ){
            System.out.println("No hay estudiantes en esta carrera...");
        }
    }
    public Estudiante buscarEstudiante(String nombreBuscado){
        String nombreBuscadom = nombreBuscado.toLowerCase();
        for(int i = 0; i < contadorE; i++){
            Estudiante e = this.estudiantes[i];
            String nombreEstudiantem = e.getNombre().toLowerCase();
            if(nombreEstudiantem.equals(nombreBuscadom)){
                return e;
            }
        }
        return null;
    }
    public String getNombre(){return nombre;}
}