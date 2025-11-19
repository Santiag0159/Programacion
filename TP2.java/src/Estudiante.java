public class Estudiante extends Persona implements MiembroUniversidad{
    private String carrera;
    private double promedio;
    private ListaEnlazada materias;

    public String getCarrera() { return carrera; }
    public double getPromedio() { return promedio; }
    public ListaEnlazada getMaterias() { return materias; }

    public void setCarrera(String carrera) { this.carrera = carrera; }
    public void setPromedio(double promedio) { this.promedio = promedio; }
    public void setMaterias(ListaEnlazada materias) { this.materias = materias; }

    public double calcularPromedioRecursivo(){
        int totalMaterias = this.materias.getCantidad();
        if (totalMaterias == 0){
            return 0.0;
        }
        double suma = calcularPromedioRecursivo(materias.getInicio());
        return suma / totalMaterias;
    }

    public static double calcularPromedioRecursivo(Nodo actual){
        if(actual == null){
            return 0.0;
        }
        Materia materia = (Materia) actual.getDato();
        return materia.getCalificacion() + calcularPromedioRecursivo(actual.getSiguiente());
    }

    public double calcularPromedioIterativo(){
        int totalMaterias = materias.getCantidad();
        if (totalMaterias == 0){
            return 0.0;
        }
        double suma = 0.0;
        Nodo actual = materias.getInicio();
        while(actual != null){
            Materia materia = (Materia) actual.getDato();
            suma += materia.getCalificacion();
            actual = actual.getSiguiente();
        }
        return suma / totalMaterias;
    }
    public boolean inscribirMateria(Materia materia){
        if(materias.buscar(materia)){
            return false;
        }
        materias.agregar(materia);
        return true;
    }

    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera, double promedio){
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = new ListaEnlazada();
    }
    @Override
    // si es v o f;
    public String toString(){
        int totalMaterias = materias != null ? materias.getCantidad() : 0;

        return "Estudiante [" + super.toString() + 
               ", Carrera: " + carrera + 
               ", Promedio: " + promedio + 
               ", Total Materias: " + totalMaterias + "]";
    }
    @Override
    public String obtenerRol(){
        return "Estudiante";
    }
    @Override
    public String obtenerInformacionCompleta(){
        return this.toString();
    }
}