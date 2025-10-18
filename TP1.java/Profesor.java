public class Profesor extends Persona implements MiembroUniversidad{
    private String especialidad;
    private int experiencia;
    private Materia[] materiasAsignadas;
    private int contadorMateriasAsignadas;
    private static final int MAX_MATERIAS = 100;
    public String getEspecialidad(){return especialidad;}
    public int getExperiencia(){return experiencia;}
    public Materia[] getMateriasAsignadas(){return materiasAsignadas;}
    public int getContadorMateriasAsignadas(){return contadorMateriasAsignadas;}
    public void setEspecialidad(String especialidad){
        this.especialidad = especialidad;
    }
    public void setExperiencia(int experiencia){
        this.experiencia = experiencia;
    }
    public Profesor(String nombre, String apellido, int edad, String documento, String especialidad, int experiencia){
        super(nombre, apellido, edad, documento);
        this.especialidad = especialidad;
        this.experiencia = experiencia;
        this.materiasAsignadas = new Materia[MAX_MATERIAS];
        this.contadorMateriasAsignadas = 0;
    }
    public boolean asignarMateria(Materia materia){
        if(contadorMateriasAsignadas < MAX_MATERIAS){
            this.materiasAsignadas[contadorMateriasAsignadas]= materia; 
            contadorMateriasAsignadas++;
            materia.setProfesor(this);
            return true;
        } else {
            System.out.println("Error: El profesor alcanzo el limite de materias...");
            return false;
        }
    }
    @Override 
    public String toString(){
        return "Profesor (" + super.toString() + ". Especialidad: "+ especialidad + 
        ". Experiencia: "+ experiencia + ". Materias Asignadas: " + contadorMateriasAsignadas + ")";
    }
    @Override
    public String obtenerRol(){
        return "Profesor ";
    }
    @Override
    public String obtenerInformacionCompleta(){
        return this.toString();
    }
}