public class TurnoConsulta{
    private String estudiante;
    private String motivo;
    private String horaLlegada;
    private String duracionEstimada;
    // Getters
    public String getEstudiante(){return estudiante;}
    public String getMotivo(){return motivo;}
    public String getHoraLlegada(){return horaLlegada;}
    public String getDuracionEstimada(){return duracionEstimada;}
    // Setters
    public void setEstudiante(String estudiante){this.estudiante = estudiante;}
    public void setMotivo(String motivo){this.motivo = motivo;}
    public void setHoraLlegada(String horaLlegada){this.horaLlegada = horaLlegada;}
    public void setDuracionEstimada(String duracionEstimada){this.duracionEstimada = duracionEstimada;}
    // Constructor
    public TurnoConsulta(String estudiante, String motivo, String horaLlegada, String duracionEstimada){
        this.estudiante = estudiante;
        this.motivo = motivo;
        this.horaLlegada = horaLlegada;
        this.duracionEstimada = duracionEstimada;
    }
}