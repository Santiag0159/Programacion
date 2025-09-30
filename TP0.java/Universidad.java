public class Universidad{
    private String nombre;
    private String direccion;
    private Estudiante[] estudiantes;
    private int contador;

    public Universidad(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.estudiantes = new Estudiante[20];
        this.contador = 0;
    }
    public String getNombre(){return nombre;}
    public String getDireccion(){return direccion;}
    public void agregarEstudiante(Estudiante nuevo){
        if(contador < estudiantes.length){
            this.estudiantes[contador] = nuevo;
            this.contador++;
        }
    }

    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    
}