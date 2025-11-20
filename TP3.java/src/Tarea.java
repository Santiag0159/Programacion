enum Prioridad{
    BAJA,
    MEDIA,
    ALTA
}
public class Tarea{
    private String descripcion;
    private String materia;
    private String fechaLimite;
    private Prioridad prioridad;
    // Getters
    public String getDescripcion(){return descripcion;}
    public String getMateria(){return materia;}
    public String getFechaLimite(){return fechaLimite;}
    public Prioridad getPrioridad(){return prioridad;}
    // Setters
    public void setDescripcion(String descripcion){this.descripcion = descripcion;}
    public void setMateria(String materia){this.materia = materia;}
    public void setFechaLimite(String fechaLimite){this.fechaLimite = fechaLimite;}
    public void setPrioridad(Prioridad prioridad){this.prioridad = prioridad;}
    // Constructor
    public Tarea(String descripcion, String materia, String fechaLimite, Prioridad prioridad){
        this.descripcion = descripcion;
        this.materia = materia;
        this.fechaLimite = fechaLimite;
        this.prioridad = prioridad;
    }
}