public class CambioNota{
    private int estudianteID;
    private int materiaID;
    private double notaAnterior;
    private double notaNueva;
    private String fecha;
    // Getters
    public int getEstudianteID(){return estudianteID;}
    public int getMateriaID(){return materiaID;}
    public double getNotaAnterior(){return notaAnterior;}
    public double getNotaNueva(){return notaNueva;}
    public String getFecha(){return fecha;}
    // Setters
    public void setEstudianteID(int estudianteID){this.estudianteID = estudianteID;}
    public void setMateriaID(int materiaID){this.materiaID = materiaID;}
    public void setNotaAnterior(double notaAnterior){this.notaAnterior = notaAnterior;}
    public void setNotaNueva(double notaNueva){this.notaNueva = notaNueva;}
    public void setFecha(String fecha){this.fecha = fecha;}
    // Constructor
    public CambioNota(int estudianteID, int materiaID, double notaAnterior, double notaNueva, String fecha){
        this.estudianteID = estudianteID;
        this.materiaID = materiaID;
        this.notaAnterior = notaAnterior;
        this.notaNueva = notaNueva;
        this.fecha = fecha;
    }
    @Override
    public String toString(){
        return "Cambio Nota" +
                "estudiante ID =" + estudianteID +
                ", materia ID =" + materiaID +
                ", nota Anterior =" + notaAnterior +
                ", nota Nueva = " + notaNueva +
                ", fecha = " + fecha;
    }
}