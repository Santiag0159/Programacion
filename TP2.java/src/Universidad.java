public class Universidad{
    private String nombre;
    private String direccion;
    private ListaEnlazada miembros;


    public Universidad(String nombre, String direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.miembros = new ListaEnlazada();
    }
    public String getNombre(){return nombre;}
    public String getDireccion(){return direccion;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public void setDireccion(String direccion){this.direccion = direccion;}
    public void agregarMiembro(MiembroUniversidad nuevoMiembro){
        this.miembros.agregar(nuevoMiembro);
        System.out.println("Miembro agregado: "+ nuevoMiembro.obtenerRol());
    }
    public ListaEnlazada obtenerEstudiantes(){
        ListaEnlazada estudiantes = new ListaEnlazada();
        Nodo actual = this.miembros.getInicio();
        while(actual != null){
            MiembroUniversidad miembro = (MiembroUniversidad) actual.getDato();
            if(miembro instanceof Estudiante){
                estudiantes.agregar(miembro);
            }
            actual = actual.getSiguiente();
        }
        return estudiantes;
    }

    public int contarEstudiantesIterativo(String carrera){
        int contador = 0;
        Nodo actual = miembros.getInicio();
        while(actual != null){
            MiembroUniversidad miembro = (MiembroUniversidad) actual.getDato();
            if(miembro instanceof Estudiante){
                Estudiante estudiante = (Estudiante) miembro;
                if(estudiante.getCarrera().equalsIgnoreCase(carrera)){
                    contador++;
                }
            }
            actual = actual.getSiguiente();
        }
        return contador;
    }
    public int contarEstudiantesRecursivo(String carrera){
        return contarEstudiantesRecursivo(miembros.getInicio(), carrera);
    }
    public static int contarEstudiantesRecursivo(Nodo actual, String carrera){
        if(actual == null){
            return 0;
        }
        MiembroUniversidad miembro = (MiembroUniversidad) actual.getDato();
        int contador = 0;
        if(miembro instanceof Estudiante){
            Estudiante estudiante = (Estudiante) miembro;
            if(estudiante.getCarrera().equalsIgnoreCase(carrera)){
                contador = 1;
            }
        }
        return contador + contarEstudiantesRecursivo(actual.getSiguiente(), carrera);
    }

    public void listarTodosLosMiembros(){
        int totalMiembros = miembros.getTamaño();
        if(totalMiembros == 0){
            System.out.println("No hay miembros en la universidad.");
            return;
        }
        System.out.println("Listado de todos los miembros de la universidad:");
        Nodo actual = miembros.getInicio();
        while(actual != null){
            MiembroUniversidad miembro = (MiembroUniversidad) actual.getDato();
            System.out.println(" "+ miembro.obtenerRol() + ": " + miembro.obtenerInformacionCompleta());
            actual = actual.getSiguiente();
        }
    }
    public void buscarMiembrosPorRol(String rol){
        int totalMiembros = miembros.getTamaño();
        if(totalMiembros == 0){
            System.out.println("No hay miembros registrados en la universidad...");
            return;
        }
        System.out.println("Buscando miembros con rol: " + rol);
        Nodo actual = miembros.getInicio();
        boolean encontrado = false;
        while(actual != null){
            MiembroUniversidad miembro = (MiembroUniversidad)
            actual.getDato();
            if(miembro.obtenerRol().equalsIgnoreCase(rol)){
                System.out.println(" "+ miembro.obtenerRol() + ": " + miembro.obtenerInformacionCompleta());
                encontrado = true;
            }
            actual = actual.getSiguiente();
        }
        if(!encontrado){
            System.out.println("No se encontraron miembros con el rol: " + rol);
        }
    }

    public Estudiante buscarEstudianteIterativo(String documento){
        Nodo actual = miembros.getInicio();
        while(actual != null){
            MiembroUniversidad miembro = (MiembroUniversidad) actual.getDato();
            if(miembro instanceof Estudiante){
                Estudiante estudiante = (Estudiante) miembro;
                if(estudiante.getDocumento().equals(documento)){
                    return estudiante; // Estudiante encontrado
                }
            }
            actual = actual.getSiguiente();
            // Continuar con el siguiente nodo
        }
        return null; // No se encontró estudiante
    }

    public Estudiante buscarEstudianteRecursivo(String documento){
        return buscarEstudianteRecursivo(miembros.getInicio(), documento);
    }

    public static Estudiante buscarEstudianteRecursivo
    (Nodo actual, String documento){
        if(actual == null){
            return null; // No se encontró estudiante
        }
        MiembroUniversidad miembro = (MiembroUniversidad) actual.getDato();
        if(miembro instanceof Estudiante){
            Estudiante estudiante = (Estudiante) miembro;
            if(estudiante.getDocumento().equals(documento)){
                return estudiante; // Estudiante encontrado
            }
        }
        return buscarEstudianteRecursivo(actual.getSiguiente(), documento);
    }

    // Convierte la lista enlazada de estudiantes en un array
    public Estudiante[] arrayEstudiantes(){
        int contar = 0;
        Nodo actual = miembros.getInicio();

        while(actual != null){
            if (actual.getDato() instanceof Estudiante){
                contar++;
            }
            actual = actual.getSiguiente();
        }
        Estudiante[] arrayEstudiantes = new Estudiante[contar];
        actual = miembros.getInicio();
        int indice = 0;

        while(actual != null){
            if (actual.getDato() instanceof Estudiante){
                arrayEstudiantes[indice++] = (Estudiante) actual.getDato();
            }
            actual = actual.getSiguiente();
        }
        return arrayEstudiantes;
    }

    public static Estudiante[] ordenarApellidos(Estudiante[] estudiantes){
        int x = estudiantes.length;
        for(int y = 0; y < x - 1; y++){
            for(int z = 0; z < x - y - 1; z++){
                if(estudiantes[z].getApellido().compareToIgnoreCase(estudiantes[z + 1].getApellido()) > 0){
                    Estudiante temp = estudiantes[z];
                    estudiantes[z] = estudiantes[z + 1];
                    estudiantes[z + 1] = temp;
                }
            }
        }
        return estudiantes;
    }
    public static void busquedaBinaria(Estudiante[] estudiantes, String Apellido){
        int izquierda = 0;
        int derecha = estudiantes.length - 1;
        boolean encontrado = false;

        while(izquierda <= derecha){
            int medio = izquierda + (derecha - izquierda) / 2;
            int comparacion = estudiantes[medio].getApellido().compareToIgnoreCase(Apellido);

            if(comparacion == 0){
                System.out.println("Estudiante encontrado: " + estudiantes[medio].obtenerInformacionCompleta());
                encontrado = true;
                break;
            }
            if(comparacion < 0){
                izquierda = medio + 1;
            } else {
                derecha = medio - 1;
            }
        }
        if(!encontrado){
            System.out.println("Estudiante con apellido " + Apellido + " no encontrado.");
        }
    }

    @Override
    public String toString(){
        int contadorMiembros = miembros.getTamaño();
        return "Universidad (Nombre: "+ nombre + ". Direccion: " + direccion + ". Total miembros: " + contadorMiembros + ")";
    }
}