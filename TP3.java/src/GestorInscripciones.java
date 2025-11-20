public class GestorInscripciones{
    private Cola solicitudesPendientes;

    public GestorInscripciones(){
        this.solicitudesPendientes = new Cola();
    }
    public void agregarSolicitud(SolicitudInscripcion solicitud){
        solicitudesPendientes.insertar(solicitud);
    }
    public Object procesarSiguienteSolicitud(){
        Object solicitud = solicitudesPendientes.quitar();
        if(solicitud != null){
            System.out.println("Procesando solicitud de: " + solicitud.toString());
        } else {
            System.out.println("No hay solicitudes pendientes para procesar.");
        }
        return solicitud;
    }
    public Object verSiguienteSolicitud(){
        Object solicitud = solicitudesPendientes.Inicio();
        if(solicitud != null){
            System.out.println("Siguiente solicitud en la cola: " + solicitud.toString());
        } else {
            System.out.println("No hay solicitudes pendientes.");
        }
        return solicitud;
    }
    public int cantidadSolicitudesPendientes(){
        return solicitudesPendientes.tamaño();
    }
}