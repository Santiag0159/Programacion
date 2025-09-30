public class Estudiante{
    private String nombre;
    private String apellido;
    private int edad;
    private String carrera;
    private double promedio;
    private Materia[] materias;
    private int contadorm;

    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public int getEdad(){return edad;}
    public String getCarrera(){return carrera;}
    public double getPromedio(){return promedio;}

    public void setNombre(String nombre){
        if (nombre.length() > 0){
            this.nombre = nombre;
        } else {System.out.println("El nombre no puede estar vacio");}
    }
    public void setApellido(String apellido){
        if (apellido.length() > 0){
            this.apellido = apellido;
        } else {System.out.println("El apellido no puede estar vacio");}
    }
    public void setEdad(int edad){
        if (edad > 16){
            this.edad = edad;
        } else {System.out.println("No puede ser menor de 16");}
    }
    public void setCarrera(String carrera){this.carrera = carrera;}
    public void setPromedio(double promedio){this.promedio = promedio;}
    public void agregarMateria(Materia materia){
        if(contadorm < materias.length){
            this.materias[contadorm] = materia;
            this.contadorm++;
            System.out.println("Materia  " + materia.getNombre() + " Agregada exitosamente...");
        } else {
            System.err.println("Se alcanzo el limite de materias. ");
        }
    }
    public double calcularPromedio(){
        if (contadorm == 0){return 0.0;}
        double sumaCalificaciones = 0.0;
        for(int i = 0; i < contadorm; i++){
            sumaCalificaciones += this.materias[i].getCalificacion();
        }
        return sumaCalificaciones / contadorm;
    }
    public Estudiante(int maxMaterias){
        this.materias = new Materia[maxMaterias];
        this.contadorm = 0;
    }
    public Estudiante(String nombre, String apellido, int edad, String carrera, double promedio, int maxMaterias){
    this.nombre = nombre;
    this.apellido = apellido;
    this.edad = edad;
    this.carrera = carrera;
    this.promedio = promedio;
    this.materias = new Materia[maxMaterias];
    this.contadorm = 0;
 }
}