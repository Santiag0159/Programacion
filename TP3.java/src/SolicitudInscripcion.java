enum EstadoSolicitud{
    PENDIENTE,
    ACEPTADA,
    RECHAZADA
}
public class SolicitudInscripcion{
    private String estudiante;
    private String materia;
    private double fechaSolicitud;
    private EstadoSolicitud estado;
    // Getters
    public String getEstudiante(){return estudiante;}
    public String getMateria(){return materia;}
    public double getFechaSolicitud(){return fechaSolicitud;}
    public EstadoSolicitud getEstado(){return estado;}
    // Setters
    public void setEstudiante(String estudiante){this.estudiante = estudiante;}
    public void setMateria(String materia){this.materia = materia;}
    public void setFechaSolicitud(double fechaSolicitud){this.fechaSolicitud = fechaSolicitud;}
    public void setEstado(EstadoSolicitud estado){this.estado = estado;}
    // Constructor
    public SolicitudInscripcion(String estudiante, String materia, double fechaSolicitud, String estado){
        this.estudiante = estudiante;
        this.materia = materia;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
    }
}