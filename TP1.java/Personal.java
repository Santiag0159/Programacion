public class Personal extends Persona implements MiembroUniversidad{
    //Atributos
    private String departamento;
    private String puesto;
    private String fechaIngreso;

    //Métodos getter
    public String getDepartamento(){return departamento;}
    public String getPuesto(){return puesto;}
    public String getFechaIngreso(){return fechaIngreso;}

    //Métodos setter
    public void setDepartamento(String departamento){this.departamento = departamento;}
    public void setPuesto(String puesto){this.puesto = puesto;}
    public void setFechaIngreso(String fechaIngreso){this.fechaIngreso = fechaIngreso;}

    //Constructor
    public Personal(String nombre, String apellido,int edad, String documento, String departamento, String puesto, String fechaIngreso){
        super(nombre, apellido, edad, documento);
        this.departamento = departamento;
        this.puesto = puesto;
        this.fechaIngreso = fechaIngreso;
    }
    //Interfaz
    @Override
    public String toString(){
        return "Personal: ("+ super.toString() + ". Departamento: " + departamento + ". Puesto: "+ puesto + ". Fecha de ingreso: "+ fechaIngreso+ ")";
    }
    @Override
    public String obtenerRol(){
        return "Personal Administrativo ";
    }
    @Override
    public String obtenerInformacionCompleta(){
        return this.toString();
    }

    }
