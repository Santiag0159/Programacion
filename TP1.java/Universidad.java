public class Universidad{
    private String nombre;
    private String direccion;
    private MiembroUniversidad[] miembros;
    private int contadorMiembros;
    private static final int MAX_MIEMBROS = 100;
    public Universidad(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.miembros = new MiembroUniversidad[MAX_MIEMBROS];
        this.contadorMiembros = 0;
    }
    public String getNombre(){return nombre;}
    public String getDireccion(){return direccion;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void agregarMiembro(MiembroUniversidad nuevoMiembro){
        if(contadorMiembros < miembros.length){
            this.miembros[contadorMiembros] = nuevoMiembro;
            this.contadorMiembros++;
            System.out.println("Miebro Agregado: "+ nuevoMiembro.obtenerRol());
        } else {
            System.out.println("Error: La universidad alzanzo el limite de " + MAX_MIEMBROS + "miembros");
        }
    }
    public Estudiante[] obtenerEstudiantes(){
        int cont = 0;
        for(int i=0; i < contadorMiembros; i++){
            if(miembros[i] instanceof Estudiante){
                cont++;
            }
        }
        Estudiante[] estudiantes = new Estudiante[cont];
        int indice = 0;
        for(int i=0; i < contadorMiembros; i++){
            if(miembros[i] instanceof Estudiante){
                estudiantes[indice++] = (Estudiante)miembros[i];
            }
        }
        return estudiantes;
    }
    public int contarEstudiantesIterativo(String carrera){
        int contador = 0;
        for(int i=0; i < contadorMiembros; i++){
            MiembroUniversidad miembro = miembros[i];
            if(miembro instanceof Estudiante){
                Estudiante estudiante = (Estudiante) miembro;
                if(estudiante.getCarrera().equalsIgnoreCase(carrera)){
                    contador++;
                }
            }
        } 
        return contador;
    }
    public int contarEstudiantesRecursivo(String carrera){
        return contarEstudiantesRecursivo(this.miembros, carrera, 0, this.contadorMiembros);
    }
    public static int contarEstudiantesRecursivo(MiembroUniversidad[] miembros, String carrera, int indice, int limite){
        if(indice >= limite){
            return 0;
        }
        MiembroUniversidad miembro = miembros[indice];
        int contadorActual = 0;
        if(miembro instanceof Estudiante){
            Estudiante estudiante = (Estudiante) miembro;
            if(estudiante.getCarrera().equalsIgnoreCase(carrera)){
                contadorActual = 1;
            }
        }
        return contadorActual + contarEstudiantesRecursivo(miembros, carrera, indice + 1, limite);
    }
    public void listarTodosLosMiembros(){
        if(contadorMiembros == 0){
            System.out.println("No hay miembros en la Universidad");
            return;
        }
        System.out.println("Lista de miembros de la universidad (" + contadorMiembros + ")");
        for (int i = 0; i < contadorMiembros; i++){
            MiembroUniversidad miembro = miembros[i];
            System.out.println(" "+ miembro.obtenerRol() + ": " + miembro.obtenerInformacionCompleta());
        }
    }
    public void buscarMiembrosPorRol(String rol){
        System.out.println("Buscando miembros con rol: " + rol);
        boolean encontrado = false;
        for(int i = 0; i < contadorMiembros; i++){
            MiembroUniversidad miembro = miembros[i];
            if(miembro.obtenerRol().equalsIgnoreCase(rol)){
                System.out.println(" "+ miembro.obtenerRol() + ": " + miembro.obtenerInformacionCompleta());
                encontrado = true;
            }
        }
        if(!encontrado){
            System.out.println("No se encontraron miembros con el rol: " + rol);
        }
    }
    public Estudiante buscarEstudianteIterativo(String documento){
        for(int i=0; i < contadorMiembros; i++){
            MiembroUniversidad miembro = miembros[i];
            if(miembro instanceof Estudiante){
                Estudiante estudiante = (Estudiante) miembro;
                if(estudiante.getDocumento().equals(documento)){
                    return estudiante;
                }
            }
        }
        return null;
    }
    public Estudiante buscarEstudianteRecursivo(String documento){
        Estudiante[] estudiantes = obtenerEstudiantes();
        if(estudiantes.length == 0){
            return null;
        } else {
            return buscarEstudianteRecursivo(estudiantes, documento, 0);
        }
    }
    public static Estudiante buscarEstudianteRecursivo
    (Estudiante[] estudiantes, String documento, int indice){
        if(indice >= estudiantes.length){
            return null;
        }
        Estudiante estudianteActual = estudiantes[indice];
        if(estudianteActual.getDocumento().equals(documento)){
            return estudianteActual;
        }
        return buscarEstudianteRecursivo(estudiantes, documento, indice + 1);
    }
    public static Estudiante[] ordenarPorApellido(Estudiante[] estudiantes){
        int n=estudiantes.length;
        for(int i=0; i<n-1; i++){
            int indiceMinimo = i;
            for(int j=i+1; j<n; j++){
                if(estudiantes[j].getApellido().compareTo(estudiantes[indiceMinimo].getApellido())<0){
                    indiceMinimo=j;
                }
            }
            if(indiceMinimo != i){
                Estudiante temp = estudiantes[i];
                estudiantes[i] = estudiantes[indiceMinimo];
                estudiantes[indiceMinimo] = temp;
        }
      }
        return estudiantes;
    }
    public Estudiante buscarEstudianteBinario(String apellido){
        Estudiante[] estudiantes = obtenerEstudiantes();
        if(estudiantes.length == 0){
            return null;
        }
        Universidad.ordenarPorApellido(estudiantes);
        int indiceEncontrado = busquedaBinariaEstudiante(estudiantes, apellido);
        if(indiceEncontrado >= 0){
            return estudiantes[indiceEncontrado];
        } else {
            return null;
        }
    }
    public static int busquedaBinariaEstudiante(Estudiante[] estudiantes, String apellido){
        int izquierda = 0;
        int derecha = estudiantes.length -1;
        while(izquierda <= derecha){
            int medio = (derecha + izquierda) / 2;
            int comparacion = apellido.compareTo(estudiantes[medio].getApellido());
            if (comparacion == 0){
                return medio;
            } else if (comparacion <0){
                derecha = medio -1;
            } else {
                izquierda = medio +1;
            }
        }
        return -1;
    }
    @Override
    public String toString(){
        return "Universidad (Nombre: "+ nombre + ". Direccion: " + direccion + ". Total miembros: " + contadorMiembros + ")";
    }
}