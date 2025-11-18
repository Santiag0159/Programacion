public class Historial{
    private Pila historial;

    public void registrarCambio(CambioNota cambio){
        historial.insertar(cambio);
    }
    public CambioNota deshacerUltimoCambio(){
        return (CambioNota) historial.quitar();
    }
}