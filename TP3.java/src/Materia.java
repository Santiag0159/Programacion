public class Materia{
    private String nombre;
    private String codigo;
    private int creditos;
    private double calificacion;
    private Profesor profesor;
    // Constructor sin parametros
    public Materia(){}
    /// Constructor con parametros
    public Materia(String nombre, String codigo, int creditos, double calificacion, Profesor profesor){
    this.nombre = nombre;
    this.codigo = codigo;
    this.creditos = creditos;
    this.calificacion = calificacion;
    this.profesor = profesor;
}
    // Getters
    public String getNombre(){return nombre;}
    public String getCodigo(){return codigo;}
    public int getCreditos(){return creditos;}
    public double getCalificacion(){return calificacion;}
    public Profesor getProfesor(){return profesor;}
    // Setters
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setCodigo(String codigo){this.codigo = codigo;}
    public void setCreditos(int creditos){this.creditos = creditos;}
    public void setCalificacion(double calificacion){this.calificacion = calificacion;}
    public void setProfesor(Profesor profesor){this.profesor = profesor;}
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return codigo.equals(materia.codigo);
    }
    @Override
    public int hashCode(){
        return codigo.hashCode();
    }
    @Override
    public String toString()
    {return "Materia [nombre: "+ nombre + ". codigo: "+ codigo + ". Creditos: "+ 
    creditos + ". Calificacion: " + calificacion + ". Profesor: "+ profesor +"]";}
}