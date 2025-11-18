public class GestorInscripciones{
    private Cola solicitudesPendientes;

    public SolicitudesPendientes agregarSolicitud(solicitudesPendientes solicitud){
        return solicitudesPendientes.insertar(solicitud);
    }
    public SolicitudesPendientes procesarSiguienteSolicitud(){
        return (solicitudesPendientes) solicitudesPendientes.quitar();
    }
    public SolicitudesPendientes versiguienteSolicitud(){
        return solicitudesPendientes.frente();
    }
    public int cantidadSolicitudesPendientes(){
        return solicitudesPendientes.tamanio();
    }
}