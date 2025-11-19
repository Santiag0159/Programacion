public class Profesor extends Persona implements MiembroUniversidad{
    private String especialidad;
    private int experiencia;
    private ListaEnlazada materiasAsignadas;

    public String getEspecialidad(){return especialidad;}
    public int getExperiencia(){return experiencia;}
    public ListaEnlazada getMateriasAsignadas(){return materiasAsignadas;}
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
        this.materiasAsignadas = new ListaEnlazada();
    }
    public boolean asignarMateria(Materia materia){
        if(materiasAsignadas.buscar(materia)){
            return false;
        }
        materiasAsignadas.agregar(materia);
        return true;
    }

    @Override 
    public String toString(){
        int totalAsignadas = materiasAsignadas.getCantidad();
        return "Profesor (" + super.toString() + ". Especialidad: "+ especialidad + 
        ". Experiencia: "+ experiencia + ". Materias Asignadas: " + totalAsignadas + ")";
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