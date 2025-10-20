public class Estudiante extends Persona implements MiembroUniversidad{
    private String carrera;
    private double promedio;
    private Materia[] materias;
    private int contadorMaterias;

    //Métodos getter
    private static final int MAX_MATERIAS = 100;
    public String getCarrera() { return carrera; }
    public double getPromedio() { return promedio; }
    public Materia[] getMaterias(){return materias;}
    public int getContadorMaterias(){return contadorMaterias;}
    
    //Métodos setter
    public void setCarrera(String carrera) {this.carrera = carrera;}
    public void setPromedio(double promedio) {this.promedio = promedio;}

    //Recursividad
    public double calcularPromedioRecursivo(){
        if(contadorMaterias == 0){
            return 0.0;
        }
        Materia[] materias = new Materia[contadorMaterias];
        for(int i=0; i < contadorMaterias; i++){
            materias[i] = this.materias[i];
        }
        double suma = calcularPromedioRecursivo(materias, 0);
        return suma / contadorMaterias;
    }
    public static double calcularPromedioRecursivo(Materia[] materias, int indice){
        if(indice >= materias.length){
            return 0.0;
        }
        return materias[indice].getCalificacion() + calcularPromedioRecursivo(materias, indice + 1);
    }
    //Iteratividad
    public double calcularPromedioIterativo(){
        if(contadorMaterias == 0){
            return 0.0;
        } double suma = 0.0;
        for(int i=0; i < contadorMaterias; i++){
            suma += this.materias[i].getCalificacion();
        }
        return suma / contadorMaterias;
    }
    //Inscribir materias
    public boolean inscribirMateria(Materia materia){
        if(contadorMaterias < MAX_MATERIAS){
            this.materias[contadorMaterias] = materia;
            contadorMaterias++;
            return true;
        } else {
            System.out.println("Error: El estudiante alcanzo el limite de materias...");
            return false;
        }
    }
    //Constructor
    public Estudiante(String nombre, String apellido, int edad, String documento, String carrera, double promedio){
        super(nombre, apellido, edad, documento);
        this.carrera = carrera;
        this.promedio = promedio;
        this.materias = new Materia[MAX_MATERIAS];
        this.contadorMaterias = 0;
    }
    
    @Override
    public String toString(){
        return "Estudiante [" + super.toString() + 
               ", Carrera: " + carrera + 
               ", Promedio: " + promedio + 
               ", Total Materias: " + contadorMaterias + "]";
    }
    //Aplicando interfaz
    @Override
    public String obtenerRol(){
        return "Estudiante";
    }
    @Override
    public String obtenerInformacionCompleta(){
        return this.toString();
    }

}

