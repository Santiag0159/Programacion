public class Persona{
    private String nombre;
    private String apellido;
    private int edad;
    private String documento;
    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public int getEdad(){return edad;}
    public String getDocumento(){return documento;}
    public void setNombre(String nombre){
        if(nombre.length() > 0){
            this.nombre = nombre;
        } else {System.err.println("El nombre no puede estar vacio...");}}
    public void setApellido(String apellido){
        if(apellido.length()>0){this.apellido=apellido;}else{System.err.println("El apellido no puede estar vacio...");}}
    public void setEdad(int edad){
        if (edad < 16){System.err.println("La edad no puede ser menor a 16");}
        else{this.edad = edad;}}
    public void setDocumento(String documento){this.documento = documento;}
    public Persona(String nombre, String apellido, int edad, String documento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
    }
    @Override
    public String toString(){
        return "Persona [nombre: "+ nombre + "apellido: "+ apellido + "edad: "+ edad + "Documento: "+ documento +"]";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return documento.equals(persona.documento);
    }
    @Override
    public int hashCode(){
        return documento.hashCode();
    }
    }